public class Triangle
{
    private LineSegment P1P2;
    private LineSegment P2P3;
    private LineSegment P3P1;
    private Point p1;
    private Point p2;
    private Point p3;
    public Triangle(Point p1, Point p2, Point p3)
    {
        // initialise instance variables
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        P1P2 = new LineSegment(p1,p2);
        P2P3 = new LineSegment(p2, p3);
        P3P1 = new LineSegment(p3, p1);
        

    }
    public LineSegment getLineSegmentP1P2()
    {
        return P1P2;
    }
    public LineSegment getLineSegmentP2P3()
    {
       return P2P3; 
    }
    public LineSegment getLineSegmentP3P1()
    {
        return P3P1;
    }
    public String toString()
    {
       return "Triangle - P1: ("+p1.getX()+","+p1.getY()+") P2: ("+ p2.getX()+","+ p2.getY()+") P3: ("+p1.getX()+","+ p1.getY()+")";
    }
    public double area()
    {
        double s = (P1P2.length() + P2P3.length() + P3P1.length())/2;
        return Math.sqrt(s*(s-P1P2.length())*(s-P2P3.length())*(s-P3P1.length()));
    }
    public double perimeter()
    {
        return P1P2.length() + P2P3.length() + P3P1.length();
    }
}   
