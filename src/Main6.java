public class Main6 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(new Point(2,3), new Point(4,4), new Point(5,2));
        Triangle t2 = new Triangle(3,3, 4,5, 7,3);
        t1.printType();
        t2.printType();
    }
}