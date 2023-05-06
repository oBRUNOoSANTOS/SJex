import javax.swing.JOptionPane;

public class aula01_05_adr{
	
	public static void main(String[] args){
		
		double h, b, A;
		
		JOptionPane.showMessageDialog(null, "Programa para calculo de área de um retangulo!");
		
		h = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do seu retangulo? "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Qula a base do seu retangulo? "));
		
		A = b * h;
		
		JOptionPane.showMessageDialog(null, "A área do seu retangulo é de: " + A);
	}
}