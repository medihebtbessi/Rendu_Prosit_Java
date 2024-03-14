package tn.esprit.gestionzoo.entities;

public class Zoo {
   private Animal[] animals;
   private String name;
   private String city;
  private final int  nbrCages=25;
   private int nbAnimaux=0;


   public Zoo(String name, String city) {
      this.animals = new Animal[nbrCages];
      this.name = name;
      this.city = city;
   }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbAnimaux() {
        return nbAnimaux;
    }

    public void setNbAnimaux(int nbAnimaux) {
        this.nbAnimaux = nbAnimaux;
    }

    public  void displayZoo(){
      System.out.println("Name "+name+" City "+city+" nbrCages "+nbrCages+" nbAnimaux "+nbAnimaux);

   }

   public boolean addAnimal(Animal animal){
      boolean etat=false;
      if (searchNameUnique(animal.getName())==-1 && isZooFull()) {
         for (int i = 0; i < nbrCages; i++) {
            if(animals[i]!=null){
               animals[i] = animal;
               nbAnimaux++;
               etat=true;
               break;
         }
         }
      }
      return etat;
   }
   public void afficherAnimaux(){
      for (int i=0;i<animals.length;i++){
         System.out.println(animals[i]);
      }
   }
   public int searchAnimal(Animal animal){

         for (int i = 0; i < animals.length; i++) {
            if (animal.getName().equals(animals[i].getName())) {
               return i;
            }
         }

      return -1;
   }

   public int searchNameUnique(String name){
      for (int i=0;i<animals.length;i++){
         if (name.equals((animals[i].getName())))
            return 1;
      }
      return -1;
   }

   public boolean removeAnimal(Animal animal){
      for (int i=0;i<nbAnimaux;i++){
         if (animal.getName().equals(animals[i].getName())){
            animals[i]=animals[nbAnimaux-1];
            nbAnimaux--;
            return true;
         }
      }
      return false;
   }

   public boolean isZooFull(){
     return nbAnimaux==nbrCages;
   }
   public Zoo comparerZoo(Zoo z1, Zoo z2){
      if (z1.nbAnimaux>z2.nbAnimaux)
         return z1;
      else
         return z2;

   }
}
