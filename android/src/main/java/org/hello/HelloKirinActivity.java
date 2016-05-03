package org.hello;

import android.os.Bundle;
import android.util.Log;
import com.futureplatforms.kirin.android.Kirin;
import com.futureplatforms.kirin.android.app.KirinActivity;
import org.hello.core.HelloModule;
import org.hello.core.natives.HelloModuleNative;

/**
 * Created by douglashoskins on 03/05/2016.
 */
public class HelloKirinActivity
    extends KirinActivity<HelloModule, HelloModuleNative>
    implements HelloModuleNative
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);
        getModule().kirinMethod("Hi from Android", 7654);
    }

    @Override
    public void nativeMethod(String str) {
        Log.d("HelloKirin", "Native method called: " + str);
    }
}
