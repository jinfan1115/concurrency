package com.yangfan.single;

public class SingleExample05 {
    private SingleExample05(){}
    private static SingleExample05 singleInit = null;

    public static SingleExample05 getSingleInit(){
        if (singleInit == null){
            synchronized (SingleExample05.class){
                if (singleInit == null){
                    singleInit = new SingleExample05();
                }
            }
        }
        return  singleInit;
    }
}
