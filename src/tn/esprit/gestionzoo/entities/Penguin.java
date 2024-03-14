package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
   private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal) {
        super(family, name, age, isMammal);
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    public Penguin(String family, String name, int age, boolean isMammal, float swimmingDepth) {
        super(family, name, age, isMammal);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}
