public class Crocodile extends Animal implements Speakable, Runable, Swimable{
    public Crocodile(String nickname, String owner, int weight) {
        super(nickname, owner, weight);
        this.setOwner("None");
    }

    @Override
    public int runSpeed() {
        return 48;
    }

    @Override
    public String speak() {
        return "hissss mothufaqa";
    }

    @Override
    public int swimSpeed() {
        return 30;
    }

    @Override
    public String toString(){
        return String.format("\nCrocodile:%s\n",super.toString());
    }
}
