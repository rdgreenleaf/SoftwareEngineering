import javax.swing.*;
import java.io.*;
import java.util.*;

public class PlayChomp{

	public JFrame frame;

	public Chomp game;

	public int activePlayer;

	public final int PLAYER_NUMS = 2;
/*
	public PlayChomp(){
		this.game = new PlayChomp();
		this.activePlayer = 0;

	}
	*/
	public PlayChomp(Chomp game){
		this.game = game;
		this.activePlayer = 0;
	}
	/*
	public void displayBoard(){
		this.frame.setContentPane(new Chomp(this.game));
		this.frame.pack();
		this.frame.repaint();
	}
	*/
	public void playGame(){
		//get user input
			//scanner to capture x and y
		Scanner getMove = new Scanner(System.in);
		System.out.println("Enter your move");
		String coordinates = getMove.nextLine();
		String[] coordinateArray = coordinates.split(",");
		int xCoordinate = Integer.parseInt(coordinateArray[0]);
		int yCoordinate = Integer.parseInt(coordinateArray[1]);
		//check if cookie exists
		System.out.println(game.isValidMove(xCoordinate, yCoordinate));
		//check if poison cookie is only one left
		if(game.onlyPoisonCookieLeft()){
			//game over
		}
		//removes cookies
		//update array
		//call to update the board

	}
	public static void main(String[] args){
		Chomp game = new Chomp();
		PlayChomp PlayGame = new PlayChomp(game);
		PlayGame.playGame();
	}
}