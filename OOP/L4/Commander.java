public class Commander extends Warrior<GreatSword>{

    public Commander(String name, GreatSword sw, int hitPoint) {
        super(name, sw, hitPoint);
    }

    @Override
    public String toString(){ return String.format("Командир%s", super.toString()); }
}
