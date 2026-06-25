package view;

//importações 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;
import controller.UsuarioController;
import model.Usuario;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;


//construtor
public class TelaCadastroUsuario extends JFrame {
	
	private RoundedJTextField txtNome;
	private RoundedJTextField txtCpf;
	private RoundedJTextField txtTelefone;
	private RoundedJTextField txtEmail;
	private RoundedJTextField txtSenha;
	
    private JComboBox<String> cbTipo;
    private JCheckBox chkAtivo;

    private JTable tabela;
    private DefaultTableModel modelo;

    private UsuarioController controller = new UsuarioController();
    public TelaCadastroUsuario() {

        setTitle("Cadastro de Usuários - IFSC60+");
        setSize(1000, 911);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(255, 255, 255));

        criarComponentes();
        criarTabela();

        setVisible(true);
    }
    
    private void criarComponentes() {
        getContentPane().setLayout(new MigLayout("", "[][52px][][98px][29px][123px][19px][212px][1px][245px][56px][85px]", "[30px][2px][][25px][][][25px][21px][14px][20px][][][19px][14px][][][][14px][20px][][21px][14px][25px][20px][14px][][][35px][126px][79px]"));
                        
                                JLabel titulo = new JLabel("Cadastro de Usuários");
                                titulo.setFont(new Font("Arial", Font.BOLD, 40));
                                getContentPane().add(titulo, "cell 4 0,grow");
                
                        JLabel lblTipo = new JLabel("Opções:");
                        getContentPane().add(lblTipo, "cell 1 2,alignx right,aligny bottom");
                
                        cbTipo = new JComboBox<>();
                        
                                cbTipo.addItem(" ----- ");
                                cbTipo.addItem("Administrador");
                                cbTipo.addItem("Coordenador");
                                cbTipo.addItem("Bolsista");
                                getContentPane().add(cbTipo, "cell 3 2,growx,aligny bottom");
        
                JLabel lblNome = new JLabel("Nome Completo:");
                lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
                getContentPane().add(lblNome, "cell 3 5,alignx left,growy");
        
                txtNome =new RoundedJTextField(10);
                txtNome.setBackground(new Color(214, 214, 214));
                getContentPane().add(txtNome, "cell 3 6 8 1,growx,aligny center");
        
        JLabel lblNewLabel_1_2 = new JLabel("Digite o nome completo corretamente (Ex: Maria Clara da Silva).");
        lblNewLabel_1_2.setForeground(new Color(242, 121, 0));
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblNewLabel_1_2.setBackground(Color.LIGHT_GRAY);
        getContentPane().add(lblNewLabel_1_2, "cell 3 7,alignx left,growy");

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
        getContentPane().add(lblCpf, "cell 3 9 3 1,alignx left,growy");
        
                txtCpf = new RoundedJTextField(10);
                txtCpf.setBackground(new Color(214, 214, 214));
                getContentPane().add(txtCpf, "cell 3 10 8 1,growx,aligny center");
        
        JLabel lblNewLabel_1 = new JLabel("Digite o número de CPF corretamente contendo no minimo de 11 caracteres (Ex: 10082845422).");
        lblNewLabel_1.setForeground(new Color(242, 121, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
        getContentPane().add(lblNewLabel_1, "cell 3 11,alignx left,growy");
                                        
                                                JLabel lblTelefone = new JLabel("Telefone:");
                                                lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
                                                getContentPane().add(lblTelefone, "cell 3 13,alignx left,aligny bottom");
                                
                                        txtTelefone = new RoundedJTextField(10);
                                        txtTelefone.setBackground(new Color(214, 214, 214));
                                        getContentPane().add(txtTelefone, "cell 3 14 8 1,growx,aligny bottom");
                                
                                JLabel lblNewLabel = new JLabel("Digite seu número de telefone sem espaços ou traços (EX: 47112233445).");
                                lblNewLabel.setForeground(new Color(242, 121, 0));
                                lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
                                lblNewLabel.setBackground(new Color(192, 192, 192));
                                getContentPane().add(lblNewLabel, "cell 3 15,alignx left,growy");
                        
                                JLabel lblEmail = new JLabel("Email:");
                                lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
                                getContentPane().add(lblEmail, "cell 3 17,alignx left,growy");
                
                        txtEmail = new RoundedJTextField(10);
                        txtEmail.setBackground(new Color(214, 214, 214));
                        getContentPane().add(txtEmail, "cell 3 18 8 1,growx,aligny center");
                
                JLabel lblNewLabel_1_3 = new JLabel("Digite o e-mail corretamente (Ex: mariaclara@email.com).");
                lblNewLabel_1_3.setForeground(new Color(242, 121, 0));
                lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
                lblNewLabel_1_3.setBackground(Color.LIGHT_GRAY);
                getContentPane().add(lblNewLabel_1_3, "cell 3 19,alignx left,growy");
        
                JLabel lblSenha = new JLabel("Senha:");
                lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
                getContentPane().add(lblSenha, "cell 3 21,alignx left,growy");
        
        chkAtivo = new JCheckBox("Usuário Ativo");
        chkAtivo.setBackground(new Color(245,245,245));
        getContentPane().add(chkAtivo, "cell 1 3 3 1,grow");
        
                txtSenha = new RoundedJTextField(10);
                txtSenha.setBackground(new Color(214, 214, 214));
                getContentPane().add(txtSenha, "cell 3 22 8 1,growx,aligny center");
        
        JLabel lblNewLabel_1_1 = new JLabel("Digite a senha temporária corretamente contendo no minimo de 8 caracteres (EX: Maria123).");
        lblNewLabel_1_1.setForeground(new Color(242, 121, 0));
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblNewLabel_1_1.setBackground(new Color(242, 121, 0));
        getContentPane().add(lblNewLabel_1_1, "cell 3 23,alignx left,growy");
    }
    private void criarTabela() {

        modelo = new DefaultTableModel();

       
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Telefone");
        modelo.addColumn("Email");
        modelo.addColumn("Tipo");
        modelo.addColumn("Ativo");
        
                JButton btnCadastrar = new JButton("Cadastrar");
                btnCadastrar.setBackground(new Color(76,175,80));
                btnCadastrar.setForeground(Color.WHITE);
                getContentPane().add(btnCadastrar, "cell 4 26,growx");
                
                        btnCadastrar.addActionListener((ActionEvent e) -> {
                            cadastrarUsuario();
                        });

        tabela = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tabela);

        getContentPane().add(scroll, "cell 3 28 8 1,grow");
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(TelaCadastroUsuario.class.getResource("/img/keyboard_arrow_up (1).png")));
        getContentPane().add(lblNewLabel_2, "cell 11 0 1 3,growx,aligny bottom");
                
                        JButton btnExcluir = new JButton("Excluir");
                        btnExcluir.setForeground(new Color(255, 255, 255));
                        btnExcluir.setBackground(new Color(255, 0, 0));
                        getContentPane().add(btnExcluir, "cell 4 29,alignx left,aligny top");
                        
                                btnExcluir.addActionListener((ActionEvent e) -> {
                                    excluirUsuario();
                                });
        
                JButton btnEditar = new JButton("Editar");
                btnEditar.setForeground(new Color(255, 255, 255));
                btnEditar.setBackground(new Color(0, 128, 255));
                getContentPane().add(btnEditar, "cell 5 29,alignx center,aligny top");
                
                        btnEditar.addActionListener((ActionEvent e) -> {
                            editarUsuario();
                        });
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(TelaCadastroUsuario.class.getResource("/img/LOGO 60+.png")));
        getContentPane().add(lblNewLabel_3, "cell 11 29,growx,aligny bottom");

        tabela.getSelectionModel().addListSelectionListener(e -> {

            int linha = tabela.getSelectedRow();

            if (linha >= 0) {

                txtNome.setText(modelo.getValueAt(linha, 0).toString());
                txtCpf.setText(modelo.getValueAt(linha, 1).toString());
                txtTelefone.setText(modelo.getValueAt(linha, 2).toString());
                txtEmail.setText(modelo.getValueAt(linha, 3).toString());


                cbTipo.setSelectedItem(
                    modelo.getValueAt(linha,5).toString()
                );

                chkAtivo.setSelected(
                    Boolean.parseBoolean(
                    		modelo.getValueAt(linha,5).toString()
                    )
                );
            }
        });
    }
    private boolean validar() {

        if(txtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Nome obrigatório");
            return false;
        }

        if(txtCpf.getText().length() != 11){
            JOptionPane.showMessageDialog(this,
                    "CPF deve conter 11 números");
            return false;
        }

        if(!txtEmail.getText().contains("@")){
            JOptionPane.showMessageDialog(this,
                    "Email inválido");
            return false;
        }

        if(String.valueOf(txtSenha.getText()).length() < 8){
            JOptionPane.showMessageDialog(this,
                    "Senha mínima de 8 caracteres");
            return false;
        }

        return true;
    }
    private void cadastrarUsuario() {

        if(!validar())
            return;

        Usuario u = new Usuario();

    
        u.setNome(txtNome.getText());
        u.setCpf(txtCpf.getText());
        u.setTelefone(txtTelefone.getText());
        u.setEmail(txtEmail.getText());
        u.setSenha(txtSenha.getText());
        u.setTipoUsuario(cbTipo.getSelectedItem().toString());
        u.setAtivo(chkAtivo.isSelected());

    
        controller.adicionar(u);

        atualizarTabela();

        limparCampos();

        JOptionPane.showMessageDialog(this,
                "Usuário cadastrado!");
    }
    private void atualizarTabela() {

        modelo.setRowCount(0);

        ArrayList<Usuario> lista = controller.listar();

        for(Usuario u : lista){

        	 modelo.addRow(new Object[]{
        	      
        	            u.getNome(),
        	            u.getCpf(),
        	            u.getTelefone(),
        	            u.getEmail(),
        	            u.getTipoUsuario(),
        	            u.isAtivo()
        	        });
        	    }
        	}
    private void editarUsuario() {

        int linha = tabela.getSelectedRow();

        if (linha < 0) {
            JOptionPane.showMessageDialog(this,
                    "Selecione um usuário");
            return;
        }

        JanelaEditarUsuario janela = new JanelaEditarUsuario();

        // Preenche os campos da nova janela
        janela.getTxtNome().setText(modelo.getValueAt(linha, 0).toString());
        janela.getTxtCpf().setText(modelo.getValueAt(linha, 1).toString());
        janela.getTxtTelefone().setText(modelo.getValueAt(linha, 2).toString());
        janela.getTxtEmail().setText(modelo.getValueAt(linha, 3).toString());
        janela.getChkAtivo().setSelected(
        	    Boolean.parseBoolean(modelo.getValueAt(linha, 5).toString())
        	);
        

        // Botão Salvar
        janela.getBtnSalvar().addActionListener(e -> {

            Usuario u = new Usuario();

            u.setNome(janela.getTxtNome().getText());
            u.setCpf(janela.getTxtCpf().getText());
            u.setTelefone(janela.getTxtTelefone().getText());
            u.setEmail(janela.getTxtEmail().getText());
            u.setAtivo(janela.getChkAtivo().isSelected());
            u.setTipoUsuario(
            	    janela.getCmbTipo().getSelectedItem().toString()
            	);

            controller.atualizar(linha, u);

            atualizarTabela();

            janela.dispose();
        });

        // Botão Cancelar
        janela.getBtnCancelar().addActionListener(e -> {
            janela.dispose();
        });

        janela.setLocationRelativeTo(this);
        janela.setVisible(true);
    }
    private void excluirUsuario() {

        int linha = tabela.getSelectedRow();

        if(linha < 0){
            JOptionPane.showMessageDialog(this,
                    "Selecione um usuário");
            return;
        }

        controller.remover(linha);

        atualizarTabela();

        limparCampos();
    }
    private void limparCampos() {

       
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtSenha.setText("");

        cbTipo.setSelectedIndex(0);

        chkAtivo.setSelected(false);
    }
}