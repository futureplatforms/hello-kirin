package org.hello.core;

import com.futureplatforms.kirin.KirinModule;
import com.futureplatforms.kirin.dependencies.StaticDependencies;
import com.futureplatforms.kirin.dependencies.StaticDependencies.LogDelegate;
import com.futureplatforms.kirin.dependencies.StaticDependencies.NetworkDelegate;
import com.futureplatforms.kirin.dependencies.StaticDependencies.NetworkDelegate.HttpVerb;
import com.futureplatforms.kirin.dependencies.StaticDependencies.NetworkDelegate.NetworkResponse;
import com.google.gwt.core.client.GWT;
import org.hello.core.natives.HelloModuleNative;
import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportPackage;

import java.util.Map;

/**
 * Created by douglashoskins on 03/05/2016.
 */
@Export(value = "HelloModule", all = true)
@ExportPackage("screens")
public class HelloModule extends KirinModule<HelloModuleNative> {

    public HelloModule() { super(GWT.<HelloModuleNative> create(HelloModuleNative.class)); }

    public void kirinMethod(String str, int i) {
        getNativeObject().nativeMethod("Hello from Kirin!  " + str + ", " + i);
        final StaticDependencies deps = StaticDependencies.getInstance();
        final LogDelegate ld = deps.getLogDelegate();
        deps.getLogDelegate().log("Logging via the logging delegate");

        NetworkDelegate net = deps.getNetworkDelegate();
        net.doHttp(HttpVerb.GET, "https://www.google.co.uk", new NetworkResponse() {

            public void onSuccess(int res, String result, Map<String, String> headers) {
                ld.log("Network SUCCESS :: " + result);
            }

            public void onFail(String code) {
                ld.log("Network FAIL :: " + code);
            }
        });
    }
}
