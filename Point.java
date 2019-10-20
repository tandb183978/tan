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
class Point {
    float x;
    float y;
    float z;
    Point(){
        x=0;
        y=0;
        z=0;
    }
    Point(float a,float b,float c){
        x=a;
        y=b;
        z=c;
    }
    void hienthi(){
        System.out.println(x+" ; "+y+" ; "+z);
    }
}
