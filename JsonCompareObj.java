package code;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonCompareObj {

	static String data = "England";
	public static void main(String[] args) throws JSONException, FileNotFoundException, IOException, ParseException {
		testJson();
	}
	
	public static void testJson() throws JSONException, FileNotFoundException, IOException, ParseException {
		System.out.println(expectedJsonObject().equals(actualJsonObject()));
		Boolean status = actualJsonObject().toString().contains(data);
		System.out.println("Status is :"+ status);		
	}

	private static JSONObject expectedJsonObject() throws JSONException, FileNotFoundException, IOException, ParseException {
		 JSONParser parser = new JSONParser();
		 Object object = parser
                 .parse(new FileReader("C:\\Users\\swapnilband\\Documents\\workspace-sts-3.7.0.RELEASE\\daily-Code\\src\\code\\expected.json")); // Kindly replace expected.json file path here
		 return (JSONObject)object;
	}

	private static JSONObject actualJsonObject() throws JSONException, FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object object = parser
                .parse(new FileReader("C:\\Users\\swapnilband\\Documents\\workspace-sts-3.7.0.RELEASE\\daily-Code\\src\\code\\actual.json")); // Kindly replace actual.json file path here
		return (JSONObject)object;
	}
}