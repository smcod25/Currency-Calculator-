import java.util.Scanner;

public class Currencycal {
    public static void main(String[] args) {
        float value;int input;
        int i = 1;
        Scanner in = new Scanner(System.in);
        while (i > 0)
        {
            System.out.println("Enter 1 to convert inr to usd");
            System.out.println("Enter 2 to convert usd to inr");
            System.out.println("Enter 3 to convert inr to euro");
            System.out.println("Enter 4 to quit");
            input = in.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter the value");
                    value = in.nextFloat();
                    System.out.println("Value:" + value * 0.012);
                    break;
                case 2:
                    System.out.println("Enter the value");
                    value = in.nextFloat();
                    System.out.println("Value:" + value * 83.74);
                    break;
                case 3:
                    System.out.println("Enter the value");
                    value = in.nextFloat();
                    System.out.println("Value:" + value * 0.011);
                    break;
                case 4:
                    break;
            }
        }
    }
}

