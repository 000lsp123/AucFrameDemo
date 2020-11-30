package com.lsp.feature1.pkg.main;

import android.content.Context;
import android.content.Intent;

import com.lsp.common.activity.CommonActivity;

/**
 * Copyright: 方正国际软件有限公司
 * Author：luo_shaopeng
 * Date：2020/11/26 17:08
 * EMail：luo_shaopeng@founder.com.cn
 * Description：toDo
 */
public class Feature1Activity extends CommonActivity {
    public static void start(Context context) {
         Intent starter = new Intent(context, Feature1Activity.class);
        context.startActivity(starter);
    }
} 