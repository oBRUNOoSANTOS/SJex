import javax.swing.JOptionPane;

public class aula02_11_calculoSal{
	public static void main(String[] args){
		
      double valor, percentBru, percentConv, aumento, salFin;
      
		JOptionPane.showMessageDialog(null, "Calculo do lucro da comissão das vendas");		
		
		percentBru = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de lucro adivinda do preço total de venda: "));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Agora, qual o valor do seu salario que você vendeu: "));
				
		aumento = valor * (percentBru / 100);
      
      salFin = aumento + valor;
		
		JOptionPane.showMessageDialog(null, "O valor a receber das vendas, com base na comissão de " + percentBru + "% é de: " + salFin);      }
		
}