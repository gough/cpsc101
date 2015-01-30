import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        Mysticeti m = new Mysticeti(random.nextDouble(), random.nextDouble());
        System.out.println("Mysticeti:");
        m.swim();
        m.eat();
        m.jump();
        m.tail();
        
        System.out.println();

        GenusBalaena gb = new GenusBalaena(random.nextDouble(), random.nextDouble());
        System.out.println("Genus Balaena:");
        gb.swim();
        gb.eat();
        gb.jump();
        gb.tail();

        System.out.println();

        Bowhead gb_b = new Bowhead(random.nextDouble(), random.nextDouble());
        System.out.println("Bowhead:");
        gb_b.swim();
        gb_b.eat();
        gb_b.jump();
        gb_b.tail();

        System.out.println();
        
        GenusEubalaena ge = new GenusEubalaena(random.nextDouble(), random.nextDouble());
        System.out.println("Genus Eubalaena:");
        ge.swim();
        ge.eat();
        ge.jump();
        ge.tail();

        System.out.println();

        NorthAtlanticRight ge_nar = new NorthAtlanticRight(random.nextDouble(), random.nextDouble());
        System.out.println("North Atlantic Right:");
        ge_nar.swim();
        ge_nar.eat();
        ge_nar.jump();
        ge_nar.tail();

        System.out.println();

        NorthPacificRight ge_npr = new NorthPacificRight(random.nextDouble(), random.nextDouble());
        System.out.println("North Pacific Right:");
        ge_npr.swim();
        ge_npr.eat();
        ge_npr.jump();
        ge_npr.tail();

        System.out.println();

        SouthernRight ge_sr = new SouthernRight(random.nextDouble(), random.nextDouble());
        System.out.println("Southern Right:");
        ge_sr.swim();
        ge_sr.eat();
        ge_sr.jump();
        ge_sr.tail();
        
        /* Output:
         * Mysticeti:
         * swim
         * eat
         * jump
         * spots on their tails
         *
         * Genus Balaena:
         * swim
         * eat
         * jump completely out of the water
         * spots on their tails
         *
         * Bowhead:
         * swim on left side
         * eat
         * jump completely out of the water
         * spots on their tails
         *
         * Genus Eubalaena:
         * swim
         * eat
         * jump
         * spots on their tails
         *
         * North Atlantic Right:
         * swim
         * eat
         * jump with pirouette, but not always on porpoise
         * spots on their tails
         *
         * North Pacific Right:
         * swim
         * eat
         * jump
         * spots on their tails
         *
         * Southern Right:
         * swim
         * eat, but also enjoy the occasional lobster
         * jump
         * spots on their tails
         */
    }
}
