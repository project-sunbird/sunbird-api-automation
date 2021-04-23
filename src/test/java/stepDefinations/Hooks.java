package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{		//execute this code only when place id is null
		//write a code that will give you place id
		
		StepDefination m =new StepDefination();
		if(StepDefination.do_id==null)
		{
		
		m.createContentPayloadWith("test4", "Course", "application/vnd.ekstep.content-collection");
		m.user_calls_with_http_request("createContentAPI", "POST");
		m.verifyDo_idCreatedMapsToUsing("test4", "getContentAPI");
		}
		
		

	}
}
