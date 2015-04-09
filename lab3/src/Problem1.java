public class Problem1 {
    public static void main(String args[]) {
        Circle circle1 = new Circle(-1.0);

        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(2.0);

        System.out.println(circle2.getRadius());
        System.out.println(circle2.toString());
        System.out.println(circle2.equals(circle3));
        System.out.println(circle2.hashCode());

    }
}

/* Output:
 * // Circle circle1 = new Circle(-1.0);
 * Exception in thread "main" java.lang.IllegalArgumentException: Radius must be greater than zero
 *
 * // Circle circle2 = new Circle(2);
 * // Circle circle3 = new Circle(2.0);
 * // System.out.println(circle2.getRadius());
 * // System.out.println(circle2.toString());
 * // System.out.println(circle2.equals(circle3));
 * // System.out.println(circle2.hashCode());
 * 2.0
 * Circle@1073741824
 * true
 * 1073741824
 */
