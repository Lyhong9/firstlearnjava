import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // 3. Read a String
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        // 3. Read an Integer
        int age = input.nextInt();

        if (age > 17){
            System.out.println(name + " can be a police");
        } else if (age < 18 && age > 0) {
            System.out.println(name + " are a baby");
        } else if (age == 0 && age < 3) {
            System.out.println(name + " can't even stand up");
        } else {
            System.out.println("Please become a baby first");
        }

//        for (int i = 0; i <= 10; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

        input.close();

    }
}