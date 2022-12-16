public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable{
    @Override
    public int swimSpeed() {
        return 10;
    }
    public Duck(String nickname, String owner, int weight) {
        super(nickname, owner, weight);
    }

       @Override
    public String speak(){ return "quack-quack mothufaqa";}

       @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public String toString(){ return String.format("\nDuck:%s\n",super.toString()); }

    @Override
    public int flySpeed() {
        return 35;
    }
}
