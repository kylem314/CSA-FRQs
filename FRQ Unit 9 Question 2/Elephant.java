public class Elephant extends Herbivore {

   private double tuskLength;

   public Elephant(String name, double tuskLength) {
       super("elephant", name);
       this.tuskLength = tuskLength;
   }

   public String toString() {
       return super.toString() + " with a tusk length of " + tuskLength + " meters";
   }
}