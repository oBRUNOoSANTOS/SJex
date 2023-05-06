import javax.swing.JOptionPane;

   public class aula02_05_SomaNunInt{
	   public static void main(String[] args){
         
         int nun1, nun2, nun3, result;
         
         JOptionPane.showMessageDialog(null,"Soma de numeros inteiros");
         
         nun1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1:"));
         nun2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2:"));
         nun3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3:"));
         
         result = nun1 + nun2 + nun3;
         
         JOptionPane.showMessageDialog(null,"O resultado da soma dos numeros inteiros é de: " + result);
         		
	}
}