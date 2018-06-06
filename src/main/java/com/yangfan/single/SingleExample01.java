package com.yangfan.single;

public class SingleExample01 {
    private  SingleExample01(){}
    private static SingleExample01 singleInit = null;

    public static SingleExample01 getSingleInit(){
        if (singleInit == null){
            singleInit = new SingleExample01();
        }
        return  singleInit;
    }
}
