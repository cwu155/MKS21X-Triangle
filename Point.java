public class Point{

  private double x, y;

  public Point(double pointX, double pointY){
    x = pointX;
    y = pointY;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public static double distance(Point P1, Point P2){
    return (Math.sqrt(Math.pow((P2.x-P1.x), 2) + (Math.pow((P2.y-P1.y), 2))));
  }

  public double distanceTo(Point newPoint){
    return distance(this, newPoint);
  }

  public String toString(){
    return "(" + (this.getX()) + "," + (this.getY()) + ")";
  }
}
