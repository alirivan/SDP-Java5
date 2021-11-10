package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    private static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException {
        do{
            System.out.print("========= Mobile Store XXX ============ \n");
            System.out.print("1. iPhone \n");
            System.out.print("2. Samsung \n");
            System.out.print("3. Meizu \n");
            System.out.print("4. Exit \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            Assistant assistant = new Assistant();

            switch (choice) {
                case 1:
                {
                    assistant.iPhoneSale();
                }
                break;
                case 2:
                {
                    assistant.SamsungSale();
                }
                break;
                case 3:
                {
                    assistant.MeizuSale();
                }
                break;
                default:
                {
                    System.out.println("Nothing purchased");
                }
                return;
            }

        }while(choice!=4);
    }
}
