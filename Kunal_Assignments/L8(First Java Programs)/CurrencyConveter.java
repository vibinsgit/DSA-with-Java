//6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConveter {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the Indian rupees : ");
     double indianRupee = input.nextDouble();
     System.out.print("Enter the exchange rate : ");
     double exchangeRate = input.nextDouble();
     double usd = indianRupee / exchangeRate;
     System.out.println("The convention of Indian rupees to USD is " + usd);
     input.close();
    }
}
