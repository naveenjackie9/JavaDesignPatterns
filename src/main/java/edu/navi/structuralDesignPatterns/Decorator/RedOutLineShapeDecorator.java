package edu.navi.structuralDesignPatterns.Decorator;

public class RedOutLineShapeDecorator extends ShapeDecorator{

    public RedOutLineShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        this.shape.draw();
        this.drawRedOutline();
    }

    public void drawRedOutline() {
        System.out.println("Drawing red outline");
    }
}
