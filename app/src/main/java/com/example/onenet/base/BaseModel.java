package com.example.onenet.base;

import com.example.onenet.supers.SuperBase;

public  abstract class  BaseModel<P extends BasePresenter,CONTRACT> extends SuperBase<CONTRACT> {
    protected P mPresenter;
    public BaseModel(P mPresenter){
        this.mPresenter=mPresenter;
    }


}
