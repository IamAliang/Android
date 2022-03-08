package com.example.onenet.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public  abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements View.OnClickListener {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewID());
        initView();
        initData();
        initListener();
        mPresenter=getPresenterInstance();
        mPresenter.bindView(this);
    }

    protected abstract void initData();

    //初始化布局控件ID
    protected abstract void initView();

    //监听
    protected abstract void initListener();

    //加载布局
    protected abstract int getContentViewID();

    //实例化P层
    protected abstract P getPresenterInstance();

    //处理响应错误
    protected abstract <ERROR extends Object> void responseError(ERROR error,Throwable throwable);

    //销毁不能在父类写 要告诉子类
    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy();
    }
    //子类销毁方法
    protected abstract void destroy();

//    private void findById(@IdRes int id){
//         findViewById(id);
//    }
}
