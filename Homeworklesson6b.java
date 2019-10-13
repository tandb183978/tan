/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklesson6b;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Homeworklesson6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n: ");
        int n = sc.nextInt();
        int d = 0;
        System.out.println("nhap vao seglen: ");
        int seglen = sc.nextInt();
        System.out.println("nhap vao toa do cac diem theo thu tu tang dan: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] - a[i] == seglen) {
                    d++;
                    break;
                }
            }
        }
        System.out.println("so doan can dung la :");
        System.out.println(d);
        // TODO code application logic here
    }

}
