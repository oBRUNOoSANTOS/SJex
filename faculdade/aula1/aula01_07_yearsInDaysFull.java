import javax.swing.JOptionPane;

public class aula01_07_yearsInDaysFull{
	
	public static void main(String[] args){
		
		double year, month, days, dY, dM, dT;
		
		JOptionPane.showMessageDialog(null, "Anos de vida em dias ");
		JOptionPane.showMessageDialog(null, "Agora me informe, separadamente, sua idade em: anos, meses e dias ");
		
		year = Double.parseDouble(JOptionPane.showInputDialog("Anos"));
		month = Double.parseDouble(JOptionPane.showInputDialog("meses"));
		days = Double.parseDouble(JOptionPane.showInputDialog("Dias"));
		
		dY = year * 365;
		dM = month * 30;
		dT = dY + dM + days;
		
		JOptionPane.showMessageDialog(null, "Sua idade em dias é de: " + dT);
		
		
		
	}
}