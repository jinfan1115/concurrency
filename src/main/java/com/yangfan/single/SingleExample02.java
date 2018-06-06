package com.yangfan.single;

public class SingleExample02 {
    private SingleExample02(){}
    private static SingleExample02 singleInit = new SingleExample02();

    public static SingleExample02 getSingleInit(){
        return singleInit;
    }
}
