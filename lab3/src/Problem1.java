public class Problem1 {
    public static void main(String args[]) {
        Circle circle1 = new Circle();

        Circle circle2 = new Circle(2);
        System.out.println(circle2.getRadius());

        Circle circle3 = new Circle(2.0);
        System.out.println(circle3.getRadius());
        System.out.println(circle3.toString());
        System.out.println(circle3.equals(circle2));
        System.out.println(circle3.hashCode());

    }
}

/* Output:
 * // Circle circle1 = new Circle();
 * Exception in thread "main" java.lang.IllegalArgumentException: Must supply radius when creating a circle
 *
 * // Circle circle2 = new Circle(2);
 * // System.out.println(circle2.getRadius();
 * 2.0
 *
 * // Circle circle3 = new Circle(2.0);
 * // System.out.println(circle3.getRadius());
 * 2.0
 *
 * // System.out.println(circle3.toString());
 * Circle@1073741824
 *
 * // System.out.println(circle3.equals(circle2));
 * true
 *
 * // System.out.println(circle3.hashCode());
 * 1073741824
 */
