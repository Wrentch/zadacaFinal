package zadaca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class treciProzor extends JFrame {

	private JPanel contentPane;
	private JTextField textbr1;
	private JTextField textbr2;
	private JTextField textbr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					treciProzor frame = new treciProzor();
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
	public treciProzor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVr = new JButton("Vrati se ");
		btnVr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ime = glavniProzor.window.getTxtIme().getText();
				String prezime = glavniProzor.window.getTxtPrezime().getText();
				String datum = glavniProzor.window.getTxtDatum().getText();
				String razred = glavniProzor.window.getRazBox();

				
				drugiProzor ispis = new drugiProzor(ime, prezime, datum, razred);
				ispis.setVisible(true);
				zatvori();
				
			}
		});
		btnVr.setBounds(59, 147, 324, 75);
		contentPane.add(btnVr);
		
		JLabel lblN1 = new JLabel("Prvi broj:");
		lblN1.setBounds(25, 11, 93, 20);
		contentPane.add(lblN1);
		
		JLabel lblN2 = new JLabel("drugi broj:");
		lblN2.setBounds(25, 42, 93, 20);
		contentPane.add(lblN2);
		
		JLabel lblIspis = new JLabel("");
		lblIspis.setBounds(235, 104, 116, 30);
		contentPane.add(lblIspis);
		
		JLabel lblN3 = new JLabel("Treci broj:");
		lblN3.setBounds(25, 73, 93, 20);
		contentPane.add(lblN3);
		
		textbr1 = new JTextField();
		textbr1.setBounds(128, 11, 86, 20);
		contentPane.add(textbr1);
		textbr1.setColumns(10);
		
		textbr2 = new JTextField();
		textbr2.setBounds(128, 42, 86, 20);
		contentPane.add(textbr2);
		textbr2.setColumns(10);
		
		textbr3 = new JTextField();
		textbr3.setBounds(128, 73, 86, 20);
		contentPane.add(textbr3);
		textbr3.setColumns(10);
		
		JButton btnIzracun = new JButton("Izracunaj");
		btnIzracun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(textbr1.getText().matches("[0-9]+")&&textbr2.getText().matches("[0-9]+")&&textbr3.getText().matches("[0-9]+")) {
					float Br1 = Float.parseFloat(textbr1.getText());
					float Br2 = Float.parseFloat(textbr2.getText());
					float Br3 = Float.parseFloat(textbr3.getText());
					String ispis = Float.toString((Br1+Br2+Br3)/3);
					
					lblIspis.setText(ispis);
				}else {
					lblIspis.setText("Los unos");
				}
	
			}
		});
		btnIzracun.setBounds(285, 41, 89, 23);
		contentPane.add(btnIzracun);
		
		JLabel lblsredina = new JLabel("Aritmeticka sredina: ");
		lblsredina.setBounds(59, 104, 155, 30);
		contentPane.add(lblsredina);
		
		
	}

	public void zatvori() {
		this.dispose();
		this.setVisible(false);
	}
}
