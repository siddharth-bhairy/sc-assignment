import java.io.*;

public class q1 {
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

        System.out.println("union");

        for (int i = 0; i < n; i++) {
            System.out.println(Math.max(A[i], B[i]) + "/" + U[i]);
        }

        System.out.println("intersection");

        for (int i = 0; i < n; i++) {
            System.out.println(Math.min(A[i], B[i]) + "/" + U[i]);
        }

        System.out.println("Complement of A");

        for (int i = 0; i < n; i++) {
            System.out.println((1 - A[i]) + "/" + U[i]);
        }

        System.out.println("Complement of B");

        for (int i = 0; i < n; i++) {
            System.out.println((1 - B[i]) + "/" + U[i]);
        }
    }
}