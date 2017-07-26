import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SplitClass {
    void performSplit(CamelContext camelContext) throws Exception {
        final List<InputRequest> requestData = new ArrayList<InputRequest>();
        requestData.add(new InputRequest(getDateAfterDate(0), "English", "Manali"));
        requestData.add(new InputRequest(getDateAfterDate(2), "Arabic", "Khanna"));
        camelContext.addRoutes(new RouteConfig());
        ProducerTemplate template = camelContext.createProducerTemplate();
        camelContext.start();
        String concatenatedString = (String) template.requestBody("direct:asyncStart", requestData);
        System.out.println("Concatenated String : " + concatenatedString);
    }

    private static Date getDateAfterDate(int days) {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        date = c.getTime();
        return date;
    }
}
