// Quiz
import java.util.ArrayList;
import java.lang.Math;

class Number{

  // Set instance variables
  private int squirrels;
  private int Index;
  private static int day;
    
  // Number has a zero Argument constructor
  // It initializes a random number between 3 and 36, ie the number of squirrels in class
  public Number(){
    squirrels = (int)(Math.random() * 34) + 3;
    Index = Number.day;
    day++;
  }

    // It contains a getter for the Random Number
    public int squirrelCount(){
      return squirrels;
    }

    // It contains a getter for Index, or the order it was initialized
    public int Index(){
      return Index;
    }

}
