package apiTests;

 // import utils.*;

//import org.junit.runners.MethodSorters;
//import static org.junit.Assert.assertTrue;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;

public class Example1 {
	
//	private Response res = null;
//	private JsonPath jp = null;
//	
//	//@Before
//	public void setup() throws IOException {
//		Properties prop = new Properties();
//	
//		InputStream inputStr = new FileInputStream("/Users/vivekshivankar/eclipse-workspace/RestAssuredApiTest/src/main/java/utils/config.properties");
//		prop.load(inputStr);
//		System.out.println("Base URI : "+ prop.getProperty("BASE_URI"));
//		
//		RestUtils.setBaseURI(prop.getProperty("BASE_URI"));
//		RestUtils.setBasePath("search"); //Setup Base Path
//	    RestUtils.setContentType(ContentType.JSON); //Setup Content Type
//	    RestUtils.createSearchQueryPath("barack obama", "videos.json", "num_of_videos", "4"); //Construct the path
//	    res = RestUtils.getResponse(); //Get response
//	    jp = RestUtils.getJsonPath(res); //Get JsonPath
//	}
 
//	 // @Test
//	   public void T01_StatusCodeTest() {
//		 System.out.println("First test...!!");
//	       //Verify the http response status returned. Check Status Code is 200?
//	      HelperMethods.checkStatus200(res);
//	   }
	 
//	 @Test
//	 public void TC02_test() {
//		 System.out.println("test csae 2");
//		 Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
//		 System.out.println(resp.asString());
//		 System.out.println(resp.getBody().asString());
//	 }
//	
}	
