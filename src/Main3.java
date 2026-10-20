public class Main3 {
    public static void main(String[] args) {
        Segment c1 = new Segment(new Point(4, 5), new Point(6, 8));
        c1.setOffset(4, 4);
        System.out.println(c1);
        System.out.println(c1.getModule());
    }
}