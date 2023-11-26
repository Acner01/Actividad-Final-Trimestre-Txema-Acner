package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextArea;

public class VentanaGestionProyectos extends JFrame implements  ActionListener{
	
	private JButton btnExcel;
	private JButton btnWord;
	private JButton btnPowerP;
	private JButton btnNavegar;
	private JTextArea textArea;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Create the frame.
	 */
	public VentanaGestionProyectos() {

		

		setTitle("Gestion de Proyectos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 421);
		setSize(500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		inicializarVentana();
	}

	public void inicializarVentana() {
	
		btnExcel = new JButton("Excel");
		btnExcel.setBackground(new Color(255, 255, 255));
		btnExcel.setBounds(33, 31, 89, 23);
		getContentPane().add(btnExcel);
		btnExcel.addActionListener(this);
		
		btnWord = new JButton("Word");
		btnWord.setBackground(new Color(255, 255, 255));
		btnWord.setBounds(314, 31, 89, 23);
		getContentPane().add(btnWord);
		btnWord.addActionListener(this);
		
		btnPowerP = new JButton("Power P.");
		btnPowerP.setBackground(new Color(255, 255, 255));
		btnPowerP.setBounds(179, 31, 89, 23);
		getContentPane().add(btnPowerP);
		btnPowerP.addActionListener(this);
		
		textField = new JTextField();
		textField.setBounds(33, 92, 235, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNavegar = new JButton("Navegar");
		btnNavegar.setBackground(new Color(255, 255, 255));
		btnNavegar.setBounds(314, 91, 89, 23);
		getContentPane().add(btnNavegar);
		btnNavegar.addActionListener(this);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(31, 123, 372, 111);
		getContentPane().add(textArea);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnWord) {
			ProcessBuilder pb = new ProcessBuilder("NOTEPAD");
			try {
				Process p = pb.start();
			} catch (Exception ee) {
				// TODO Auto-generated catch block
				ee.printStackTrace();
			}
		}
		
		if (e.getSource() == btnExcel) {
			ProcessBuilder pb = new ProcessBuilder("Excel");
			try {
				Process p = pb.start();
			} catch (Exception ee) {
				// TODO Auto-generated catch block
				ee.printStackTrace();
			}
		}
		
		if (e.getSource() == btnPowerP) {
			ProcessBuilder pb = new ProcessBuilder("PowerPoint");
			try {
				Process p = pb.start();
			} catch (Exception ee) {
				// TODO Auto-generated catch block
				ee.printStackTrace();
			}
		}
		
	}
}
