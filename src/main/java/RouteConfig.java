import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteConfig extends RouteBuilder {
    public void configure() throws Exception {
//        Split Route Configurations
        from("direct:splitAsyncStart")
                .split(body(), new SplitAggregationClass()).parallelProcessing(true)
                .to("direct:processInputRequest").end();
        from("direct:processInputRequest")
                .bean(InputProcessor.class);

//        Multicast Route Configurations
        from("direct:multicastAsyncStart")
                .multicast().parallelProcessing(true).aggregationStrategy(new MultiCastAggregationClass())
                .to("direct:multicastRoute1")
                .to("direct:multicastRoute2")
                .to("direct:multicastRoute3")
                .end();
        from("direct:multicastRoute1")
                .bean(MulticastProcessing.class, "route1");
        from("direct:multicastRoute2")
                .bean(MulticastProcessing.class, "route2");
        from("direct:multicastRoute3")
                .bean(MulticastProcessing.class, "route3");
    }
}
