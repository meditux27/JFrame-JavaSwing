package Example;
//Copiar codigo desde aqui
import javax.swing.JFrame;

public class JFrameSetSize {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
	 public static void main(String[] args) {
	        // Crear un nuevo JFrame y agregar el título al mismo tiempo, sin utilizar setTitle
	        JFrame frame = new JFrame("Tamaño definido de 800x600");

	        // Configurar el comportamiento al cerrar la ventana
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Establecer el tamaño de la ventana
	        frame.setSize(800, 600);

	        // Hacer visible la ventana
	        frame.setVisible(true);
	        
	        //Establece la posición inicial de la ventana al ejecutar 
	        frame.setLocationRelativeTo(null);
	    }
}
