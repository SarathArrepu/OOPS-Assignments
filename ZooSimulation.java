import java.util.*;  
 
public class ZooSimulation {
    
    static String greeting = "Welcome to the Indian Zoo!";
    /*
    * Execution begins here
    */
    public static void main(String args[]) {

    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    System.out.print("Enter Animal name- ");  
    String str= sc.nextLine();   
    //String[] animals1 = {"tiger"};
    //String c = "tiger";
    //if (str == animals1[0]);
    //System.out.println(c);
    System.out.println("The animal is = " +str);  
    System.out.println(greeting.toUpperCase());
      
      Tiger tommy = new Tiger();
      tommy.speak();
      tommy.move();
      
    }
}
