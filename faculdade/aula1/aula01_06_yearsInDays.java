import javax.swing.JOptionPane;

public class aula01_06_yearsInDays{
	
	public static void main(String[] args){
		
		double year, dy;
		JOptionPane.showMessageDialog(null, "Anos de vida em dias ");
		
		year = Double.parseDouble(JOptionPane.showInputDialog("Quantos anos você tem?"));
		
		dy = year * 365;
		
		JOptionPane.showMessageDialog(null, "Sua idade em dias é de: " + dy);
				
		
		
	}
}