
package com.reactlibrary;

import java.io.IOException;
import android.util.Log;
import com.facebook.react.bridge.*;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.meituan.android.walle.WalleChannelReader;

public class RNChannelModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNChannelModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNChannel";
  }

  @ReactMethod
  public void getChannelInfo(final Promise promise) {

    new Thread(new Runnable() {

      @Override
      public void run() {

        // 获取渠道信息
        String channel = WalleChannelReader.getChannel(getReactApplicationContext());
        if (channel != null) {
          promise.resolve(channel);
        } else {
          promise.reject("0", "Get Channel failed");
        }
      }
    }).start();
  }

}
