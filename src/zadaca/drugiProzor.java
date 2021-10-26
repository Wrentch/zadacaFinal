package zadaca;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class drugiProzor extends JFrame {
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					drugiProzor frame = new drugiProzor();
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
	public drugiProzor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnN = new JButton("Vrati se nazad");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				zatvori();
				otvori();
			}
		});
		btnN.setBounds(10, 227, 144, 45);
		contentPane.add(btnN);
		
		JButton btnTr = new JButton("Treci prozor");
		btnTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treciProzor treci = new treciProzor();
				treci.setVisible(true);
				zatvori();
				
			}
		});
		btnTr.setBounds(167, 227, 144, 45);
		contentPane.add(btnTr);
		
		JLabel lblIme = new JLabel("Ime : ");
		lblIme.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblIme.setBounds(10, 11, 81, 22);
		contentPane.add(lblIme);
		
		JLabel lblImeispis = new JLabel("");
		lblImeispis.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblImeispis.setBounds(20, 36, 87, 22);
		contentPane.add(lblImeispis);
		
		JLabel lblprezimeisp = new JLabel("");
		lblprezimeisp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblprezimeisp.setBounds(20, 84, 87, 22);
		contentPane.add(lblprezimeisp);
		
		JLabel lblPrezime = new JLabel("Prezime : ");
		lblPrezime.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblPrezime.setBounds(10, 59, 81, 22);
		contentPane.add(lblPrezime);
		
		JLabel lbldatisp = new JLabel("");
		lbldatisp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lbldatisp.setBounds(20, 131, 291, 22);
		contentPane.add(lbldatisp);
		
		JLabel lbDatum = new JLabel("Datum:");
		lbDatum.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lbDatum.setBounds(10, 106, 81, 22);
		contentPane.add(lbDatum);
		
		JLabel lblrazisp = new JLabel("");
		lblrazisp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblrazisp.setBounds(20, 180, 87, 22);
		contentPane.add(lblrazisp);
		
		JLabel lblraz = new JLabel("Razred:");
		lblraz.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblraz.setBounds(10, 155, 81, 22);
		contentPane.add(lblraz);
		
		
		
	}
	
	public drugiProzor(String ime, String prezime, String datum, String raz) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnN = new JButton("Vrati se nazad");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				zatvori();
				otvori();
			}
		});
		btnN.setBounds(10, 278, 144, 45);
		contentPane.add(btnN);
		
		JButton btnTr = new JButton("Treci prozor");
		btnTr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treciProzor treci = new treciProzor();
				treci.setVisible(true);
				zatvori();
				
			}
		});
		btnTr.setBounds(167, 278, 144, 45);
		contentPane.add(btnTr);
		
		JLabel lblIme = new JLabel("Ime : ");
		lblIme.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblIme.setBounds(10, 11, 81, 22);
		contentPane.add(lblIme);
		
		JLabel lblImeispis = new JLabel(ime);
		lblImeispis.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblImeispis.setBounds(20, 36, 87, 22);
		contentPane.add(lblImeispis);
		
		JLabel lblprezimeisp = new JLabel(prezime);
		lblprezimeisp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblprezimeisp.setBounds(20, 84, 87, 22);
		contentPane.add(lblprezimeisp);
		
		JLabel lblPrezime = new JLabel("Prezime : ");
		lblPrezime.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblPrezime.setBounds(10, 59, 81, 22);
		contentPane.add(lblPrezime);
		
		JLabel lbldatisp = new JLabel(datum + godine(datum));
		lbldatisp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lbldatisp.setBounds(20, 131, 291, 22);
		contentPane.add(lbldatisp);
		
		JLabel lbDatum = new JLabel("Datum:");
		lbDatum.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lbDatum.setBounds(10, 106, 81, 22);
		contentPane.add(lbDatum);
		
		JLabel lblrazisp = new JLabel(raz);
		lblrazisp.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblrazisp.setBounds(20, 180, 87, 22);
		contentPane.add(lblrazisp);
		
		JLabel lblraz = new JLabel("Razred:");
		lblraz.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblraz.setBounds(10, 155, 81, 22);
		contentPane.add(lblraz);
		
	}
	
	public void zatvori() {
		this.dispose();
		this.setVisible(false);
	}
	public void otvori() {
		glavniProzor.window.getFrame().setVisible(true);
	}
	public static String godine(String datum) {
		if(datum.isEmpty()) {
			return " - los unos. Datum nije unesen.";
		}else {
			if(datum.matches("[0-9.]*")) {
				String godina = datum.substring(datum.length()-5, datum.length()-1);
				if(godina.matches("[0-9]+")) {
					String brojGod = (" -  Broj godina: " + (2021 - Integer.parseInt(godina)));
					
					return brojGod;
				}else {
					return " - los unos";
				}

			}else {
				return " - los unos";
			}
			
			
		}
		
	}
	

}
