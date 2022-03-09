package com.example.onenet.login;

import com.example.onenet.base.BaseModel;

public class LoginModel extends BaseModel<LoginPresenter,ILogin.M>{
    public LoginModel(LoginPresenter mPresenter) {
        super(mPresenter);
    }

/*    @Override
    public void requestLogin(String name, String psw) throws Exception {
        //请求服务器登录接口，拿到JSON数据
        if ("123".equals(name) && "456".equals(psw)){
                mPresenter.responseLoginResult(true);
        }else
            mPresenter.responseLoginResult(false);
    }*/

    @Override
    public ILogin.M getContract() {
        return new ILogin.M() {
            @Override
            public void requestLogin(String name, String psw) throws Exception {
                if ("123".equals(name) && "456".equals(psw)){
                    mPresenter.getContract().responseLoginResult(true);
                }else
                    mPresenter.getContract().responseLoginResult(false);
            }
        };
    }
}
