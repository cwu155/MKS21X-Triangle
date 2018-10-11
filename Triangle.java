public class Triangle{

  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle (Point point1, Point point2, Point point3){
    v1 = point1;
    v2 = point2;
    v3 = point3;
  }

  public Triangle (double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  public double getPerimeter(){
    return (Point.distance(v1,v2) + Point.distance(v2,v3) + Point.distance(v1,v3));
  }

  public Point getVertex (int index){
    Point[] points = {v1, v2, v3};
    return points[index];
    }

  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    } else if (index == 1){
      v2 = newP;
    } else {
      v3 = newP;
    }
  }

  public String toString(){
    return "Triangle: A" + v1.toString() + " B" + v2.toString() + " C" + v3.toString();
  }

}
