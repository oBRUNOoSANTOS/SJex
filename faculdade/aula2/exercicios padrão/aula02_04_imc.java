import javax.swing.JOptionPane;

   public class aula02_04_imc{
	   public static void main(String[] args){
        
       double pes, alt, imc;
       
       pes = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
       alt = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
       
        imc = pes / (alt * alt);
       
        JOptionPane.showMessageDialog(null,"O seu imc é de: " + imc);
       
       String sexo = JOptionPane.showInputDialog("Qual o seu sexo? (responder com m ou f)");
       
       if (sexo == "m"){
       
        
       
         if(imc >= 20.7){
         
            JOptionPane.showMessageDialog(null,"você esta saudavel");
         
         }
         else
         {
         
            JOptionPane.showMessageDialog(null,"você não esta saudavel");
            
         }
         
         
         
       
       }
       else
       {
         
          if(imc == 19.1){
         
            JOptionPane.showMessageDialog(null,"você esta saudavel");
         
         }
         else
         {
         
            JOptionPane.showMessageDialog(null,"você não esta saudavel");
         
         }
       
       }
    		
   }	
}