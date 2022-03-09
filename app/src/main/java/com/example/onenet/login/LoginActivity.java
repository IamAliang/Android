package com.example.onenet.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.onenet.R;
import com.example.onenet.base.BaseActivity;
import com.example.onenet.base.BasePresenter;

public class LoginActivity  extends BaseActivity<LoginPresenter,ILogin.VP>{
    private EditText etName;
    private EditText etPassword;
    private Button btnLogin;


    @Override
    protected ILogin.VP getInstance() {
        return new ILogin.VP() {
            @Override
            public void requestLogin(String name, String psw) {
                    mPresenter.getContract().requestLogin(name, psw);
            }

            @Override
            public void responseLoginResult(boolean loginStatusResult) {
                Toast.makeText(LoginActivity.this, loginStatusResult?"登录成功":"登录失败", Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        etName=findViewById(R.id.et_name);
        etPassword=findViewById(R.id.et_psw);
        btnLogin=findViewById(R.id.bt_login);
    }

    @Override
    protected void initListener() {
        btnLogin.setOnClickListener(this);
    }

    @Override
    protected int getContentViewID() {
        return R.layout.activity_login;
    }

    @Override
    protected LoginPresenter getPresenterInstance() {
        return new LoginPresenter();
    }

    @Override
    protected <ERROR> void responseError(ERROR error,Throwable throwable) {
        //真实做UI变化
        Toast.makeText(this, ""+ error,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void destroy() {

    }

    @Override
    public void onClick(View v) {
        String name=etName.getText().toString();
        String psw=etPassword.getText().toString();
       getInstance().requestLogin(name, psw);
    }



   /* @Override
    public void requestLogin(String name, String psw) {
       mPresenter.requestLogin(name,psw);
    }

    @Override
    public void responseLoginResult(boolean loginStatusResult) {
        Toast.makeText(this, loginStatusResult?"登录成功":"登录失败", Toast.LENGTH_SHORT).show();


    }*/
}
