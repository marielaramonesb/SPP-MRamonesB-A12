/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author marielaramonesbalvoa
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double est = solicitaDouble("Digite su estatura");
        double p = solicitaDouble("Digite su peso");
        
        double imc = p / Math.pow(est,2);
        
        JOptionPane.showMessageDialog (null, "Su IMC es igual a: " + imc);
        
        if (imc > 25){
            JOptionPane.showMessageDialog (null, "SOBREPESO");
        }else if (imc < 18){
            JOptionPane.showMessageDialog (null, "DESNUTRICIÓN");
        }else {
            JOptionPane.showMessageDialog (null, "NORMAL");
        }
    }
      public static double solicitaDouble(String mensaje){
        Scanner kb = new Scanner (System.in);
        String dato;
        double num = 0;
        boolean flag;
        do{
            try{
            dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "ERROR");
                flag=true;
                } 
        } while (flag); 
        return num;
 
        
    }
}
