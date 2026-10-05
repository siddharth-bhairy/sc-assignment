import java.io.*;

public class q4 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] A = new String[n];

        System.out.println("enter setA elements : ");

        for (int i = 0; i < n; i++) {
            System.out.print("element " + (i + 1) + " : ");
            A[i] = br.readLine();
        }

        int m = Integer.parseInt(br.readLine());

        String[] B = new String[m];

        System.out.println("enter setB elements : ");

        for (int i = 0; i < m; i++) {
            System.out.print("element " + (i + 1) + " : ");
            B[i] = br.readLine();
        }

        double[] MA = new double[n];
        double[] MB = new double[m];

        System.out.println("enter setA membership values : ");

        for (int i = 0; i < n; i++) {
            System.out.print(" A(" + A[i] + ") : ");
            MA[i] = Double.parseDouble(br.readLine());
        }

        System.out.println("enter setB membership values : ");

        for (int i = 0; i < m; i++) {
            System.out.print(" B(" + B[i] + ") : ");
            MB[i] = Double.parseDouble(br.readLine());
        }

        System.out.println("IF A THEN B");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double x = Math.min(MA[i], MB[j]);
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}