package resources;


//enum is special class in java which has constant collection of methods
public enum apiPath {
	ContentCreateAPI("/api/content/v1/create"),
	ReadContentAPI("/api/content/v1/read/"),
	PublishContentAPI("/action/content/v3/publish/");
	private String path;
	
	apiPath(String path)
	{
		this.path=path;
	}

	public String getResource()
	{
		return path;	
	}

}
