
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yolo
 */
public class Pratica41 {
    public static void main(String[] args) {
        Elipse maroto =new Elipse (2,2);
        Circulo maroto2 =new Circulo (7);
        
        System.out.println(maroto.getArea());
        System.out.println(maroto.getPerimetro());
        System.out.println(maroto2.getArea());
        System.out.println(maroto2.getPerimetro());
    }
    
}
