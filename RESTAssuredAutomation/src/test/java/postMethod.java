import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postMethod 

{
	@Test
	public void testpost() 
	{
	JSONObject jo= new JSONObject();
	jo.put("Name", "sahoo");
	jo.put("job", "Software");
	
	RestAssured.baseURI="https://reqres.in/api/users";
	RestAssured.given().header("Content-type","application/json").
	contentType(ContentType.JSON).
	body(jo.toJSONString()).
	when().
	post().then().statusCode(201).log().all();
	
		
	}
	public class putMethod 

	{
		@Test
		public void testput() 
		{
		JSONObject jo= new JSONObject();
		jo.put("Name", "sahoo");
		jo.put("job", "QA");
		
		RestAssured.baseURI="https://reqres.in/api/users/997";
		RestAssured.given().header("Content-type","application/json").
		contentType(ContentType.JSON).
		body(jo.toJSONString()).
		when().
		put().then().statusCode(200).log().all();
		
			
		}
		@Test
		public class patchMethod 

		{
			@Test
			public void testpatch() 
			{
			JSONObject jo= new JSONObject();
			jo.put("Name", "nitai");
			jo.put("job", "QA");
			
			RestAssured.baseURI="https://reqres.in/api/users/997";
			RestAssured.given().header("Content-type","application/json").
			contentType(ContentType.JSON).
			body(jo.toJSONString()).
			when().
			patch().then().statusCode(200).log().all();
			
				
			}
	
	}	
	}
}
