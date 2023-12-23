package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + (numberTableToPrint * i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        System.out.print("Enter a number to print its multiplication table: ");
        int numberToPrint = Integer.parseInt(in.nextLine());

        multiplicationTable.printTable(numberToPrint);
    }
}
