public class Archer extends Warrior<Shooty_stuff>{

    public Archer(String name, LongBow bow, int hitPoint) {
        super(name, bow, hitPoint);
    }

    @Override
    public String toString(){ return String.format("Лучник%s", super.toString()); }
}
