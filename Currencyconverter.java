package Aniket;

import java.util.*;
import java.text.DecimalFormat;

public class Currencyconverter
{
    public static void main(String[] args)
    {
        double amount;
        double rupee, dollar, pound, euro, yen, chineseyan;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);
        // Latest number in 2023...!

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: Rupee");
        System.out.println("Enter 2: Dollar");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Euro");
        System.out.println("Enter 5: Yen");
        System.out.println("Enter 5: chinese yan");

        System.out.print("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextDouble();

        switch (choice)
        {
            case 1:  // Rupee Conversion
                dollar = amount / 82.09;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");

                pound = amount / 101.15;
                System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");

                euro = amount / 89.42;
                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");

                yen = amount / 1.60;
                System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");

                chineseyan = amount / 12.04;
                System.out.println(amount + " Rupee = " + f.format(chineseyan) + " chineseyan");
                break;

            case 2:  // Dollar Conversion
                rupee = amount * 82.10;
                System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");

                pound = amount *0.81;
                System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");

                euro = amount *130.82;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

                yen = amount *111.087;
                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");

                chineseyan = amount *6.82;
                System.out.println(amount + " Dollar = " + f.format(chineseyan) + " chineseyan");
                break;

            case 3:  // Pound Conversion
                rupee = amount * 101.16;
                System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");

                dollar = amount *1.23;
                System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");

                euro = amount *1.13;
                System.out.println(amount + " pound = " + f.format(euro) + " Euro");

                yen = amount *161.18;
                System.out.println(amount + " pound = " + f.format(yen) + " Yen");

                chineseyan = amount *8.40;
                System.out.println(amount + " pound = " + f.format(chineseyan) + " chineseyan");
                break;

            case 4:  // Euro Conversion
                rupee = amount * 89.42;
                System.out.println(amount + " euro = " + f.format(rupee) + " Rupees");

                dollar = amount *1.09;
                System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");

                pound = amount *0.88;
                System.out.println(amount + " euro = " + f.format(pound) + " Pound");

                yen = amount *142.46;
                System.out.println(amount + " euro = " + f.format(yen) + " Yen");

                chineseyan = amount *7.43;
                System.out.println(amount + " euro = " + f.format(chineseyan) + " chineseyan");
                break;

            case 5:  // Yen Conversion
                rupee = amount *0.63;
                System.out.println(amount + " yen = " + f.format(rupee) + " Rupees");

                dollar = amount *0.0076;
                System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");

                pound = amount *0.0062;
                System.out.println(amount + " yen = " + f.format(pound) + " Pound");

                euro = amount *0.0070;
                System.out.println(amount + " yen = " + f.format(euro) + " Euro");

                chineseyan = amount *0.052;
                System.out.println(amount + " yen = " + f.format(chineseyan) + " chineseyan");
                break;

            case 6:  // chineseyan Conversion
                rupee = amount *12.3;
                System.out.println(amount + " chineseyan = " + f.format(rupee) + " Rupees");

                dollar = amount *0.15;
                System.out.println(amount + " chineseyan = " + f.format(dollar) + " dollar");

                pound = amount *0.12;
                System.out.println(amount + " chineseyan =: " + f.format(pound) + " pound");

                euro = amount *0.13;
                System.out.println(amount + " chineseyan = " + f.format(euro) + " euro");

                yen = amount *19.18;
                System.out.println(amount + " chineseyan = " + f.format(yen) + " yen");
                break;


            default:
                System.out.println("Please insert valid currency...!");
        }
    }
}