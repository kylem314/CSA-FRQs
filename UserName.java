/*import java.util.ArrayList;

public class UserName{

private ArrayList<String> possibleNames = new ArrayList<>();

public UserName(String firstName, String lastName){ 
  for(int x = 1; x <= firstName.length(); x++){
    possibleNames.add(lastName + firstName.substring(0,x));
  }
  System.out.print("List of possible names: " + possibleNames);
}

public boolean isUsed(String name, String[] arr){
  // Enhanced for loop
  for (String s : arr){for (String s : arr){
    if(s.equals(name)){
      return true;
    }
  }
  return false;
}

public void setAvailableUserNames(String[] usedNames){
  for(int s = 0; s < possibleNames.size(); s++){
    // Remove name from possible if it's used
    if(isUsed(possibleNames.get(s), usedNames)){
      possibleNames.remove(s);
      s--;
    System.out.println("List of possible names: " + possibleNames);
    }
  }
}
}
*/