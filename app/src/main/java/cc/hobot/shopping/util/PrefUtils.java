package cc.hobot.shopping.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreference 工具类
 */

public class PrefUtils {

    public static int getIntValue(Context context, String key) {
        if (context != null) {
            SharedPreferences pref = context.getApplicationContext().getSharedPreferences("config", Context.MODE_PRIVATE);
            return pref.getInt(key, 0);
        }
        return 0;
    }

    public static boolean getBooleanValue(Context context, String key) {
        if(context != null) {
            SharedPreferences pref = context.getApplicationContext().getSharedPreferences("config", Context.MODE_PRIVATE);
            return pref.getBoolean(key, true);
        }

        return false;
    }

    public static void setValue(Context context, String key, int value) {
        if(context == null) {
            throw new IllegalArgumentException("the context must not be a null");
        }

        SharedPreferences pref = context.getApplicationContext().getSharedPreferences("config", Context.MODE_PRIVATE);
        pref.edit().putInt(key, value).apply();
    }

    public static void setValue(Context context, String key, boolean value) {
        if(context == null) {
            throw new IllegalArgumentException("the context must not be a null");
        }

        SharedPreferences pref = context.getApplicationContext().getSharedPreferences("config", Context.MODE_PRIVATE);
        pref.edit().putBoolean(key, value).apply();
    }
}
