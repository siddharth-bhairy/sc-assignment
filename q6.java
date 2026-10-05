import java.io.*;

public class q6 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine());

        int m = Integer.parseInt(br.readLine());

        double[][] R = new double[r][m];

        System.out.println("enter relation R values : ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("R[" + i + "][" + j + "] : ");
                R[i][j] = Double.parseDouble(br.readLine());
            }
        }

        int m2 = Integer.parseInt(br.readLine());

        int c = Integer.parseInt(br.readLine());

        double[][] S = new double[m2][c];

        System.out.println("enter relation S values : ");

        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("S[" + i + "][" + j + "] : ");
                S[i][j] = Double.parseDouble(br.readLine());
            }
        }

        if (m != m2) {
            System.out.println("composition not possible");
        } else {

            System.out.println("Max-Min Composition");

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                    double max = 0;

                    for (int k = 0; k < m; k++) {
                        double x = Math.min(R[i][k], S[k][j]);

                        if (x > max) {
                            max = x;
                        }
                    }

                    System.out.print(max + " ");
                }

                System.out.println();
            }

            System.out.println("Max-Product Composition");

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {

                    double max = 0;

                    for (int k = 0; k < m; k++) {
                        double x = R[i][k] * S[k][j];

                        if (x > max) {
                            max = x;
                        }
                    }

                    System.out.print(max + " ");
                }

                System.out.println();
            }
        }
    }
}