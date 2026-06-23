package Q7;

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

public class Q77 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNota;
	private JLabel lblPreco;
	private JTextField txtNota1;
	private JTextField txtNota2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q77 frame = new Q77();
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
	public Q77() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(59, 81, 80, 14);
		contentPane.add(lblNome);

		txtNota = new JTextField();
		txtNota.setBounds(144, 78, 189, 20);
		contentPane.add(txtNota);
		txtNota.setColumns(10);

		JLabel lblTitulo = new JLabel("Média Final");
		lblTitulo.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblTitulo.setBounds(160, 11, 300, 14);
		contentPane.add(lblTitulo);

		lblPreco = new JLabel("");
		lblPreco.setBounds(141, 239, 150, 14);
		contentPane.add(lblPreco);

		JLabel lblNota1 = new JLabel("Primeira nota:");
		lblNota1.setBounds(59, 108, 156, 12);
		contentPane.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(144, 106, 189, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblSituacao = new JLabel("");
		lblSituacao.setBounds(208, 227, 150, 12);
		contentPane.add(lblSituacao);
		
		JLabel lblNota2 = new JLabel("Segunda nota:");
		lblNota2.setBounds(59, 133, 156, 12);
		contentPane.add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(144, 129, 189, 20);
		contentPane.add(txtNota2);
		
		JLabel lblMedia = new JLabel("");
		lblMedia.setBounds(230, 201, 128, 12);
		contentPane.add(lblMedia);
		
		JLabel lblMedia_1 = new JLabel("");
		lblMedia_1.setBounds(141, 217, 128, 12);
		contentPane.add(lblMedia_1);
		

		JButton btnMedia = new JButton("Calcular média final");
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					double nota1 = Double.parseDouble(txtNota1.getText());
					double nota2 = Double.parseDouble(txtNota2.getText());
					
					String media =  " = " + String.format("%.2f", (nota1+nota2)/2) ;
					lblMedia.setText(media);
					if( (nota1+nota2)/2 >= 7 ) {
						lblSituacao.setText(" = Aprovado(a)");
					} else {
						lblSituacao.setText(" = Reprovado(a)");
					}
					
				
			}
		});
		
		
		btnMedia.setBounds(141, 167, 150, 23);
		contentPane.add(btnMedia);
		
		JLabel lblInstrucoes = new JLabel("Digite seu nome e em seguida sua notas para que seja calculado sua média final:");
		lblInstrucoes.setBounds(29, 47, 395, 14);
		contentPane.add(lblInstrucoes);
		
		JLabel lblMediaTitulo = new JLabel("Resultado Média:");
		lblMediaTitulo.setBounds(87, 201, 128, 12);
		contentPane.add(lblMediaTitulo);
		
		JLabel lblSitucao = new JLabel("Situação:");
		lblSitucao.setBounds(87, 227, 128, 12);
		contentPane.add(lblSitucao);
		
	}
}