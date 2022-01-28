
public class TicTacToe {
    
    private int turn;
    private String[][] board = new String[3][3];

    public TicTacToe(){
        this.turn = 1;
        this.board = new String[][] {
                                     {"","",""},
                                     {"","",""},
                                     {"","",""}
                                    };

    }//End of constructor


    public void play(int choice)
    {
        //If they enter 3, we still are on the first row, so to prevent that we minus the choice value by 1
        int row = (choice-1)/3;
        int col = (choice-1)%3;

        //Place the letter in its spot, then alternate to the other players turn
        if (turn == 1)
        {
            board[row][col] = Player.ONE.letter();
            this.turn = 2;
        }
        else
        {
            board[row][col] = Player.TWO.letter();
            this.turn = 1;
        }

    }//End of play method

    public String winnner()
    {

        //Diagonal check
        if( (this.board[0][0] == this.board[1][1] || this.board[1][1] == this.board[2][2]) ||
            (this.board[0][2] == this.board[1][1] || this.board[1][1] == this.board[2][0]) )
            {
                return this.board[0][0];
            }

        //Horizontal Check
        for(int i=0; i < board.length ; i++)
        {
            if(this.board[i][0] == this.board[i][1] || this.board[i][1] == this.board[i][2])
                return this.board[i][0];

        }

        //Vertical Check
        for(int i=0; i < board[0].length ; i++)
        {
            if(this.board[0][i] == this.board[1][i] || this.board[1][i] == this.board[2][i])
                return this.board[0][i];
        }

        //Nothing was found so return false
        return "";

    }//End of winner method

    public boolean tie()
    {
        for(int i=0; i< board.length ; i++)
        {
            for(int j=0; j< board[0].length; j++)
            {
                if(this.board[i][j] == "")
                    return false;
            }
        }

        return true;
    }//End of tie method

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
