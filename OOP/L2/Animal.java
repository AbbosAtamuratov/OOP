public abstract class Animal {

    private String nickname;
    private String owner;
    private int weight;

    public Animal(String nickname, String owner, int weight) {
        this.nickname = nickname;
        this.setOwner(owner);
        this.setWeight(weight);
    }

    public String getNickname() {
        return nickname;
    }

    public String setNickname(String nickname) {
        this.nickname = nickname;
        return nickname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString (){
        return String.format(" %s\nOwner: %s\nWeight: %d\n",nickname, owner, weight);
    }

}
