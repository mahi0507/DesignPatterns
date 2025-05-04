// Decorator Design Pattern
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

class RedBorderDecorator extends ShapeDecorator {
    public RedBorderDecorator(Shape shape) {
        super(shape);
    }

    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("Setting red border");
    }
}
