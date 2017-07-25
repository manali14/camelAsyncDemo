import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelAsyncDemoMain {
    public static void main(String[] args) {
        CamelContext camelContext = new DefaultCamelContext();
        try {
            camelContext.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("direct:asyncStart")
                            .to("direct:abc");
                    from("direct:abc")
                            .bean(MyTestBean.class);
                }
            });
            ProducerTemplate template = camelContext.createProducerTemplate();
            camelContext.start();
            template.sendBody("direct:asyncStart", "Hello World");
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("Hello");
    }
}
