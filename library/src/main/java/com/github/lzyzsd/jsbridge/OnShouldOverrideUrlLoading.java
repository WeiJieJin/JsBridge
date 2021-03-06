package com.github.lzyzsd.jsbridge;

import android.graphics.Bitmap;
import android.webkit.WebView;

/**
 * @author hjhrq1991 created at 5/10/16 15:12.
 * @Description: 超链接回调
 */
public interface OnShouldOverrideUrlLoading {

    /**
     * @param view webview
     * @param url
     * @return
     * @Description: 非js桥的超链接回调回去自行处理
     * @author hjhrq1991 created at 5/10/16 15:12.
     */
    boolean onShouldOverrideUrlLoading(WebView view, String url);

    void onPageFinished(WebView view, String url);

    void onPageStarted(WebView view, String url, Bitmap bitmap);

    void onReceivedError(WebView view, int errorCode, String description, String failingUrl);


}
