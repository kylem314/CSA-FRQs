import java.util.Scanner;
import java.lang.Math;

class Main {
  
  public static void main(String[] args) {

    // Take user input for menu
    Scanner sc = new Scanner(System.in);
    System.out.println("\n\n==================== \nMenu \n==================== \n1.  FRQ 2\n2.  FRQ 3 Question 1\n3.  FRQ 3 Question 2\n4.  FRQ 4 Question 1 \n5.  FRQ 4 Question 2 \n6.  FRQ 5 Question 1\n7.  FRQ 5 Question 2 \n8.  FRQ 6 Question 1 \n9.  FRQ 6 Question 2\n====================");
    System.out.println("Enter menu option");  
    int option = sc.nextInt();
    System.out.println("");

    if(option == 1){

      Scanner sc8 = new Scanner(System.in);
      System.out.println("Enter a light sequence (0s/1s)");
      String user_sequence = sc8.nextLine();
      LightSequence ls = new LightSequence(user_sequence);
      System.out.println("\n============================= \n Choose an action \n============================= \n1. Display the sequence \n2. Update the sequence \n3. Insert a segment\n4. Remove segments from oldSeq\n5. Find distance between two points\n=============================");
      String action = sc8.nextLine();

      if(action.equals("1")){
        ls.display();
      }

      if(action.equals("2")){
        System.out.println("Enter new light sequence");
        ls.changeSequence(sc8.nextLine());
        System.out.print("New sequence is ");
        ls.display();
      }

      if(action.equals("3")){
        System.out.println("Enter sequence to insert");
        String insert = sc8.nextLine();
        System.out.println("Now enter the index for inserting");
        int index = Integer.parseInt(sc8.nextLine());
        ls.insertSegment(insert, index);
        System.out.print("New sequence is ");
        ls.display();
      }

      if(action.equals("4")){
        System.out.println("Enter a sequence");
        String old = sc8.nextLine();
        System.out.println("enter a segment to remove:");
        String remove = sc8.nextLine();
        System.out.println("newSeq is " + ls.remover(old, remove));
      }

      if(action.equals("5")){
        System.out.println("Enter first double ");
        double a = Double.parseDouble(sc8.nextLine());
        System.out.println("Enter second double ");
        double b = Double.parseDouble(sc8.nextLine());
        System.out.print("Distance is ");
        ls.distance(a, b);
      }

    }else if(option == 2){

      Scanner sc6 = new Scanner(System.in);
      System.out.println("Will you be attending? true/false");
      boolean response = Boolean.parseBoolean(sc6.nextLine());
      System.out.println("Select your meal -\n1. Beef\n2. Chicken\n3. Pasta\n4. Fish\n");
      int choice = Integer.parseInt(sc6.nextLine());

      event msg = new event(response, choice);
      msg.message();
      System.out.println(msg.option1);

    }else if(option == 3){

      Scanner sc7 = new Scanner(System.in);
      System.out.println("Enter a square side length:");
      int squareSize = Integer.parseInt(sc7.nextLine());
      Square.drawSquare(5, 5, squareSize);

    }else if(option == 4){

      // Take user input
      Scanner sc1 = new Scanner(System.in);
      System.out.println("Enter a string");  
      String word = sc1.nextLine();
      System.out.println("");

      // Run longestStreak and print output
      System.out.println(longstreak.longestStreak(word));
      
    }else if(option == 5){
        //coinGame.playGame();
        /*
        Scanner input = new Scanner(System.in);
        int p1input = input.nextInt();
        int p2input = input.nextInt();
        */
    
    }else if(option == 6){

      Scanner sc4 = new Scanner(System.in);
      System.out.println("Enter host name (Press enter if unknown)");
      String hostName = sc4.nextLine();
      Invitation inv = new Invitation(hostName, "address");
      System.out.println("Enter an address");
      String hostAddress = sc4.nextLine();
      inv.updateAddress(hostAddress);
      System.out.println("What is your name?");
      String user = sc4.nextLine();
      System.out.println(inv.invite(user));

    }else if(option == 7){

      Scanner sc5 = new Scanner(System.in);
      System.out.println("Enter number of digits");
      int digit_response = Integer.parseInt(sc5.nextLine());
      System.out.println("Custom prefix? y/n");
      String prefix_response = sc5.nextLine();
      if(prefix_response.equals("y")){
        System.out.println("Enter custom prefix:");
        String user_prefix = sc5.nextLine();
        passwordGenerator pwd = new passwordGenerator(digit_response, user_prefix);
        System.out.println("Generated password: " + pwd.pwGen() + " , total passwords generated: " + pwd.pwCount());
      }else{ 
        passwordGenerator pwd = new passwordGenerator(digit_response);
        System.out.println("Generated password: " + pwd.pwGen() + " , total passwords generated: " + pwd.pwCount());
      }

    }else if(option == 8){
        System.out.println("Enter a list of words");
        Scanner sc2 = new Scanner(System.in);
        String response = sc2.nextLine();
        String[] user_list = response.split("\\s*,\\s*");
        System.out.println("Words ending in 'ing'");
        sortIng.filterIng(user_list);
    
    }else if(option == 9){
      System.out.println("Enter number of items sold by each employee");
      Scanner sc3 = new Scanner(System.in);
      String response = sc3.nextLine();
      String[] items_sold_str = response.split("\\s*,\\s*");
      int[] items_sold = new int[items_sold_str.length];

      for(int i = 0;i < items_sold.length;i++){
        items_sold[i] = Integer.parseInt(items_sold_str[i]);
      }

      Payroll pr = new Payroll(items_sold);

      System.out.println("Enter base wage");
      double fixed_wage  = Integer.parseInt(sc3.nextLine());

      System.out.println("Enter wage per item");
      double per_item = Integer.parseInt(sc3.nextLine());

      pr.computeWages(fixed_wage, per_item);
      System.out.println("Employee wages:");
      pr.printwages();

    }else{
      System.out.println("Invalid option");
    }

    
  }


//main bracket
} 
