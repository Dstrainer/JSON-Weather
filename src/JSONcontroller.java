	
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class JSONcontroller {
	private Scanner scan;
	private String[] temp = new String[1];
	
	public JSONcontroller(){ 
		
	}
	public void run()
	{
		this.getId();
		this.readId();
	}
	public void getId()
	{
		try{
			scan = new Scanner(new File("Codes.txt"));//scans through the Codes file
		}
		catch(Exception e){
			System.out.println("ID read error");
			
		}
	}
	public void readId(){
		while(scan.hasNext())
		{
			String id = scan.next();//while the scan has a next line store it in the id variable
			int i = 0;
			
		try{
	        URL geoNames;			
				geoNames = new URL("http://api.geonames.org/weatherIcaoJSON?ICAO="+id+"&formatted=true&username=dstrainer");//fill url with the id
			
	        URLConnection yc = geoNames.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
	        String inputLine;

	        while ((inputLine = in.readLine()) != null)//while the readline is not null add the input line to the string array
	        { 
	        	temp[i]+= inputLine+"\n";
	       
			}
	        in.close();//close out url connection
	        }
		catch (Exception e){
		}
	   }
		System.out.println(temp[0]);	
	}
	
	}
