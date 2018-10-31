package lessons.two;



public class Circle {
    double x;
    double y;
    double rad;

    public Circle(double x, double y, double rad){
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public Circle(Point point, double rad){
        this.rad = rad;
        this.x = point.x;
        this.y = point.y;
        square(rad);
    }

    double square(double rad){
        return 3.14*rad*rad;
    }
}
