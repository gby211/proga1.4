package num_2.Z1;

import java.lang.*;

public class dog {
    private String Name_dog;
    private int Age_dog;

    public dog() {
        Name_dog = "NULL";
        Age_dog = 0;
    }

    public dog(String name) {
        Name_dog = name;
        Age_dog = 0;
    }

    public dog(String name, int age) {
        Name_dog = name;
        Age_dog = age;
    }

    public void setAge_dog(int age_dog) {
        Age_dog = age_dog;
    }

    public int getAge_dog() {
        return Age_dog;
    }

    public String getName_dog() {
        return Name_dog;
    }

    public void setName_dog(String name_dog) {
        Name_dog = name_dog;
    }

    @Override
    public String toString() {
        return "dog{" +
                "Name_dog='" + Name_dog + '\'' +
                ", Age_dog=" + Age_dog +
                '}';
    }

    public int toHumanAge(){
        return getAge_dog()*7;
    }

}
