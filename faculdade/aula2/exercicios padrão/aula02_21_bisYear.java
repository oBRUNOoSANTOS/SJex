import javax.swing.JOptionPane;

public class aula02_21_bisYear{
	public static void main(String[] args){
		
		int year, bi;
		
		year = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano"));
		
		bi = year % 4;
		
		if (bi == 0){
			
			JOptionPane.showMessageDialog(null, "Esse ano é bissexto");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Esse ano não é bissexto");
			
		}
		
	}
}