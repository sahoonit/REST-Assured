package Seasson_o3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

//import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_GetMethod 
{
 //@Test	
 public void testo1() 
 {
	 Response response =get("https://reqres.in/api/users?page=2");
	 System.out.println("Response code:" +response.getStatusCode());
	 System.out.println("Response Body:" +response.getBody().asString());
	 System.out.println("Response Time:" +response.getTime());
	 System.out.println("Response Header:" +response.getHeader("Contant-Type"));
	 
	 int expectedstatuscode = 200;
	 int actualstatuscode = response.getStatusCode();
	 
	 Assert.assertEquals(expectedstatuscode, actualstatuscode);
	 
	 
 }
 @Test
 public void test02()
 {
	 // given, when, then
	 
	 baseURI=("https://reqres.in/api/users");
	 given().
	 queryParam("page", "2").
	 when().
	 get().
	 then().
	 statusCode(200);
	 
 }
 
 
 
}
