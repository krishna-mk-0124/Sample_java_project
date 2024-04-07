import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

    public static String add(String a, String b){
        return a+b;
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) throws IOException {
        String a = "abc";
        String b = "def";
        int c = 1;
        int d = 2;
        Scanner sc = new Scanner(System.in);
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter input for bufferedreader input");
        int br_choice = Integer.parseInt(br.readLine());
            System.out.println("Enter choice of day number:\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Selected day number is " + choice + ", so the day is Sunday");
                    for (int i=1;i<=10;i++){
                        System.out.println("Inside the for loop and current value of i is:");
                        System.out.println(i);
                    }
                    break;
                case 2:
                    System.out.println("Selected day number is " + choice + ", so the day is Monday");
                    break;
                case 3:
                    System.out.println("Selected day number is " + choice + ", so the day is Tuesday");
                    break;
                case 4:
                    System.out.println("Selected day number is " + choice + ", so the day is Wednesday");
                    break;
                case 5:
                    System.out.println("Selected day number is " + choice + ", so the day is Thursday");
                    break;
                case 6:
                    System.out.println("Selected day number is " + choice + ", so the day is Friday");
                    break;
                case 7:
                    System.out.println("Selected day number is " + choice + ", so the day is Saturday");
                    break;
                default:
                    System.out.println("Select the count between 1 to 7 only");
                    break;
            }
            int k = choice + br_choice;
            System.out.println("Sum of choice and choice_br is: "+ k);
            System.out.println("Fn Overloaded example for strings o/p: " + add(a,b));
            System.out.println("Fn Overloaded example for integer o/p: " + add(c,d));
    }
}