package TicTacToe;

public class Game {
    Player players[];
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;


    public Game(Player[] players, Board board){
        this.players=players;
        this.board=board;
        this.turn=0;
        this.noOfMoves=0;
        this.gameOver=false;


        StringBuilder z = new StringBuilder();
        StringBuilder c = new StringBuilder();

        for(int i=0; i<board.size; i++){
            z.append('0');
            c.append('X');
        }

        zero = z.toString();
        cross = c.toString();

    public void printBoard(){
        for(int i=0; i<board.size; i++){
            for(int j=0; j<board.size; j++){
                System.out.print(board);
            }
        }
    }



    }
}
