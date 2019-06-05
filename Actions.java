package game;

public class Actions {
	
	public static void Campaign(Country EASYCLAP, Party user){
		System.out.println("You chose to campaign!");
		
		if(EASYCLAP.getIdeology() == user.getIdeology()){
			user.setSupport(user.getSupport()+3);
		}else if(Ideology.ideologicalCompatibility(EASYCLAP.getIdeology(),user.getIdeology())){
			user.setSupport(user.getSupport()+1);
		}else{
			user.setSupport(user.getSupport()+2);
		}			
	}
	
	public static void Attack(Country EASYCLAP, Party enemy){
		System.out.println("You chose to create an attack ad!");
		
		if(EASYCLAP.getIdeology() == enemy.getIdeology()){
			enemy.setSupport(enemy.getSupport()-2);
		}else if(Ideology.ideologicalCompatibility(EASYCLAP.getIdeology(),enemy.getIdeology())){
			enemy.setSupport(enemy.getSupport()-5);
		}else{
			enemy.setSupport(enemy.getSupport()-3);
		}
				
	}
	
	public static void Fundraise(Country EASYCLAP, Party user){
		System.out.println("You chose to fundraise!");
		
		if(EASYCLAP.getIdeology() == user.getIdeology()){
			user.setFunds(user.getFunds()+10000);
		}else if(Ideology.ideologicalCompatibility(EASYCLAP.getIdeology(),user.getIdeology())){
			user.setFunds(user.getFunds()+5000);
		}else{
			user.setFunds(user.getFunds()+7500);
		}
	}

}
