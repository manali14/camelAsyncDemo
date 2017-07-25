import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyTestBean implements Processor {
    static void test() {
        System.out.println("Hello");
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println("hello");
    }
}
