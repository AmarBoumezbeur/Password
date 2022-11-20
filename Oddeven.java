import java.util.*;
import java.lang.*;


public class Oddeven {
    
    /* Attributes */
    /* The value of integer will change each time the user types it so it cannot be final */
    public static int integer;
    public static boolean loop;
    /**
     * @param args
     */
    public static void main(String[] args) {

        Oddeven oddeven = new Oddeven();
        oddeven.setLoop(true);
        while (oddeven.getLoop())
        {
        /** Scanning Input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Integer : ");

        /** Storing the integer */
        oddeven.setInput(sc.nextInt());
    
        /* Testing if the integer is Odd or Even */
        
            if (oddeven.integer%2 == 0)
            {
                System.out.println("The number you entered is Even "+ oddeven.getInput());
            } else {
                System.out.println("The number you entered is Odd "+ oddeven.getInput());
            }
        }
    }

    /* Constructor */
    public Oddeven() {
    }

    /* Setters */
    public void setInput (int integer) {
        this.integer = integer;
    } 

    public void setLoop (boolean loop) {
        this.loop = loop;
    }

    /* Getters */
    public int getInput() {
        return integer;
    }

    public boolean getLoop() {
        return loop;
    }
    
        
}