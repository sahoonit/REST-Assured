package Seasson_o3;

//import static io.restassured.RestAssured.baseURI;
//import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_PostMethod 
{
    @Test
	public void test03()
	{
		JSONObject jsonData = new JSONObject();
		jsonData.put("Name", "Prachi");
		jsonData.put("job", "QA");
		baseURI=("https://reqres.in/api/users");
		 given().
		 header("Content-type", "application/json").
		 contentType(ContentType.JSON).
		 body(jsonData.toJSONString()).
		 when().
		 post().
		 then().
		 statusCode(201).log().all();
	}
	
}
