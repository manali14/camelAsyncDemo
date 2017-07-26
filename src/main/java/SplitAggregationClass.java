import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class SplitAggregationClass implements AggregationStrategy {
    public Exchange aggregate(Exchange exchange, Exchange exchange1) {
        try {
            String concatenatedString = "";
            OutputResponse outputResponse = exchange1.getIn().getBody(OutputResponse.class);
            int splitIndex = exchange1.getProperty("CamelSplitIndex", int.class);
            if (exchange != null) {
                concatenatedString = exchange.getIn().getBody(String.class);
                concatenatedString += " " + outputResponse.getInputRequest().getName();
            } else {
                exchange = exchange1;
                concatenatedString += "Hello! " + outputResponse.getInputRequest().getName();
            }
            System.out.println("Split Index : " + splitIndex + " in Aggregation class with Response : " + outputResponse);
            exchange.getIn().setBody(concatenatedString);
        } catch (Exception e) {
            System.out.println("Exception occurred while performing Aggregation");
        }
        return exchange;
    }
}
