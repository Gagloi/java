package lessons.two;

import lessons.two.Point;
import java.util.Objects;

public class Triangle {
    private Point one;
    private Point two;
    private Point three;

    double perimetr(){
        double a = Math.sqrt((two.x - one.x)*(two.x - one.x) + (two.y - one.y)*(two.y - one.y));
        double b = Math.sqrt((three.x - two.x)*(three.x - two.x) + (three.y - two.y)*(three.y - two.y));
        double c = Math.sqrt((three.x - one.x)*(three.x - one.x) + (three.y - one.y)*(three.y - one.y));
        return a + b + c;

    }

    double square(){
        double a = Math.sqrt((two.x - one.x)*(two.x - one.x) + (two.y - one.y)*(two.y - one.y));
        double b = Math.sqrt((three.x - two.x)*(three.x - two.x) + (three.y - two.y)*(three.y - two.y));
        double c = Math.sqrt((three.x - one.x)*(three.x - one.x) + (three.y - one.y)*(three.y - one.y));
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    Triangle func(Point somePoint){
        Point left = left(left(this.one,this.two),this.three);
        double distX = somePoint.x - left.x;
        double distY = somePoint.y - left.y;
        Triangle triangle = new Triangle();
        triangle.one = new Point(this.one.x + distX,this.one.y + distY);
        triangle.two = new Point(this.two.x + distX,this.two.y + distY);
        triangle.three = new Point(this.three.x + distX,this.three.y + distY);
        return triangle;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(one, triangle.one) &&
                Objects.equals(two, triangle.two) &&
                Objects.equals(three, triangle.three);
    }

    @Override
    public int hashCode() {

        return Objects.hash(one, two, three);
    }
}
