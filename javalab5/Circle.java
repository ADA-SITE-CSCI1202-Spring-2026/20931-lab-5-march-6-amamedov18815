public class Circle implements Movable, Resizable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public void resize(double factor) {
        radius *= factor;
    }

    public String toString() {
        return "Circle center " + center + " radius " + radius;
    }
}