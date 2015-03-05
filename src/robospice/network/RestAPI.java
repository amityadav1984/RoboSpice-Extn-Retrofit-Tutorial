package robospice.network;

import retrofit.http.GET;
import retrofit.http.Query;
import robospice.response.Response;

public interface RestAPI {
	
	/**
	 * Notice the Response this should be match throughout the Project
	 * 
	 * Not necessary this might be different with loadDataFromNetwork()
	 * 
	 * say, here we have ArrayList<String> and in loadDataFromNetwork() we can simply return String like below
	 * ArrayList<String>.get(0)
	 */
	@GET("/data/2.5/weather")
	Response getWeather(@Query("q") String city);	
}
