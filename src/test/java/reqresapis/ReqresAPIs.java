package reqresapis;

import io.restassured.response.Response;
import restUtils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class ReqresAPIs {

    public Response createReqres(Map<String, Object> createReqresPayload) {

        String endPoint = (String) Base.dataFromJsonFile.get("createAPIEndpoint");
        return RestUtils.performPost(endPoint, createReqresPayload, new HashMap<>());

    }
}
