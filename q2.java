import java.io.*;

public class q2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] U = new String[n];
        double[] A = new double[n];
        double[] B = new double[n];

        System.out.println("enter universal set elements : ");

        for (int i = 0; i < n; i++) {
            System.out.print("element " + (i + 1) + " : ");
            U[i] = br.readLine();
        }

        System.out.println("enter setA membership values : ");

        for (int i = 0; i < n; i++) {
            System.out.print(" A(" + U[i] + ") : ");
            A[i] = Double.parseDouble(br.readLine());
        }

        System.out.println("enter setB membership values : ");

        for (int i = 0; i < n; i++) {
            System.out.print(" B(" + U[i] + ") : ");
            B[i] = Double.parseDouble(br.readLine());
        }

        System.out.println("(A union B)'");

        for (int i = 0; i < n; i++) {
            double x = 1 - Math.max(A[i], B[i]);
            System.out.println(x + "/" + U[i]);
        }

        System.out.println("A' intersection B'");

        for (int i = 0; i < n; i++) {
            double x = Math.min(1 - A[i], 1 - B[i]);
            System.out.println(x + "/" + U[i]);
        }

        System.out.println("(A intersection B)'");

        for (int i = 0; i < n; i++) {
            double x = 1 - Math.min(A[i], B[i]);
            System.out.println(x + "/" + U[i]);
        }

        System.out.println("A' union B'");

        for (int i = 0; i < n; i++) {
            double x = Math.max(1 - A[i], 1 - B[i]);
            System.out.println(x + "/" + U[i]);
        }
    }
}