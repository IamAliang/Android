package com.example.onenet.base;

public  abstract class BasePresenter<V extends BaseActivity,M extends BaseModel> {
    private V  mView;
    private M mModel;
    public  BasePresenter(){
        this.mModel=getModelInstance();
    }
    //绑定
    public void bindView(V mView){
        this.mView=mView;
    }
    //解绑
    public void unBinView(){
        this.mView=null;
    }
    //只有继承了BasePresenter 就直接实例化BaseModel
    public abstract M getModelInstance();
}
