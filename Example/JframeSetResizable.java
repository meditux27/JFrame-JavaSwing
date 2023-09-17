package Example;

//Copiar codigo desde aqui
import java.awt.GridLayout;
import javax.swing.*;

public class JframeSetResizable {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 

	public static void main(String[] args) {
		 // Crear un nuevo JFrame
		JFrame frame=new JFrame();
		//Determina el tamaño de JFrame
		frame.setSize(400,400);
		//Establece la visibilidad
		frame.setVisible(true);
		//Determina la posición inicial
		frame.setLocationRelativeTo(null);
		//Determina el comportamiento para cerrar el programa 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Determina la posición de los componentes GridLayout tendrá 3 filas y 2 columnas
		frame.setLayout(new GridLayout(3,2));
		
		//Se crean los botónes a utiliza
		JButton btn1= new JButton("Botón 1");
		JButton btn2= new JButton("Botón 2");
		JButton btn3= new JButton("Botón 3");
		JButton btn4= new JButton("Botón 4");
		JButton btn5= new JButton("Botón 5");
		JButton btn6= new JButton("Botón 6");
		
		// Se agrega los componentes a JFrame 
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		
		// Se utiliza el método para que no se puda redimencionar la ventana 
		frame.setResizable(false);
		
	}
}
