public abstract class  Warrior<T extends Weapon> {
    private String name;
    private T lead_hand;
    private T off_hand;
    private int hitPoint;

    public Warrior(String name, T weapon, int hitPoint) {
        this.name = name;
        this.hitPoint = hitPoint;
        if (weapon.double_handed() == true) {
            this.lead_hand = weapon;
            this.off_hand = weapon;
        } else{
            this.lead_hand = weapon;
            this.off_hand = (T) new Unarmed();
        }
    }

    public Warrior(String name, T w1, T w2, int hitPoint){
        setName(name);
        setLead_hand(w1);
        setOff_hand(w2);
        setHitPoint(hitPoint);
    }

    public String getName() { return name; }
    public Weapon getLead_hand() { return lead_hand; }
    public int getHitPoint() { return hitPoint; }
    public T getOff_hand() { return off_hand; }

    public void setOff_hand(T off_hand) { this.off_hand = off_hand; }
    public void setName(String name) { this.name = name; }
    public void setLead_hand(T lead_hand) { this.lead_hand = lead_hand; }
    public void setHitPoint(int hitPoint) { this.hitPoint = hitPoint; }

    @Override
    public String toString() {
        if (this.lead_hand instanceof Unarmed && this.off_hand instanceof Unarmed)
            return ": " + name + " безоружён " + " (" + hitPoint+ " HP)";
        else if (this.off_hand instanceof Unarmed)
            return ": " + name + " вооружён " + lead_hand + " (" + hitPoint+ " HP)";
        else if (this.lead_hand.double_handed() == true)
            return ": " + name + " вооружён " + lead_hand + " (" + hitPoint+ " HP)";
        else
            return ": " + name + " вооружён " + lead_hand + " и " + off_hand +  "(" + hitPoint+ " HP)";
    }
}
