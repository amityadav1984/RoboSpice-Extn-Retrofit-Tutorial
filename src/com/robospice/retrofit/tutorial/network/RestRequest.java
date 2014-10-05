package com.robospice.retrofit.tutorial.network;

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.robospice.retrofit.tutorial.pojo.Response;

/**
 * 
 * RetrofitSpiceRequest<T,R>
 * T = Response
 * R = RestAPI
 */
public class RestRequest extends RetrofitSpiceRequest<Response, RestAPI> {
						
	private String city;
    public RestRequest(String city) {
    	
    	/**
    	 * RetrofitSpiceRequest(Class<T> clazz, Class<R> retrofitedInterfaceClass)
    	 * 
		 * RetrofitSpiceRequest<T,R>
		 * T = Response
		 * R = RestAPI
		 *     	 
    	 */    	
    	super(Response.class, RestAPI.class); 
    	
    	this.city = city;
    }

    /**
     * This is the method which does N/W stuff here also Response is same
     * 
     * NOTE: getService().{RestAPI method}
     * 
     */
    @Override
    public Response loadDataFromNetwork() {					
        return getService().getWeather(city);
    }
}
