package com.example.onenet.base;

public class BaseModel<P extends BasePresenter> {
    private P mPresenter;
    public BaseModel(P mPresenter){
        this.mPresenter=mPresenter;
    }

}
