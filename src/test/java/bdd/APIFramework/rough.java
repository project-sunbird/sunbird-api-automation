package bdd.APIFramework;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class rough {
    public static void main(String[] args) throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("C:/Users/admin/Desktop/testData.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("baseUrl");
            String course = (String) jsonObject.get("Course");
            JSONArray subjects = (JSONArray) jsonObject.get("Subjects");
            System.out.println("Name: " + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
