package Instruction1;

public class Zoo {
   Animal[] animals;
   String name;
   String city;
  final int  nbrCages=25;
   int nbAnimaux=0;

   public Zoo(String name, String city) {
      this.animals = new Animal[nbrCages];
      this.name = name;
      this.city = city;
   }
   public  void displayZoo(){
      System.out.println("Name "+name+" City "+city+" nbrCages "+nbrCages+" nbAnimaux "+nbAnimaux);

   }

   public boolean addAnimal(Animal animal){
      boolean etat=false;
      if (searchNameUnique(animal.name)==-1) {
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
      for (int i=0;i<nbAnimaux;i++){
         if (animal.name.equals(animals[i].name)){
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
