package resources;

public class Resources {
	
	public static String userCreateAPI()
	{
		String userCreateAPI="/api/user/v2/create";
		return userCreateAPI;
		
	}
	
	public static String userReadAPI(String st1)
	{
		String userReadAPI="/api/user/v3/read/"+st1+"";
		return userReadAPI;
		
	}
	
	public static String userUpdateAPI()
	{
		String userUpdateAPI="/api/user/v1/update";
		return userUpdateAPI;
		
	}

	public static String userSearchAPI()
	{
		String userSearchAPI="/api/user/v1/search";
		return userSearchAPI;
		
	}
	
	public static String userExistsAPI(String st2)
	{
		String userExistsAPI="/api/user/v1/exists/email/"+st2+"";
		return userExistsAPI;
		
	}
	
	public static String userConscentReadAPI()
	{
		String userConscentReadAPI="/api/user/v1/consent/read";
		return userConscentReadAPI;
		
	}
	
	public static String userFeedAPI(String st2)
	{
		String userFeedAPI="/api/user/v1/feed/"+st2+"";
		return userFeedAPI;
		
	}
	
	public static String getChannelAPI(String channelId)
	{
		String getChannelAPI="/api/channel/v1/read/"+channelId+"";
		return getChannelAPI;
		
	}
	public static String getFrameworkAPI(String frameworkId)
	{
		String getFrameworkAPI="/api/framework/v1/read/"+frameworkId+"";
		return getFrameworkAPI;
		
	}
	public static String generateDialCodeAPI()
	{
		String generateDialCodeAPI="/api/dialcode/v1/generate";
		return generateDialCodeAPI;
		
	}
	
	public static String addRegistryRecordAPI()
	{
		String addRegistryRecordAPI="/api/add";
		return addRegistryRecordAPI;
		
	}
	
	public static String createLicenseAPI()
	{
		String createLicenseAPI="/api/license/v3/create";
		return createLicenseAPI;
		
	}
}
