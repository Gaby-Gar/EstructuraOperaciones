/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraopercaciones;

/**
 *
 * @author LENOVO
 */
public class OperacionesBasicas {
    double resultado;
    
    public void Suma(double num1, double num2){
        resultado = num1 + num2;
    }
    
    public void Resta(double num1, double num2){
        resultado = num1 - num2;
    }
    
    public void Multiplicacion(double num1, double num2){
        resultado = num1 * num2;
    }
    
    public void Division(double num1, double num2){
        if(num2==0){
            System.out.println("\nNo es posible dividir entre 0, pruebe con otro numero");
        }
        resultado = num1 / num2;
    }
    
    public void Resultado(){
        System.out.printf("\nEl resultado de la operacion es:" + "%5.5f", resultado);
    }
    
}
