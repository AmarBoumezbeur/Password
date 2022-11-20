import java.util.*;
import java.lang.*;


public class Note {
    /* Attributes */
    public static double grade;
    public static boolean loop;

    public static void main(String[] arg) {

        Note note = new Note();
        note.setLoop(true);
        while (note.getLoop()){
        /* Scanning input */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Grade : ");
        note.setGrade(sc.nextDouble());

        if (note.getGrade() <= 20 && note.getGrade() >=0){
            if (note.getGrade() >=10){
                System.out.println("Passed");
                note.setLoop(false);
            } else {
                System.out.println("Not Passed");
            }
        }
        else {
            System.out.println("Enter a grade between 0 and 20");
        }

    }
}

    /* Constructor */
    public Note() {
    }

    /* Setters */
    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    /* Getters */
    public double getGrade() {
        return grade;
    }

    public boolean getLoop() {
        return loop;
    }
} 