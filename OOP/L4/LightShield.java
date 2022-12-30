public class LightShield implements Shield {

    @Override
    public int def() { return 15; }

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
    public String toString() { return String.format("Лёгкий щит: защита - %d",def()); }

}
