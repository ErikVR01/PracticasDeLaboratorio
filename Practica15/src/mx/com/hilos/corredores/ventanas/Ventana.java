package mx.com.hilos.corredores.ventanas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class Ventana extends JFrame{
	private JLabel lblTitulo;
	private JLabel lblElem1;
	private JLabel lblElem2;
	private JLabel hElem1;
	private JLabel hElem2;
	private JTextField txtElem1;
	private JTextField txtElem2;
	private JButton btnStart;

	public Ventana(){
		initComponents();
	}

	public void initComponents(){
		int ancho = 550;
		int alto =250;
		Dimension lblDim = new Dimension(ancho-15,alto/10);
		Color border = new Color(0,0,255);
		lblTitulo=new JLabel("* Practica 15 Manejo de hilos *");
		lblTitulo.setPreferredSize(lblDim);
		lblElem1=new JLabel("Hilo 1");
		txtElem1= new JTextField(3);
		lblElem2=new JLabel("Hilo 2");
		txtElem2= new JTextField(3);
		btnStart= new JButton("Comenzar");
		hElem1= new JLabel(" Aqui va el hilo 1 ");
		hElem1.setBorder(BorderFactory.createLineBorder(border));
		hElem1.setPreferredSize(lblDim);
		hElem2= new JLabel(" Aqui va el hilo 2 ");
		hElem2.setBorder(BorderFactory.createLineBorder(border));
		hElem2.setPreferredSize(lblDim);
		btnStart.setPreferredSize(lblDim);
		btnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btnStart.setEnabled(false);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Practica 15");
		setLayout(new FlowLayout());
		setSize(ancho, alto);
		add(lblTitulo);
		add(lblElem1);
		add(txtElem1);
		add(lblElem2);
		add(txtElem2);
		add(btnStart);
		add(hElem1);
		add(hElem2);
		setVisible(true);

	}


}