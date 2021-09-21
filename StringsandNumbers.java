/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects.arrepu_lab01objects;
import java.util.Random;
/**
 *
 * @author S545027
 */
public class StringsandNumbers {
     /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Question 1
       String string1 =  "  Welcome    " ;
       String string2 =  " to ";
       String string3 =  "  the first    " ;
       String string4 =  "Lab Activity " ;
       String string5 =  " in the   ";
       String string6 =  " OOP course ";
       String string7 = String.join("",string1,string2,string3,string4,string5,string6);
       String string8 = ("!");
       String con = string1.trim() +" "+string2.trim() +" " + string3.trim() +" " + string4.trim() +" " + string5.trim() +" " + string6.trim() + string8.trim();
       //String string9 = ("",string7,string8);
       System.out.println("*******String Class*******");
       System.out.println(string7.toString());
       System.out.println("The length of the concatenated string is -" +string7.length());
       System.out.println(con);
       System.out.println("The length of the string with ! is -" +con.length());
       //System.out.println(string7.length());
       //System.out.println(string9);
       String string10 = con.substring(21,33);
       String string11 = string10.toUpperCase();
       System.out.println("Retrieved - " +string10); 
       System.out.println("uppercase Lab Activity -" +string11);  
       int index1 = string11.indexOf("I");
       //System.out.println("Index of I in" +string10.toUpperCase() +index1);
       System.out.println("Index of I in 'LAB ACTIVITY' is at : " +index1);
       String con1 = " lab intresting activities are activities lab Intresting lab Activities Are Intresting Lab activities Lab intresting";
       System.out.println("First occurance of Intresting is at  : " +con1.indexOf("I"));
       String con2 = "Object-Oriented-Programming 44542";
       System.out.println(con2);
       //String con3 = con2.replaceall('-', '_');
       con2 = con2.replaceAll("-", "_");
       con2 = con2.replaceAll(" ", "-");
       System.out.println(con2);
       string1 = "Computer";
       string2 = "Science";
       String con3 = string2.substring(0, 3);
       System.out.println("The ID is " +string1.substring(0,4)+con3.toUpperCase()+ string1.length()+ string2.length());
       System.out.println("I have always been fascinated by coding , how one small line of code can create such complex applications and solve real time problems. I felt a constant learning can help me reach my career aspirations and applied computer is the pathway i choose");
       //Math Class
       System.out.println("\n");
       System.out.println("*******Math Class********");
       int value1 = 9;
       int value2 = 13;
       int square1 = value1 * value1;
       int square2 = value2 * value2;
       int value3 = square1 + square2;
       System.out.println("Sqrt (value1 + value2): " +Math.sqrt(value3));
       System.out.println("exp(9) " +java.lang.Math.exp(value1));
       System.out.println("Sec(9) "+java.lang.Math.sin(value1)); 
       int Mynumber = 27;
       System.out.println("Cube root of 27 is : " +Math.cbrt(Mynumber));
       System.out.println("Logarithm value is : " +java.lang.Math.log(Mynumber));
       System.out.println("tan 60 - tan 45 +(1 + tan60 tan45) = " +java.lang.Math.tan(60-45)); 
       System.out.println("Theortical value of tan 90 = " +java.lang.Math.tan(90));
       double con4 = java.lang.Math.tan(90);
       con4 = java.lang.Math.cbrt(con4);
       System.out.println("The cubic root of modulus value of |tan 90| = " +Math.abs(con4));
      // System.out.println("cosec30 : " +  Math.acos(Math.toRadians(30)));
      double secant = (1 / Math.cos(30));
      System.out.println("Secant 30 is " + secant);
      double coscent = (1 / Math.sin(30));
      System.out.println("Cosecnet 30 is " + coscent);
      System.out.println("Minimum value in Cosec (30) and Sec (30) is: " + Math.min(secant,coscent));
      System.out.println("Maximum value in Cosec (30) and Sec (30) is: " + Math.max(secant,coscent));
      double mynumber2 = 27;
      double mynumber1 = 45;
      double cos27 = Math.cos(mynumber2);
      double cos45 = Math.cos(mynumber1);
      double tan27 = Math.tan(mynumber2);
      double tan45 = Math.tan(mynumber1);
      System.out.println("Rounded value of cos 27 is: " + Math.round(cos27));
      System.out.println("Rounded value of cos 45 is: " + Math.round(cos45));
      System.out.println("Rounded value of tan 27 is: " + Math.round(tan27));
      System.out.println("Rounded value of tan 45 is: " + Math.round(tan45));
      
      double y = Math.pow(Math.pow(7,(4)) +8*(7)*(6)*5,1.0/4.0);
      double x = Math.pow(Math.pow(5,2)-Math.pow(3,2),1.0/8.0);
      double z = Math.abs(8*(Math.cos(mynumber2)));
      //this has error check it
      System.out.println("The value of Equation is : " +((z)*(y/x)));
      System.out.println("\n");
      //random class
      System.out.println("*********random class********");
      Random random =new Random();
      int rand = random.nextInt(200);
      int rand1 = random.nextInt(200);
      int rand2 = random.nextInt(200);
      int rand3 = random.nextInt(200);
      //double rand4 =  random.nextInt();
      //double rand5 =  random.nextInt();
      //double rand6 =  random.nextInt(200);
      System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
      System.out.println("First Random number is "+rand + " Square root : " + Math.pow(rand,(2)));
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand,(2)));
      System.out.println("Second Random number 2 "+rand1 + " Square root  : " + Math.pow(rand1,(2)));
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand1,(2)));
      System.out.println("Third Random number 3 "+rand2 + " Square root  : " + Math.pow(rand2,(2)));
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand2,(2)));
      System.out.println("Fourth Random number 4 "+rand3 + " Square root  : " + Math.pow(rand3,(2)));
      System.out.println("3 pseudo-random integer values without seed value and bounds");
      System.out.println("Fifth Random number 5 " + random.nextInt());
      System.out.println("Sixth Random number 6 " + random.nextInt());
      System.out.println("Seventh Random number 7 " + random.nextInt());
      System.out.println("No, The result is not same each time I print program for random numbers one to seven because there is no seed value");
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand3,(2)));
      System.out.println("pseudo-random integer values without seed value and bounds");
      //Random random1 =new Random(30);
      //System.out.println("fifth Random number is  : " + rand4);
      //System.out.println("sixth Random number is  : " + rand5);
      //System.out.println("seventh Random number is  : " + rand6);
      long seed = 30;
      random.setSeed(seed);
      
      int rand5 = random.nextInt(200);
      int rand6 = random.nextInt(200);
      int rand7 = random.nextInt(200);
      int rand8 = random.nextInt(200);
      //System.out.println("Random number 5 "+rand4);
      System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
      System.out.println("First Random number is "+rand5 + " Square root : " + Math.pow(rand5,(2)));
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand,(2)));
      System.out.println("Second Random number 2 "+rand6 + " Square root  : " + Math.pow(rand6,(2)));
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand1,(2)));
      System.out.println("Third Random number 3 "+rand7 + " Square root  : " + Math.pow(rand7,(2)));
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand2,(2)));
      System.out.println("Fourth Random number 4 "+rand8 + " Square root  : " + Math.pow(rand8,(2)));
      System.out.println("3 pseudo-random integer values with seed value" );
      System.out.println("Fifth Random number 5 " + random.nextInt());
      System.out.println("Sixth Random number 6 " + random.nextInt());
      System.out.println("Seventh Random number 7 " + random.nextInt());
      //System.out.println("Random number 6 "+rand5);
      //System.out.println("Random number between 1 and 200 : " + Math.pow(rand5,(2)));
      //System.out.println("Random number 7 "+rand6);
      System.out.println("Yes, The result is same each time I print program for random numbers one to seven because of seed value");
      System.out.println("When I compare the results between and B & D, It indicates that when we run the program with seed value the result remains same each time we print it. While the for random numbers one to five since there is no fixed seed values the printed value changes each time");
    }
}


    
