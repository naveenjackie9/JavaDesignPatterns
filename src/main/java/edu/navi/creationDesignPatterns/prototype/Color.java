package edu.navi.creationDesignPatterns.prototype;

public abstract class Color implements Cloneable {

    public abstract void drawColor();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
