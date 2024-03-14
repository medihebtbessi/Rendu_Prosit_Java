package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
   private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
