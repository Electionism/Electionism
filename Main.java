package game;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static int turn = 0;
	static Country EASYCLAP= new Country();
	static Party user;
	static Party enemy = new Party(1);
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		chooseIdeo();
	}
	
	public static void chooseIdeo() {
		StartScreen frame = new StartScreen(EASYCLAP);
		frame.setVisible(true);
	}
	public static void setUp(String string, String ideoList, boolean b, int i, int j) {
		user = new Party ("TEST", ideoList, b, i,j);
		enemy = new Party ("TEST", ideoList, b, i,j);
		MainGui frame2 = new MainGui(EASYCLAP, user, enemy, turn);
		frame2.setVisible(true);

	}
	
		
	//public static void chooseMove() {
			//}
	public static void seePolls() {
		
		if(turn<12){
		MainGui.lblMoney.setText("Money: "+ user.getFunds());
		MainGui.lblWeek.setText("Week:"+ turn);
		MainGui.textDescription.setText("You have completed "+turn+" week of campaigning, the standings are below" + "Your party is polling at " + user.getSupport() + "%" + "The other party is polling at " + enemy.getSupport() + "%" + "You have $"+ user.getFunds() + " in funds." + "Your opponent has $"+ enemy.getFunds() + " in funds.");
		}else{
			MainGui.lblMoney.setText("Money: "+ user.getFunds());
			MainGui.lblWeek.setText("Week:"+ turn);
			input.close();
			int voters = (EASYCLAP.getPopulation()/100)*Country.randomNumber(57,63);
			System.out.println();
			String L = ("The campaign is over! The election results are below");
			String M = ("Your party received " + (voters/100*user.getSupport()) + " votes, in other words "+ user.getSupport()+ "% of the vote");
			String F = ("The enemy party received " +(voters/100*enemy.getSupport())+ " votes, in other words "+ enemy.getSupport()+"% of the vote");
			if(enemy.getSupport()>user.getSupport()){
				MainGui.textDescription.setText(L+M+F+"Your opponent won with " + ((voters/100*enemy.getSupport())-(voters/100*user.getSupport())) +" more votes");
			}else{
				int tism = 250000000/100*49;
				MainGui.textDescription.setText(L+M+F+"You won with " + ((voters/100*user.getSupport())-(voters/100*enemy.getSupport())) +" more votes");
			}
			MainGui.letMeEndThis();
		}
		
		
	}
}

