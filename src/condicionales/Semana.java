/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB05
 */
public class Semana 
{
  public static void main (String[]  args)
  {
   int semana =Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
   switch(semana)
           {
        case 7:
           JOptionPane.showMessageDialog(null, "domingo");
         break;
          case 6:
           JOptionPane.showMessageDialog(null, "sabado");
         break;
         case 5:
           JOptionPane.showMessageDialog(null, "viernes");
         break;
         case 4:
           JOptionPane.showMessageDialog(null, "jueves");
         break;
         case 3:
           JOptionPane.showMessageDialog(null, "miercoles");
         break;
         case 2:
           JOptionPane.showMessageDialog(null, "martes");
         break;
          default:
           JOptionPane.showMessageDialog(null, "lunes");
         break;
  }
   
 
 
  }  
}
