import javax.swing.JOptionPane;

public class aula02_15_orgCres{
	public static void main(String[] args){
		
		int nun1, nun2, nun3;
		
		nun1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		nun2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
      nun3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		if (nun1 > nun2 && nun2 > nun3){
			
			JOptionPane.showMessageDialog(null,nun1 + " , " + nun2 + " , " + nun3);
			
		}else if (nun1 > nun3 && nun3 > nun2){
			
			JOptionPane.showMessageDialog(null,nun1 + " , " + nun3 + " , " + nun1);
			
		}else if (nun2 > nun3 && nun3 > nun1){
			
			JOptionPane.showMessageDialog(null,nun2 + " , " + nun3 + " , " + nun1);
			
		}else if (nun2 > nun1 && nun1 > nun3){
			
			JOptionPane.showMessageDialog(null,nun2 + " , " + nun1 + " , " + nun3);
			
		}else if (nun3 > nun2 && nun2> nun1){
			
			JOptionPane.showMessageDialog(null,nun3 + " , " + nun2 + " , " + nun1);
			
		}else if (nun3 > nun1 && nun1 > nun2){
			
			JOptionPane.showMessageDialog(null,nun3 + " , " + nun1 + " , " + nun2);
			
		}
		
	}
}