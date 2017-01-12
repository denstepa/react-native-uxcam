package com.trippple.RNUXCam;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.uxcam.UXCam;

public class RNUXCamModule extends ReactContextBaseJavaModule  {

    private final ReactApplicationContext reactContext;

    public RNUXCamModule(ReactApplicationContext reactContext) {

        super(reactContext);

        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNUXCam";
    }

    @ReactMethod
    public void isRecording(Promise promise){
        promise.resolve(UXCam.isRecording());
    }
    @ReactMethod
    public void setUser(final String userId) {
        UXCam.tagUsersName(userId);
    }

     @ReactMethod
     public void markSessionAsFavorite() {
         UXCam.markSessionAsFavorite();
     }

    @ReactMethod
    public void tagScreenName(final String screenName) {
        UXCam.tagScreenName(screenName);
    }

    @ReactMethod
    public void urlForCurrentUser(Promise promise) {
        promise.resolve(UXCam.urlForCurrentUser());
    }

    @ReactMethod
    public void urlForCurrentSession(Promise promise) {
        promise.resolve(UXCam.urlForCurrentSession());
    }

    @ReactMethod
    public void stopApplicationAndUploadData() {
      UXCam.stopApplicationAndUploadData();
    }
}
