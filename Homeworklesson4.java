/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklesson4;

/**
 *
 * @author Admin
 */
public class Homeworklesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String m = "aadasdasd";
        String n = "aadasdrsd";
        int[] b = {1, 2, 3, 4, 6, 7};
        int c = 6;
        char d[] = {'a', 'b', 'e', 'd', 'c'};
        System.out.println("kiem tra doi xung cua mang b");
        System.out.println(checkdx(b));
        System.out.println("kiem tra c co phai so nguyen to hay khong");
        System.out.println(checksnt(c));
        System.out.println("so sanh 2 mang m n cho ra ket qua nhu ham compareto");
        System.out.println(scompare(m,n));
        System.out.println("kiem tra tinh tang dan giam dan ");
         System.out.println(check(b));
        System.out.println("mang d sau khi da sap xep");
        sapxep(d);
        for (int i = 0; i < 10; i++) {

            System.out.println(d[i]);
        }
       
        
        // TODO code application logic here
    }

    public static boolean checkdx(int b[]) {

        int n = b.length;
        for (int i = 0; i < n / 2; i++) {
            if (b[i] != b[n - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean checksnt(int a) {
        int d = 0;
        for (int i = 1; i < a + 1; i++) {
            if (a % i == 0) {
                d++;
            }

        }
        return d == 2;
    }

    public static char[] sapxep(char a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }

            }

        }
        return a;
    }

    public static int check(int a[]) {
       
        if (a[0] >= a[1]) {
            for (int i = 1; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    return 0;
                }
                return -1;

            }
        } else {
            for (int i = 1; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return 0;
                } 

            }
            return 1;
        }
        return 5;
    }
    public static int scompare(String a,String b){
         for (int i = 0; i < Integer.min(a.length(), b.length()); i++) {
            if (a.charAt(i) - b.charAt(i) != 0) {
                return a.charAt(i) - b.charAt(i);
            } else {
                if ((i == Integer.min(a.length(), b.length()) - 1)) {
                    if (a.length() == b.length()) {
                        return 0;
                    } else if (a.length() > b.length()) {
                        return 1;
                    }
                    else return -1;

                }
                
            }

        }
        return 0;
    }
   
}
