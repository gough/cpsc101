public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
    }

    public Circle(int radius) {
        this.setRadius(Double.valueOf(radius));
    }

    public Circle() {
        throw new IllegalArgumentException("Must supply radius when creating a circle");
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
}

