package com.example.onenet.login;

import com.example.onenet.base.BaseModel;

public class LoginModel extends BaseModel<LoginPresenter> implements ILogin.M{
    public LoginModel(LoginPresenter mPresenter) {
        super(mPresenter);
    }

    @Override
    public void requestLogin(String name, String psw) throws Exception {
        //请求服务器登录接口，拿到JSON数据
        if ("123".equals(name) && "456".equals(psw)){
                mPresenter.responseLoginResult(true);
        }else
            mPresenter.responseLoginResult(false);
    }
}
