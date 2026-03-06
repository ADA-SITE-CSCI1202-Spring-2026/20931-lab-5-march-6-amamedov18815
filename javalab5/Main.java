public class Main {
    public static void main(String[] args) throws Exception {

        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);

        Segment s = new Segment(p1,p2);
        System.out.println(s);

        s.moveUp();
        System.out.println("After move: " + s);

        Rectangle r = new Rectangle(4,5);
        System.out.println(r);

        Square sq = new Square(6);
        System.out.println(sq);

        Circle c = new Circle(new Point(0,0),5);
        System.out.println(c);

        c.moveRight();
        c.resize(2);

        System.out.println("Circle after move/resize: " + c);
    }
}