package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
   private int age;
    private boolean isMammal;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(""))
            throw new IllegalArgumentException("Le nom ne peut pas être vide.");
        else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0)
            throw new IllegalArgumentException("L'age ne peut pas être négatif.");
        else
            this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal(){
        System.out.println("Family "+family+" Name "+name+" Age "+age+" isMammal "+isMammal);
    }
}
