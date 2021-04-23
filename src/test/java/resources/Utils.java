package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	static Properties prop;
	public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	{
		
		if(req==null)
		{
		PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
		 req=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl"))
				 .addHeader("Content-Type", "application/json")
				 .addHeader("Authorization", prop.getProperty("authToken"))
				 .addHeader("x-authenticated-user-token", getAccessToken())
				 .addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
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
				.formParam("client_id", prop.getProperty("clientId"))
				.formParam("username",prop.getProperty("username") )
				.formParam("password",prop.getProperty("password") )
				.formParam("grant_type", prop.getProperty("grant_type"))
				.formParam("client_secret",prop.getProperty("client_secret") )
				.log().all()
				.when()
				.post(prop.getProperty("accessTokenurl"))
				.then().log().all().statusCode(200).extract().response();
		String accessToken=response.path("access_token");
		return accessToken;
	}
}
