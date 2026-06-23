package Q5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Q55 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso;
	private JLabel lblPreco;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q55 frame = new Q55();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Q55() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPeso = new JLabel("Peso (kg): ");
		lblPeso.setBounds(81, 97, 150, 14);
		contentPane.add(lblPeso);

		txtPeso = new JTextField();
		txtPeso.setBounds(165, 94, 189, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblTitulo = new JLabel("Fomelandia");
		lblTitulo.setFont(new Font("Bauhaus 93", Font.PLAIN, 16));
		lblTitulo.setBounds(176, 25, 300, 14);
		contentPane.add(lblTitulo);

		lblPreco = new JLabel("");
		lblPreco.setBounds(187, 207, 150, 14);
		contentPane.add(lblPreco);

		JButton btnPreco = new JButton("Calcular preço");
		btnPreco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double pesoRef = Double.parseDouble(txtPeso.getText());
					
					String precoTotal =  "R$ " + String.format("%.2f", 9.95*pesoRef) ;
					lblPreco.setText(precoTotal);
				
			}
		});
		btnPreco.setBounds(143, 167, 142, 23);
		contentPane.add(btnPreco);
		
		JLabel lblInstrucao = new JLabel("Digite o peso de sua refeição em quilograma:");
		lblInstrucao.setBounds(109, 50, 382, 14);
		contentPane.add(lblInstrucao);
	}
}