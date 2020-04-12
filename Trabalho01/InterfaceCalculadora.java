
/* Autores
 * 
 *  Luis Augusto Kühn
 *  Tharcisio Hernani Vitor Felipe Pereira
 *  Thomas Ricardo Reinke
 *  
*/


package Trabalho01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import java.awt.List;
import java.awt.TextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfExpressao;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JRadioButton rbLista;
	private JRadioButton rbVetor;
	private Calculadora calc = new Calculadora();
	private JTextField tfResultado;
	private JLabel lblNewLabel_1;

  
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCalculadora frame = new InterfaceCalculadora();
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
	public InterfaceCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblNewLabel.setBounds(10, 11, 258, 52);
		contentPane.add(lblNewLabel);
		
		tfExpressao = new JTextField();
		tfExpressao.setBounds(10, 108, 258, 20);
		contentPane.add(tfExpressao);
		tfExpressao.setColumns(10);
		
		rbLista = new JRadioButton("Lista");
		rbLista.setSelected(true);
		buttonGroup.add(rbLista);
		rbLista.setBounds(34, 135, 109, 23);
		contentPane.add(rbLista);
		
		rbVetor = new JRadioButton("Vetor");
		buttonGroup.add(rbVetor);
		rbVetor.setBounds(169, 135, 109, 23);
		contentPane.add(rbVetor);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbLista.isSelected()) {	
					calc.setExpressao(tfExpressao.getText());				
					tfResultado.setText(Double.toString(calc.usePilhaLista()));
				}else if (rbVetor.isSelected()) {
					calc.setExpressao(tfExpressao.getText());				
					tfResultado.setText(Double.toString(calc.usePilhaVetor()));										
				}
			}
		});
		btnNewButton.setBounds(91, 176, 89, 23);
		contentPane.add(btnNewButton);
		
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfResultado.setHorizontalAlignment(SwingConstants.CENTER);
		tfResultado.setBounds(10, 237, 258, 55);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Express\u00E3o: ");
		lblNewLabel_1.setBounds(108, 83, 69, 14);
		contentPane.add(lblNewLabel_1);
	}
}
