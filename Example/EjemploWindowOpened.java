package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.event.*;

public class EjemploWindowOpened {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	// Crear un nuevo JFrame y agregar el título al mismo tiempo
        JFrame frame = new JFrame("Ejemplo windowOpened");
        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);
       
        //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);
        
        //Se crea addWindowListener que incorpora a WindowAdapter
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // Este método se llama cuando la ventana se abre
                JOptionPane.showMessageDialog(null, "La ventana se ha abierto.");
            }
            
        });

        // Hacer visible la ventana , en esta situación es conveniente colocarlo hasta el final para que se aprecien los cambios
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
