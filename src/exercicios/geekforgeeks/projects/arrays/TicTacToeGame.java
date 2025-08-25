package exercicios.geekforgeeks.projects.arrays;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static java.lang.Thread.sleep;

/*
Tic-Tac-Toe is a classic game that two people can enjoy together. It is played on a 3x3 grid where players take turns
placing their marks, X or O, in empty spots. The main goal is to get three of the same marks in a row-horizontally,
vertically, or diagonally.

We are going to build a Java program that lets two players play the Tic-Tac-Toe game right from the console. There will
be a board with numbers from 1 to 9, and we have to select a spot. And when it's our turn, we have to choose a number
to put the mark there, and the board will update after every move, and the game continues until someone wins or it
ends in a tie.

HOW TO PLAY THE GAME
The steps to play the game are listed below:

    - Both players choose either X or O to mark their cells.
    - There will be a 3x3 grid with numbers assigned to each of the 9 cells.
    - The player who chooses X begins to play first.
    - He enters the cell number where he wishes to place X.
    - Now, both O and X play alternatively until one of the two wins.
    - Winning criteria: Whenever any of the two players has fully filled one row/ column/ diagonal with their
      symbol (X/ O), they win and the game ends.
    - If neither of the two players wins, the game is said to have ended in a draw.
*/

public class TicTacToeGame {
    private static char[] marks = {'X','O'};
    private static int cellsLeft = 9;
    private static char[][] board = {{'1','2','3'},
                                     {'4','5','6'},
                                     {'7','8','9'}};

    private static String[] names = new String[2];

    private static void printBoard(){
        for(int i=0; i<3; i++){
            System.out.println("\n|---|---|---|");
            for(int j=0; j<3; j++){
                System.out.print("| "+board[i][j]+" ");
            }
            System.out.println('|');
        }
        System.out.println("|---|---|---|");
    }

    private static char checkWinner(){
        // Checking diagonal
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) return board[0][0];

        // Checking lines and columns
        for(int i=0; i<3; i++){
            String lineResult = "";
            String colResult = "";
            for(int j=0; j<3; j++){
                if(Character.isDigit(board[i][j])) break;

                lineResult+=board[i][j];
                colResult+=board[j][i];
            }

            if(lineResult.equals("XXX") || colResult.equals("XXX")) return 'X';
            if(lineResult.equals("OOO") || colResult.equals("OOO")) return 'O';
        }
        return 'N'; // None. The game was not won.
    }

    public static void playTicTacToe(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play TicTacToe!");
        System.out.print("(X) Type player 1 name: ");
        names[0] = sc.nextLine();
        System.out.print("(O) Type player 2 name: ");
        names[1] = sc.nextLine();

        if(names[0].trim().equalsIgnoreCase(names[1].trim())) {
            System.out.println("Are you playing alone?! That's so sad :(");
            try {
                // Playing Naruto Sad Music for 5 seconds
                AudioPlayer audioPlayer = new AudioPlayer("src/exercicios/geekforgeeks/projects/arrays/naruto_sad_music.wav");
                audioPlayer.playSound();
                sleep(10000);
                audioPlayer.stopSound();
                audioPlayer.close();

            } catch(IOException | InterruptedException e) {
                System.out.println("Can't play \"Naruto Sad Music 'tururu'\".");
            }
        }

        char winner = 'N';
        int i=0;
        while(winner == 'N' && cellsLeft>0){
            printBoard();
            System.out.println();
            try {
                System.out.print("It's "+names[i%2]+'('+marks[i%2]+')'+" turn! Choose a cell: ");
                String currentCellStr = sc.nextLine();
                int currentCell = Integer.parseInt(currentCellStr.trim());

                if(currentCell < 1 || currentCell>9) {
                    System.out.println("Type a number between 1 and 9. Try again.\n");
                    continue;
                }

                int line = (currentCell-1)/3;
                int col= (currentCell-1)%3;

                if(!Character.isDigit(board[line][col])){
                    System.out.println("This cell is already occupied!");
                    continue;
                } else {
                    board[line][col] = marks[i%2];
                    cellsLeft--;
                    i++;
                }
                winner = checkWinner();
            } catch(NumberFormatException e){
                System.out.println("Please type a valid entry! Try again.\n");
            } catch(NoSuchElementException | IllegalStateException e){
                System.out.println("The buffer was closed! Exiting game :/");
                return;
            }
        }

        switch (winner){
            case 'N':
                System.out.println("It's a draw! Thanks for playing.");
                break;
            case 'X':
                System.out.println("Congratulations! "+ names[0] + "'s have won! Thanks for playing.");
                break;
            case 'O':
                System.out.println("Congratulations! "+ names[1] + "'s have won! Thanks for playing.");
                break;
        }
    }

    public static void main(String[] args) {
        playTicTacToe();
    }
}
