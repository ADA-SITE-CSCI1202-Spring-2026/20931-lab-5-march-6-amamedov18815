public class Segment implements Movable, Cloneable {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void moveUp() {
        p1.moveUp();
        p2.moveUp();
    }

    public void moveDown() {
        p1.moveDown();
        p2.moveDown();
    }

    public void moveLeft() {
        p1.moveLeft();
        p2.moveLeft();
    }

    public void moveRight() {
        p1.moveRight();
        p2.moveRight();
    }

    public String toString() {
        return "Segment: " + p1 + " - " + p2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Segment)) return false;
        Segment s = (Segment) obj;
        return p1.equals(s.p1) && p2.equals(s.p2);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}