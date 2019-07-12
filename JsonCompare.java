package code;

import java.io.IOException;

public class JsonCompare {

	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
		JSONObject obj1 = new JSONObject("{'userId': 1,'id': 1,'title': sunt aut facere repellat provident occaecati excepturi optio reprehenderit,'body': quia et}");
		JSONObject obj2 = new JSONObject("{'userId': 1,'id': 1,'title': sunt aut facere repellat provident occaecati excepturi optio reprehenderit,'body': quia et}");
		System.out.println(jsonCheck(obj1,obj2));
	}
	
	public static boolean jsonCheck(JSONObject obj1,JSONObject obj2) throws IOException{
		final ObjectMapper mapper = new ObjectMapper();

		final JsonNode tree1 = mapper.readTree(obj1.toString());
		final JsonNode tree2 = mapper.readTree(obj2.toString());

		return tree1.equals(tree2);
	}
}