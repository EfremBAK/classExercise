import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Brain brain = new Brain();
        HumanClass human = new HumanClass();
        Child child = new Child();
        HumanClass human2 = new HumanClass();
        human.setEyeColor("Black");
        human.setHairColor("grey");
        human.setHeight(64);
        human.setWeight(165);

        human2.setEyeColor("Brown");
        human2.setHairColor("blond");
        human2.setHeight(56);
        human2.setWeight(215);

        human.talk();
        child.talk();

        ArrayList<HumanClass> humanArrayList = new ArrayList<>();
//        humanArrayList.add(human);
//        humanArrayList.add(human2);

        Collections.addAll(humanArrayList, human, human2);

        for (HumanClass h : humanArrayList) {
            h.displayText(); //METHOD from onother class (Human Class)is being called now

            display(h);
        }
// if you have another class for the database
  /*
        HumanDB humanDB = new HumanDB();
        humanDB.setHumanDb(humanArrayList);
        for (Human h: humanDB.getHumanDB()){
        h.displayText();
        }

        */

    }

    //method from and the "main" color

    public static void display(HumanClass humanClass) {
        System.out.println("weight is " + humanClass.getWeight());
    }

}
