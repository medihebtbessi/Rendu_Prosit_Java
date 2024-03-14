package Instruction1;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        /*int nbrCages=20;
        String zooName="my zoo";
        System.out.println(zooName+" comporte "+nbrCages+" cages");*/
       /* int nbrCages;
        String zooName;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter zooName");
        zooName=reader.nextLine();
        System.out.println("Enter nbrCages");
        nbrCages=reader.nextInt();
        System.out.println(zooName+" comporte "+nbrCages+" cages");*/

        Animal lion =new Animal("animal","animal",25,true);
        Zoo myZoo =new Zoo("zooooo","zoooo",2);
        myZoo.displayZoo();
       /* System.out.println(myZoo);
        System.out.println(myZoo.toString());*/
        lion.displayAnimal();





    }
}
