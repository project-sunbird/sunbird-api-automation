package resources;

public class Resources {
	
	public static String ContentCreateAPI()
	{
		String ContentCreateAPI="/api/content/v1/create";
		return ContentCreateAPI;
	}
	
	public static String ContentUpdateAPI(String ContentId)
	{
		String ContentUpdateAPI="/api/content/v1/update/"+ContentId+"";
		return ContentUpdateAPI;
	}
	
	public static String contentPublish(String contentId)
	{
		String contentPublish="/api/content/v1/publish/"+contentId+"";
		return contentPublish;
	}
	
	public static String contentSearch()
	{
		String contentSearch="/api/content/v1/search";
		return contentSearch;
	}
	
	public static String contentRead(String contentid)
	{
		String contentRead="/api/content/v1/read/"+contentid+"";
		return contentRead;
	}
		
	public static String contentHierarchy(String contentId)
	{
		String contentHierarchy="/action/content/v3/hierarchy/"+contentId+"";
		return contentHierarchy;
	}
	public static String CompositeSearch()
	{
		String CompositeSearch="/api/composite/v1/search";
		return CompositeSearch;
	}
	
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
}
