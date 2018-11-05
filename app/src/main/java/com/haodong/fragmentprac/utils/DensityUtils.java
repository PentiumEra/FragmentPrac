package com.haodong.fragmentprac.utils;

import android.content.Context;

/**
 * @author linghailong
 * @date on 2018/11/5
 * @email 105354999@qq.com
 * @describe :
 */
public class DensityUtils {

    /**
     * 根据手机的分辨率 dp 转 px
     *
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率 px 转 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * 获取屏幕宽度
     * @param context
     * @return
     */
    public static int getWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /**
     * 获取屏幕高度
     * @param context
     * @return
     */
    public static int getHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /**
     * 文字大小，sp 转 px
     * @param context
     * @param spValue
     * @return
     */
    public static int sp2px(Context context,float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
}
