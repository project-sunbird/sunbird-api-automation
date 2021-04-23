package resources;

import io.restassured.path.json.JsonPath;

public class reUseableMethods {
	public static JsonPath RawToJson(String response)
	{
	
		JsonPath js = new JsonPath(response);
		return js;
	}

}