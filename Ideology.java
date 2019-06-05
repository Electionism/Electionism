package game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ideology {
	
	public static boolean ideologicalCompatibility(String typeOne, String typeTwo) {
		Map<String, String[]> opposes = new HashMap<String, String[]>();

		//SETUP THE STRENGTHS
		opposes.put("social democracy", new String[]{"conservatism","neoliberalism","neoconservatism","centrism","fascism","communism","libertarianism"});
		opposes.put("liberalism", new String[] {"conservatism","neoconservatism","fascism","Democratic Socialism","communism"});
		opposes.put("neoliberalism", new String[] {"conservatism","neoconservatism","fascism","Democratic Socialism","communism", "Social Democracy"});
		opposes.put("conservatism", new String[] {"liberalism","neoliberalism","Democratic Socialism","communism", "Social Democracy"});
		opposes.put("centrism", new String[] {"Democratic Socialism","communism","fascism","neoconservatism"});
		opposes.put("neoconservatism", new String[] {"liberalism","neoliberalism","Democratic Socialism","communism", "Social Democracy", "libertarianism","centrism"});
		opposes.put("fascism", new String[]  {"neoliberalism","centrism", "liberalism", "Social Democracy","libertarianism","Democratic Socialism","communism"});
		opposes.put("Democratic Socialism", new String[] {"conservatism","neoliberalism","neoconservatism","centrism","fascism"});
		opposes.put("communism", new String[] {"conservatism","neoliberalism","neoconservatism","centrism","fascism", "liberalism", "Social Democracy","libertarianism"});
		opposes.put("libertarianism ", new String[] {"Social Democracy","Democratic Socialism","communism","neoconservatism","fascism"});
		
		//System.out.println("Type 1: "+typeOne+" Type 2: "+typeTwo);
		//CONVER TO A LIST TO SEE IF IT CONTAINS THE SECOND TYPE
        List<String> oppositionList = Arrays.asList(opposes.get(typeOne.toLowerCase()));

       //CHECK 
		if(oppositionList.contains(typeTwo.toLowerCase())){
			//STRONG AGAINST
		//	System.out.println("THE IDEOLOGIES ARE CONFLICTING");
			return true; // DOUBLE DAMAGE	
		}else {
			return false; //No damage multiplier
		}
	}
}
