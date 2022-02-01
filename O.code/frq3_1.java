/*
public static class event{
  boolean rsvp;
  int selection;
  String option1;
  String option2;

  public event(boolean rsvp, int selection){
    this.rsvp = rsvp;
    this.selection = selection;
  }


  public void attending(){
    if(rsvp == true){
      System.out.println("attending");
    }else{
      System.out.println("not attending");
    }
  }

  public void selection(){
    if(selection == 1){
      System.out.println("beef");
    }else if(selection == 2){
      System.out.println("chicken");
    }else if(selection == 3){
      System.out.println("pasta");
    }else{
      System.out.println("fish");
    }
  }

  public void message(){
  if (rsvp == true){
    option1 = "Thanks for attending. You will be served ";
    if (selection == 1){
      option1 = option1 + "beef.";
    }else if(selection == 2){
      option1 = option1 + "chicken.";
    }else if (selection == 3){
      option1 = option1 + "pasta.";
    }else{option1 = option1 + "fish.";
  }
  }else{
    option1 = "Sorry you can't make it.";
  }
}

  public void equals(){
    System.out.println(option1.equals(option2));
  }
}
*/