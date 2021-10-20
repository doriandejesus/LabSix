import java.util.Scanner;
public class Hello {
    public static void main (String [] args){
        System.out.print("Hello. What is your name? ");
        Scanner scnr = new Scanner (System.in);
        String userName = scnr.nextLine();  //user types name after question
        System.out.print("It's nice to meet you, " + userName + ". ");

        System.out.print("How old are you? ");
        String userAge = scnr.nextLine();   //user types age after question
        System.out.print("I see that you are still quite young at only " + userAge + ". ");

        System.out.print("Where do you live? ");
        String userLocation = scnr.nextLine();  //user types location after question
    }
}

//Lab Six Comment - Dorian DeJesus
