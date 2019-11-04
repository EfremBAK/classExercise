public class HumanClass {

    private String eyeColor;
    private String hairColor;
    private double weight;
    private double height;

    public HumanClass() {
    }

    public HumanClass(String eyeColor, double height, String hairColor, double weight) {
        this.height = height;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.hairColor = hairColor;

    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void talk(){
        System.out.println("Talking...");
    }

    public void displayText(){
        System.out.println("eye color is " + eyeColor);
        System.out.println("hair color is " + hairColor);
        System.out.println("height is " + height);
    }
}





