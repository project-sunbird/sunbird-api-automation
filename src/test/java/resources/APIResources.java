package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	createContentAPI("/api/private/content/v3/create"),
	getContentAPI("/api/private/content/v3/read/{do_id}"),
	updateContentAPI("/api/private/content/v3/update/{do_id}"),
	searchContentAPI("/api/content/v1/search"),
	courseEnrollAPI("/api/course/v1/enrol"),
	courseUnEnrollAPI("/api/course/v1/unenrol"),
	tocUploadAPI("/api/textbook/v1/toc/upload/{textbook-id}"),
	readOrgAPI("/api/org/v1/read"),
	updateLocationAPI("/api/data/v1/location/update"),
	createGroupAPI("/api/group/v1/create"),
	readGroupList("/api/group/v1/list"),
	createQuestionAPI("/api/question/v1/create"),
	createQuestionSetAPI("/api/questionset/v1/create");

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
