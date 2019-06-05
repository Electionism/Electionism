package game;
import java.util.Random;
public class Country {

	protected String name;
	protected int population;
	protected String ideology;
	protected int parties;
	protected boolean educated;
	protected boolean prosperous;
	
	
	protected static int randomNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max-min+1)+min;
	}
	
	protected static boolean trueFalse(int min, int max) {
		Random rand = new Random();
		if(rand.nextInt(max-min+1)+min == 0){
			return false;
		}else{
			return true;
		}
	}
	
	
	
	public Country(){
		this.name = Test.generateName();
		this.population = randomNumber(500000,250000000);
		this.educated = trueFalse(0,1);
		this.prosperous = trueFalse(0,1);
		//this.parties = randomNumber(2,5);
		this.parties = 2;
		int ideoPick = randomNumber(0,8);
		switch(ideoPick) {
		  case 0:
			  this.ideology ="Communism";
		    break;
		  case 1:
		    this.ideology = "Social Democracy";
		    break;
		  case 2:
			  this.ideology ="Democratic Socialism";
		    break;
		  case 3:
			  this.ideology ="Liberalism";
		    break;
		  case 4:
			  this.ideology ="Neoliberalism";
		    break;
		  case 5:
			  this.ideology ="Conservatism";
		    break;
		  case 6:
			  this.ideology ="Neoconservatism";
		    break;
		  case 7:
			  this.ideology ="Libertarianism";
		    break;
		  case 8:
			  this.ideology ="Right Wing Populism";
		    break;
		  
		}
	}
	
	public Country(int population, boolean edu, boolean rich, int parties, int ideoPick){
		this.population = population;
		this.educated = edu;
		this.prosperous = rich;
		this.parties = parties;
		switch(ideoPick) {
		  case 0:
			  this.ideology ="Communism";
		    break;
		  case 1:
		    this.ideology = "Social Democracy";
		    break;
		  case 2:
			  this.ideology ="Democratic Socialism";
		    break;
		  case 3:
			  this.ideology ="Liberalism";
		    break;
		  case 4:
			  this.ideology ="Neoliberalism";
		    break;
		  case 5:
			  this.ideology ="Conservatism";
		    break;
		  case 6:
			  this.ideology ="Neoconservatism";
		    break;
		  case 7:
			  this.ideology ="Libertarianism";
		    break;
		  case 8:
			  this.ideology ="Right Wing Populism";
		    break;
		  
		}
	}
	public Country(int baboon, int ape){
		this.name = "Canada";
		this.parties = 3;
		this.ideology = "Social Democracy"; // or Liberalism
		this.population = 35000000;
	}
	
	public Country(int baboon){
		this.name = "USA";
		this.parties = 2;
		this.ideology = "Neoliberalism"; // or Liberalism
		this.population = 250000000;
		this.prosperous = true;
		this.educated = false;
	}


	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public String getIdeology() {
		return ideology;
	}

	public int getParties() {
		return parties;
	}

	public boolean isEducated() {
		return educated;
	}

	public boolean isProsperous() {
		return prosperous;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setIdeology(String ideology) {
		this.ideology = ideology;
	}

	public void setParties(int parties) {
		this.parties = parties;
	}

	public void setEducated(boolean educated) {
		this.educated = educated;
	}

	public void setProsperous(boolean prosperous) {
		this.prosperous = prosperous;
	}
	
	
	

}
