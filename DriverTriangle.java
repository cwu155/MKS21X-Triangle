public class DriverTriangle{
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    //System.out.println(Point.distance(P1,P2)); // Tests distance function
    //System.out.println(P1.distanceTo(P2)); // Tests distanceTo function
    //System.out.println(P1.toString()); // Tests toString function

    Triangle abc = new Triangle(0, 0, 3, 0, 0, 4);
    System.out.println(abc.getVertex(1)); // Tests getVertex function
    System.out.println(abc.getPerimeter()); // Tests getPerimeter function

    abc.setVertex(0, new Point (1,1)); //  Changes a point using setVertex

    System.out.println(abc.getVertex(0)); // Tests if setVertex actually works
    System.out.println(abc.getPerimeter()); // Tests if setVertex has successfully changed the perimeter
    System.out.println(abc.toString()); // Tests toString function
  }
}
