public class LongBow extends Shooty_stuff{

    @Override
    public int bonk() {
        return 15;
    }

    @Override
    public int range() {
        return 80;
    }

    @Override
    public String toString(){ return String.format("Длинный лук: урон - %d, дальность - %d", bonk(), range()); }
}
