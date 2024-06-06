
import javax.swing.JOptionPane;

public class TrafficLightChecker {

    public static void main(String args[]) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero de 1 a 3"));
    if (age == 1) {
        System.out.println("O farol esta vermelho");
    }
    else if (age == 2) {
        System.out.println("O farol esta verde");
    }
    else if (age == 3) {
        System.out.println("O farol esta amarelo");
    }
    else {
        System.out.println("Esse numero nao e valido");
    }
    
    
    
}

}
