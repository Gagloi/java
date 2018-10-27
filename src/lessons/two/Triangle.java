package lessons.two;


public class Triangle {
    private Point one;
    private Point two;
    private Point three;

    double perimetr(){
        double a = Math.sqrt((two.x - one.x)^2 + (two.y - one.y)^2);
        double b = Math.sqrt((three.x - two.x)^2 + (three.y - two.y)^2);
        double c = Math.sqrt((three.x - one.x)^2 + (three.y - one.y)^2);
        return a + b + c;

    }

    double square(){
        double a = Math.sqrt((two.x - one.x)^2 + (two.y - one.y)^2);
        double b = Math.sqrt((three.x - two.x)^2 + (three.y - two.y)^2);
        double c = Math.sqrt((three.x - one.x)^2 + (three.y - one.y)^2);
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    void func(Point somePoint){
        Point left = left(left(this.one,this.two),this.three);
        double distX = somePoint.x - left.x;
        double distY = somePoint.y - left.y;
        this.one.x += distX;
        this.one.y += distY;
        this.two.x += distX;
        this.two.y += distY;
        this.three.x += distX;
        this.three.y += distY;
    }

    Point left(Point one, Point two){
        if (one.x < two.x){
            if (one.y < two.y){
                return one;
            }else{
                return one;
            }
        }else{
            return two;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "one=" + one.x + "," + one.y +
                ", two=" + two.x + "," + two.y +
                ", three=" + three.x + "," + three.y +
                '}';
    }
}
