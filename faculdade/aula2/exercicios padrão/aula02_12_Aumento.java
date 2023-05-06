import javax.swing.JOptionPane;

public class aula02_12_Aumento{
	public static void main(String[] args){
		
      double valor, percentBru, percentConv, aumento, salFin;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario?"));
      percentBru = Double.parseDouble(JOptionPane.showInputDialog("Qual a porncetagem de aumento?"));
				
		aumento = valor * (percentBru / 100);
      
      salFin = aumento + valor;
		
		JOptionPane.showMessageDialog(null, "O valor a receber das vendas, com base na comissão de " + percentBru + "% é de: " + salFin);      }
		
}