import javax.swing.JOptionPane;

   public class aula02_09_calculoNunQCR{
	   public static void main(String[] args){
         
        int nun, nunq, nunc, nunr;
        
        nun =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
        
        nunq = nun * nun;
        nunc = (nun * nun) * nun;
        
        JOptionPane.showMessageDialog(null,"O quadrado de " + nun + " é : " + nunq );
        JOptionPane.showMessageDialog(null,"O cubo de " + nun + " é : " + nunc );		
	}
}