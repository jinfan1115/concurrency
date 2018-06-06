package com.yangfan.single;

public class SingleExample04 {
    private SingleExample04(){}
    private static volatile SingleExample04 singleInit;

    public static synchronized SingleExample04 getSingleInit(){
        if (singleInit == null){
            singleInit = new SingleExample04();
        }
        return  singleInit;
    }
}
