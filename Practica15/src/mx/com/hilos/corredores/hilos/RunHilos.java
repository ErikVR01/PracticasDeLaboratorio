package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class RunHilos{
	public static void iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
		char ch1 = txt1.getText().charAt(0);
		char ch2 = txt2.getText().charAt(0);

		if (ch1 == '0' || ch1 == ' ') {
			ch1 = 'E';
		}

		if (ch2 == '0' || ch2 == ' ') {
			ch2 = 'M';
		}
		String salida1 = ch1 + "";
		String salida2 = ch2 + "";

		elem1.setText(salida1);
		elem2.setText(salida2);
		Letra hilo1 = new Letra(elem1, ch1);
		Letra hilo2 = new Letra(elem2, ch2);
		Thread run1 = new Thread(hilo1);
		Thread run2 = new Thread(hilo2);
		run1.start();
		run2.start();

	}
}