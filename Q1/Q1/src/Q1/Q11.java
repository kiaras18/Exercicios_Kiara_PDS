package Q1;

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

public class Q11 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lblTemperaturaCelsius;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q11 frame = new Q11();
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
	public Q11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Temperatura em  Celcius ( °C ): ");
		lblTemperatura.setBounds(50, 69, 217, 14);
		contentPane.add(lblTemperatura);
		
		lblTemperaturaCelsius = new JTextField();
		lblTemperaturaCelsius.setBounds(266, 66, 104, 20);
		contentPane.add(lblTemperaturaCelsius);
		lblTemperaturaCelsius.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(266, 146, 104, 14);
		contentPane.add(lblResultado);
		
		JButton bntConverter = new JButton("Converter");
		bntConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = lblTemperaturaCelsius.getText();
				
				double tempD = Double.parseDouble(temp);
				
				double C = (tempD - 32) * 5.0/9.0;
				
				String TempResultado = String.valueOf(C);
				lblResultado.setText(TempResultado);
			}
		});
		bntConverter.setBounds(62, 191, 104, 31);
		contentPane.add(bntConverter);
		
		JButton bntFechar = new JButton("Fechar");
		bntFechar.setBounds(207, 191, 89, 31);
		contentPane.add(bntFechar);
		
		JLabel lblNewLabel = new JLabel("Temperaturaa em  Farenheit ( °F ):");
		lblNewLabel.setBounds(50, 146, 214, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblInstrucao = new JLabel("Insira o valor em Celcius para coverter para  Farenheit:");
		lblInstrucao.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblInstrucao.setBounds(62, 29, 322, 26);
		contentPane.add(lblInstrucao);
		
		
		
	}

}
