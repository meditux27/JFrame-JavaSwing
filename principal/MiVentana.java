package principal;
//Copiar codigo desde aqui
import javax.swing.JFrame;
public class MiVentana {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
	public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación Swing"); // Crear un nuevo JFrame con un título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configurar el comportamiento al cerrar
	frame.setLocationRelativeTo(null);//Establecer la posición inicial al ejecutar la ventana
        frame.setSize(400, 300); // Establecer el tamaño inicial de la ventana
        frame.setVisible(true); // Hacer visible la ventana
        
    }
	
}
