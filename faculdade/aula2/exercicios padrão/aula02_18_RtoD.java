import javax.swing.JOptionPane;

public class aula02_18_RtoD{
	public static void main(String[] args){
  
   double R, D, cD;		
		R = Double.parseDouble(JOptionPane.showInputDialog("Informe uma quantos reais você tem"));
		cD = Double.parseDouble(JOptionPane.showInputDialog("Agora, qual a cotação do dolar atual?"));		
		D = R / cD;				
		JOptionPane.showMessageDialog(null, "Fazendo a conversão direta, você tem: " + D + " dolares");
   
   
   }
		
      
  }    