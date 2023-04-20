/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuraopercaciones;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Numeros {
    Scanner entrada = new Scanner(System.in);
    
    int opcion;
    double num1, num2;
    
    OperacionesBasicas OpeBas = new OperacionesBasicas();
    
    public void Menu(){
        System.out.println("Seleccione una opcion del siguiente menu:"
        + "\n\t" + "1. Suma"
        + "\n\t" + "2. Resta"
        + "\n\t" + "3. Multiplicación"
        + "\n\t" + "4. División");
        opcion = entrada.nextInt();
        
        if(opcion >= 1 && opcion <= 4){
            System.out.println("\nDigite el primer numero para realizar la operacion");
            num1 = entrada.nextInt();
            System.out.println("\nDigite el segundo numero para realizar la operacion");
            num2 = entrada.nextInt();
            
            if(opcion==1){
                OpeBas.Suma(num1, num2);
            } 
            else if(opcion==2){
                OpeBas.Resta(num1, num2);
            } 
            else if(opcion==3){
                OpeBas.Multiplicacion(num1, num2);
            } 
            else if(opcion==4){
                OpeBas.Division(num1, num2);
            }
            
            OpeBas.Resultado();
        }
        else{
            System.out.println("\nOpcion no valida");
        }
    }
}
