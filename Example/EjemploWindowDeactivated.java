package Example;
//Copiar codigo desde aqui
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploWindowDeactivated {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente

    public static void main(String[] args) {
    	// Crear un nuevo JFrame
    	JFrame frame=new JFrame();
    	// Configura la ventana principal
        frame.setTitle("Ejemplo de windowActivated");
        // Establece el tamaño de la ventana
        frame.setSize(400, 400);
        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);

        // Agrega un escuchador de eventos para la ventana
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                // Este método se llama cuando la ventana se activa
                System.out.println("La ventana se ha activado.");
            }
        });
      //Agregando etiqueta para descripción 
        JLabel label=new JLabel("<html>Al retirar la seleccion de esta ventana <br>se ejecutara el metodo </html>");
      //adjuntado etiqueta a JFrame
        frame.add(label);
      //Establece la visibilidad de la ventana
    frame.setVisible(true);
    }
}
