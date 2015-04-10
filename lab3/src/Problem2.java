import java.util.*;

public class Problem2 {
    public static void partA() {
        List list = new ArrayList<Circle>(10000);
        Set set = new HashSet<Circle>(10000);
        Queue queue = new PriorityQueue<Circle>(10000);
        Map map = new HashMap<Integer, Circle>(10000);
    }

    public static void partB() {
        //// Question 1 ////
        System.out.println("Question 1:");

        // create a list with 10 circles in it
        List<Circle> list = new ArrayList<Circle>();
        for (int i = 0; i < 10; i++) {
            list.add(new Circle());
        }

        // natural order
        System.out.println(list);

        // sorted ascending
        Collections.sort(list);
        System.out.println(list);

        // shuffled
        Collections.shuffle(list);
        System.out.println(list);

        // largest (maximum)
        System.out.println(Collections.max(list) + " (" + Collections.max(list).getRadius() + ")");

        // smallest (minimum)
        System.out.println(Collections.min(list) + " (" + Collections.min(list).getRadius() + ")");



        //// Question 2 ////
        System.out.println("\nQuestion 2:");

        // create a queue for Circles
        Queue queue = new PriorityQueue<Circle>(10);

        // add
        queue.add(new Circle());
        System.out.println(queue);

        // element
        queue.element();
        System.out.println(queue);

        // offer
        queue.offer(new Circle());
        System.out.println(queue);

        // peek
        queue.peek();
        System.out.println(queue);

        // poll
        queue.poll();
        System.out.println(queue);

        // remove
        queue.remove();
        System.out.println(queue);



        //// Question 3 ////
        System.out.println("\nQuestion 3:");

        // create a set for Circles
        Set set = new HashSet<Circle>(10);

        // add
        set.add(new Circle());
        System.out.println(set);

        // clear
        set.clear();
        System.out.println(set);

        // contains
        System.out.println(set.contains(new Circle()));

        // remove
        set.remove(0);
        System.out.println(set);

        // size
        System.out.println(set.size());



        //// Question 4 ////
        System.out.println("\nQuestion 4:");

        // create a map for Circles
        Map map = new HashMap<Integer, Circle>(10);

        // clear
        map.put(new Random().nextInt(), new Circle());
        System.out.println(map);
        map.clear();
        System.out.println(map);

        // get
        map.put(new Random().nextInt(), new Circle());
        map.put(new Random().nextInt(), new Circle());
        System.out.println(map);
        System.out.println(map.get(0));

        // put
        map.put(new Random().nextInt(), new Circle());
        System.out.println(map);

        // remove
        map.remove(map.get(0));
        System.out.println(map);

        // size
        System.out.println(map.size());
    }

    public static void main(String args[]) {
        //partA();
        partB();
    }
}

/* Output:
 * Question 1:
 * [Circle@16696868, Circle@-1283218778, Circle@-7887560, Circle@-705751538, Circle@914162669, Circle@141319570, Circle@2070068747, Circle@-1830597039, Circle@1957965415, Circle@2068747214]
 * [Circle@-1830597039, Circle@1957965415, Circle@-705751538, Circle@16696868, Circle@-1283218778, Circle@2070068747, Circle@141319570, Circle@2068747214, Circle@914162669, Circle@-7887560]
 * [Circle@-7887560, Circle@1957965415, Circle@-705751538, Circle@914162669, Circle@2070068747, Circle@2068747214, Circle@16696868, Circle@-1283218778, Circle@-1830597039, Circle@141319570]
 * Circle@-7887560 (0.9545229681038533)
 * Circle@-1830597039 (0.007806605391847188)
 *
 * Question 2:
 * [Circle@-301943764]
 * [Circle@-301943764]
 * [Circle@-790622672, Circle@-301943764]
 * [Circle@-790622672, Circle@-301943764]
 * [Circle@-301943764]
 * []
 *
 * Question 3:
 * [Circle@-984036531]
 * []
 * false
 * []
 * 0
 *
 * Question 4:
 * {-1294415143=Circle@-350015490}
 * {}
 * {-1494930617=Circle@-1350449732, 837801964=Circle@1060420534}
 * null
 * {-1494930617=Circle@-1350449732, -1830523603=Circle@1838079226, 837801964=Circle@1060420534}
 * {-1494930617=Circle@-1350449732, -1830523603=Circle@1838079226, 837801964=Circle@1060420534}
 * 3
 */
