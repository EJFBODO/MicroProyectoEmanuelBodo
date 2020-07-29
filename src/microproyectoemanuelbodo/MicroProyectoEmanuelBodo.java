
package microproyectoemanuelbodo;
import javax.swing.*;


public class MicroProyectoEmanuelBodo {

   
    public static void main(String[] args) {
                   
          if (!login()) return;
                      
        int partialFee;        
        String brand= JOptionPane.showInputDialog (null,"Enter your car´s brand", "Brand",JOptionPane.QUESTION_MESSAGE);
        int age=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your car´s year of manufacturing", "Age",JOptionPane.QUESTION_MESSAGE));
        String luxuryBrand []= {"BMW","AUDI","VOLVO"};
        String brandU=brand.toUpperCase ();
        boolean search= searching (luxuryBrand,brandU);
        if (!search){partialFee=890;}
         
        else{partialFee=1800;}
                         
        int partialFeeTwo=searchingAge(age);
                   
        int finalFee=partialFee+partialFeeTwo;
     
        JOptionPane.showMessageDialog (null,"Your car´s brand,year and fee"
                + ":\n" +brand+ "\n"+age+"\n" +finalFee, "Result",JOptionPane.INFORMATION_MESSAGE);
                
     }            
    
    public static boolean searching(String x [],String y ){
    
         for (String i:x){
        if (i.equals(y)){
            return true;}       
}
return false;
    }
   
    public static int searchingAge (int x){
       
        int partialFeeTwo;
       
        switch (x){
            case 1990: case 1991: case 1992: case 1993: case 1994: case 1995: case 1996: case 1997: case 1998: case 1999: 
           partialFeeTwo=480;
             break;
            case 2000: case 2001: case 2002: case 2003: case 2004: case 2005: case 2006: case 2007: case 2008: case 2009: case 2010:
                partialFeeTwo=780;
             break;
            case 2011: case 2012: case 2013: case 2014: case 2015: case 2016:
                partialFeeTwo=950;
                break;
            case 2017: case 2018: case 2019: case 2020:
                partialFeeTwo=1200;
                break;
            default:
                partialFeeTwo=350;
                      
        }
        return partialFeeTwo;
        
    }
 public static boolean login(){
     boolean authenticated=false;
        int tries=1;
     String[]users={"juan","jose"};
     String[] pass={"hola","chau"};
    
     do{
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
     Object[] message = {
    "Username:", username,
    "Password:", password};
int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
if (option == JOptionPane.OK_OPTION) { 
    for  (String i:users){
       if (i.equals(username.getText()))
           for (String j:pass) 
           if (j.equals(password.getText())){authenticated=true;  }  }  } 
    
    if (!authenticated) {JOptionPane.showMessageDialog(null,"Login failed\nRetry please\n3 tries maximum","Retry",JOptionPane.WARNING_MESSAGE);} 

    tries++; }  
        
       while(tries<=3 & (!authenticated));

    if (authenticated){JOptionPane.showMessageDialog(null,"Welcome\nLogin Successfull");} 
   else {JOptionPane.showMessageDialog(null,"Login canceled\nMaximum number of tries reached","Error",JOptionPane.ERROR_MESSAGE);}

    if (authenticated){return true;} 
    return false;
} 
 
}

