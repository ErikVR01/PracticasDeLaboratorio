package mx.com.hilos.corredores.ventanas;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	private JLabel lblTitulo;
	private JLabel lblElem1;
	private JLabel lblElem2;
	private JLabel hElem1;
	private JLabel hElem2;
	private JTextField txtElem1;
	private JTextField txtElem2;
	private JButton btnStart;

	public void initComponents(){
		int ancho = 550;
		int alto =250;
		Dimension lblDim = new Dimension(ancho-15,alto/10);
		Color border = new Color(0,0,255);
		lblTitulo=new JLabel("* Practica 15 Manejo de hilos *");
		
	}




	
}