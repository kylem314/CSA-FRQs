// Quiz
import java.util.ArrayList;
import java.lang.Math;

class Number{

    // Set previousChar and streak
    int squirrels;
    int Index;
    
   // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number(){
        // Constructor
        squirrels = (int)(Math.random() * 34) + 3;
        System.out.println(squirrels);
        Index += 1;
    }

    // It contains a getter for the Random Number
    public int squirrelCount(){
      return squirrels;
    }

    // It contains a getter for Index, or the order it was initialized
    public int Index(){
      return Index;
    }

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, the ArrayList is called squirrels
      ArrayList<Number> squirrels = new ArrayList<>();

        // Initialize 10 squirrels of class type Number
        // Insert Number Object into ArrayList Squirrels in least to the greatest order using getNumber()

      for(int i = 0; i < 10; i++){
        Number sqrl = new Number();
            // Insert in ordered position, this avoids sort algorithm
            for(int n = 0; true; n++) {
                // Conditions to insert
                if((sqrl.getNumber() < squirrels.get(n).getNumber()) || (n == squirrels.size())){
                    squirrels.add(j, sqrl);
                    break;
                }
            }
        }

        for (Number squirrel : squirrels) {
            System.out.println("Squirrel count: " + squirrel.squirrelCount() + " Day: " + squirrel.Index());
        }
    }

}
