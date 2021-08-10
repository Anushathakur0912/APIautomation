package APITestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_GET_REQUEST {
	
	@Test
	void getemployeeDetails()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		//Request object
		RequestSpecification httpRequest=RestAssured.given();
		//Response object
		Response response=httpRequest.request(Method.GET,"employees");
		String responseBody=response.body().asString();
		System.out.println("Response body is:" +responseBody);
		
		//Status code validation
		int statusCode=response.getStatusCode();
		System.out.println("Status code is:" +statusCode);
		Assert.assertEquals(statusCode, 200);
		
		//StatusLine verification
		String statusLine=response.getStatusLine();
		System.out.println("Status Line is:" +statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
	}

}
