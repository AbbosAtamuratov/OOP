public class Eagle extends Animal implements Speakable, Runable, Flyable{

    public Eagle(String nickname, String owner, int weight) {
        super(nickname, owner, weight);
    }

    @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public int flySpeed() {
        return 50;
    }

    @Override
    public String speak() {
        return "Kaw-kaw mothufaqa";
    }

    @Override
    public String toString(){ return String.format("\nEagle:%s\n",super.toString()); }
}
