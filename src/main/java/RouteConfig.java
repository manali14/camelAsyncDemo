import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteConfig extends RouteBuilder {
    public void configure() throws Exception {
        from("direct:asyncStart")
                .split(body(), new SplitAggregationClass()).parallelProcessing(true)
                .to("direct:processInputRequest").end();
        from("direct:processInputRequest")
                .bean(InputProcessor.class);
    }
}
