package poo.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Raiz {
    static DecimalFormat f = new DecimalFormat("##.000000");

    public static void main(String[] args) {
        Scanner conEntrada = new Scanner( System.in );
        try{
            System.out.println(calcularBiseccion(0.00d,3.0d));
        }catch (Exception e){
            System.exit(0);
        }
    }
    public static double f(double x){
        return Math.log(1+Math.cos(x)) - (Math.sqrt(x)/2);
    }
    public static double calcularBiseccion(double a, double b) throws Exception {
        if (!(f(a)*f(b) < 0))
            throw new Exception("");
        else{
            return obtenerRaiz(a,b,0.0000000001d);
        }
    }
    public static double obtenerRaiz(double a, double b, double umbral){
        double pt_medio = (a+b)/2;
        if ((f(a)*f(pt_medio)) >= -umbral && (f(a)*f(pt_medio)) <= umbral)
            return pt_medio;
        else{
            if (f(a)*f(pt_medio) < 0)
                return obtenerRaiz(a,pt_medio,umbral);
            else
                return obtenerRaiz(pt_medio,b,umbral);
        }
    }
}
