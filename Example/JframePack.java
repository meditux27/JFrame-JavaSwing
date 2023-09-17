package Example;
//Copiar codigo desde aqui
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JframePack {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
	public static void main(String[] args) {
		//Creación de Jframe
		JFrame frame=new JFrame();
		//Determina el tamaño de JFrame
		frame.setSize(400,400);
		//Determina la posición inicial
		frame.setLocationRelativeTo(null);
		//Establece la visibilidad
		frame.setVisible(true);
		//Determina el comportamiento de cerrar la ventana 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		//Creación de botones 
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");
        JButton button4 = new JButton("Botón 4");
        JButton button5 = new JButton("Botón 5");
        JButton button6 = new JButton("Botón 6");
        
       
     //Se establece el administrador de diseño para los componentes
       frame.setLayout(new FlowLayout());
     
    
     
       //Utilizando el metodo add para unir todos los componentes a JFrame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        
        //Se implementa el metodo pack para que Jframe se ajuste al espacio utilizado por los componentes 
        frame.pack();
		
	}
}
