package cc.hobot.shopping.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cc.hobot.shopping.R;
import cc.hobot.shopping.contant.ShoppingConstants;
import cc.hobot.shopping.util.ActivityUtils;
import cc.hobot.shopping.util.PrefUtils;

public class SplashActivity extends AppCompatActivity {
    /**
     * 是否第一次进入引导界面
     */
    private boolean isFirstEnter = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        isFirstEnter = PrefUtils.getBooleanValue(this, ShoppingConstants.ENTER_SPLASH_FLAG);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(isFirstEnter) {
                    //第一次启动App
                    ActivityUtils.switchActivity(SplashActivity.this, GuideActivity.class, true);
                } else {
                    ActivityUtils.switchActivity(SplashActivity.this, MainActivity.class, true);
                }
            }
        }, 3000);
    }

}
