package Instruction1;

public class Zoo {
   Animal[] animals;
   String name;
   String city;
   int  nbrCages;

   public Zoo(String name, String city, int nbrCages) {
      this.animals = new Animal[nbrCages];
      this.name = name;
      this.city = city;
      this.nbrCages = nbrCages;
   }
   public  void displayZoo(){
      System.out.println("Name "+name+" City "+city+" nbrCages "+nbrCages);

   }

   public boolean addAnimal(Animal animal){
      boolean etat=false;
      if (searchNameUnique(animal.name)==-1) {
         for (int i = 0; i < nbrCages; i++) {
            if(animals[i]!=null){
               animals[i] = animal;
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
            if (animal.name.equals(animals[i].name)) {
               return i;
            }
         }

      return -1;
   }

   public int searchNameUnique(String name){
      for (int i=0;i<animals.length;i++){
         if (name.equals((animals[i].name)))
            return 1;
      }
      return -1;
   }

   public boolean removeAnimal(Animal animal){
      for (int i=0;i<animals.length;i++){
         if (animal.name.equals(animals[i].name)){
            animals[i]=animals[animals.length-1];
            nbrCages--;
            return true;
         }
      }
      return false;
   }
}
