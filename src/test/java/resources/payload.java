package resources;

public class payload {
	
	public static String AddContent(String name , String description, String createdBy)
	{
		return"{\n" + 
				"    \"request\": {\n" + 
				"        \"content\": {\n" + 
				"            \"code\": \"test\",\n" + 
				"            \"name\": \"testResource"+name+"\",\n" + 
				"            \"mimeType\": \"application/pdf\",\n" + 
				"            \"contentType\": \"Resource\",\n" + 
				"            \"description\": \"test"+description+"\",\n" + 
				"            \"createdBy\":\""+createdBy+"\" ,\n" + 
				"            \"channel\":\"01269878797503692810\"\n" + 
				"            \n" + 
				"        }\n" + 
				"    }\n" + 
				"}";
		
	}
	
	public static String ContentPublish()
	{
		return"{\n" + 
				"  \"request\": {\n" + 
				"    \"content\": {\n" + 
				"      \"publisher\": \"EkStep\",\n" + 
				"      \"lastPublishedBy\": \"Ekstep\",\n" + 
				"      \"publishComment\":\"OK\",\n" + 
				"      \"publishChecklist\":[]\n" + 
				"    }\n" + 
				"  }\n" + 
				"}";
		
	}
	
	public static String SearchContent(String contentId)
	{
		return "{\n" + 
				"    \"request\": {\n" + 
				"      \"query\" : \"\",\n" + 
				"        \"filters\":{\n" + 
				"          \n" + 
				"          \"identifier\": \""+contentId+"\"\n" + 
				"        },\n" + 
				"        \"sort_by\" : {\"createdOn\" : \"desc\"}\n" + 
				"    },\n" + 
				"    \"params\" : {\n" + 
				"    \n" + 
				"    }\n" + 
				"}\n" + 
				"";
	}
	
	public static String CompositeSearch()
	{
		return "{\n" + 
				"  \"request\": { \n" + 
				"    \"filters\" : {\n" + 
				"      \"status\":\"Live\"\n" + 
				"    },\n" + 
				"    \"limit\":5\n" + 
				"    \n" + 
				"  }\n" + 
				"}";
	}
	
	public static String contentUpdateAPI (String versionKey)
	{
		return "{\n" + 
				"  \"request\": {\n" + 
				"    \"content\": {\n" + 
				"      \"name\" : \"Updated newly 30-34\",\n" + 
				"      \"description\" : \"Updated EPUB5\",\n" + 
				"     \"versionKey\": \""+versionKey+"\"\n" + 
				"    }\n" + 
				"  }\n" + 
				"}";
	}
	
	public static String userCreateAPI()
	{
	
		String emailAddress = "test+" + System.currentTimeMillis() + "@yopmail.com";
		
		return "{\n" + 
				"	\"request\"  :{               \n" + 
				"      \"firstName\": \"Creator\",\n" + 
				"      \"lastName\":\"test\",\n" + 
				"      \"email\":\""+emailAddress+"\",\n" + 
				"      \"emailVerified\": true,\n" + 
				"      \"password\":\"Test@123\"\n" + 
				"  \n" + 
				"         }\n" + 
				"}";
		
	}
	
	public static String userCreateAPI_withExistingEmail(String test)
	{
		return "{\n" + 
				"	\"request\"  :{               \n" + 
				"      \"firstName\": \"Creator\",\n" + 
				"      \"lastName\":\"test\",\n" + 
				"      \"email\":\""+test+"\",\n" + 
				"      \"emailVerified\": true,\n" + 
				"      \"password\":\"Test@123\"\n" + 
				"  \n" + 
				"         }\n" + 
				"}";
		
	}
	
	public static String userCreateAPI_withInvalidEmailFormat(String test)
	{
		return "{\n" + 
				"	\"request\"  :{               \n" + 
				"      \"firstName\": \"Creator\",\n" + 
				"      \"lastName\":\"test\",\n" + 
				"      \"email\":\""+test+"\",\n" + 
				"      \"emailVerified\": true,\n" + 
				"      \"password\":\"Test@123\"\n" + 
				"  \n" + 
				"         }\n" + 
				"}";
		
	}
	
	public static String userCreateAPI_withInvalidPasswordFormat(String test)
	{
		return "{\n" + 
				"	\"request\"  :{               \n" + 
				"      \"firstName\": \"Creator\",\n" + 
				"      \"lastName\":\"test\",\n" + 
				"      \"email\":\"testaccount@yopmail.com\",\n" + 
				"      \"emailVerified\": true,\n" + 
				"      \"password\":\"\"+test+\"\"\n" + 
				"  \n" + 
				"         }\n" + 
				"}";
		
	}
	
	public static String userUpdateAPI(String str1,String str2)
	{
		return "{\n" + 
				"  \"request\": {\n" + 
				"    \"userId\": \""+str2+"\",\n" + 
				"    \"firstName\": \""+str1+"\",\n" + 
				"    \"lastName\": \"Prabha\"\n" + 
				"  }\n" + 
				"}";
		
	}
	
	
	public static String userUpdateAPI_withoutUserId(String str1)
	{
		return "{\n" + 
				"  \"request\": {\n" +  
				"    \"firstName\": \""+str1+"\",\n" + 
				"    \"lastName\": \"Prabha\"\n" + 
				"  }\n" + 
				"}";
		
	}
	
	public static String userSearch_with_userName(String username)
	{
		return "{\n" + 
				"  \"request\": {\n" + 
				"    \"filters\": {\n" + 
				"      \"userName\" :\""+username+"\"\n" + 
				"    },\n" + 
				"    \"limit\": 500\n" + 
				"  }\n" + 
				"}";
	}
	
	public static String userSearch_with_userId(String userId)
	{
		return "{\n" + 
				"  \"request\": {\n" + 
				"    \"filters\": {\n" + 
				"      \"id\" :\""+userId+"\"\n" + 
				"    },\n" + 
				"    \"limit\": 500\n" + 
				"  }\n" + 
				"}";
	}
	
	public static String userSearch_with_email(String email)
	{
		return "{\n" + 
				"  \"request\": {\n" + 
				"    \"filters\": {\n" + 
				"      \"email\" :\""+email+"\"\n" + 
				"    },\n" + 
				"    \"limit\": 500\n" + 
				"  }\n" + 
				"}";
	}
	
	public static String userSearch_with_firstName(String name)
	{
		return "{\n" + 
				"  \"request\": {\n" + 
				"    \"filters\": {\n" + 
				"      \"firstName\" :\""+name+"\"\n" + 
				"    },\n" + 
				"    \"limit\": 500\n" + 
				"  }\n" + 
				"}";
	}
	
	public static String userSearch_with_createdBy(String createdBy)
	{
		return "{\n" + 
				"  \"request\": {\n" + 
				"    \"filters\": {\n" + 
				"      \"createdBy\" :\""+createdBy+"\"\n" + 
				"    },\n" + 
				"    \"limit\": 500\n" + 
				"  }\n" + 
				"}";
	}
	
	public static String userConscentRead(String userId ,String consumerId, String objectId)
	{
		return "{\n" + 
				"    \"request\": {\n" + 
				"        \"consent\": {\n" + 
				"            \"filters\": {\n" + 
				"                \"userId\": \""+userId+"\",\n" + 
				"                \"consumerId\": \""+consumerId+"\",\n" + 
				"                \"objectId\": \""+objectId+"\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    }\n" + 
				"}";
	}

}
