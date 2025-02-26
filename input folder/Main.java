import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("This code is a simple password generator for security. You can customize the length and types of characters.");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the minimum length of the password: ");
        int minLength=scan.nextInt();
        System.out.println();
        System.out.print("Enter the maximum length of the password: ");
        int maxLength=scan.nextInt();
        System.out.println();

        //Requirements
        System.out.println("Type '1' if your answer is 'yes' and '0' if 'no'." );
        System.out.println("Do you want to include lowercase letters?");
        int lowercase=scan.nextInt();
        System.out.println("Do you want to include uppercase letters?");
        int uppercase=scan.nextInt();
        System.out.println("Do you want to include numbers?");
        int numbers=scan.nextInt();
        System.out.println("Do you want to include symbols?");
        int symbols=scan.nextInt();
        System.out.println("Do you want to include your own character set in the password?");
        int set=scan.nextInt();

        String setString = "";
        if(set==1){
            scan.nextLine();
            System.out.println("Type your set of characters in the line below: ");
            setString = scan.nextLine();
        }

        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbersChars = "0123456789";
        String symbolsChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        StringBuilder passwordChars = new StringBuilder();

        if (lowercase == 1) passwordChars.append(lowercaseChars);
        if (uppercase == 1) passwordChars.append(uppercaseChars);
        if (numbers == 1) passwordChars.append(numbersChars);
        if (symbols == 1) passwordChars.append(symbolsChars);
        if (set == 1) passwordChars.append(setString);

        Random rand = new Random();
        int passwordLength=rand.nextInt(maxLength-minLength+1)+minLength;

        StringBuilder password = new StringBuilder();
        for(int i=0; i<passwordLength; i++){
            int randomIndex=rand.nextInt(passwordChars.length());
            password.append(passwordChars.charAt(randomIndex));
        }

        System.out.println("Generated password: " + password.toString());

        passwordStrength(password.toString());

        System.out.println("Your simple password is ready!");
        System.out.println("Run the code again to generate a new one.");
    }

    public static void passwordStrength(String password){
        int count=0;

        if(password.length()>=8){
            count++;
        }
        if(password.length()>=12){
            count++;
        }

        if (password.matches(".*[0-9].*")){
            count++;
        }
        if (password.matches(".*[a-z].*")){
            count++;
        }
        if (password.matches(".*[A-Z].*")){
            count++;
        }
        if (password.matches(".*[!@#$%^&*()-_=+\\[\\]{}|;:,.<>?].*")){
            count++;
        }

        System.out.print("Password strength: ");
        if (count <= 2) {
            System.out.println("Weak");
        } else if (count <= 4) {
            System.out.println("Moderate");
        } else {
            System.out.println("Strong");
        }
    }
}