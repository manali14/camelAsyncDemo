import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelAsyncDemoMain {
    public static void main(String[] args) {
        CamelContext camelContext = new DefaultCamelContext();
        try {
//            Note: Following Code shows a Demo for using Split for Asynchronous Processing
            SplitClass splitClass = new SplitClass();
            splitClass.performSplit(camelContext);

//            Note: Following Code shows a Demo for using Multicast for Asynchronous Processing
            MultiCastClass multiCastClass = new MultiCastClass();
            multiCastClass.performMultiCast(camelContext);
        } catch (Exception e) {
            System.out.println("Exception occurred : " + e.getMessage());
        }
    }
}
