package validmail;
import java.util.Scanner;
public class ValidMail {
	
    public static void main(String[] args) 
    { 
      String[] strArray = new String[4];
      strArray[0]= "mctweek@gmail.com";
      strArray[1]= "125@gmail.com"; 
      strArray[2]= "uchiha@gmail.com"; 
      strArray[3]= "senju@gmail.com";
      
        boolean found = false;
        int index = 0;
        
        Scanner Str=new Scanner(System.in);
        System.out.println("Enter the Email ID:");
        String a= Str.nextLine(); 
       for (int i = 0; i <strArray.length; i++) {
       if(a.equals(strArray[i])) {
            index = i; found = true; 
            }
        }
       if(found)
          System.out.println("\n" +a +" found at the index "+index);
        else
          System.out.println("\n" +a +" not found in the array");
 
    }
}