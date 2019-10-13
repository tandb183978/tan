/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklesson6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Homeworklesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap sao so nguyen n :");
        int n = sc.nextInt();
        long s = 1;
        int d = 0;
        int a = 10;
        for (int i = 0; i < n; i++) {
            s = s * (i + 1);
        }
        while (s % a == 0) {
            d++;
            a = 10 * a;
        }
        System.out.println("so chu so 0 tinh tu hang don vi cua n! la:");
        System.out.println(d);
        int m=234;
        int tcs=0;
        int b=n;
        while(b>0){
            tcs=tcs+b%10;
            b=b/10;
        }
        if(m%tcs==0) System.out.println(m + " la so dep");
        else System.out.println(m + " khong la so dep");
        // TODO code application logic here
    }

}
