# JFrame - JavaSwing

![JFrame](https://www.onworks.net/imagescropped/defaulticon.png_3.webp) <img title="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzTjottlnIzfylXY6zxHx-M8YdpnoMw-oxaPSU58H5X1jrNs5vmCK0e9aeMX8SUtpi1KM&usqp=CAU" alt="" data-align="inline" width="265">

#### JFrame es una clase en la biblioteca de Java Swing que representa una ventana de nivel superior en una interfaz gráfica de usuario (GUI). La ventana JFrame puede contener y organizar otros componentes de Swing, como botones, etiquetas, campos de texto, paneles y más.

---

:book: **Las características más importantes de un `JFrame` en Swing son las siguientes:**



1. **Ventana Principal**: `JFrame` generalmente se utiliza como la ventana principal de una aplicación de escritorio. Cuando creas un objeto `JFrame`, estás creando una ventana en la que los usuarios pueden interactuar con tu aplicación.

2. **Decoración de Ventana**: `JFrame` proporciona una variedad de opciones para personalizar la decoración de la ventana, como el título, el ícono, los botones de minimizar, maximizar y cerrar, y la apariencia de la barra de título.

3. **Layout Manager**: Puedes usar un administrador de diseño (Layout Manager) para organizar y posicionar los componentes dentro de un JFrame. Esto te permite crear diseños flexibles y adaptables.

4. **Eventos de Ventana**: Puedes agregar controladores de eventos a un JFrame para responder a eventos de ventana, como abrir, cerrar o cambiar de tamaño. Esto te permite controlar el comportamiento de tu aplicación en respuesta a las acciones del usuario.

5. **Tamaño y Posición**: Puedes controlar el tamaño y la posición inicial de la ventana JFrame mediante métodos y propiedades. También puedes hacer que la ventana se ajuste automáticamente al contenido.

6. **Visibilidad**: Puedes controlar la visibilidad de un JFrame utilizando métodos como `setVisible()`. Esto te permite mostrar u ocultar la ventana según sea necesario.

7. **Cierre de la Aplicación**: Cuando un JFrame se cierra, puedes controlar si la aplicación completa debe cerrarse o simplemente ocultarse. Esto se puede configurar utilizando métodos como `setDefaultCloseOperation()`.



---

:clipboard: **Pasos para implementar JFrame**

1. Importa las clases necesarias:

Asegúrate de importar las clases necesarias de la biblioteca Swing en tu archivo Java para trabajar con JFrame.

```java
import javax.swing.JFrame;
```

2. Crea un objeto JFrame:

Crea una instancia de la clase JFrame para representar tu ventana.

```java
JFrame frame = new JFrame("Mi Titulo");
```

3. Configura las propiedades del `JFrame` (opcional):

Puedes configurar diversas propiedades del `JFrame`, como el cierre de la ventana al hacer clic en la "X" de la esquina superior derecha, el tamaño de la ventana, la ubicación inicial, etc.

```java
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cierre de la ventana
frame.setSize(800, 600);//Tamaño inicial de la ventana
frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
```

4. Agrega componentes (opcional):

Si deseas agregar componentes, como botones, etiquetas, campos de texto, etc., a la ventana, puedes hacerlo usando métodos como `add()`.

```java
// Ejemplo: Agregar un botón a la ventana
frame.add(new JButton("Mi Botón"));
```

5. Hacer visible la ventana:

Debes hacer que la ventana sea visible para que los usuarios puedan interactuar con ella.

```java
frame.setVisible(true);
```

6. Gestión de eventos (opcional):

Si deseas que la ventana reaccione a eventos, como clics de botones o cierre de ventana, puedes agregar controladores de eventos.

```java
// Ejemplo: Agregar un ActionListener para manejar eventos de botones
myButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Código para manejar el evento
    }
});
```

:coffee:[Estructura basica](https://github.com/meditux27/JFrame-JavaSwing/blob/main/principal/MiVentana.java)

---

> :beginner: **setTitle**

- Descripción

Establece el título de la ventana 

- Sintaxis

```java
frame.setTitle(" texto ");
```

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

<sub> Crear un JFrame</sub>  
`JFrame frame = new JFrame();`

<sub>Agregar setTitle </sub>  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo:coffee:

[ setTitle]( https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

[setTitle2](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample2.java)

---

> :beginner: **setSize()**

- Descripción

Establece el tamaño inicial de la ventana en píxeles

- Sintaxis

```java
frame.setSize(800,600);
```

- Nota

Para el uso del metodo setSize se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setSize(400,400)

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setSize(400,400);`

- Ejemplo:coffee:

[setSize](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetSize.java)

---

> :beginner: **setDefaultCloseOperation()**

- Descripción

Configura el comportamiento de cierre de la ventana

- Sintaxis

```java
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`

- Ejemplo:coffee:

[setDefaultCloseOperation](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/setDefaultCloseOperation.java)

---

> :beginner: **setVisible**

- Descripción

Hace que la ventana sea visible o invisible

- Sintaxis

```java
frame.setVisible(boolean);
```

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setVisble(true), por default java tiene a utilizar el valor false, por lo cual se requiere establecerlo en true

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setVisible(true);`

- Ejemplo:coffee:

[setVisible](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/setVisible.java)

[setVisible2](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/setVisible2.java)

---

> :beginner: **setLayout**

- Descripción

Establece el administrador de diseño para organizar los componentes dentro del JFrame

- Sintaxis
1. Creando la instancia de layout manager y asignando el nombre de la variable donde se guardo la instancia

```java
GridLayout diseno = new GridLayout(3, 3);
panel.setLayout(diseno);
```

2. Agregando directamente al panel mediante la instancia

```java
JPanel panel = new JPanel(new GridLayout(2, 3));
```

- Nota

Entre los mas utilizados se encuentran `FlowLayout|GridLayout|BorderLayout`

1. **FlowLayout**

*Organiza los componentes en una fila horizontal o vertical, ajustándolos automáticamente a medida que se agregan. Es útil para diseños simples de una fila o una columna de componentes.*

2. ***BorderLayout***

*Divide el contenedor en cinco áreas: norte, sur, este, oeste y centro. Cada área puede contener un solo componente, y los componentes se expanden para llenar su área asignada.*

3. ***GridLayout***

*Organiza los componentes en una cuadrícula de filas y columnas de tamaño fijo. Todos los componentes en un GridLayout tienen el mismo tamaño.*

- Ejemplo:coffee:

[FlowLayout](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/FlowLayoutExample.java)

[BorderLayout](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/BorderLayoutExample.java)

[GridLayout](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/GridLayoutExample.java)

---

> :beginner: **add()**

- Descripción

Agrega un componente (como un JPanel, JButton, etc.) al JFrame

- Sintaxis

```java
frame.add(new JButton("Mi Botón"));
```

- Nota

Para el uso del metodo add se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .add( componente) para asociarlo 

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.add(componente);`

- Ejemplo:coffee:

[add ](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/addComponentExample.java)

---

> :beginner: **pack**

- Descripción

Ajusta automáticamente el tamaño de la ventana para que se ajuste a los componentes que contiene

- Sintaxis

```java
frame.pack( );
```

- Nota

Para el uso del metodo `pack ();`, es conveniente utilizar layout manager para que los componentes tenga una administración del espacio interno y posteriormente utilizar el metodo `pack ();` al final del listado de componentes agregados a JFrame 

- Ejemplo:coffee:

[pack ()](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JframePack.java)

---

> :beginner: **setResizable**

- Descripción

Permite o impide que el usuario cambie el tamaño de la ventana.

- Sintaxis

```java
frame.setResizable(boolean);
```

- Nota

Para el uso del metodo `setResizable` se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar `.setResizable(true);` 

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setResizable(true);`

- Ejemplo:coffee:

[setResizable](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JframeSetResizable.java)

---

> :beginner: **setLocationRelativeTo**

- Descripción

Establece la posición al generar la ventana 

- Sintaxis

```java
frame.setLocationRelativeTo(null);
```

- Nota

Coloca la ventana en una posición relativa a otro componente (por lo general, `null` para centrarla en la pantalla).

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setLocationRRelativeTo(null);`

- Ejemplo:coffee:

[setLocationRelativeTo](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/setLocationRelativeTo.java)

---

> :beginner: **addWindowListener**

- Descripción

Se utiliza para registrar un objeto que escuchará eventos relacionados con la ventana, como eventos de apertura, cierre, activación, desactivación y otros eventos relacionados con la ventana.

- Sintaxis

```java
frame.add(new JButton("Mi Botón"));
```

- Nota

La interfaz `WindowListener` define varios métodos que puedes implementar para manejar diferentes tipos de eventos de ventana. Estos métodos incluyen:

1. `windowOpened(WindowEvent e)`: Se llama cuando la ventana se abre.

2. `windowClosing(WindowEvent e)`: Se llama cuando el usuario intenta cerrar la ventana.

3. `windowClosed(WindowEvent e)`: Se llama después de que la ventana se haya cerrado.
   
   `windowClosing` se utiliza para tomar decisiones antes de que la ventana se cierre y permite la posibilidad de cancelar el cierre, mientras que `windowClosed` se llama después de que la ventana ya está cerrada y se utiliza para realizar tareas posteriores al cierre.

4. `windowIconified(WindowEvent e)`: Se llama cuando la ventana se minimiza.

5. `windowDeiconified(WindowEvent e)`: Se llama cuando la ventana se restaura desde un estado minimizado.

6. `windowActivated(WindowEvent e)`: Se llama cuando la ventana se activa.

7. `windowDeactivated(WindowEvent e)`: Se llama cuando la ventana se desactiva.

Para usar `addWindowListener`, primero debes agregar una instancia de la clase como oyente de eventos de ventana utilizando `addWindowListener`, posteriormente se crea una instancia anónima de una clase que implementa la interfaz `WindowListener`, esto con el proposito de crear una manera conveniente de trabajar con eventos de ventana, cuando solo necesitas manejar algunos de ellos y no todos.

A continuación se proporcionar una implementación de sobrecarga para los métodos que desees manejar ejemplo: `windowClosing(WindowEvent e){ }`

- Ejemplo:coffee:

[windowOpened(WindowEvent e)](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/EjemploWindowOpened.java)

[windowClosing(WindowEvent e)](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/EjemploWindowClosing.java)

[windowClosed(WindowEvent e)](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/EjemploWindowClosed.java)

[windowIconified(WindowEvent e)](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/MinimizeWindowExample2.java)

[windowDeiconified(WindowEvent e)](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/EjemploDeiconify.java)

[windowActivated(WindowEvent e)](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/EjemploWindowActivated.java)

[windowDeactivated(WindowEvent e)](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/EjemploWindowDeactivated.java)

---

> :beginner: **dispose**

- Descripción

Se utiliza para liberar los recursos asociados a una ventana o diálogo y cerrarla

- Sintaxis

```java
frame.dispose();
```

- Nota

Para el uso del metodo add se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar el metodo

Es importante destacar que `dispose()` libera los recursos asociados a la ventana y la cierra, pero no termina la aplicación por completo. Si tienes más ventanas o componentes en tu aplicación, la aplicación seguirá en ejecución. Si deseas cerrar la aplicación por completo, puedes utilizar `System.exit(0)` o cerrar todas las ventanas principales.

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.dispose();`

- Ejemplo:coffee:

[dispose](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/EjemploDispose.java)
