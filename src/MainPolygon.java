public class MainPolygon {
    public static void main(String[] args){
        Point[] points = new Point[4];
        points[0] = new Point(2,2);
        points[1] = new Point(4,2);
        points[2] = new Point(4,4);
        points[3] = new Point(2,4);

        Polygon p = new Polygon(points);
        System.out.println(p);
        System.out.println(p.getLength());
    }
}
