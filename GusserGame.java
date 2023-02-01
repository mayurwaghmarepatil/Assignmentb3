
import java.util.Scanner;

  class Gusser {
      int gusseVal;
      int n = 11;

      int GusserNum() {
          Scanner scan = new Scanner(System.in);
          System.out.println("Guesser kindly guess one number between 1 to 10");
          gusseVal = scan.nextInt();
          if (gusseVal>0 && gusseVal<n)
          {
              return gusseVal;
          }
          else
          {
              switch (gusseVal)
              {
                  default:
                      System.out.println(" !INVALID NUMBER! Guesser please enter the number between 1 to 10");
                      break;
              }
              return 0;
          }
          }
      }
class Player {
    int guesserVal;
    int n=11;

    int guessNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("player guess the one number");
        guesserVal = scan.nextInt();
        if (guesserVal>0 && guesserVal<n )
        {
            return guesserVal;
        }else
        {
            System.out.println("invalid number");
            return 0;
        }
    }
    }
    class Umpire {
        int numFromGusser;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

        void collectFromGusser() {
            Gusser g = new Gusser();
          numFromGusser = g.GusserNum();
        }

        void collectFromPlayer() {
            Player p1 = new Player();
            numFromPlayer1 = p1.guessNum();

            Player p2 = new Player();
            numFromPlayer2 = p2.guessNum();

            Player p3 = new Player();
            numFromPlayer3 = p3.guessNum();
        }

        void compare() {
            if (numFromGusser==numFromPlayer1) {
                if (numFromGusser == numFromPlayer2 && numFromGusser == numFromPlayer3) {
                    System.out.println("All players are win");
                } else if (numFromGusser == numFromPlayer2) {
                    System.out.println("player 1 & player 2 won");
                } else if (numFromGusser == numFromPlayer3) {
                    System.out.println("player 1 and player 3 won");
                } else {
                    System.out.println("player 1 won the game");
                }
            } else if (numFromGusser==numFromPlayer2) {
                if (numFromGusser == numFromPlayer3) {
                    System.out.println("Player 2 & player 3 won the game");
                } else {
                    System.out.println("player 2 won the game");
                }
            }
            else if(numFromGusser==numFromPlayer3)
                {
                    System.out.println("player 3 won the game");
                }
            else{
                System.out.println("GAME OVER! Try Again...");
            }

        }
    }
        public class GusserGame {
            public static void main(String[] args) {
                Umpire u = new Umpire();
                u.collectFromGusser();
                u.collectFromPlayer();
                u.compare();

            }
        }

