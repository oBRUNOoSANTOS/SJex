import javax.swing.JOptionPane;

public class aula02_17_CtoF{
	public static void main(String[] args){
		
		double F, C;
		
		C = Double.parseDouble(JOptionPane.showInputDialog("Informe uma temperatura em graus Celsius"));
		
		F = C * (9.0/5.0)+32.0;
		
		JOptionPane.showMessageDialog(null, C + " graus Celsius em Fahrenheit é: " + F);
		
	}
}