import java.io.*;

public class q7 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] U = new String[n];
        double[] A = new double[n];

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

        System.out.print("enter alpha value : ");
        double alpha = Double.parseDouble(br.readLine());

        System.out.println("Alpha Cut");

        for (int i = 0; i < n; i++) {
            if (A[i] >= alpha) {
                System.out.println(A[i] + "/" + U[i]);
            }
        }
    }
}