// Unit 6 Question 1

class sortIng{
  public static void filterIng(String[] words){
    for(String s: words){
      if (s.substring(Math.abs(s.length()-3),s.length()).equals("ing")){
        System.out.println(s);
      }
    }
  }
}