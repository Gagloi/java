package lessons.two;

import java.util.Objects;

public class Point {
    final double x;
    final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(String x, String y){
        double xCoord = Double.parseDouble(x);
        double yCoord = Double.parseDouble(y);
        this.x = xCoord;
        this.y = yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
