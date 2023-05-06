import javax.swing.JOptionPane;

public class aula02_13_ifMed{
	public static void main(String[] args){
		
		int nt1, nt2, nt3, med;
		
		nt1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do seu trabalho de láboratório"));
		nt2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da sua avaliação semestral"));
		nt3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do seu exame final"));
		
		med = nt1 + nt2 + nt3;
		
		if (med >= 6){
			
         JOptionPane.showMessageDialog(null,"Nesse trimestre, você tirou " + med);
			JOptionPane.showMessageDialog(null,"Você passou");
			
		}else{
      
			JOptionPane.showMessageDialog(null,"Nesse trimestre, você tirou " + med);
			JOptionPane.showMessageDialog(null,"Você foi reprovado");
			
		}
		
	}
}