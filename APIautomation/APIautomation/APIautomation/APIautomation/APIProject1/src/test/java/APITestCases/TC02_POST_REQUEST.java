package APITestCases;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;


public class TC02_POST_REQUEST {

	@Test
	void RegisterSuccessfully()
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httpRequest=RestAssured.given();
		JSONObject requestparams=new JSONObject();
		requestparams.put("email", "eve.holt@reqres.in");
		requestparams.put("password", "pistol");
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestparams.toJSONString());
		Response response=httpRequest.request(Method.POST,"/api/register");
		String responseBody=response.body().asString();
		System.out.println("Response body is" +responseBody);
		
        int statusCode=response.getStatusCode();
        System.out.println("Status code is:" +statusCode);
        Assert.assertEquals(statusCode, 200);
        
        
	}
	
	
}
