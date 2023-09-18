package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploDispose {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
        // Crear una ventana
        JFrame frame = new JFrame("Ejemplo Dispose");
        // Establece el tamaño de la ventana
        frame.setSize(300, 200);
        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);

        // Crear un botón para cerrar la ventana
        JButton closeButton = new JButton("Cerrar Ventana");

        // Agregar un ActionListener al botón para cerrar la ventana
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana utilizando dispose()
                frame.dispose();
            }
        });

        // Agregar el botón a la ventana
        frame.add(closeButton, BorderLayout.CENTER);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
