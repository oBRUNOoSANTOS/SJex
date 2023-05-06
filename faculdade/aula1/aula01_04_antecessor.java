import javax.swing.JOptionPane;

   public class aula01_04_antecessor{
	   public static void main(String[] args){
         
         int nun = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
         
         nun = nun - 1;
         
         JOptionPane.showMessageDialog(null,"O antecessor é: " + nun);
      	
	}
}