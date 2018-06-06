package com.yangfan.single;

public class SingleExample06 {
    private SingleExample06(){}

    private static class SingletonInstance{
        private static final SingleExample06 INSTANCE = new SingleExample06();
    }
    public static SingleExample06 getSingleInit(){
        return  SingletonInstance.INSTANCE;
    }
}
