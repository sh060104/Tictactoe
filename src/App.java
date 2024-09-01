import board.Board;
import game.Game;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First project -> Tic Tac Toe");

        Board b=new Board (3);
        b.setDefaultsymbol('-');

        b.printBoardconfig();

        Player p1=new Player ();
        p1.setPlayerNamesym("savi",'0');
        p1.getPlayernamesym();
        
        Player p2=new Player();
        p2.setPlayerNamesym("shreya",'x');
        p2.getPlayernamesym();

        Game game =new Game(new Player[]{p1,p2},b);
        game.play();

        
    }
}
