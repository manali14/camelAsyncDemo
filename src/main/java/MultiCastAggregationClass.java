import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class MultiCastAggregationClass implements AggregationStrategy {
    public Exchange aggregate(Exchange exchange, Exchange exchange1) {
        if (exchange == null) {
            return exchange1;
        } else {
            String oldExchangeText = exchange.getIn().getBody(String.class);
            oldExchangeText += " " + exchange1.getIn().getBody(String.class);
            exchange.getIn().setBody(oldExchangeText, String.class);
            return exchange;
        }
    }
}
