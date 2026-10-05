import java.io.*;

public class q8 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("enter linguistic term : ");
        String term = br.readLine();

        System.out.print("enter membership value : ");
        double membership = Double.parseDouble(br.readLine());

        System.out.println("1. Very");
        System.out.println("2. More or Less");
        System.out.println("3. Not");

        System.out.print("enter your choice : ");
        int choice = Integer.parseInt(br.readLine());

        if (choice == 1) {
            double x = Math.pow(membership, 2);
            System.out.println("Very " + term + " = " + x);
        } else if (choice == 2) {
            double x = Math.pow(membership, 0.5);
            System.out.println("More or Less " + term + " = " + x);
        } else if (choice == 3) {
            double x = 1 - membership;
            System.out.println("Not " + term + " = " + x);
        } else {
            System.out.println("invalid choice");
        }
    }
}