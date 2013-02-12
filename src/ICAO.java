
public class ICAO {

		String clouds;
		String weatherCondition;
		String observation;
		int windDirection;
		String ICAOid;
		int seaLevelPressure;
		int elevation;
		
public ICAO(String _clouds,String _weatherCondition,String _observation,int _windDirection,String _ICAOid,int _seaLevelPressure,int _elevation){
	clouds = _clouds;
	weatherCondition = _weatherCondition;
	observation = _observation;
	windDirection = _windDirection;
	ICAOid = _ICAOid;
	seaLevelPressure = _seaLevelPressure;
	elevation = _elevation;
	
}

public String toString(){
		String result;
		
		result = ("Clouds: " +clouds + " \n" + 
				  "Weather Condition: " + weatherCondition + " \n" + 
				  "Observation: " + observation + " \n" + 
				  "Wind Direction: " + windDirection + " \n" +
				  "ICAO: " + ICAOid + " \n" +
				  "Sea Level Pressure: " + seaLevelPressure + " \n" +
				  "Elevation: " + elevation);
		return result;
}
}
