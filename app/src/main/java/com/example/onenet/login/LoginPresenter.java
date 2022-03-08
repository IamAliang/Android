package com.example.onenet.login;

import com.example.onenet.base.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginActivity, LoginModel> implements ILogin.VP{
    @Override
    public LoginModel getModelInstance() {
        return new LoginModel(this) ;
    }

    @Override
    public void requestLogin(String name, String psw) {
        try {
            mModel.requestLogin(name,psw);
        } catch (Exception e) {
            e.printStackTrace();
            //异常处理
            //保存到日志
        }
    }

    @Override
    public void responseLoginResult(boolean loginStatusResult) {
            //真是开发中 解析数据
        mView.responseLoginResult(loginStatusResult);
    }
}
