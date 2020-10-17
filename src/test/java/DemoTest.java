import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoTest {
	
	// not working site just for practice purpose
	@Test
	public void testGet() {	
		System.out.println("Get method called ...!");
		System.out.println("test csae 2");
		 Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		 System.out.println(resp.asString());
		 System.out.println(resp.getBody().asString());
	}
	
	@Test
	public void testGetProduct() {	
		System.out.println("Post method called ...!");
		
		// RestAssured.baseURI = "https://restcountries.eu/rest/v2/name/Germany";
		
//		RequestSpecification httpRequest = RestAssured.given();
//		
		Response response = RestAssured.get("https://restcountries.eu/rest/v2/name/Germany");
		
		//print the message body of the response received from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is => " + responseBody);
		
		Headers allHeaders = response.getHeaders();
		// Headers class implements Iterable interface.
		// Iterate over all the Headers using an advance for loop as shown in the code below
		for (Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
		
		JsonPath jsonPath= response.jsonPath();
		String countryName=jsonPath.getString("name[0]");
		// Print the name variable to see what we got
		System.out.println("Country Name"+countryName);
		//Validating the country name
		Assert.assertTrue(countryName.equals("Germany"));
	}
	
	@Test
	public void bddTest() {
		
	}
	
	
	@Test 
	public void testUseJsonParam() {
//		RestAssured.baseURI = "http://142.93.219.181:3000";
//		/*
//		* Get the RequestSpecification of the request that you want to sent to the
//		* server The server is specified bythe BaseURI that we have specified in the
//		* above step
//		*/
//		RequestSpecification request = RestAssured.given(); // Add a header stating the Request body is a JSON
//		request.header("Content-Type", "application/json"); // Create an object for JSONObject class
//		JSONObject requestParams = new JSONObject(); // We can add key-Value pairs using put method
//		requestParams.put("email", "jatinvsharma@gmail.com");
//		requestParams.put("password", "123123123");
//
//		request.body(requestParams.toString()); // Post the request and check the response
//		Response response = request.post("/user/signin"); // Obtain the response in string form
//		String apiResponse = response.asString();
//		System.out.println(apiResponse); // Asserting the response
//		Assert.assertTrue(apiResponse.contains("success"));
	}


}
