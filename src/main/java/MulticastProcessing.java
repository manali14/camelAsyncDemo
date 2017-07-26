import java.util.Date;

public class MulticastProcessing {
    public String route1() throws Exception {
        System.out.println("In Route 1 : Request received at : " + new Date());
        Thread.sleep(1000);
        return "Hello!";
    }

    public String route2() throws Exception {
        System.out.println("In Route 2 : Request received at : " + new Date());
        Thread.sleep(1000);
        return "Manali";
    }

    public String route3() throws Exception {
        System.out.println("In Route 3 : Request received at : " + new Date());
        Thread.sleep(1000);
        return "Khanna";
    }
}
