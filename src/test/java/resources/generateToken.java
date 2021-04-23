package resources;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.generateToken;
import resources.Utils;

public class generateToken {

	
	public static String GTOKEN (String token) throws IOException{

		    
		RequestSpecification res;
		Response resspec;
		
	    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
	    	
			 res = given().log().all().config(RestAssured.config()
				     .encoderConfig(EncoderConfig.encoderConfig()
				     .encodeContentTypeAs("x-www-form-urlencoded",
				     ContentType.URLENC)))
				     .contentType("application/x-www-form-urlencoded")
				      .formParam("client_id", "google-auth")
				      .formParam("grant_type", "password")
				      .formParam("client_secret", "CLIENT_SECRET")
				      .formParam("username", "USER_EMAIL").request();
			 
			    resspec = res.post("/auth/realms/sunbird/protocol/openid-connect/token");
			    String result = resspec.then().extract().response().asString();
			    JsonPath js = new JsonPath(result);
			    String access_token= js.getString("access_token");
			    //System.out.println(access_token);
			    return access_token;
	}

}
