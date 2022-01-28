
public class TicTacToe {
    
    int turn;
    String[][] board = new String[3][3];

    public TicTacToe(){
        this.turn = 1;
        this.board = new String[][] {
                                     {"","",""},
                                     {"","",""},
                                     {"","",""}
                                    };

    }//End of constructor


    public void printBoard(){
        for(int i=0; i < board.length; i++)
        {
            for(int j=0; j < board[0].length; j++)
            {
                if(j != board[0].length-1)
                    System.out.printf(" %-2s|",board[i][j] );
                else
                    System.out.printf(" %-2s ", board[i][j] );
            }
            if(i != board.length-1)
                System.out.println("\n-----------");
            else
                System.out.println();
        }

    }//End of printBoard method


    public void instructions(){

        int counter = 1;
        for(int i=0; i < board.length; i++)
        {
            for(int j=0; j < board[0].length; j++)
            {
                if(j != board[0].length-1)
                    System.out.printf(" %-2s|",counter++ );
                else
                    System.out.printf(" %-2s ", counter++ );
            }
            if(i != board.length-1)
                System.out.println("\n-----------");
                else
                System.out.println();
        }

        System.out.printf("Player %d please type 1-9 to choose where to go:%n",this.turn);
    }//End of instructions method

    public boolean verify(String s)
    {
        //This will verify if info inputed was a number or not
        try {
            Integer.parseInt(s);

        } catch (Exception e) {
            System.out.println("Info entered was not a number, please try again");
            return false;
        }

        int value = Integer.parseInt(s);

        if(value <1 || value >9)
        {
            System.out.println("Value entered was less than 1 or greater than 9, please try again");
            return false;
        }

        return true;
        
    }//End of verify method

}//End of TicTacToe class
