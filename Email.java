import java.util.Random;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        InnerEmail email1 = new InnerEmail();

    }

    static class InnerEmail {
        private String firstname;
        private String lastname;
        private String password;
        private String department;
        private String email;
        private int mailBoxCapacity = 500;

        public InnerEmail() {
            System.out.println("Enter the first name: ");
            Scanner scan = new Scanner(System.in);
            this.firstname = scan.nextLine();
            System.out.println("Enter the last name: ");
            this.lastname = scan.nextLine();
            generateEmail();
            randomPassword();
            System.out.println("\n");
            changeMailBoxCapacity(1000);
            displayInfo();
        }

        public void department() {
            System.out.println("Enter the department:\n1 - Sales\n2 - development\n3 - accounting");
            Scanner scan = new Scanner(System.in);
            int dep = scan.nextInt();
            if (dep == 1) {
                this.department = "sal";
            } else if (dep == 2) {
                this.department = "dev";
            } else if (dep == 3) {
                this.department = "acc";
            } else
                this.department = "";
        }

        public void generateEmail() {
            department();
            this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + ".suretech.com";
            System.out.println("Your email is: " + email);
        }

        public void randomPassword() {
            String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ12345567890*!#%&/=?";
            char[] character = characters.toCharArray();
            Random random = new Random();
            char[] randomPassword = new char[8];
            int idx = 0;
            for (int i = 0; i < randomPassword.length; i++) {
                randomPassword[i] = character[random.nextInt(character.length)];
            }
            System.out.println("Your password is: " + new String(randomPassword));
        }

        public void changePassword(String password) {
            this.password = password;
        }

        public void changeMailBoxCapacity(int mailBoxCapacity) {
            this.mailBoxCapacity = mailBoxCapacity;
        }

        public void changeEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return firstname + " " + lastname;
        }

        public String getEmail() {
            return email;
        }

        public int getMailBoxCapacity() {
            return mailBoxCapacity;
        }

        public void displayInfo() {
            System.out.println("Name: " + getName() + "\nEmail: " + getEmail() + "\nMail box capacity: " + getMailBoxCapacity());
        }
    }
}
