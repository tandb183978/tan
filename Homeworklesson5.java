/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklesson5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Homeworklesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soTien = 1768932398;
        String st = String.valueOf(soTien);

        int x[] = new int[st.length() / 3 + 1];
        for (int i = 0; i < x.length; i++) {
            x[i] = soTien % 1000;
            soTien = soTien / 1000;
        }
        for (int i = x.length - 1; i > 0; i = i - 1) {
            System.out.print(x[i] + ",");

        }
        System.out.println(x[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao phep tinh ");
        String s = sc.nextLine();
        char u[] = s.toCharArray();
        int v = s.indexOf('+');
        char a[] = new char[v];
        char b[] = new char[s.length() - v - 1];
        for (int i = 0; i < v; i++) {
            a[i] = u[i];

        }
        for (int i = 0; i < b.length; i++) {
            b[i] = u[i + v + 1];
        }
        String c = String.valueOf(a);
        int sohang1 = Integer.parseInt(c);
        String d = String.valueOf(b);
        int sohang2 = Integer.parseInt(d);
        System.out.println(sohang1 + sohang2);

        int matran[][] = new int[3][3];
        int mt[] = new int[9];
        int k = 0;
        int l = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("a" + (i + 1) + (j + 1) + " = ");
                matran[i][j] = sc.nextInt();
                mt[k] = matran[i][j];
                k++;

            }

        }
        int max = mt[0];
        int min = mt[0];
        for (int j = 0; j < 9; j++) {
            if (mt[j] > max) {
                max = mt[j];
            }
            if (mt[j] < min) {
                min = mt[j];
            }

        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (mt[i] == mt[j]) {
                    l++;
                    
                }
            }

        }
        if(l==0){
            if(max==9&&min==1) System.out.println("ma tran du cac so tu 1 den 9");
            else System.out.println("ma tran khong du cac so tu 1 den 9");
        }
        else System.out.println("ma tran khong du cac so tu 1 den 9");
        

        // TODO code application logic here
    }

}
