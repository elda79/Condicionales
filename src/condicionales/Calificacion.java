/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 * @author LAB05:Elda Solar Molina
 * Fecha: 02/11/2017
 * Clase: Calificacion
 * Responsabilidad:Ingresar tres notas si el promedio es mayor o igual a cuatro enviar mensaje si aprobo sino reprobo
 */
public class Calificacion 
{
 public static void main(String[] args)
 {
  float nota1,nota2,nota3, promedio;
  
  nota1 =Float.parseFloat(JOptionPane.showInputDialog("Ingrese primer nota"));
  nota2 =Float.parseFloat(JOptionPane.showInputDialog("Ingrese segunda nota"));
  nota3 =Float.parseFloat(JOptionPane.showInputDialog("Ingrese tercer nota"));
   promedio = (nota1 + nota2 + nota3)/3;
  
    if (promedio > 4) 
     {
      JOptionPane.showMessageDialog(null, "su promedio es mayor que 4"); 
      JOptionPane.showMessageDialog(null, "Usted aprobo");
     }
    else
     {
     JOptionPane.showMessageDialog(null, "su promedio es menor que 4");
     JOptionPane.showMessageDialog(null, "Usted reprobo");
     }
    
 }   
}
