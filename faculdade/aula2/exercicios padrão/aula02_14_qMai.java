import javax.swing.JOptionPane;

public class aula02_14_qMai{
	public static void main(String[] args){
		
		int nun1, nun2;
		
		nun1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		nun2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		if (nun1 > nun2){
			
			JOptionPane.showMessageDialog(null,nun1 + " é maior do que " + nun2);
			
		}else{
			
			JOptionPane.showMessageDialog(null,nun2 + " é maior do que " + nun1);
			
		}
		
	}
}