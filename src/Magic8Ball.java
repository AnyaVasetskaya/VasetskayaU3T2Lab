import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";

        int num = (int) (Math.random() * 6 + 1);

        if (num == 1)
            response = "Most definitely!";
        else if (num == 2)
            response = "Quite likely";
        else if (num == 3)
            response = "Perhaps";
        else if (num == 4)
            response = "I'm not quite sure...";
        else if (num == 5)
            response = "I doubt it";
        else
            response = "Likely not!";

        System.out.println(response);
    }
}
