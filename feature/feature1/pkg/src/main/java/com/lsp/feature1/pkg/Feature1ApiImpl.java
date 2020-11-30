package com.lsp.feature1.pkg;

import android.content.Context;

import com.blankj.utilcode.util.ApiUtils;
import com.blankj.utilcode.util.LogUtils;
import com.lsp.feature1.export.api.Feature1Api;
import com.lsp.feature1.export.bean.Feature1Param;
import com.lsp.feature1.export.bean.Feature1Result;
import com.lsp.feature1.pkg.main.Feature1Activity;

/**
 * Copyright: 方正国际软件有限公司
 * Author：luo_shaopeng
 * Date：2020/11/27 17:38
 * EMail：luo_shaopeng@founder.com.cn
 * Description：toDo
 */
@ApiUtils.Api
public class Feature1ApiImpl extends Feature1Api {
    @Override
    public Feature1Result startFeature1Activity(Context context, Feature1Param param) {
        Feature1Activity.start(context);
        LogUtils.e(param.getName());
        return new Feature1Result("Feature1Result");
    }
}