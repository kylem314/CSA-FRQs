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
      System.out.println(longestStreak(word));
      
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

// FRQ 2 Question 2

public static class LightSequence{

  private String sequence;
  private String oldSeq;
  private String segment;

  public LightSequence(String seq){ 
    sequence = seq;
  }

  public String insertSegment(String segment, int ind){
    sequence = sequence.substring(0, ind) + segment + sequence.substring(ind, sequence.length()); 
    return sequence;
  }

  public String remover(String oldseq, String segment){
    this.oldSeq = oldseq;
    this.segment = segment;
    int start = oldSeq.indexOf(segment);
    String newSeq = oldSeq.substring(0,start) + oldSeq.substring (start+segment.length());
    return newSeq;
  }

  public void distance(double a, double b){
    System.out.println(Math.sqrt(a*a + b*b));
  }

  public void changeSequence(String seq){ 
    sequence = seq;
  }

  public void display(){ 
    System.out.println(sequence);
  }
}

// FRQ 3 Question 1

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

// FRQ 3 Question 2
public static class Square{

  public static void drawLine(int x1, int y1, int x2, int y2){
  }

  public static void drawSquare(int x, int y, int len){
    if(x + len > 10 && y -len < 0){
      len = Math.min(10-x, y);
    }else if (x + len > 10){
      len = 10-x; 
    }else if(y - len < 0){
      len = y;
    }

  drawLine(x, y, x + len, y);
  drawLine(x, y, x, y - len);
  drawLine(x, y - len, x + len, y - len);
  drawLine(x + len, y - len, x + len, y);
  int area = len * len;
  System.out.println(String.format("Side Length = %d, Square Area = %d", len, area));
  } 
}

// FRQ 4 Question 1
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

// FRQ 4 Question 2

class coinGame{

  private int startingCoins;
  private int maxRounds;

  public coinGame(int s, int r){
    startingCoins = s;
    maxRounds = r;
  }

  public int getPlayer1Move(){
    return (int)(Math.random() * 3) + 1;
  }

  public int getPlayer2Move(int round){
    int spent = 0;

    if(round%3 == 0){
      spent = 3;
    }
    if(round%3 != 0 && round%2 == 0){
      spent = 2;
    }
    if(round%3 != 0 && round%2 != 0){
      spent = 1;
    }

    return spent;
  }


  public void playGame(){

    int player1coins = startingCoins;
    int player2coins = startingCoins;
    int round = 1;

    while (round <= maxRounds){
      if(player1coins < 3 || player2coins < 3){
        break;
      }

      int player1spent = getPlayer1Move();
      player1coins -= player1spent;

      int player2spent = getPlayer2Move(round);
      player2coins -= player2spent;

      if(Math.abs(player1spent - player2spent) == 2){
        player1coins = player1coins + 2;
      }else{
        player2coins++;
      }

      round++;
    }

  if(player1coins == player2coins){
    System.out.println("tie game");
  }else if(player1coins > player2coins){
    System.out.println("player 1 wins");
  }else{
    System.out.println("player 2 wins");
  }
}}

// FRQ 5 Question 1

public static class Invitation{

  private String hostName;
  private String address;
  
  public Invitation(String n, String a){
    hostName = n;
    address = a;
  }

  public String getName(){
    return hostName;
  }

  public void updateAddress(String s){
    address = s;
  }

  public String invite(String person){
    return "Dear " + person + ", please attend my event at " + address + ". See you then, " + hostName + ".";
  }

  public Invitation(String a){
    hostName = "Host";
    address = a;
  }
}

// FRQ 5 Question 2

public static class passwordGenerator{

  private int suffix_length;
  private String prefix = "A.";
  private static int counter;

  public passwordGenerator(int s, String p){
    prefix = p + ".";
    suffix_length = s;
  }

  public passwordGenerator(int s){
    suffix_length = s;
  }
    
  public String pwGen(){
    for (int i = 1; i<=suffix_length; i++){
      prefix += Integer.toString((int) (Math.random()*10));
    }
    counter+=1;
    return prefix;
  }
  
  public int pwCount(){
    return counter;
  } 
}

// FRQ 6 Question 1

public static class sortIng{
  public static void filterIng(String[] words){
    for(String s: words){
      if (s.substring(Math.abs(s.length()-3),s.length()).equals("ing")){
        System.out.println(s);
      }
    }
  }
}

// FRQ 6 Question 2

public static class Payroll {
    private int[] itemsSold = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60}; // number of items sold by each employee
    private double[] wages;

    public Payroll(int[] x){
        itemsSold = x;
        wages = new double[itemsSold.length];

    }

    public void printwages(){
        for (int i = 0; i < wages.length ; i++){
            System.out.println("$" + wages[i] + "0");
        }
    }

    public double computeBonusThreshold(){

        int temp;

        double totalSales = 0;
        for (int i : itemsSold){
            totalSales += i;
        }

        for(int i = 0; i< itemsSold.length; i++){
            for(int x = i + 1; x < itemsSold.length; x++){
                if (itemsSold[x] < itemsSold[i]){
                    temp = itemsSold[i];
                    itemsSold[i] = itemsSold[x];
                    itemsSold[x] = temp;
                }
            }
        }

        return ((int)(totalSales - itemsSold[0] - itemsSold[itemsSold.length-1]) / ((itemsSold.length)-2)) + 0.5;
    }

    public void computeWages(double fixedWage, double perItem){
        double threshold = computeBonusThreshold();
        double bonus = 1.1;

        for (int n = 0; n < wages.length; n++){
            wages[n] = fixedWage + (perItem * itemsSold[n]);
            wages[n] = (int)wages[n];
            if(itemsSold[n] - threshold > 0){
                wages[n] = wages[n] * bonus;
            }
        }
    }}



//main bracket
} 
