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
class Complex {
    float pt;
    float pa;

    Complex() {
        pt = 0;
        pa = 0;
    }

    Complex(int a) {
        pt = a;
        pa = 0;
    }

    Complex(int a, int b) {
        pt = a;
        pa = b;

    }

    Complex cong(Complex e, Complex f) {
        Complex g = new Complex();
        g.pt = e.pt + f.pt;
        g.pa = e.pa + f.pa;
        return g;
    }

    Complex tru(Complex e, Complex f) {
        Complex g = new Complex();
        g.pt = e.pt - f.pt;
        g.pa = e.pa - f.pa;
        return g;
    }

    Complex nhan(Complex e, Complex f) {
        Complex g = new Complex();
        g.pt = e.pt * f.pt - e.pa * f.pa;
        g.pa = e.pt * f.pa + f.pt * e.pa;
        return g;
    }

    Complex chia(Complex e, Complex f) {
        Complex g = new Complex();
        Complex h = new Complex();
        if (f.pt != 0 && f.pa != 0) {
            h.pt = f.pt / (f.pt * f.pt + f.pa * f.pa);
            h.pa = -f.pa / (f.pt * f.pt + f.pa * f.pa);
            g.pt = e.pt * h.pt - e.pa * h.pa;
            g.pa = e.pt * h.pa + h.pt * e.pa;
        } else {
            return h;
        }

        return g;
    }
void hienthi(){
    System.out.println(pt+" + "+pa+"i");
}
}
