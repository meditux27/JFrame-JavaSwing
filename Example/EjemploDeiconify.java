package Example;
//Copiar codigo desde aqui
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploDeiconify  {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    

    public static void main(String[] args) {
    	// Crear un nuevo JFrame
    	JFrame frame=new JFrame();
        // Configura la ventana principal
        frame.setTitle("Ejemplo de WindowDeiconified");
     // Establecer el tamaño de la ventana
        frame.setSize(400, 300);
     // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Establece la posición inicial de la ventana al ejecutar 
        frame.setLocationRelativeTo(null);

        // Agrega un metodo para escuchar eventos de la ventana
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeiconified(WindowEvent e) {
                // Este método se llama cuando la ventana se restaura
                System.out.println("La ventana se ha desiconificado.");
            }
        });
        //Agregando etiqueta para descripción 
        JLabel label =new JLabel("<html>Ver la terminal al restaurar la ventana para <br>observar el ingreso al metodo al momento de restaurar la ventana</html>");
        //adjuntado etiqueta a JFrame
        frame.add(label);
        //Establece la visibilidad de la ventana
        frame.setVisible(true);
    }
}
