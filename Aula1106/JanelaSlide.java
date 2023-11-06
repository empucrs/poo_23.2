import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JanelaSlide {
    public static void main(String[] args){
      JFrame frame = new JFrame("User JanelaSlide");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      // Criação do menu
      JMenu arquivo = new JMenu("Arquivo");
      arquivo.add(new JMenuItem("Abrir"));
      arquivo.add(new JMenuItem("Salvar"));
      arquivo.add(new JMenuItem("Sair"));
      JMenu ajuda   = new JMenu("Ajuda");

      JMenuBar menuBar = new JMenuBar();
      menuBar.add(arquivo);
      menuBar.add(ajuda);
      frame.setJMenuBar(menuBar);
      ////////////////////////////

      JPanel pnID = new JPanel(new FlowLayout(FlowLayout.LEADING));
      JLabel lbID = new JLabel("ID");
      JTextField tfID = new JTextField(40);
      pnID.add(lbID);
      pnID.add(tfID);

      JPanel pnNome = new JPanel(new FlowLayout(FlowLayout.LEADING));
      JLabel lbNome = new JLabel("Nome");
      JTextField tfNome = new JTextField(40);
      pnNome.add(lbNome);
      pnNome.add(tfNome);

      JPanel pnAcao = new JPanel(new FlowLayout(FlowLayout.CENTER));
      JButton btnLimpar = new JButton("Limpar");
      JButton btnSalvar = new JButton("Salvar");
      JLabel lbEspacamento = new JLabel("    ");
      pnAcao.add(btnLimpar);
      pnAcao.add(lbEspacamento);
      pnAcao.add(btnSalvar);

      // container da esquerda
      JPanel leftPanel = new JPanel();
      leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
      leftPanel.add(new JLabel("Detalhes funcionário"));
      leftPanel.add(pnID);
      leftPanel.add(pnNome);
      leftPanel.add(pnAcao);

      // container da esquerda
      JPanel rightPanel = new JPanel();
      JTable tblTabela = new JTable(10, 5);
      rightPanel.add(tblTabela);

      JPanel paiDeTodos = new JPanel();
      paiDeTodos.setLayout(new GridLayout(1,2));
      paiDeTodos.add(leftPanel);
      paiDeTodos.add(rightPanel);

      frame.getContentPane().add(paiDeTodos);

      frame.pack();
      frame.setLocationRelativeTo(null);
      //frame.setSize(400, 400);
      frame.setVisible(true);


/*
      JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
      JLabel lbUser = new JLabel("Usuario: ");
      JTextField tfUser = new JTextField(20);
      linha1.add(lbUser);
      linha1.add(tfUser);

      JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
      JLabel lbPass = new JLabel("Senha:   ");
      JPasswordField pfPass = new JPasswordField(20);
      linha2.add(lbPass);
      linha2.add(pfPass);

      JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
      JButton btClean = new JButton("Limpar");
      JLabel lbEmpty = new JLabel("  ");
      JButton btJanelaSlide = new JButton("JanelaSlide");
      linha3.add(btJanelaSlide);
      linha3.add(lbEmpty);
      linha3.add(btClean);
     
      Container contentPane = frame.getContentPane();
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
      contentPane.add(linha1);
      contentPane.add(linha2);
      contentPane.add(linha3);
*/

   }
}
