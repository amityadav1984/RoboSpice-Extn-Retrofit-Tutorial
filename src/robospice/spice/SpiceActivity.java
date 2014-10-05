package robospice.spice;

import robospice.network.RestService;
import android.app.Activity;

import com.octo.android.robospice.SpiceManager;

/**
 * This class is the base class of all activities of the sample project. This class offers all
 * subclasses an easy access to a {@link SpiceManager} that is linked to the {@link Activity}
 * lifecycle. Typically, in a new project, you will have to create a base class like this one and
 * copy the content of the {@link SpiceActivity} into your own class.
 * @author sni
 */
public abstract class SpiceActivity extends Activity {
	
	/**
	 * Mapped SpiceService to SpiceManager
	 * 
	 * <service
	 * 		android:name=".network.RestService"
	 * 		android:exported="false" 
	 * />
	 * 
	 */
    private SpiceManager spiceManager = new SpiceManager(RestService.class);

    @Override
    protected void onStart() {
    	
    	/**
    	 * start the SpiceManager
    	 */
        spiceManager.start(this);
        super.onStart();
    }

    @Override
    protected void onStop() {
    	
    	/**
    	 * stop the SpiceManager
    	 */
        spiceManager.shouldStop();
        super.onStop();
    }

    protected SpiceManager getSpiceManager() {
    	
    	/**
    	 * SpiceManager getter
    	 */
        return spiceManager;
    }

}
