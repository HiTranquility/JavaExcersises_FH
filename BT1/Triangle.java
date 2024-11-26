package BT1;

import java.util.Scanner;

public class Triangle {
    public static double distance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean isCollinear(int[] A, int[] B, int[] C) {
        return (B[1] - A[1]) * (C[0] - B[0]) == (C[1] - B[1]) * (B[0] - A[0]);
    }
    
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[2];
        int[] B = new int[2];
        int[] C = new int[2];

        System.out.println("Nhập tọa độ điểm A (x, y): ");
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();

        System.out.println("Nhập tọa độ điểm B (x, y): ");
        B[0] = sc.nextInt();
        B[1] = sc.nextInt();

        System.out.println("Nhập tọa độ điểm C (x, y): ");
        C[0] = sc.nextInt();
        C[1] = sc.nextInt();

        double AB = distance(A, B);
        double BC = distance(B, C);
        double CA = distance(C, A);

        if (!isValidTriangle(AB, BC, CA) || isCollinear(A,B,C)) {
            System.out.println("Invalid triangle");
        } else {
            double p = perimeter(AB, BC, CA);
            double area = area(AB, BC, CA);

            System.out.printf("Chu vi tam giác ABC: %.2f\n", p);
            System.out.printf("Diện tích tam giác ABC: %.2f\n", area);
        }

        sc.close();
    }
}
