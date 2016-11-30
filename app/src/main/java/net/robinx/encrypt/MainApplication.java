package net.robinx.encrypt;

import android.app.Application;

import net.robinx.lib.encrypt.conceal.ConcealHelper;

/**
 * Created by Robin on 2016/11/24 16:16.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ConcealHelper.init(this);
    }
}
