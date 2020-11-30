package com.lsp.mock.feature1;

import android.content.Context;

import com.blankj.utilcode.util.ApiUtils;
import com.lsp.feature1.export.api.Feature1Api;
import com.lsp.feature1.export.bean.Feature1Param;
import com.lsp.feature1.export.bean.Feature1Result;

/**
 * Copyright: 方正国际软件有限公司
 * Author：luo_shaopeng
 * Date：2020/11/30 10:08
 * EMail：luo_shaopeng@founder.com.cn
 * Description：toDo
 */

@ApiUtils.Api(isMock = true)
public class Feature1ApiMock extends Feature1Api {
    @Override
    public Feature1Result startFeature1Activity(Context context, Feature1Param param) {
        return new Feature1Result("Mock Result");
    }
}