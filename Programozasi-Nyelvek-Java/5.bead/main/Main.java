package main;
import person.*;

public class Main {
    public static void main(String[] args) {
        Person  example1 = new Person("Gál","Gergely","Informatika hallgato",Gender.MALE,2001);
        Person  example2 = new Person("Nagy","Emese","Középiskolás",Gender.FEMALE,2002);
        Person  example3 = new Person("Gál","Gergely","Informatika hallgato",Gender.MALE,2001);
        
        if (example1.equals(example2)){
            System.out.println("They are the same.");
        }else{
            System.out.println("They are NOT the same.");
        }

    }
}