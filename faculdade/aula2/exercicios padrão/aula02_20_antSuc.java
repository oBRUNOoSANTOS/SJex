import javax.swing.JOptionPane;

public class aula02_20_antSuc{
	public static void main(String[] args){
		
		int nun;
		
		nun = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		
		switch (nun){
			
			case 1:
			
				JOptionPane.showMessageDialog(null, "Esse numero corresponde ao Domingo");
			
			break;
			
			case 2:
			
				JOptionPane.showMessageDialog(null, "Esse numero corresponde ao Segunda-Feira");
			
			break;
			
			case 3:
			
				JOptionPane.showMessageDialog(null, "Esse numero corresponde ao Terça-Feira");
			
			break;
			
			case 4:
			
				JOptionPane.showMessageDialog(null, "Esse numero corresponde ao Quarta-Feira");
			
			break;
			
			case 5:
			
				JOptionPane.showMessageDialog(null, "Esse numero corresponde ao Quinta-Feira");
			
			break;
			
			case 6:
			
				JOptionPane.showMessageDialog(null, "Esse numero corresponde ao Sexta-Feira");
			
			break;
			
			case 7:
			
				JOptionPane.showMessageDialog(null, "Esse numero corresponde ao Sábado");
			
			break;
		}
		
		
	}
}