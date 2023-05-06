import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {

        int num = 1;
        String mensagem = "";

        while (num <= 100) {
        
         if (num == 100){
         
            mensagem += num + ".";
            num++;         
         }else{
         
            mensagem += num + ", ";
            num++;  
         }   
         
          
       }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}