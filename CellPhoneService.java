
// Class: IT 2650
// Class Course: Java Programming, Fall 2015,
//  Due Date: November, 2016




import javax.swing.JOptionPane;

public class CellPhoneService 
{
  

  public static void main(String[] args)
  {

   JOptionPane.showMessageDialog(null "Micheal Seals" +  "\nAssign 90, IT 2650" +  "\nJava Programming, Fall 2015 CRN 97667,"  + "\n October 12, 2016");   
    


   
      displayMessage();
        
   }



   public static void displayMessage()
   {  
     
      String input1, input2, input3;
      int TALK_MINUTES;
      int TEXT_MESSAGES;
      int GIGABYTE_DATA;

      input1=JOptionPane.showInputDialog("Enter talk minutes needed");
      TALK_MINUTES=Integer.parseInt(input1);
      
      input2=JOptionPane.showInputDialog("Enter text messages needed");
      TEXT_MESSAGES=Integer.parseInt(input2);

      input3=JOptionPane.showInputDialog("Enter gigabytes of data needed");
      GIGABYTE_DATA=Integer.parseInt(input3);   
      

      if(TALK_MINUTES<500 && TEXT_MESSAGES == 0 && GIGABYTE_DATA==0)
      {
        JOptionPane.showMessageDialog(null, "Plan A $49 per month");
      }
      if(TALK_MINUTES<500 && TEXT_MESSAGES > 0 && GIGABYTE_DATA == 0)
      {  
        JOptionPane.showMessageDialog(null, "Plan B $55 per month");
      }
      if(TALK_MINUTES>=500 && GIGABYTE_DATA == 0 && TEXT_MESSAGES <=100 && TEXT_MESSAGES>0)
      {
        JOptionPane.showMessageDialog(null, "Plan C $ 61 per month");
      }
      if(TALK_MINUTES>=500 && GIGABYTE_DATA == 0 && TEXT_MESSAGES >100)
      {
        JOptionPane.showMessageDialog(null, "Plan D $ 70 per month"); 
      }
      if(GIGABYTE_DATA<2 && GIGABYTE_DATA>0)
      {
        JOptionPane.showMessageDialog(null, "Plan E $ 79 per month");
      }
      if(GIGABYTE_DATA>=2 && GIGABYTE_DATA>0)
      {
        JOptionPane.showMessageDialog(null, "Plan F $ 87 per month"); 
      }

      
     

  
       
   }

}
