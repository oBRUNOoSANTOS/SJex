import javax.swing.JOptionPane;

public class aula02_19_antSuc{
	public static void main(String[] args){
		
		int nun, nunA, nunS;
		
		nun = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		
		nunA = nun - 1;
		nunS = nun + 1;
		
		JOptionPane.showMessageDialog(null, "O antecessor de " + nun + " é " + nunA + ", e o sucessor é " + nunS);
		
		
	}
}