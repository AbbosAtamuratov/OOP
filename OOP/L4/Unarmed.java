public class Unarmed implements Weapon {
    @Override
    public int bonk() {return 3;}

    @Override
    public int range() { return 2; }

    @Override
    public boolean double_handed() { return false; }


}
