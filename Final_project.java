package final_project;
import java.util.Scanner;

public class Final_project {
 public static void main(String[] args) {
     
   Scanner input = new Scanner(System.in);
    System.out.print("Enter player name: ");
    String name = input.nextLine();
      GameFrame G = new GameFrame();
G.setTitle("Snake Game--------------"+"Player :"+name);

 game g = new game();
g.setVisible(true);

	}

}
    

