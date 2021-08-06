package payload;

import org.apache.commons.lang3.RandomStringUtils;

import javax.print.DocFlavor;

public class payloads {
    public static String contentSearch(){
        return "{\n" +
                "  \"request\": {\n" +
                "    \"filters\": {\n" +
                "      \"objectType\": \"Content\",\n" +
                "      \"status\": []\n" +
                "    },\n" +
                "    \"limit\": 1\n" +
                "  }\n" +
                "}";
    }
    public static String courseEnroll(String courseId,String batchId,String userId){
        return "{\n" +
                "  \"request\": {\n" +
                "    \"courseId\": \""+courseId+"\",\n" +
                "    \"batchId\": \""+batchId+"\",\n" +
                "    \"userId\": \""+userId+"\"\n" +
                "  }\n" +
                "}";
    }
    public static String courseUnEnroll(String courseId,String batchId,String userId){
        return "{\n" +
                "  \"request\": {\n" +
                "    \"courseId\": \""+courseId+"\",\n" +
                "    \"batchId\": \""+batchId+"\",\n" +
                "    \"userId\": \""+userId+"\"\n" +
                "  }\n" +
                "}";
    }
    public static String readOrgDetail(String orgId){
        return "{\n" +
                "  \"request\": {\n" +
                "    \"organisationId\": \""+orgId+"\"\n" +
                "  }\n" +
                "}";
    }
    public static String updateLocation(String name,String locId){
        return "{\n" +
                "  \"request\": {\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"id\": \""+locId+"\"\n" +
                "  }\n" +
                "}";
    }
    public static String createGroup(String name,String des){
        return "{\n" +
                "  \"request\": {\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"description\": \""+des+"\"\n" +
                "  }\n" +
                "}";
    }
    public static String listGroupByUser(String userId){
        return "{\n" +
                "    \"request\": {\n" +
                "        \"filters\": {\n" +
                "            \"userId\": \""+userId+"\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

    public static String createQuestion(String mimeType,String primaryCategory){
        String questionName="question+" + System.currentTimeMillis();
        return "{\n" +
                "  \"request\": {\n" +
                "    \"question\": {\n" +
                "      \"name\": \""+questionName+"\",\n" +
                "      \"visibility\": \"Default\",\n" +
                "      \"code\": \"question.code\",\n" +
                "      \"editorState\": \"Random stuff\",\n" +
                "      \"mimeType\": \""+mimeType+"\",\n" +
                "      \"primaryCategory\": \""+primaryCategory+"\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }
    public static String createQuestionSet(String mimeType,String primaryCategory){
        String questionName="question+" + System.currentTimeMillis();
        return "{\n" +
                "  \"request\": {\n" +
                "    \"questionset\": {\n" +
                "      \"code\": \"finemanfine\",\n" +
                "      \"navigationMode\": \"linear\",\n" +
                "      \"allowSkip\": \"Yes\",\n" +
                "      \"requiresSubmit\": \"Yes\",\n" +
                "      \"shuffle\": true,\n" +
                "      \"showFeedback\": \"Yes\",\n" +
                "      \"showSolutions\": \"Yes\",\n" +
                "      \"summaryType\": \"Complete\",\n" +
                "      \"mimeType\": \""+mimeType+"\",\n" +
                "      \"primaryCategory\": \""+primaryCategory+"\",\n" +
                "      \"name\": \""+questionName+"\",\n" +
                "      \"visibility\": \"Default\",\n" +
                "      \"description\": \"Questionset description\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }
    public static String createUser(){
        String emailId ="email+"+System.currentTimeMillis()+"@yopmail.com";;
        return "{\n" +
                "  \"request\": {\n" +
                "    \"firstName\": \"selfdeclaredev2\",\n" +
                "    \"email\": \""+emailId+"\",\n" +
                "    \"lastName\": \"selfdeclaredev2\",\n" +
                "    \"emailVerified\": true,\n" +
                "    \"password\": \"Password@1\"\n" +
                "  }\n" +
                "}";

    }
    public static String updateUser(String userId){
        long phoneNumber = (long)(Math.random()*100000 + 6633300000L);
    return "{\n" +
            "  \"request\": {\n" +
            "    \"userId\": \""+userId+"\",\n" +
            "    \"phone\": "+phoneNumber+",\n" +
            "    \"phoneVerified\": true\n" +
            "  }\n" +
            "}";
    }
    public static String generateDialCode()
  {
        return "{\n" + 
        		"  \"request\": {\n" + 
        		"    \"dialcodes\": {\n" + 
        		"      \"count\": 5,\n" + 
        		"      \"publisher\": \"Sunbird21\",\n" + 
        		"       \"qrCodeSpec\" : {\n" + 
        		"                \"width\": 30,\n" + 
        		"                \"height\": 30,\n" + 
        		"                \"border\": 12,\n" + 
        		"                \"text\": \"true\",\n" + 
        		"                \"errCorrectionLevel\": \"H\",\n" + 
        		"                \"color\": \"100,0,0,100\"\n" + 
        		"            }\n" + 
        		"    \n" + 
        		"    }\n" + 
        		"  }\n" + 
        		"}";
    }

    public static String addRegistryRecord()
    {
        return "{\n" +
                "    \"request\": {\n" +
                "\"opensaberapiTeacher\": {\n" +
                "\"signatures\": [],\n" +
                "\"serialNum\": 8,\n" +
                "\"teacherCode\": \"1223h4d\",\n" +
                "\"nationalIdentifier\": \"1234567890123456\",\n" +
                "\"teacherName\": \"Marvin Pande\",\n" +
                "\"gender\": \"GenderTypeCode-MALE\",\n" +
                "\"birthDate\": \"1990-12-06T00:00:00.000Z\",\n" +
                "\"socialCategory\": \"SocialCategoryTypeCode-GENERAL\",\n" +
                "\"highestAcademicQualification\": \"AcademicQualificationTypeCode-PHD\",\n" +
                "\"highestTeacherQualification\": \"TeacherQualificationTypeCode-MED\",\n" +
                "\"yearOfJoiningService\": \"2014\",\n" +
                "\"teachingRole\": {},\n" +
                "\"inServiceTeacherTrainingFromBRC\": {},\n" +
                "\"inServiceTeacherTrainingFromCRC\": {},\n" +
                "\"inServiceTeacherTrainingFromDIET\": {},\n" +
                "\"inServiceTeacherTrainingFromOthers\": {},\n" +
                "\"nonTeachingAssignmentsForAcademicCalendar\": {},\n" +
                "\"basicProficiencyLevel\": [],\n" +
                "\"disabilityType\": \"DisabilityCode-NA\",\n" +
                "\"trainedForChildrenSpecialNeeds\": \"YesNoCode-YES\",\n" +
                "\"trainedinUseOfComputer\": \"YesNoCode-YES\"\n" +
                "}\n" +
                "}\n" +
                "}";
    }

    public static String createLicense()
    {

        String license = RandomStringUtils.randomAlphanumeric(5);
        return "{\n" +
                "  \"request\": {\n" +
                "    \"license\": {\n" +
                "      \"name\": \""+license+"\",\n" +
                "      \"url\": \"www.url.com\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

    public static String searchUser(String emailId){
        return "{\n" +
                "  \"request\": {\n" +
                "    \"filters\": {\n" +
                "      \"email\": \""+emailId+"\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }

}
