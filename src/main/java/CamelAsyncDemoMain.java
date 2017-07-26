public class CamelAsyncDemoMain {
    public static void main(String[] args) {
        try {
//            Note: Following Code shows a Demo for using Split for Asynchronous Processing
            SplitClass splitClass = new SplitClass();
            splitClass.performSplit();

//            Note: Following Code shows a Demo for using Multicast for Asynchronous Processing
            MultiCastClass multiCastClass = new MultiCastClass();
            multiCastClass.performMultiCast();
        } catch (Exception e) {
            System.out.println("Exception occurred : " + e.getMessage());
        }
    }
}
