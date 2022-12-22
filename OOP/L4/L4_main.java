import java.sql.SQLOutput;

public class L4_main {
    public static void main(String[] args) {
        Commander c1 = new Commander("Harry", new GreatSword(), 250);
        Team <Samurai> melee = new Team<>(c1);
        melee.addWarrior(new Samurai("Hanzo", new Katana(), 180));
        melee.addWarrior(new Samurai("Genji", new Katana(), 190));
        System.out.println(c1);
        melee.forEach(i -> System.out.println(i));
        System.out.println(TeamStats(melee));

        System.out.println();
        Commander c2 = new Commander("Ron", new GreatSword(), 250);
        Team<Archer> ranged = new Team<>(c2);
        ranged.addWarrior(new Archer("Niko", new LongBow(), 150));
        ranged.addWarrior(new Archer("Sam", new LongBow(), 145));

        System.out.println(c2);
        ranged.forEach(i -> System.out.println(i));
        System.out.println(TeamStats(ranged));

        System.out.println();
        Commander c3 = new Commander("Hermione", new GreatSword(), 250);
        Team<Warrior> mixed = new Team<>(c3);
        mixed.addWarrior(new Archer("Neo", new LongBow(), 150));
        mixed.addWarrior(new Samurai("Morpheus", new Katana(), 190));
        System.out.println(c3);
        mixed.forEach(i -> System.out.println(i));
        System.out.println(TeamStats(mixed));
    }
    public static String TeamStats(Team t){
        return String.format("Общее здоровье: %d\nОбщий уррон: %d\nМакс. Дальность: %d\n", t.getOverallHp(), t.getOverallDmg(), t.getMaxRange());
    }
}
