import java.util.*;
import java.io.*;


public class Password {
    public static int index;
    public static char randomChar;
    public static StringBuilder password;
    public static void main (String[] arg){

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        String symbol = "@&+=/_<>-#%$!?";
    
        String alphabet = lowercase + uppercase + number + symbol;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the password : ");
        int password_length = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i=0; i<password_length; i++){
            /* Get a random character */
            index = random.nextInt(alphabet.length());
            /* Map the index in the Alphabet */
            randomChar = alphabet.charAt(index);
            /* Cancaternate the mapped characters */
            password = sb.append(randomChar);
        }
        System.out.println("Password is : " + password);
    }

}