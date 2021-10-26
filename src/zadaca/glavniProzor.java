package zadaca;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class glavniProzor {
	
	private JFrame frame;
	
	public static glavniProzor window = null;
	
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtDatum;
	
	private String razBox = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new glavniProzor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTxtIme() {
		return txtIme;
	}

	public void setTxtIme(JTextField txtIme) {
		this.txtIme = txtIme;
	}

	public JTextField getTxtPrezime() {
		return txtPrezime;
	}

	public void setTxtPrezime(JTextField txtPrezime) {
		this.txtPrezime = txtPrezime;
	}

	public JTextField getTxtDatum() {
		return txtDatum;
	}

	public void setTxtDatum(JTextField txtDatum) {
		this.txtDatum = txtDatum;
	}

	public String getRazBox() {
		return razBox;
	}
	public void setRazBox(String razBox) {
		this.razBox = razBox;
	}
	/**
	 * Create the application.
	 */
	public glavniProzor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIme = new JLabel("Ime :");
		lblIme.setBounds(26, 55, 69, 14);
		frame.getContentPane().add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime :");
		lblPrezime.setBounds(26, 94, 69, 14);
		frame.getContentPane().add(lblPrezime);
		
		JLabel lblDat = new JLabel("Datum ro\u0111enja:");
		lblDat.setBounds(26, 136, 93, 14);
		frame.getContentPane().add(lblDat);
		
		JLabel lblRazred = new JLabel("Razred:");
		lblRazred.setBounds(26, 181, 69, 14);
		frame.getContentPane().add(lblRazred);
		
		txtIme = new JTextField();
		txtIme.setBounds(121, 52, 86, 20);
		frame.getContentPane().add(txtIme);
		txtIme.setColumns(10);
		
		txtPrezime = new JTextField();
		txtPrezime.setColumns(10);
		txtPrezime.setBounds(121, 91, 86, 20);
		frame.getContentPane().add(txtPrezime);
		
		txtDatum = new JTextField();
		txtDatum.setColumns(10);
		txtDatum.setBounds(121, 133, 86, 20);
		frame.getContentPane().add(txtDatum);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				razBox = (String)comboBox.getSelectedItem();
			}
		});
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"I a", "I b", "II a", "II b", "III a ", "III b", "IV a", "IV b"}));
		comboBox.setBounds(121, 177, 86, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnIspis = new JButton("Ispis");
		btnIspis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ime = txtIme.getText();
				String prezime = txtPrezime.getText();
				String datum = txtDatum.getText();
				String razred = razBox;
				
				drugiProzor ispis = new drugiProzor(ime, prezime, datum, razred);
				ispis.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnIspis.setBounds(30, 234, 177, 35);
		frame.getContentPane().add(btnIspis);
		
		JLabel lblNatpis = new JLabel("Ispis Ucenika");
		lblNatpis.setFont(new Font("Bungee Inline", Font.PLAIN, 13));
		lblNatpis.setBounds(59, 11, 115, 33);
		frame.getContentPane().add(lblNatpis);
	}
	
	
}
