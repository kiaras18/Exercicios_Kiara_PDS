package Q3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q33 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JLabel lblArea;
	private JLabel lblPerimetro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q33 frame = new Q33();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public class Retangulo {
		double base;
		double altura;

		public Retangulo(double base, double altura) {
			this.base = base;
			this.altura = altura;
		}

		double calcularArea() {
			return base * altura;
		}

		double calcularPerimetro() {
			return 2 * base + 2 * altura;
		}
	}

	public Retangulo criarRetangulo() {
		double baseR = Double.parseDouble(txtBase.getText());
		double alturaR = Double.parseDouble(txtAltura.getText());
		return new Retangulo(baseR, alturaR);
	}


	/**
	 * Create the frame.
	 */
	public Q33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Base = new JLabel("Base :");
		Base.setBounds(60, 65, 84, 14);
		contentPane.add(Base);

		txtBase = new JTextField();
		txtBase.setBounds(198, 62, 189, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(198, 93, 189, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JLabel Altura = new JLabel("Altura:");
		Altura.setBounds(60, 100, 84, 14);
		contentPane.add(Altura);

		JLabel Instrucao = new JLabel("Insira as informações referente ao retângulo em centimetros");
		Instrucao.setBounds(60, 22, 300, 14);
		contentPane.add(Instrucao);

		lblArea = new JLabel("Área: ");
		lblArea.setBounds(52, 236, 150, 14);
		contentPane.add(lblArea);

		lblPerimetro = new JLabel("Perímetro: ");
		lblPerimetro.setBounds(274, 236, 150, 14);
		contentPane.add(lblPerimetro);

		JButton btnArea = new JButton("Calcular área");
		btnArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Retangulo ret = criarRetangulo();
					String area = "Área: " + ret.calcularArea() + " cm²";
					lblArea.setText(area);
				
			}
		});
		btnArea.setBounds(23, 139, 142, 23);
		contentPane.add(btnArea);

		JButton btnPerimetro = new JButton("Calcular perímetro");
		btnPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Retangulo ret = criarRetangulo();
					String perimetro = "Perímetro: " + ret.calcularPerimetro() + " cm";
					lblPerimetro.setText(perimetro);
				
			}
		});
		btnPerimetro.setBounds(256, 139, 142, 23);
		contentPane.add(btnPerimetro);
		
		JLabel lblNewLabel = new JLabel("RESULTADOS:");
		lblNewLabel.setBounds(175, 183, 84, 14);
		contentPane.add(lblNewLabel);
	}
}