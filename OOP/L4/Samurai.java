public class Samurai extends Warrior<Katana>{

    public Samurai(String name, Katana ken, int hitPoint) {
        super(name, ken, hitPoint);
    }

    @Override
    public String toString(){ return String.format("Самурай%s", super.toString()); }
}
