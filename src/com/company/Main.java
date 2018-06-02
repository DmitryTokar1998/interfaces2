package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        PrintConsole Prconsole=new PrintConsole();
        NoOutput NoOut=new NoOutput();
        System.out.println("Select action: ");
        System.out.println("1-Output text in console");
        System.out.println("2-Output text in emptiness(no output)");
        System.out.println("3-Agregator with delegation");
        System.out.println("0-Exit");
        int action=in.nextInt();
        switch(action)
        {
            case 1:
            {
                System.out.print("Input a string: ");
                String s=in.next();
                Prconsole.Print(s);
                break;
            }
            case 2:
            {
                System.out.print("Input a string: ");
                String s=in.next();
                NoOut.Print(s);
                break;
            }
            case 3:
            {
                System.out.print("Input a string: ");
                String s=in.next();
                AgrPrinter printer=new AgrPrinter(new PrintString[]{
                        new NoOutput(),
                        new PrintConsole()
                });
                printer.Print(s);
                break;
            }
            case 0:
            {
                break;
            }
            default:
            {
                System.out.println("Invalid value!");
                break;
            }
        }
    }
}

