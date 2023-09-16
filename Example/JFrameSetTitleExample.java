package Example;
//Copiar codigo desde aqui
import javax.swing.JFrame;

public class JFrameSetTitleExample {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
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
	        
	        //Establece la posición inicial de la ventana al ejecutar 
	        frame.setLocationRelativeTo(null);
	    }
}
