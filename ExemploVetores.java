import javax.swing.JOptionPane;
public class ExemploVetores{
  public static void main(String[] args) {
  
    String [] nomes = new String[15];
    for (int i = 0; i < nomes.length; i++){
      nomes[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "\u00B0 nome");
    }

    
    for (int i = 0; i < nomes.length; ++i){
      JOptionPane.
        showMessageDialog(null, nomes[i]);
        
    }
    // nomes[0] = JOptionPane.showInputDialog("1 nome");
    // nomes[1] = JOptionPane.showInputDialog("2 nome");
  }
} 