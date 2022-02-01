/*
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
}
*/