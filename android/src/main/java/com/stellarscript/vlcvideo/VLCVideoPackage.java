package com.stellarscript.vlcvideo;

import android.support.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class VLCVideoPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(@NonNull final ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(@NonNull final ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(new VLCVideoViewManager());
    }

}
