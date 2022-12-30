public class HeavyShield implements Shield {

    @Override
    public int def() { return 20; }

    @Override
    public int bonk() {
        return 0;
    }

    @Override
    public int range() {
        return 0;
    }

    @Override
    public boolean double_handed() {
        return false;
    }

    @Override
    public String toString() { return String.format("Тяжёлый щит: защита - %d",def()); }

}
