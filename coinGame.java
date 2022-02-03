// FRQ 4 Question 2

public class coinGame{

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