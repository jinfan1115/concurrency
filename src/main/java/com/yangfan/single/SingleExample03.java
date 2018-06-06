package com.yangfan.single;

public class SingleExample03 {
    private SingleExample03(){}
    private static SingleExample03 singleInit ;

    static {
        singleInit = new SingleExample03();
    }

    public static SingleExample03 getSingleInit(){
        return  singleInit;
    }
}
