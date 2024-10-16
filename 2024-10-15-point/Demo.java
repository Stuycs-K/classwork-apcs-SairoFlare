public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX())  + (a.getY() - b.getY()) * (a.getY() - b.getY()) );
  }


  public static void main(String[]args){

    //test cases for distance
    System.out.println("Expected 3.0, Returned: " + distance(new Point(0, 3), new Point(0, 0)));
    System.out.println("Expected 3.0, Returned: " + distance(new Point(3, 0), new Point(0, 0)));
    System.out.println("Expected 5.0, Returned: " + distance(new Point(4, 5), new Point(1, 1)));
    System.out.println("Expected 20.0, Returned: " + distance(new Point(-10, 3), new Point(10, 3)));
    System.out.println("Expected 1.5, Returned: " + distance(new Point(-10, 0), new Point(-10, 1.5)));
    System.out.println("Expected 2.75, Returned: " + distance(new Point(1.5, 0), new Point(4.25, 0)));

    //test cases for distanceTo
    System.out.println("Expected 3.0, Returned: " + (new Point(0, 3)).distanceTo(new Point(0, 0)));
    System.out.println("Expected 3.0, Returned: " + (new Point(3, 0)).distanceTo(new Point(0, 0)));
    System.out.println("Expected 5.0, Returned: " + (new Point(4, 5)).distanceTo(new Point(1, 1)));
    System.out.println("Expected 20.0, Returned: " + (new Point(-10, 3)).distanceTo(new Point(10, 3)));
    System.out.println("Expected 1.5, Returned: " + (new Point(-10, 0)).distanceTo(new Point(-10, 1.5)));
    System.out.println("Expected 2.75, Returned: " + (new Point(1.5, 0)).distanceTo(new Point(4.25, 0)));

    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));

    //equilateral triangle
    Point v1 = new Point(0,0);
    Point v2 = new Point(1,0);
    Point v3 = new Point(0.5, Math.sqrt(3) / 2);
    System.out.println(v1.distanceTo(v2));
    System.out.println(v2.distanceTo(v3));
    System.out.println(v3.distanceTo(v1));
  }
}
