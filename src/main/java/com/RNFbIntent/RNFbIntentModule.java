package com.syarul.fbintent;

import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.MapBuilder;

/**
 * {@link NativeModule} that allows JS to open the default browser
 *  for an url.
 */
public class RNFbIntentModule extends ReactContextBaseJavaModule {

  ReactApplicationContext reactContext;

  public RNFbIntentModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "FbIntent";
  }

  @ReactMethod
  public void open(String pageId) {
    Intent intent;
    try {
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + pageId));
    } catch (Exception e) {
        intent =  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + pageId));
    }
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    this.reactContext.startActivity(intent);
  }
}
