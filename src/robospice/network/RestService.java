package robospice.network;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter.Builder;
import retrofit.RestAdapter.LogLevel;

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

public class RestService extends RetrofitGsonSpiceService {

	/**
	 * This should be define in XML
	 */
	private final static String BASE_URL = "http://api.openweathermap.org";
	
	

    @Override
    public void onCreate() {
        super.onCreate();
        
        /**
         * Register here your REST API class
         */
        addRetrofitInterface(RestAPI.class);		
    }

    /**
     * HostName
     */
    @Override
    protected String getServerUrl() {
        return BASE_URL;
    }	
    
    
    /**
     * RestAdapter
     */
	@Override
	protected Builder createRestAdapterBuilder() {					
		Builder builder = super.createRestAdapterBuilder();
		builder.setRequestInterceptor(new RequestInterceptor() {
			  @Override
			  public void intercept(RequestFacade request) {
				  
				  /**
				   * Intercept request typically add header parameter
				   */
			  }
		});
		/**
		 * Verbose mode
		 */
		builder.setLogLevel(LogLevel.FULL);		
		return builder;
	}    

}
