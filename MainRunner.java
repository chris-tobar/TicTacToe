
public class MainRunner{

    public static void main(String args[]){
        
        TicTacToe game = new TicTacToe();
        game.instructions();

        game.play(1);
        game.printBoard();
        System.out.println();

        game.play(2);
        game.printBoard();
        System.out.println();

        game.play(3);
        game.printBoard();
        System.out.println();
        
        System.out.println("End of runner");
    }//End of main runner

}//End of class