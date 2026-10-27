public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point p1,Point p2){
        super(p1.getX(), p2.getY());
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }

    public Rectangle(Point point , int newWidth, int newHeight){
        super(point.getX(), point.getY());
      width = newWidth;
      height = newHeight;
    }
    public Rectangle(Segment segment){
       super();
        int x, y;
        Point startPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();
        if (startPoint.getX() < endPoint.getX()) {
           x = startPoint.getX();

        } else{
            x = endPoint.getX();
        }
        if (startPoint.getY() < endPoint.getY()) {
            y = startPoint.getY();

        } else {
            y = endPoint.getY();
        }
        setX(x);
        setY(y);
    }
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ") " + "width:" + width + "heigtht: " + height;
    }
    public int getArea() {
        return width * height;

    }

    public Point getPoint(){
        return new Point(getX(),getY());

    }
    public Point getTopLeftPoint(){
        return new Point(getY(), height);
    }
    public Point getTopRightPoint(){
        return new Point(getX() + width, getY() + height);

    }
    public Point getBottomLeftPoint(){
        return new Point();
    }
    public Point getBottomRightPoint(){
        return new Point(getX() + width, getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

