package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class EjemploWindowClosed {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
	public static void main(String[] args) {
		// Crear un nuevo JFrame 
        JFrame frame = new JFrame("Ejemplo windowClosed");
        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);

        // Agregar un WindowListener para manejar el evento de cierre de la ventana
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("La ventana se ha cerrado.");
            }
        });
        //Se genera botón y se le asigna la acción para cerrar el programa
        JButton closeButton = new JButton("Cerrar Ventana");
        closeButton.addActionListener(e -> frame.dispose());

        frame.getContentPane().add(closeButton);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Hacer visible la ventana 
        frame.setVisible(true);
    }
}
