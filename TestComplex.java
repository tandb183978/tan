/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklesson8;

/**
 *
 * @author Admin
 */
public class TestComplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complex kq  = new Complex();
        Complex cp1 = new Complex();
        cp1.hienthi();
        Complex cp2 = new Complex(1);
        cp2.hienthi();
        Complex cp3 = new Complex(3, 5);
        System.out.println("ket qua phep cong");
        kq.cong(cp2,cp3).hienthi();
        System.out.println("ket qua phep tru");
        kq.tru(cp2, cp3).hienthi();
        System.out.println("ket qua phep nhan");
        kq.nhan(cp2,cp3).hienthi();
        if(kq.chia(cp2, cp1).pt!=0&& kq.chia(cp2, cp3).pa!=0){
            System.out.println("ket qua phep chia la");
            kq.chia(cp2, cp1).hienthi();
        }
        else System.out.println("khong chia duoc");

        // TODO code application logic here
    }

}
