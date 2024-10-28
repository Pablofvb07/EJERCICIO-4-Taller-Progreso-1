import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BalanceoGUI {
    private JTextField input;
    private JButton comprobarButton;
    private JTextArea resultado;
    private JPanel pGeneral;
    Balanceo balanceo=new Balanceo();
    public BalanceoGUI() {
        comprobarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expresion= input.getText();
                if (Balanceo.estaBalanceada(expresion)){
                    resultado.setText("Balanceada");
                } else{
                    resultado.setText("No balanceada");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BalanceoGUI");
        frame.setContentPane(new BalanceoGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
