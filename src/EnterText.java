import java.util.Scanner;

public class EnterText {

    Encryption encrypt = new Encryption();
    Decryption decrypt = new Decryption();


    public void start() {

        boolean repeat = true;
        do {

            System.out.println("Please, choose the variant:\n1. Encryption\n2. Decryption\nChoose 1 or 2:");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            if (choice == 1) {

                repeat = false;
                System.out.println("Encryption");
                in.nextLine();
                encrypt.encrypt();

            } // if

            else if (choice == 2) {

                repeat = false;
                System.out.println("Decryption");
                in.nextLine();
                decrypt.decrypt();

            } //if

            else {

                System.out.println("Wrong choice. Please, try again");

            } //if

        } while (repeat); //do...while

    } //start

}