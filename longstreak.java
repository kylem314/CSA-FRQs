// FRQ 4 Question 1


class longstreak{

  public static String longestStreak(String str){

    // Set previousChar and streak
    char previousChar = ' ';
    char currentChar = ' ';
    previousChar = Character.toLowerCase(previousChar);
    String largestStreak = "";
    String currentStreak = "";

    // Iterate through string
    for (int i = 0; i < str.length(); i++){

        // Clear streak when reaching a new character
        currentChar = str.charAt(i);
        // Makes currentChar case insensitive; comment this line to make sensitive
        currentChar = Character.toLowerCase(currentChar);

        if (currentChar != previousChar){
            currentStreak = "";
        }

        currentStreak += str.charAt(i);

        // Set largest streak if it's longer than the previous one
        if (currentStreak.length() > largestStreak.length()){
            largestStreak = currentStreak;
        }

        // Set new previousChar
        previousChar = str.charAt(i);
        // Makes it case insensitive; comment this line to make sensitive
        previousChar = Character.toLowerCase(previousChar);
        }

        // Return the character of the longest streak and the length
        return (largestStreak.charAt(0)+" "+largestStreak.length());
}}


/*

class longstreak{
public static void longestStreak(String str){

    String previous = str.substring(0,1);
    String longest = "";
    String current = "";
    for (int x = 0; x < str.length(); x++){
      if (!str.substring(x,x+1).equals(previous)){
        current = "";
      }
      current += str.substring(x,x+1);
      if (current.length() > longest.length() ){
        longest = current;
        }
    previous = str.substring(x,x+1);
    }
    System.out.println(longest.substring(0,1) + " " + longest.length());
}}



*/