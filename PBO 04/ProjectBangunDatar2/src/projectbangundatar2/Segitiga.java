/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Lenovo
 */
public class Segitiga {
    int hLuas(int a, int t){
        return (a*t/2);
    }
    
    int hKeliling(int a, int t){
        int m = (int) Math.sqrt((a*a) + (t*t));
        return (a*t*m);
    }
    
    double hLuas(double a, double t){
        return (a*t/2);
    }
    
    double hKeliling(double a, double t){
        int m = (int) Math.sqrt((a*a) + (t*t));
        return (a*t*m);
    }
}
