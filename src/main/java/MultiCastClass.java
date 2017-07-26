import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

public class MultiCastClass {

    public void performMultiCast() throws Exception {
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new RouteConfig());
        ProducerTemplate template = camelContext.createProducerTemplate();
        camelContext.start();
        String concatenatedString = (String) template.requestBody("direct:multicastAsyncStart", "hey");
        System.out.println("Concatenated String from Multicast : " + concatenatedString);
    }
}
