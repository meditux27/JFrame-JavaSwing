package Example;

import javax.swing.JFrame;

public class JFrameSetTitleExample2 {
	 public static void main(String[] args) {
	        // Crear un nuevo JFrame y agregar el título al mismo tiempo, sin utilizar setTitle
	        JFrame frame = new JFrame("Título de la ventana");

	        // Configurar el comportamiento al cerrar la ventana
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Establecer el tamaño de la ventana
	        frame.setSize(400, 300);

	        // Hacer visible la ventana
	        frame.setVisible(true);
	        
	        //Establece la posición inicial de la ventana al ejecutar 
	        frame.setLocationRelativeTo(null);
	    }
}
