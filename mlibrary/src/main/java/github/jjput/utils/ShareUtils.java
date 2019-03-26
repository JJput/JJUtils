package github.jjput.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

/**
 * @作者: JJ
 * @QQ: 281138580
 * @创建时间: 2017/10/19 11:24
 * @Version 1.0
 * @描述: SharedPreferences封装
 */
public class ShareUtils {

    private static String name = "config";

    public static void setName(String name) {
        ShareUtils.name = name;
    }

    public static boolean putString(@NonNull Context mContext, @NonNull String key, @NonNull String value) {
        return putString(name, mContext, key, value);
    }

    public static boolean putString(@NonNull String fileName, @NonNull Context mContext, @NonNull String key, @NonNull String value) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        return sp.edit().putString(key, value).commit();
    }

    public static String getString(@NonNull Context mContext, @NonNull String key, @NonNull String defValue) {
        return getString(name, mContext, key, defValue);
    }

    public static String getString(@NonNull String fileName, @NonNull Context mContext, @NonNull String key, @NonNull String defValue) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    public static boolean putInt(@NonNull Context mContext, @NonNull String key, @NonNull int value) {
        return putInt(name, mContext, key, value);
    }

    public static boolean putInt(@NonNull String fileName, @NonNull Context mContext, @NonNull String key, @NonNull int value) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        return sp.edit().putInt(key, value).commit();
    }

    public static int getInt(@NonNull Context mContext, @NonNull String key, @NonNull int defValue) {
        return getInt(name, mContext, key, defValue);
    }

    public static int getInt(@NonNull String fileName, @NonNull Context mContext, @NonNull String key, @NonNull int defValue) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }

    public static boolean putBool(@NonNull Context mContext, @NonNull String key, @NonNull Boolean value) {
        return putBool(name, mContext, key, value);
    }

    public static boolean putBool(@NonNull String fileName, @NonNull Context mContext, @NonNull String key, @NonNull Boolean value) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        return sp.edit().putBoolean(key, value).commit();
    }

    public static Boolean getBool(@NonNull Context mContext, @NonNull String key, @NonNull Boolean defValue) {
        return getBool(name, mContext, key, defValue);
    }

    public static Boolean getBool(@NonNull String fileName, @NonNull Context mContext, @NonNull String key, @NonNull Boolean defValue) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    public static boolean delSingle(@NonNull Context mContext, @NonNull String key) {
        return delSingle(name, mContext, key);
    }

    public static boolean delSingle(@NonNull String fileName, @NonNull Context mContext, @NonNull String key) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        return sp.edit().remove(key).commit();
    }

    public static void delAll(@NonNull Context mContext) {
        delAll(name, mContext);
    }

    public static void delAll(@NonNull String fileName, @NonNull Context mContext) {
        SharedPreferences sp = mContext.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        sp.edit().clear().commit();
    }

}
