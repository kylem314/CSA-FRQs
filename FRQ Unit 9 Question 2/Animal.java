public class Animal{
   private String animalType;
   private String species;
   private String name;

   public Animal(String animalType, String species, String name){
       super();
       this.animalType = animalType;
       this.species = species;
       this.name = name;
   }

   public String toString(){
       return name + " the " + species + " is a " + animalType;
   }
}