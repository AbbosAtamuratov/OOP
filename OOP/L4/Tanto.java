public class Tanto extends Shiv{

    @Override
    public int bonk() {
        return 12;
    }

    @Override
    public int range() {
        return 1;
    }

    @Override
    public boolean double_handed() { return false; }

    @Override
    public String toString(){ return String.format("Танто: урон - %d, дальность - %d", bonk(), range()); }
}
