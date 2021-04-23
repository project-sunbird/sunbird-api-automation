package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.*;

public class TestDataBuild {

	
	
	public createContent createContentPayload(String name,String contentType,String mimetype)
	{
	    createContent cc=new createContent();
		Content cn=new Content();
		Request cr=new Request();
        cn.setName(name);
        cn.setMimeType(mimetype);
        cn.setDescription("test");
        cn.setContentType(contentType);
        cn.setCode("test");
        cr.setContent(cn);
        cc.setRequest(cr);

        return cc;


	}
	
	public updateContent updateContenetPayload(){
		updateContent uc=new updateContent();
		updateRequest ur=new updateRequest();
		updateContentRequest ucr=new updateContentRequest();
		Trackable ut=new Trackable();
        ucr.setVersionKey("1599566566665");
        ucr.setUserConsent("Yes");
        ut.setAutoBatch("Yes");
        ut.setEnabled("Yes");
        ur.setContent(ucr);
        ucr.setTrackable(ut);
        uc.setRequest(ur);

        return uc;
	}
}
