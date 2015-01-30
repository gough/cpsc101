public class Mysticeti {
    private double length;
    private double mass;

    public Mysticeti(double length, double mass) {
        setLength(length);
        setMass(mass);
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
    
    public void swim() {
        System.out.println("swim");
    }
    
    public void eat() {
        System.out.println("eat");
    }
    
    public void jump() {
        System.out.println("jump");
    }
    
    public void tail() {
        System.out.println("spots on their tails");
    }
}
