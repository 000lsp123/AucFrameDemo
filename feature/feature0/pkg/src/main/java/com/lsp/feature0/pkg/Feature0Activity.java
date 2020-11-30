package com.lsp.feature0.pkg;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.blankj.utilcode.util.ApiUtils;
import com.blankj.utilcode.util.BusUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.lsp.common.activity.CommonActivity;
import com.lsp.feature1.export.api.Feature1Api;
import com.lsp.feature1.export.bean.Feature1Param;
import com.lsp.feature1.export.bean.Feature1Result;

/**
 * Copyright: 方正国际软件有限公司
 * Author：luo_shaopeng
 * Date：2020/11/26 17:01
 * EMail：luo_shaopeng@founder.com.cn
 * Description：toDo
 */
public class Feature0Activity extends CommonActivity {

    @BusUtils.Bus(tag =  BusConfig.FEATURE0_SHOW_TOAST)
    public void showToast(String msg){
        ToastUtils.showLong(msg);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feature0_activity);
        findViewById(R.id.startFeature1Btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Feature1Result result = ApiUtils.getApi(Feature1Api.class)
                        .startFeature1Activity(Feature0Activity.this, new Feature1Param("Feature1Param"));
                ToastUtils.showLong(result.getName());
            }
        });
        BusUtils.register(this);
        findViewById(R.id.showBusToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BusUtils.post(BusConfig.FEATURE0_SHOW_TOAST, "show toast.");
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BusUtils.unregister(this);
    }
}