package Example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Copiar codigo desde aqui
public class MinimizeWindowExample2 {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
	public static void main(String[] args) {
		// Crear un nuevo JFrame y agregar el título
        JFrame frame = new JFrame("Ejemplo de Minimización de Ventana");
        // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
        //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);
     // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Se crea addWindowListener que incorpora a WindowAdapter
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                // Este método se llama cuando la ventana se minimiza
                System.out.println("La ventana se ha minimizado.");
            }
        });
        //Se genera un botón para minimizar 
        JButton minimizeButton = new JButton("Minimizar");
        minimizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Minimiza la ventana cuando se hace clic en el botón
                frame.setState(Frame.ICONIFIED);
            }
        });
        
        frame.add(minimizeButton, BorderLayout.CENTER);
     // Hacer visible la ventana 
        frame.setVisible(true);
    }
}
