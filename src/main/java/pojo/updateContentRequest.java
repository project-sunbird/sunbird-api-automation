package pojo;

import java.util.HashMap;
import java.util.Map;

public class updateContentRequest {
    private String versionKey;
    private String userConsent;
    private Trackable trackable;


    public String getVersionKey() {
        return versionKey;
    }

    public void setVersionKey(String versionKey) {
        this.versionKey = versionKey;
    }

    public String getUserConsent() {
        return userConsent;
    }

    public void setUserConsent(String userConsent) {
        this.userConsent = userConsent;
    }

    public Trackable getTrackable() {
        return trackable;
    }

    public void setTrackable(Trackable trackable) {
        this.trackable = trackable;
    }


}
