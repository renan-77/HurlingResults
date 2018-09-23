package ga.renan;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class math {

    //import important stuff.


    public static void main(String args[]) {

        String name1;
        String name2;

        //first team prompts
        Scanner nm1 = new Scanner(System.in);
        System.out.println("Enter the First team name:");
        name1 = nm1.nextLine();

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the number of goals:");
        int number1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int number2 = num2.nextInt();


        //second team prompts

        Scanner nm2 = new Scanner(System.in);
        System.out.println("Enter the Second team name:");
        name2 = nm2.nextLine();

        Scanner nub1 = new Scanner(System.in);
        System.out.println("Enter the number of goals:");
        int numbr1 = nub1.nextInt();

        Scanner nub2 = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numbr2 = nub2.nextInt();


        //prompts
        int number3 = number1 * 3;
        int numbr3 = numbr1 * 3;

        int number4 = (number3 + number2);
        int numbr4 = (numbr3 + numbr2);


        //results

        System.out.println(name1 + " scored " + number4 + " points in total.");
        System.out.println(name2 + " scored " + numbr4 + " points in total.");


        if (number4 > numbr4) {
            System.out.println(name1 + " won the match! With an advantage of " + (number4 - numbr4) + " points.");
        }

        if (number4 < numbr4) {
            System.out.println(name2 + " won the match! With an advantage of " + (numbr4 - number4) + " points.");
        }

        if (number4 == numbr4) {
            System.out.println("The game was a draw!");
        }

    }

}



