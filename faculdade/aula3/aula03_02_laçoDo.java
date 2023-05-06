import javax.swing.JOptionPane;

public class aula03_02_laçoDo{
	public static void main(String[] args){
		
		int num = 100;
      
      do{
      
         System.out.println(num);
         //JOptionPane.showMessageDialog(null,num);
         
         num--;
      
      }while (num >= 0);
      
 }
}