import javax.swing.JOptionPane;

public class aula01_03_comission{
	public static void main(String[] args){
   
		double precoCamisa, percentBru, percentConv, totalVendas, vtv, comisson;
      
		JOptionPane.showMessageDialog(null, "Calculo do lucro da comissão das vendas");
		
		String produto = JOptionPane.showInputDialog("Qual o produto que você esta vendendo");
		
		percentBru = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de lucro adivinda do preço total de venda: "));
		totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Para fazermos o calculo, informe quantos(as) " + produto + " s você vendeu:"));
		precoCamisa = Double.parseDouble(JOptionPane.showInputDialog("Agora, qual o valor unitário dos(as) " + produto + "  que você vendeu: "));
		
		percentConv = percentBru / 100;
		
		vtv = totalVendas * precoCamisa;
		
		comisson = vtv * percentConv;
		
		JOptionPane.showMessageDialog(null, "O valor a receber das vendas, com base na comissão de " + percentBru + " é de: " + comisson);
		
		
		
	}
}