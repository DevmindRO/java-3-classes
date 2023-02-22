package com.devmind.springapp;

public interface Shape {
    void logYourShape();
}

class Square implements Shape {
    Square() {}

    @Override
    public void logYourShape() {
        System.out.println("i'm square");
    }
}

class Rectangle implements Shape {
    Rectangle() {}

    @Override
    public void logYourShape() {
        System.out.println("i'm rectangle");
    }
}

enum ShapeType {
    SQUARE, RECTANGLE
}

class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    synchronized public static ShapeFactory getInstance() {
        if (ShapeFactory.instance == null) {
            instance = new ShapeFactory();
        }

        return instance;
    }

    public Shape getShape(ShapeType type) {
        if (type == ShapeType.RECTANGLE) {
            return new Rectangle();
        }
        return new Square();
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        shapeFactory.getShape(ShapeType.RECTANGLE);
    }
}
