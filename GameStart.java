package game;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class GameStart {
	static int turn = 0;
	static Country USA= new Country(1);
	static Party user = new Party (1,1);
	static Party enemy = new Party(1);
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the the greatest election simulator of all time. You will decide the fate of " + Test.generateName());
		chooseIdeo();
	}
	
	public static void chooseIdeo() {
		System.out.println("Select Ideology");
		String choice = "";
		while(false == false){
				System.out.print("Pick:");
				choice = input.nextLine();
				chooseMove();
				break;
		}
	}
		
	public static void chooseMove() {
		System.out.println("You have three options");
		System.out.println("1) Campaign/Rally");
		System.out.println("2) Attack Ad");
		System.out.println("3) Fundraise");
		int choice = 0;
		while(false == false){
			try {
				System.out.print("Which do you choose? (1,2,3)");
				choice = input.nextInt();
				input.nextLine();
				if(choice == 1) {
					System.out.println("You chose to campaign!");
					
					if(USA.getIdeology() == user.getIdeology()){
						user.setFunds(user.getFunds()-25000);
						user.setSupport(user.getSupport()+3);
					}else if(Ideology.ideologicalCompatibility(USA.getIdeology(),user.getIdeology())){
						user.setFunds(user.getFunds()-25000);
						user.setSupport(user.getSupport()+1);
					}else{
						user.setFunds(user.getFunds()-25000);
						user.setSupport(user.getSupport()+2);
					}
					Country.randomNumber(0,100);
					
					
					turn++;
					seePolls();
					break;
				}else if(choice == 2) {
					System.out.println("You chose to create an attack ad!");
					
					if(USA.getIdeology() == enemy.getIdeology()){
						user.setFunds(user.getFunds()-25000);
						enemy.setSupport(enemy.getSupport()-2);
					}else if(Ideology.ideologicalCompatibility(USA.getIdeology(),enemy.getIdeology())){
						user.setFunds(user.getFunds()-25000);
						enemy.setSupport(enemy.getSupport()-5);
					}else{
						user.setFunds(user.getFunds()-25000);
						enemy.setSupport(enemy.getSupport()-3);
					}
				
					
					turn++;
					seePolls();
					break;
				
				}else if (choice == 3) {
					System.out.println("You chose to fundraise!");
					
					if(USA.getIdeology() == user.getIdeology()){
						user.setFunds(user.getFunds()+10000);
					}else if(Ideology.ideologicalCompatibility(USA.getIdeology(),user.getIdeology())){
						user.setFunds(user.getFunds()+5000);
					}else{
						user.setFunds(user.getFunds()+7500);
					}
					
					turn++;
					seePolls();
					break;
				}else {
					System.out.println("Please enter 1, 2 or 3");
				}
			} catch(InputMismatchException e) {
				System.out.println("Please enter 1, 2 or 3");
				input.nextLine();
			}
		}
		
	}
	public static void seePolls() {
		System.out.println("");
		System.out.println("You have completed "+turn+" week of campaigning, the standings are below");
		System.out.println("Your party is polling at " + user.getSupport() + "%");
		System.out.println("The other party is polling at " + enemy.getSupport() + "%");
		System.out.println("You have $"+ user.getFunds() + " in funds.");
		System.out.println("Your opponent has $"+ enemy.getFunds() + " in funds.");
		if(turn<12){
			chooseMove();
		}else{
			input.close();
			int voters = (USA.getPopulation()/100)*Country.randomNumber(57,63);
			System.out.println();
			System.out.println("The campaign is over! The election results are below");
			System.out.println("Your party received " + (voters/100*user.getSupport()) + " votes, in other words "+ user.getSupport()+ "% of the vote");
			System.out.println("The enemy party received " +(voters/100*enemy.getSupport())+ " votes, in other words "+ enemy.getSupport()+"% of the vote");
			if(enemy.getSupport()>user.getSupport()){
				System.out.println("Your opponent won with " + ((voters/100*enemy.getSupport())-(voters/100*user.getSupport())) +" more votes");
			}else{
				int tism = 250000000/100*49;
				System.out.println("You won with " + ((voters/100*user.getSupport())-(voters/100*enemy.getSupport())) +" more votes");
			}
		}
		
		
	}
}

