package org.hello.core.natives;

import com.futureplatforms.kirin.IKirinNativeObject;
import org.timepedia.exporter.client.Export;
import org.timepedia.exporter.client.ExportPackage;

/**
 * Created by douglashoskins on 03/05/2016.
 */
public interface HelloModuleNative extends IKirinNativeObject {
    void nativeMethod(String str);
}
