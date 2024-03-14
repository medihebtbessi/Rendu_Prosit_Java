package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
   private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    public Dolphin(String family, String name, int age, boolean isMammal, float swimmingSpeed) {
        super(family, name, age, isMammal);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }

}
