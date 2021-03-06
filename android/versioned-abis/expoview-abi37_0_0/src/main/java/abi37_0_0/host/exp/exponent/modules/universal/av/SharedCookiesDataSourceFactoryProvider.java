package abi37_0_0.host.exp.exponent.modules.universal.av;

import android.content.Context;

import abi37_0_0.com.facebook.react.bridge.ReactContext;
import com.google.android.exoplayer2.upstream.DataSource;

import java.util.Map;

import abi37_0_0.org.unimodules.core.ModuleRegistry;
import host.exp.exponent.utils.ScopedContext;

public class SharedCookiesDataSourceFactoryProvider extends abi37_0_0.expo.modules.av.player.datasource.SharedCookiesDataSourceFactoryProvider {
  @Override
  public DataSource.Factory createFactory(Context context, ModuleRegistry moduleRegistry, String userAgent, Map<String, Object> requestHeaders) {
    ReactContext reactContext = null;
    if (context instanceof ReactContext) {
      reactContext = (ReactContext) context;
    } else if (context instanceof ScopedContext) {
      reactContext = (ReactContext) ((ScopedContext) context).getContext();
    }
    return new SharedCookiesDataSourceFactory(reactContext, userAgent, requestHeaders);
  }
}
