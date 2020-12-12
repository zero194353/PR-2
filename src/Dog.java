import java.lang.*;
import java.util.ArrayList;


public class Dog {
    private String name;
    private String species;
    private int age;

    public Dog(String n, int a, String s) {
        name = n;
        age = a;
        species = s;
    }

    public Dog(String n, String s) {
        name = n;
        age = 0;
        species = s;
    }

    public Dog() {
        name = "Null";
        age = 0;
        species = "Null";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies(String species) {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", age " + this.age + ", species " + this.species;
    }

    public void HumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}



