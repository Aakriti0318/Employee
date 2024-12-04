public class LineComparision{
    double x1,x2,y1,y2,x3,y3,x4,y4;
    public LineComparision(double x3, double y3, double x4, double y4) {
        this.x3=x3;
        this.x4=x4;
        this.y3=y3;
        this.y4=y4;
    }
    double L;
    public void length(double x1,double x2,double y1,double y2) {
       L=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of the line is "+L+" for the line cordinates"+"("+x1+" "+" "+y1+" "+x2+" "+y2+")");
    }
    public void compareTo(double x1,double x2,double x3,double x4,double y1,double y2,double y3,double y4) {
        double L1=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double L2=Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
          if (L1==L2) {
            System.out.println("The two lines have equal length.");
        } else if (L1>L2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }

    }
    @Override
    public String toString() {
        return String.format("Line[(%f, %f) to (%f, %f)] Length: %f", x1, y1, x2, y2,L);
    }
}
