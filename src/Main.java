import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inpYear,leapYear=0, notLeapYear=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        inpYear = input.nextInt();

        if(inpYear%4 == 0){
            if(inpYear%100 == 0){
                if(inpYear%400 == 0){
                    leapYear = inpYear;

                }else {
                    notLeapYear = inpYear;
                }

            }else {
                leapYear = inpYear;
            }
        }else {
            notLeapYear = inpYear;
        }

        if (leapYear== inpYear){
            System.out.println(inpYear + " bir artık yıldır !");
        } else {
            System.out.println(inpYear + " bir artık yıl değildir !");
        }
    }
}