package com.lsp.feature1.export.api;

import android.content.Context;

import com.blankj.utilcode.util.ApiUtils;
import com.lsp.feature1.export.bean.Feature1Param;
import com.lsp.feature1.export.bean.Feature1Result;

/**
 * Copyright: 方正国际软件有限公司
 * Author：luo_shaopeng
 * Date：2020/11/27 17:32
 * EMail：luo_shaopeng@founder.com.cn
 * Description：toDo
 */
public abstract class Feature1Api extends ApiUtils.BaseApi {
    public abstract Feature1Result startFeature1Activity(Context context, Feature1Param param);
} 