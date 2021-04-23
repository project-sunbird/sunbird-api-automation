package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	createContentAPI("/api/private/content/v3/create"),
	getContentAPI("/api/private/content/v3/read/{do_id}"),
	updateContentAPI("/api/private/content/v3/update/{do_id}");
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
