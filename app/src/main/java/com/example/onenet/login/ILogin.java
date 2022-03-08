package com.example.onenet.login;

public interface ILogin {
    interface M{
        void requestLogin(String name,String psw)throws Exception;

    }
    interface VP{
        void requestLogin(String name,String psw);
        void responseLoginResult(boolean loginStatusResult);
    }
}
