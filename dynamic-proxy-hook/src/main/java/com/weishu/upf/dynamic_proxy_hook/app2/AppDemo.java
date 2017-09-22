package com.weishu.upf.dynamic_proxy_hook.app2;

import android.app.Application;
import android.content.Context;

import com.weishu.upf.dynamic_proxy_hook.app2.hook.HookHelper;

/**
 * Created by yumodev on 17/9/22.
 */

public class AppDemo extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        try {
            HookHelper.attachContext();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
