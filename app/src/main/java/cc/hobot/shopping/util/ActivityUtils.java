package cc.hobot.shopping.util;

import android.app.Activity;
import android.content.Intent;

/**
 * Activity工具类
 */

public class ActivityUtils {
    /**
     * 从当前的Activity进入到下一个Activity
     * @param activity 当前的Activity
     * @param clz 下一个Activity
     * @param isFinishActivity 是否finish结束当前Activity
     */
    public static void switchActivity(Activity activity, Class<? extends Activity> clz, boolean isFinishActivity) {
        Intent intent = new Intent(activity, clz);
        activity.startActivity(intent);

        if(isFinishActivity) {
            activity.finish();
        }
    }
}
