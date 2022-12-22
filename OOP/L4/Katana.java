public class Katana extends Shiv{

    @Override
    public int bonk() {
        return 20;
    }

    @Override
    public int range() {
        return 1;
    }

    @Override
    public String toString(){ return String.format("Катана: урон - %d, дальность - %d", bonk(), range()); }
}
