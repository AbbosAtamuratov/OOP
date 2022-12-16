import java.util.ArrayList;
import java.util.List;

public class ZOO {

    private List<Animal> animals = new ArrayList<>();

    public ZOO Add_animal(Animal a) {
        animals.add(a);
        return this;
    }

    public String talk() {
        StringBuilder shout = new StringBuilder();
        for (Speakable a : getSpeakable()) {
            shout.append(a.speak() + "!  ");
        }
        return shout.toString();
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        animals.forEach(i -> list.append(i.toString()));
        return "Our Zoo:\n" + list.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> res = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Speakable)
                res.add((Speakable) a);
        }
        res.add((Speakable) new Radio());
        return res;
    }

    public List<Runable> getRunable() {
        List<Runable> res = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Runable)
                res.add((Runable) a);
        }
        return res;
    }

    public int fastest_beast(){
        int max = 0;
        for (Runable i: getRunable()) {
            if (i.runSpeed() > max)
                max= i.runSpeed();
        }
        return max;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> res = new ArrayList<>();
        for (Animal a : animals) {
            if (a instanceof Flyable)
                res.add((Flyable) a);
        }
        return res;
    }
    public int fastest_flying_beast(){
        int max = 0;
        for (Flyable i: getFlyable()) {
            if (i.flySpeed() > max)
                max= i.flySpeed();
        }
        return max;
    }
    public List<Animal> getAnimals(){
        return animals;
    }
}
