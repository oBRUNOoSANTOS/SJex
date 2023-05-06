import javax.swing.JOptionPane;

public class aula02_16_orgCres2{
	public static void main(String[] args){
		
		int nun1, nun2, nun3, nun4;
		
		JOptionPane.showMessageDialog(null,"Digite 3 numeros em ordem crescente (do menor para o maior)");
		
		nun1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		nun2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		nun3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		JOptionPane.showMessageDialog(null,"Agora digite um numero aleatório)");
		
		nun4 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		if (nun1 > nun2 && nun2 > nun3){
			
         
			JOptionPane.showMessageDialog(null,nun1 + " , " + nun2 + " , " + nun3 + " , " + nun4);
			
		}else if (nun1 > nun3 && nun3 > nun2 && nun2 > nun4){
			
			JOptionPane.showMessageDialog(null,nun1 + " , " + nun3 + " , " + nun1 + " , " + nun4);
			
		}else if (nun2 > nun3 && nun3 > nun1 && nun1 > nun4){
			
			JOptionPane.showMessageDialog(null,nun2 + " , " + nun3 + " , " + nun1 + " , " + nun4);
			
		}else if (nun2 > nun1 && nun1 > nun3 && nun3 > nun4){
			
			JOptionPane.showMessageDialog(null,nun2 + " , " + nun1 + " , " + nun3 + " , " + nun4);
			
		}else if (nun3 > nun2 && nun2> nun1 && nun1 > nun4){
			
			JOptionPane.showMessageDialog(null,nun3 + " , " + nun2 + " , " + nun1 + " , " + nun4);
			
		}else if (nun3 > nun1 && nun1 > nun2 && nun2 > nun4){
			
			JOptionPane.showMessageDialog(null,nun3 + " , " + nun1 + " , " + nun2 + " , " + nun4);
			
		}
		
	}
}