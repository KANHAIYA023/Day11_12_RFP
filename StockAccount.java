package Com.Day11_12_RFP;
import java.util.Scanner;
public class StockAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("enter the Stock name: ");
            String n = sc.nextLine();

            System.out.print("enter the no. of Stock: ");
            int stockNumber = sc.nextInt();

            System.out.print("enter the share prize: ");
            int sharePrize = sc.nextInt();

            System.out.print("earning per share: ");
            double earning = sc.nextFloat();

            System.out.print("Growth rate: ");
             double rate = sc.nextFloat();

            System.out.print("Average AAA corporate bond : ");
            double bond = sc.nextFloat();

            double x = 8.5 + 2*rate;
            double value = (earning * x * 4.4) / bond;  //formula calculate the vale of stock

            double total = 0;
            for (int i=1; i<=stockNumber; i++){
                System.out.print(i + "value of stock : " + (value*i));
                System.out.println();
                total+=value*i;
            }
        System.out.println("---->total value is :" + total);
    }
}
