/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microproyectoemanuelbodo;
import javax.swing.*;


public class MicroProyectoEmanuelBodo {

   
    public static void main(String[] args) {
        
        int cuotaParcial;
               
        String marca= JOptionPane.showInputDialog (null,"Ingrese marca de automovil", "Marca",JOptionPane.QUESTION_MESSAGE);

        int modelo=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de fabricación de automovil", "Modelo",JOptionPane.QUESTION_MESSAGE));
        
        String altaGama []= {"bmw","audi", "volvo"};
        
        boolean busqueda= buscar (altaGama,marca);
        
        if (busqueda){cuotaParcial=1800;
     
    }
        else{cuotaParcial=890;
    }
        
               
        int cuotaParcialDos=cotizar ();
                        
        int cuotaFinal=cuotaParcial+cuotaParcialDos;
       
        JOptionPane.showMessageDialog (null,"Su marca, modelo y cotización en $:\n" +marca+ "\n"+modelo+"\n" +cuotaFinal, "Resultado",JOptionPane.INFORMATION_MESSAGE);
    }    
    public static boolean buscar (String altaGama [],String marca){
    
         for (String i:altaGama){
        if (i.equals (marca)){return true;
        
}
    
}
return false;
    }
    
    public static int cotizar (){
        int modelo=Integer.parseInt(JOptionPane.showInputDialog(null, "Reingrese el año de fabricación de automovil", "Modelo",JOptionPane.QUESTION_MESSAGE));
        int cuotaParcialDos;
        switch (modelo){
            case 1990: case 1991: case 1992: case 1993: case 1994: case 1995: case 1996: case 1997: case 1998: case 1999: 
              cuotaParcialDos=480;
             break;
            case 2000: case 2001: case 2002: case 2003: case 2004: case 2005: case 2006: case 2007: case 2008: case 2009: case 2010:
                cuotaParcialDos=780;
             break;
            case 2011: case 2012: case 2013: case 2014: case 2015: case 2016:
                cuotaParcialDos=950;
                break;
            case 2017: case 2018: case 2019: case 2020:
                cuotaParcialDos=1200;
                break;
            default:
                cuotaParcialDos=350;
                      
        }
        return cuotaParcialDos;
        
    }
 }
