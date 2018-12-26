import java.util.Scanner;

public class Decryption {

    private String message, decryptedMessage = "";
    private int key;
    private char ch;

    public String getMessage() {
        return message;
    }

    public int getKey() {
        return key;
    }

    public char getCh() {
        return ch;
    }

    public void decrypt() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message: ");
        message = scan.nextLine();
        System.out.println("Enter a key: ");
        key = scan.nextInt();

        for (int i = 0; i < message.length(); ++i) {

            ch = message.charAt(i);

            if(ch >= 'a' && ch <= 'z') {

                ch = (char)(ch - key);

                if(ch < 'a') {

                    ch = (char)(ch + 'z' - 'a' + 1);

                } //if

                decryptedMessage += ch;

            } //if

            else if(ch >= 'A' && ch <= 'Z') {

                ch = (char)(ch - key);

                if(ch < 'A') {

                    ch = (char)(ch + 'Z' - 'A' + 1);

                } //if

                decryptedMessage += ch;

            } //else if

            else {

                decryptedMessage += ch;

            } //else

        } //for

        System.out.println("Encrypted Message: " + decryptedMessage);

    } //decryption
}
