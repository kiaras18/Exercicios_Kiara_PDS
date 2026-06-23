package exercico2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.TextField;

public class CalculadoraInvestimentosGrid_Novo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid_Novo frame = new CalculadoraInvestimentosGrid_Novo();
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
	public CalculadoraInvestimentosGrid_Novo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CalcInvest");
		setBounds(100, 100, 363, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblDeposito = new JLabel("Depósito Mensal R$ :");
		lblDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblDeposito);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de Meses :");
		lblNumMeses.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNumMeses);
		
		textField_2 = new JTextField();
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblJuros = new JLabel("Juros ao mês % :");
		lblJuros.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblJuros);
		
		textField_3 = new JTextField();
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTotalInvestido = new JLabel("Total Investido   Juros R$ :");
		lblTotalInvestido.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblTotalInvestido);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton btnCalcular = new JButton("Calcular");
		contentPane.add(btnCalcular);

	}
}
