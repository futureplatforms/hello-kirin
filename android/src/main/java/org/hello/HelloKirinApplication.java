package org.hello;

import android.app.Application;
import com.futureplatforms.kirin.android.Kirin;

/**
 * Created by douglashoskins on 03/05/2016.
 */
public class HelloKirinApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Kirin.kickOff(this, false);
    }
}
