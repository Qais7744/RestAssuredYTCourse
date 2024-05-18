package reqresapis;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.ExtentReportManager;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReqresPostTest extends ReqresAPIs {
    @BeforeMethod
    public void configure() {
        ExtentReportManager.getReportNameWithTimeStamp();
    }

    @Test
    public void ReqresPost() throws IOException {

        Map<String, Object> payload = Payloads.getReqresPostPayloadFromMap("Altamash","Software Engineer");
        Response response =  createReqres(payload);
        Assert.assertEquals(response.statusCode(),201);
    }
}
