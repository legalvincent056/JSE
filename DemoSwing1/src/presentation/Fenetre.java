package presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame {

	// liste des composants de ma fenêtre
	private JLabel jl = new JLabel("Récepteur"); 
	private JTextField jtf1 = new JTextField(12);
	private JButton jb1 = new JButton("ajouter");
	private JButton jb2 = new JButton("deplacer");		
	private JButton jb3 = new JButton("vider");
	
	private List liste1 = new List();
	private List liste2 = new List();
	
	public Fenetre(String nom){
		super(nom);
		setSize(800,600); //taille de la fenêtre
		
		//disposition de la fenêtre principale 
		this.setLayout(new BorderLayout()); //précise que ce je vais ajouter va se faire ligne par ligne
		
		//ajout de la première ligne
		JPanel jp1 = new JPanel(); //nouvelle ligne
		jp1.setLayout(new FlowLayout());
		jp1.add(jl);jp1.add(jtf1);jp1.add(jb1);jp1.add(jb2); jp1.add(jb3); //ajout des bouttons du text et du label
		
		this.add(jp1,BorderLayout.NORTH);
		
		//ajout de la deuxième ligne
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout());
		jp2.add(liste1); jp2.add(liste2);
		
		this.add(jp2,BorderLayout.CENTER);
		
		
	}

}


