import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Hello World!");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = janela.getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Label de clique do botão");
        contentPane.add(label);
        JButton botao = new JButton("Botão clique");
        contentPane.add(botao);

        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

    }
}