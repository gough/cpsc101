import java.util.Random;

public class Circle implements Comparable<Circle>, Cloneable {
    private Double radius;
    private static Random random = new Random();

    public Circle(Double radius) {
        this.setRadius(radius);
    }

    public Circle() {
        this.setRadius(random.nextDouble());
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be greater than zero");
        }
    }

    public String toString() {
        return this.getClass().getName() + "@" + this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (!radius.equals(circle.radius)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return radius.hashCode();
    }

    @Override
    public int compareTo(Circle circle) {
        if (circle.radius > this.getRadius()) return -1;
        if (circle.radius == this.getRadius()) return 0;
        return 1;
    }
}

