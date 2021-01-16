import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(!input.hasNextInt()){ //while input is not a valid integer
            input.nextLine();
            System.out.print("Invalid integer; please enter an integer");
        }
        int i = input.nextInt();

    }

}
