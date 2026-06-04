package decodelabs_java_p2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DecodeLabs_Java_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("  =====================================");
        System.out.println("|| WELCOME IN STUDENT DEGREE CALCULATOR ||");
        System.out.println("  =====================================");
        int Math = -1;
        int Programming = -1;
        int English = -1;
        int IOT = -1;
        int Physics = -1;
        while (true) {
            try {

                while (Math < 0 || Math > 100) {
                    System.out.println("please enter degree of Math");
                    Math = sc.nextInt();
                    sc.nextLine();
                    if (Math < 0 || Math > 100) {
                        System.out.println("sorry, you must enter just from 0 to 100");
                    } else {
                        break;
                    }
                }
                while (Programming < 0 || Programming > 100) {
                    System.out.println("please enter degree of Programming");
                    Programming = sc.nextInt();
                    sc.nextLine();
                    if (Programming < 0 || Programming > 100) {
                        System.out.println("sorry, you must enter just from 0 to 100");
                    } else {
                        break;
                    }
                }
                while (English < 0 || English > 100) {
                    System.out.println("please enter degree of English");
                    English = sc.nextInt();
                    sc.nextLine();
                    if (English < 0 || English > 100) {
                        System.out.println("sorry, you must enter just from 0 to 100");
                    } else {
                        break;

                    }
                }
                while (IOT < 0 || IOT > 100) {
                    System.out.println("please enter degree of IOT");
                    IOT = sc.nextInt();
                    sc.nextLine();
                    if (IOT < 0 || IOT > 100) {
                        System.out.println("sorry, you must enter just from 0 to 100");
                    } else {
                        break;
                    }
                }
                while (Physics < 0 || Physics > 100) {
                    System.out.println("please enter degree of Physics");
                    Physics = sc.nextInt();
                    sc.nextLine();
                    if (Physics < 0 || Physics > 100) {
                        System.out.println("sorry, you must enter just from 0 to 100");
                    } else {
                        break;
                    }
                }
                float TotalMarks = Math + Programming + English + IOT + Physics;
                double AvgPercentage = TotalMarks / 5;

                if (AvgPercentage >= 90 && AvgPercentage <= 100) {
                    System.out.println("=============================================================");
                    System.out.printf(Locale.ENGLISH, "|| your total marks is :- %.2f ", TotalMarks);
                    System.out.printf(Locale.ENGLISH, "from 500.00  ||\n|| and your average percentage is :- %.2f ", AvgPercentage);
                    System.out.println("% ||\n|| so you are in grade A                      ||");
                    System.out.println("==============================================================");
                    break;
                } else if (AvgPercentage >= 80 && AvgPercentage < 90) {
                    System.out.printf(Locale.ENGLISH, "your total marks is :- %.2f ", TotalMarks);
                    System.out.printf(Locale.ENGLISH, "from 500.00 and your average percentage is :- %.2f ", AvgPercentage);
                    System.out.println("% \nso your are in grade B");
                    break;
                } else if (AvgPercentage >= 70 && AvgPercentage < 80) {
                    System.out.printf(Locale.ENGLISH, "your total marks is :- %.2f ", TotalMarks);
                    System.out.printf(Locale.ENGLISH, "from 500.00 and your average percentage is :- %.2f ", AvgPercentage);
                    System.out.println("% \nso your are in grade C");
                    break;
                } else if (AvgPercentage >= 60 && AvgPercentage < 70) {
                    System.out.printf(Locale.ENGLISH, "your total marks is :- %.2f ", TotalMarks);
                    System.out.printf(Locale.ENGLISH, "from 500.00 and your average percentage is :- %.2f ", AvgPercentage);
                    System.out.println("% \nso your are in grade D");
                    break;
                } else if (AvgPercentage >= 50 && AvgPercentage < 60) {
                    System.out.printf(Locale.ENGLISH, "your total marks is :- %.2f ", TotalMarks);
                    System.out.printf(Locale.ENGLISH, "from 500.00 and your average percentage is :- %.2f ", AvgPercentage);
                    System.out.println("% \nso your are in grade E");
                    break;
                } else if (AvgPercentage >= 0 && AvgPercentage < 50) {
                    System.out.printf(Locale.ENGLISH, "your total marks is :- %.2f ", TotalMarks);
                    System.out.printf(Locale.ENGLISH, "from 500.00 and your average percentage is :- %.2f ", AvgPercentage);
                    System.out.println("% \nso your are Fail");
                    break;
                } else {
                    System.out.println("Wrong input");
                }

            } catch (InputMismatchException ex) {
                System.out.println("sorry,you should add just numbers from 0 to 100");
                sc.nextLine();
            }
        }
    }

}
