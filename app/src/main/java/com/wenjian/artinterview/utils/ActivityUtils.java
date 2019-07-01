package com.wenjian.artinterview.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Description ActivityUtils
 * <p>
 * Date 2019-06-29
 *
 * @author wenjianes@163.com
 */
public class ActivityUtils {


    public static void startActivity(Context context,Class<?> clz){
        Intent intent = new Intent(context,clz);
        context.startActivity(intent);
    }
}
