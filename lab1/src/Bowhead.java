public class Bowhead extends GenusBalaena {
    public Bowhead (double length, double mass) {
        super(length, mass);
    }
    
    @Override
    public void swim() {
        System.out.println("swim on left side");        
    }
}
