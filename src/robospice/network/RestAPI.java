package robospice.network;

import retrofit.http.GET;
import retrofit.http.Query;
import robospice.response.Response;

public interface RestAPI {
	
	/**
	 * Notice the Response this should be match throughout the Project
	 */
	@GET("/data/2.5/weather")
	Response getWeather(@Query("q") String city);	
}
