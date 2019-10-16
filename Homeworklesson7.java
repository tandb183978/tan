/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklesson7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Homeworklesson7 {

    public static Scanner sc = new Scanner(System.in);
    public static int h, m, s, X, N, u, v,t;
    public static int[] a;

    /**
     *
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        input();
        int x = doi1(h, m, s);
        int y = congthem(x, X);
        System.out.println(doi2(y));
        inputN();
        inputm();
        yeucau();
        xuli();
        show();

        // TODO code application logic here
    }

    public static void input() {
        System.out.println("nhap 0 neu buoi sang 1 neu buoi chieu ");
        t=sc.nextInt();
        System.out.println("nhap vao gio phut giay hien tai: ");
        h = sc.nextInt();
        while (h > 11 || h < 0) {
            System.out.println(" nhap sai gio");
            h = sc.nextInt();
        }
        m = sc.nextInt();
        while (m > 59 || h < 0) {
            System.out.println(" nhap sai phut");
            h = sc.nextInt();
        }
        s = sc.nextInt();
        while (s > 59 || h < 0) {
            System.out.println(" nhap sai giay");
            h = sc.nextInt();
        }
    }

    private static int doi1(int h, int m, int s) {
        return 3600 * h + 60 * m + s;
    }

    private static int congthem(int x, int X) {
        System.out.println("nhap so giay can cong them ");
        X = sc.nextInt();
        return x + X;
    }

    public static String doi2(int y) {
        if(y-3600*12>=0) t=1-t;
        String buoi="";
        if(t==0){
            buoi="AM";
        }
        else buoi="PM";
        return Integer.toString((y / 3600) % 12) + "h " + Integer.toString((y % 3600) / 60) + "m " + Integer.toString(y % 60) + "s "+buoi;

    }

    public static void inputN() {

        System.out.println("Nhap vao N: ");
        N = sc.nextInt();
        while (N < 6) {
            System.out.println("nhap sai N nhap lai ");
            N = sc.nextInt();
        }

    }

    public static void inputm() {
        a=new int[N];

        System.out.println("nhap vao cac phan tu cua mang");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

    }

    private static void yeucau() {
        System.out.println("nhap vao vi tri phan tu can di chuyen");
        u = sc.nextInt();
        while (u < 0 || u > N) {
            System.out.println("nhap sai nhap lai ");
            u = sc.nextInt();
        }
        System.out.println("nhap vao vi tri sau khi di chuyen");
        v = sc.nextInt();
        while (v < 0 || v > N) {
            System.out.println("nhap sai nhap lai ");
            v = sc.nextInt();
        }

    }

    private static void xuli() {
        if (u > v + 1) {
            int tg = a[v];
            a[v] = a[u];
            for (int i = u; i > v + 1; i--) {
                a[i] = a[i - 1];
            }
            a[v + 1] = a[v];
        }
        if (u + 1 < v) {
            int tg = a[v];
            a[v] = a[u];
            for (int i = u; i < v - 1; i++) {
                a[i] = a[i + 1];

            }
            a[v - 1] = tg;
        }
        if (u == v - 1 || v == u - 1) {
            int tg = a[u];
            a[u] = a[v];
            a[v] = tg;
        }
    }

    private static void show() {
        for (int i = 0; i < N; i++) {
            System.out.println(a[i]);
        }
    }

}
