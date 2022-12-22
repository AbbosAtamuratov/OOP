public abstract class  Warrior<T extends Armed> {
    private String name;
    private T wunderwaffe;
    private int hitPoint;

    public Warrior(String name, T weapon, int hitPoint) {
        this.name = name;
        this.wunderwaffe = weapon;
        this.hitPoint = hitPoint;
    }

    public String getName() { return name; }
    public Armed getWunderwaffe() { return wunderwaffe; }
    public int getHitPoint() { return hitPoint; }

    public void setName(String name) { this.name = name; }
    public void setWunderwaffe(T wunderwaffe) { this.wunderwaffe = wunderwaffe; }
    public void setHitPoint(int hitPoint) { this.hitPoint = hitPoint; }

    @Override
    public String toString() {
        return ": " + name + " armed with " + wunderwaffe + " (" + hitPoint+ " HP)";
    }
}
