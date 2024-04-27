package Seasson_o3;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test_DeleteMethod 
{
    @Test
	public void test06()
	{
		RestAssured.baseURI = "https://reqres.in/api/users/545";
		RestAssured.given().
		when().
		delete().
		then().log().all().
		statusCode(204);
	}
}
