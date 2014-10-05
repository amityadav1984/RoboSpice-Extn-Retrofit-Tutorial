package com.robospice.retrofit.tutorial;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;
import com.robospice.retrofit.tutorial.network.RestRequest;
import com.robospice.retrofit.tutorial.pojo.Response;

public class MainActivity extends SpiceActivity {

    private RestRequest restRequest;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.main);
        
        /**
         * pass City name for request parameter
         */
        restRequest = new RestRequest("Hyderabad,ind");
    }

    @Override
    protected void onStart() {
        super.onStart();
        getSpiceManager().execute(restRequest, new RestRequestListener());
    }

    /**
     * RequestListener<RESULT>
     * void onRequestSuccess(RESULT result)
     */
    public final class RestRequestListener implements RequestListener<Response> {
        @Override
        public void onRequestFailure(SpiceException spiceException) {
            Toast.makeText(MainActivity.this, "failure", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onRequestSuccess(final Response result) {
//            Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
        	updateScreen(result);
        }
    }
    
    private void updateScreen(final Response result){
    	//setContentView(R.layout.main);
    	((TextView)findViewById(R.id.cityName)).setText(result.getName());
    	((TextView)findViewById(R.id.longitudeValue)).setText(""+result.getCoord().getLon());
    	((TextView)findViewById(R.id.latitudeValue)).setText(""+result.getCoord().getLat());
    	((TextView)findViewById(R.id.temperatureValue)).setText(""+result.getMain().getTemp());
    	((TextView)findViewById(R.id.pressureValue)).setText(""+result.getMain().getPressure());
    	((TextView)findViewById(R.id.humidityValue)).setText(""+result.getMain().getHumidity());
    	((TextView)findViewById(R.id.windValue)).setText(""+result.getWind().getSpeed());
    }
}
