package Session04;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CheckForValidResponse 
{
    @Test
	public void GetSingleUser()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RequestSpecification requestspec = RestAssured.given();
		Response response = requestspec.get();
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200,"Correct Status Code recieved");
	}
}
