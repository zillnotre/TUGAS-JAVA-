import java.util.Scanner;

public class RudeQuestions{
    public static void main(String[] args){
        String name, hobby;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. what is your name?");
        name = keyboard.next();

        System.out.print("HI," + name + "! How old are you?");
        age = keyboard.nextInt();

        System.out.println("So youre" + age +", eh? thats not very old");
        System.out.print("How much do you weight, " + name + "?");
        weight = keyboard.nextDouble();

        

    }
}