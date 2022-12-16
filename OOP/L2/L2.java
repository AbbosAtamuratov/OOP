public class L2 {
    public static void main(String[] args) {
        ZOO z1 = new ZOO();
        z1.Add_animal(new Cat("Matroskin", "Fedor", 6, "white"));
        z1.Add_animal(new Doggo("Doge", "BonkStick", 9 , "gold"));
        z1.Add_animal(new Duck("Donald", "Duck", 3))
                .Add_animal(new Eagle("Teddy", "Abe Lincoln", 5));
        System.out.println(z1);
        System.out.println(z1.talk());
        System.out.println();
        for (Runable r: z1.getRunable()) {
            System.out.println(r.runSpeed());
        }
        System.out.printf("\nFastest animal speed: %d\n", z1.fastest_beast());
        System.out.printf("\nFastest flying animal speed: %d\n", z1.fastest_flying_beast());

        TXTSaveManager saver = new TXTSaveManager();
        saver.save_to_txt(z1.getAnimals());
    }
}
