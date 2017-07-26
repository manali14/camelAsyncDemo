import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Date;

public class InputProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("Request received at: " + new Date());
        InputRequest inputRequest = exchange.getIn().getBody(InputRequest.class);
        OutputResponse outputResponse = new OutputResponse(inputRequest);
        Thread.sleep(1000);
        exchange.getIn().setBody(outputResponse, OutputResponse.class);
    }
}
