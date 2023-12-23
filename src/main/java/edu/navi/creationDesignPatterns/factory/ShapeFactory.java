package edu.navi.creationDesignPatterns.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleShape();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new SquareShape();
        }
        System.out.println("SHAPE NOT FOUND");
        return null;
    }
}
