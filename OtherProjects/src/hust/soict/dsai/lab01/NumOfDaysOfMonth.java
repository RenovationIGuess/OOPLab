package hust.soict.dsai.lab01;

import java.util.Scanner;

public class NumOfDaysOfMonth {
    public static void main(String[] args) {
        int month = -1, year;
        int[] daysInMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int daysResult;
        String[] abbrMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] abbrMonthsWithDots = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] fullNameMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a month: ");
        do {
            String testMonth = keyboard.next();
            for(int i = 0; i < abbrMonthsWithDots.length; i++){
                if (testMonth.equals(abbrMonthsWithDots[i])){
                    month = i;
                    break;
                }
                if (testMonth.equals(abbrMonths[i])){
                    month = i;
                    break;
                }
                if (testMonth.equals(fullNameMonths[i])){
                    month = i;
                    break;
                }
                try {
                    int intMonth = Integer.parseInt(testMonth);
                    month = intMonth - 1;
                } catch (NumberFormatException nfe) {
                    break;
                }
            }
            if (month < 0 || month > 12) {
                System.out.println("Please re-enter the month: ");
            }
        } while(month < 0 || month > 11);

        System.out.println("Please enter a year: ");
        do {
            year = keyboard.nextInt();
            if (year < 0){
                System.out.println("Please re-enter the year: ");
            }
        } while(year < 0);

        daysResult = -1;
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0){
                //Not a leap year
                daysResult = daysInMonths[month];
            } else {
                //Is a leap year
                if (month == 1){
                    //February
                    daysResult = 29;
                } else {
                    daysResult = daysInMonths[month];
                }
            }
        }

        System.out.println("Number of days of " + fullNameMonths[month] + ": " + daysResult);
        keyboard.close();
    }
}
