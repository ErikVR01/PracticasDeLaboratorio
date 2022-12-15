package mx.edu.elextra.extraeval.ventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
public class Ventana extends JFrame{
	//private Procesos prc;

	public Ventana(){
		initComponents();
		setJMenuBar(mb);
		mb.add(mnFile);
		mnFile.add(miOpen);
		mnFile.addSeparator();
		mnFile.add(miSalir);
		mb.add(mnSort);
		mnSort.add(miMarca);
		mnSort.add(miCosto);
		add(lbMarca);
		add(txMarca);
		add(lbCosto);
		add(txCosto);
		add(lbRamP);
		add(txRamP);
		add(btnPrev);
		add(lbIdx);
		add(btnNext);
		add(lbTipoOrd);
	}
	private void initComponents(){
		// Establecer el el tipo de JFrame como un FlowLayout
		setLayout(new FlowLayout());

		// Establecer el cierre de la aplicación al cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Crear la Barra de Menú mb
		mb = new JMenuBar();
		add(mb);

		// Crear el Menú mnFile "Archivo"
		mnFile = new JMenu("Arhivo");
		mb.add(mnFile);

		// Crear el Menú Item miOpen "Abrir"
		miOpen = new JMenuItem("Abrir");

		// Agregar al miOpen la clase anónima que manda llamar a los métodos siguientes:
		miOpen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Procesos.openFile();
				Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
			}
		});

		// Crear el Menú Item miOpen "Salir"
		miSalir = new JMenuItem("Salir");
		mb.add(miSalir);

		// Agregar al miOpen la clase anónima que manda llamar al método siguientes:
		miOpen.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent o){
				dispose();
			}
		});		

		// Crear el menú mnSort "Ordenar por ..."
		mnSort = new JMenu("Ordenar por ...");
		mb.add(mnSort);

		// Crear el Menú Item miMarca "Marca"
		miMarca = new JMenuItem("Marca");
		mb.add(miMarca);

		// Crear el Menú Item miCosto "Costo"
		miCosto = new JMenuItem("Costo");
		mb.add(miCosto);

		// Crear la etiqueta lbMarca "Marca"
		lbMarca = new JLabel("Marca");
		mb.add(lbMarca);

		// Crear la etiqueta lbMarca "Costo"
		lbCosto = new JLabel("Costo");
		mb.add(lbCosto);

		// Crear la etiqueta lbRamP "Ram/Proc"
		lbRamP = new JLabel("Ram/Proc");
		mb.add(lbRamP);

		// Crear el campo de texto txMarca de tamaño 20
		txMarca = new JTextField(20);
		add(txMarca);

		// Crear el campo de texto txCosto de tamaño 20
		txCosto = new JTextField(20);
		add(txCosto);

		// Crear el campo de texto txRamP de tamaño 20
		txRamP = new JTextField(20);
		add(txRamP);

		// Crear el botón btnPrev " <- "
		btnPrev = new JButton("<-");

		// Crear el botón btnNext " -> "
		btnNext = new JButton("->");

		// Crear la etiqueta lbIdx "0/0"
		
		String espacios = "       ";
		// Crear la etiqueta Label ordenando lbTipoOrd espacios+"Tipo de Ordenamiento"+espacios
		
		// Agregar al btnPrev la clase anónima que manda llamar al método siguientes:
				Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);

		// Agregar al btnNext la clase anónima que manda llamar al método siguientes:
				Procesos.getNext(txMarca, txCosto, txRamP, lbIdx);

		// Agregar al miMarca la clase anónima que manda llamar a los métodos siguientes: 
				lbTipoOrd.setText(espacios+"Ordenados por Marca"+espacios);
				Procesos.sortMarca();

		// Agregar al miCosto la clase anónima que manda llamar a los métodos siguientes: 
				lbTipoOrd.setText(espacios+"Ordenados por Costo"+espacios);
				Procesos.sortCosto();
		setSize(330,350);
	}
	JMenuBar mb;
	JMenu mnFile,mnSort;
	JMenuItem miOpen, miSalir, miMarca, miCosto;
	JLabel lbMarca, lbModelo, lbCosto, lbRamP, lbTipoOrd, lbIdx;
	JTextField txMarca, txCosto, txRamP;
	JButton btnPrev, btnNext;
}
