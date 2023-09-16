package principal;
import javax.swing.JFrame;
public class MiVentana {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación Swing"); // Crear un nuevo JFrame con un título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configurar el comportamiento al cerrar

        // Agregar componentes, como botones o etiquetas, al panel de contenido del JFrame aquí

        frame.setSize(400, 300); // Establecer el tamaño inicial de la ventana
        frame.setVisible(true); // Hacer visible la ventana
        frame.setLocationRelativeTo(null);//Establecer la posición inicial al ejecutar la ventana
    }
	
}
