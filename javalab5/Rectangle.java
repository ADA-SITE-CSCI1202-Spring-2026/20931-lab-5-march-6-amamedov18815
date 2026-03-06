public class Rectangle implements Cloneable, Resizable {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) obj;
        return width == r.width && height == r.height;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    public String toString() {
        return "Rectangle: " + width + " x " + height;
    }
}