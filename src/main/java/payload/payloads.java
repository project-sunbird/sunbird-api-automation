package payload;

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
                "  \"reuqest\": {\n" +
                "    \"userId\": \""+userId+"\"\n" +
                "  }\n" +
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
                "      \"shuffle\": \"Yes\",\n" +
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
}
