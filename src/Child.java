

public class Child extends HumanClass {
    private String mood;
    private Brain brain;

    public Child() {
    }


    public String getMood() {
        return mood;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }
    public void talk(){
        System.out.println("Bla bla bla..");
    }
}
