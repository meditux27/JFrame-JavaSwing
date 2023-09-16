package Example;

import javax.swing.JFrame;

public class JFrameSetTitleExample {
	 public static void main(String[] args) {
	        // Crear un nuevo JFrame
	        JFrame frame = new JFrame();

	        // Establecer el título de la ventana
	        frame.setTitle("Mi Ventana Personalizada");

	        // Configurar el comportamiento al cerrar la ventana
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Establecer el tamaño de la ventana
	        frame.setSize(400, 300);

	        // Hacer visible la ventana
	        frame.setVisible(true);
	    }
}
