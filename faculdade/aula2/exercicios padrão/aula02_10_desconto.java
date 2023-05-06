import javax.swing.JOptionPane;

   public class aula02_10_desconto{
	   public static void main(String[] args){
         
         double precoC, precoF;
         
         JOptionPane.showMessageDialog(null,"Calculo de desconto");
         
         precoC = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço inicial do produto: "));
         
         precoF = precoC - (precoC/10);
         
         JOptionPane.showMessageDialog(null,"O novo preço é de: " + precoF);
        	
	}
}