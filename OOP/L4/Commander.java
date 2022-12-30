public class Commander extends Warrior{

    public Commander(String name, Weapon w, int hitPoint) {
        super(name, w, hitPoint);
    }
    public Commander(String name, Weapon w, Weapon sh, int hitPoint) { super(name, w, sh, hitPoint); }
    @Override
    public String toString(){ return String.format("Командир%s", super.toString()); }
}
