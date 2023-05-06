import javax.swing.JOptionPane;

   public class aula02_07_med{
	   public static void main(String[] args){
         
         double nt1, nt2, nt3, result, med;
         
         JOptionPane.showMessageDialog(null,"Calculo de média");
         
         nt1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o nota 1:"));
         nt2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o nota 2:"));
         nt3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o nota 3:"));
         
         result = nt1 + nt2 + nt3;
         
         med = result / 3;
         
         JOptionPane.showMessageDialog(null,"O resultado da soma dos numeros inteiros é de: " + med);
         		
	}
}