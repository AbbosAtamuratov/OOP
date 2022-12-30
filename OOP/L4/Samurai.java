public class Samurai extends Warrior<Shiv>{

    public Samurai(String name, Katana ken, int hitPoint) {
        super(name, ken, hitPoint);
    }
    public Samurai(String name, Katana ken, Tanto t, int hitPoint) {
        super(name, ken, t, hitPoint);
    }


    @Override
    public String toString(){ return String.format("Самурай%s", super.toString()); }
}
