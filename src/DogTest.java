import java.lang.*;
import java.util.ArrayList;


public class DogTest {
    public static void main(String[] args) {
            Dog dog1 = new Dog("Hive",12 , "Beagle");
            Dog dog2 = new Dog("Helen", 4,"Labrador");
            Dog dog3 = new Dog("Zero",0,"Zero");
            NurseryDog nurseryDog = new NurseryDog();
            for (int i=0; i < 3; i++) {
                    nurseryDog.addDog(new Dog());
            }
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
            dog1.HumanAge();
            dog2.HumanAge();
            dog3.HumanAge();
        }
}

