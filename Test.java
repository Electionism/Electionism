package game;
import java.util.Random;

public class Test {

   private static String[] Beginning = { "Al", "Ca", "An", "Ar", "Au",
         "Ba", "Bo", "Be", "Ch", "Co", "Ge","Go", "Gua", "In", "Ir",
         "Ja", "La", "Li", "Ma", "Mo", "Ni", "Pa", "Po", "Se",
         "So", "Tu","Ye","Za" };
   private static String[] Middle = { "ba", "ge", "go", "st", "ng", "bo",
         "il" };
   private static String[] End = { "a", "ed", "al", "arc", "es", "er", "der",
         "e", "gary", "sia", "da", "land", "istan", "berg", "stein" };
   
   private static Random rand = new Random();

   public static String generateName() {

      return Beginning[rand.nextInt(Beginning.length)] + 
            Middle[rand.nextInt(Middle.length)]+
            End[rand.nextInt(End.length)];
      
   }
   
}