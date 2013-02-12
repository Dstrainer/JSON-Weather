
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;


public class JsonParsing {   
	public static void main(String[] args) throws Exception { 
		
		InputStream stream = JsonParsing.class.getResourceAsStream( "Jsontext.txt");
		 String jsonTxt = convertStreamToString(stream);
		
		JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );                
		double coolness = json.getDouble( "coolness" );        
		int altitude = json.getInt( "altitude" );        
		JSONObject pilot = json.getJSONObject("pilot");        
		String firstName = pilot.getString("firstName");        
		String lastName = pilot.getString("lastName");                
		System.out.println( "Coolness: " + coolness );        
		System.out.println( "Altitude: " + altitude );        
		System.out.println( "Pilot: " + lastName );    
	}

	 public static String convertStreamToString(InputStream is) throws Exception {
		    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		    StringBuilder sb = new StringBuilder();
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		      sb.append(line + "\n");
		    }
		    is.close();
		    return sb.toString();
		  }
}

