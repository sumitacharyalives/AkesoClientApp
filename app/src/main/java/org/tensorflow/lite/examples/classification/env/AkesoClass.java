package org.tensorflow.lite.examples.classification.env;

import android.util.Log;

import com.example.akesocaresdk.AKesoSdkMethodsImpl;
import com.example.akesocaresdk.AkesoSdkMethods;

public class AkesoClass {

    public void onCreate(){
        AkesoSdkMethods akesoSdkMethods = new AKesoSdkMethodsImpl();
        akesoSdkMethods.init();
        Log.d("TAG","user authenticated: "+akesoSdkMethods.authenticateApiKey("testKey"));
    }
}
