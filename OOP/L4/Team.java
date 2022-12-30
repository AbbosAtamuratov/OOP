import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{
    private Commander cap;
    List<T>  team = new ArrayList<>();

    public Team(Commander c) {
        this.cap = c;
    }

    public Commander getCap() { return cap; }

    public void addWarrior(T newGuy){
        team.add(newGuy);
    }
    @Override
    public Iterator<T> iterator(){ return team.iterator(); }

    public int getOverallHp (){
        int res = 0;
        for (T i: this.team) {
            res += i.getHitPoint();
        };
        return  res;
    }

    public int getOverallDmg(){
        int res = 0;
        for (T i: this.team) {
            res += i.getLead_hand().bonk();
        };
        return  res;
    }

    public int getMaxRange(){
        int res = 0;
        for (T i: this.team) {
            if (res<i.getLead_hand().range())
                res = i.getLead_hand().range();
        };
        return res;
    }

}
