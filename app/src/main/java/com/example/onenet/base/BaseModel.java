package com.example.onenet.base;

public class BaseModel<P extends BasePresenter> {
    protected P mPresenter;
    public BaseModel(P mPresenter){
        this.mPresenter=mPresenter;
    }

}
