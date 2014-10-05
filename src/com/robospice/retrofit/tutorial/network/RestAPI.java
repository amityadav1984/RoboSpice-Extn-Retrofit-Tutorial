package com.robospice.retrofit.tutorial.network;

import retrofit.http.GET;
import retrofit.http.Query;

import com.robospice.retrofit.tutorial.pojo.Response;

public interface RestAPI {
	
	/**
	 * Notice the Response this should be match throughout the Project
	 */
	@GET("/data/2.5/weather")
	Response getWeather(@Query("q") String city);	
}
