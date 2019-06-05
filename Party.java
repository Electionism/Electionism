package game;

public class Party {
	protected String name;
	protected String ideology;
	protected boolean inPower;
	protected int support;
	protected int funds;
	
	public Party(){
		this.name = "Glorious People's Party";
		this.ideology = "";
		this.inPower = true;
	}
	
public Party(int tism){
		this.name = "Democratic Party";
		this.ideology = "Neoliberalism";
		this.inPower = true;
		this.support = 49;
		this.funds = 1000000;
		
	}

public Party(int tism, int tismic){
	this.name = "Republican Party";
	this.ideology = "Neoconservatism";
	this.inPower = false;
	this.support = 45;
	this.funds = 500000;
}

public Party(String name, String ideo, boolean power, int support, int funds){
	this.name = name;
	this.ideology = ideo;
	this.inPower =power;
	this.support = support;
	this.funds = funds;
	
}

public String getName() {
	return name;
}

public String getIdeology() {
	return ideology;
}

public boolean isInPower() {
	return inPower;
}

public int getSupport() {
	return support;
}

public int getFunds() {
	return funds;
}

public void setName(String name) {
	this.name = name;
}

public void setIdeology(String ideology) {
	this.ideology = ideology;
}

public void setInPower(boolean inPower) {
	this.inPower = inPower;
}

public void setSupport(int support) {
	this.support = support;
}

public void setFunds(int funds) {
	this.funds = funds;
}

public void setAll(String name) {
	this.name = name;
}
	
}
