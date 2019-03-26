package github.jjput.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @作者: JJ
 * @QQ: 281138580
 * @创建时间: 2017/10/19 11:24
 * @Version 1.0
 * @描述: SharedPreferences封装
 */
public class ShareUtils {

    private static final String NAME = "config";

    public static boolean putString(Context mContext, String key, String value) {
        if (mContext == null)
            return false;
        else if (key == null)
            return false;
        else if (value == null)
            return false;
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.edit().putString(key, value).commit();
    }

    public static String getString(Context mContext, String key, String defValue) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    public static boolean putInt(Context mContext, String key, int value) {
        if (mContext == null)
            return false;
        else if (key == null)
            return false;
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.edit().putInt(key, value).commit();
    }

    public static int getInt(Context mContext, String key, int defValue) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }

    public static boolean putBool(Context mContext, String key, Boolean value) {
        if (mContext == null)
            return false;
        else if (key == null)
            return false;
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.edit().putBoolean(key, value).commit();
    }

    public static Boolean getBool(Context mContext, String key, Boolean defValue) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    public static boolean delSingle(Context mContext, String key) {
        if (mContext == null)
            return false;
        else if (key == null)
            return false;

        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return sp.edit().remove(key).commit();
    }

    public static void delAll(Context mContext) {
        SharedPreferences sp = mContext.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }

}
