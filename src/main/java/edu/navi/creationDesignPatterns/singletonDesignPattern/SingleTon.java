package edu.navi.creationDesignPatterns.singletonDesignPattern;

public class SingleTon {
    private static SingleTon singleTonInstance = null;
    public static int objectCount = 0;

    private SingleTon(){
        objectCount++;
        System.out.println("Singleton object");
    }

    public static synchronized SingleTon getSingleTonInstance() {
        if (singleTonInstance == null) {
            singleTonInstance = new SingleTon();
        }
        return singleTonInstance;
    }
}
