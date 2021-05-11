package resources;

import java.io.*;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.RequestLoggingFilter;
//import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {
	static Properties prop;
	public static RequestSpecification req;
	JSONParser parser = new JSONParser();
	Object obj = parser.parse(new FileReader("C:/Jenkinspath/testData.json"));
	JSONObject jsonObject = (JSONObject) obj;
	public  String baseuri=(String)jsonObject.get("baseUrl");
	public  String auth_key=(String)jsonObject.get("authToken");

	public Utils() throws IOException, ParseException {
	}

	public RequestSpecification requestSpecification() throws IOException
	{
		String baseuri=(String)jsonObject.get("baseUrl");
		String auth_key=(String)jsonObject.get("authToken");
		if(req==null)
		{
		//PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
		 req=new RequestSpecBuilder().setBaseUri(baseuri)
				 .addHeader("Content-Type", "application/json")
				 .addHeader("Authorization", auth_key)
				 .addHeader("x-authenticated-user-token", getAccessToken())
				 //.addFilter(RequestLoggingFilter.logRequestTo(log))
				 //.addFilter(ResponseLoggingFilter.logResponseTo(log))
		.setContentType(ContentType.JSON).build();
		 return req;
		}
		return req;
		
		
	}
	
	
	public static String getGlobalValue(String key) throws IOException
	{
		prop =new Properties();
		FileInputStream fis =new FileInputStream("src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	
		
		
	}
	
	
	public String getJsonPath(Response response,String key)
	{
		  String resp=response.asString();
		JsonPath   js = new JsonPath(resp);
		return js.get(key).toString();
	}
	public  String getAccessToken() {
		Response response= RestAssured.given()
				.header("Content-Type", "application/x-www-form-urlencoded")
				.formParam("client_id", (String)jsonObject.get("clientId"))
				.formParam("username",(String)jsonObject.get("username"))
				.formParam("password",(String)jsonObject.get("password"))
				.formParam("grant_type",(String)jsonObject.get("grant_type"))
				.formParam("client_secret",(String)jsonObject.get("client_secret"))
				.when()
				.post((String)jsonObject.get("accessTokenurl"))
				.then().statusCode(200).extract().response();
		String accessToken=response.path("access_token");
		return accessToken;
	}
	public RequestSpecification requestSpecificationFileUpload() throws IOException
	{

		if(req==null)
		{
			//PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
			req=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
					.addHeader("Content-Type", "multipart/json")
					.addHeader("Authorization", prop.getProperty("authToken"))
					.addHeader("x-authenticated-user-token", getAccessToken())
					//.addFilter(RequestLoggingFilter.logRequestTo(log))
				//	.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setContentType(ContentType.JSON).build();
			return req;
		}
		return req;


	}


}
