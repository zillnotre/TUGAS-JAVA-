import java.util.Scanner;

import javax.lang.model.element.Name;

public class CalculateMoney {
    public static void main(String[] args) {
        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay = 7;
        Scanner input = new Scanner(System.in);
        System.out.println("hitung Uang Anda\n");
        System.out.println("Siapa namamu?");
        name = input.nextLine();
        System.out.println("Berapa banyak uang yang Anda habiskan di klub pada hari Senin");
        moneySpent = input.nextInt();
        total = moneySpent;
        System.out.println("Berapa banyak uang yang Anda habiskan di klub pada hari Selasa");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("Berapa banyak uang yang Anda habiskan di klub pada hari Rabu");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("Berapa banyak uang yang Anda habiskan di klub pada hari Kamis");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("Berapa banyak uang yang Anda habiskan di klub pada hari Jumat");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("Berapa banyak uang yang Anda habiskan di klub pada hari Sabtu");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.println("Berapa banyak uang yang Anda habiskan di klub pada hari minggu");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        average = (double) total / totalDay;
        System.out.println("The Calculation Results: ");
        System.out.println("Hi " + name);
        System.out.println("Your total expenditure at the club this week is $ " + total);
        System.out.println("With ɲan Average daily expenditure of $ " + average);

    }
}