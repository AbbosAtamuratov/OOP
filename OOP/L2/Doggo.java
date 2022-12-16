public class Doggo extends Animal implements Speakable, Runable{

    public Doggo(String nickname, String owner, int weight, String mayne_color1) {
        super(nickname, owner, weight);
        this.setMayne_color(mayne_color1);
    }

    private String mayne_color;

    public String getMayne_color() {
        return mayne_color;
    }

    public void setMayne_color(String mayne_color) {
        this.mayne_color = mayne_color;
    }

    @Override
    public String speak(){ return "woof-woof mothufaqa";}

    @Override
    public String toString(){
        return String.format("\nDog:%scolor: %s\n",super.toString(), mayne_color);
    }

    @Override
    public int runSpeed() {
        return 20;
    }
}
