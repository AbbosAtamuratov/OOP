public class GreatSword extends Shiv{

    @Override
    public int bonk() {
        return 30;
    }

    @Override
    public boolean double_handed() { return true; }

    @Override
    public int range() {
        return 2;
    }

    @Override
    public String toString(){ return String.format("Двуручный меч: урон - %d, дальность - %d", bonk(), range()); }
}
