# JFrame - JavaSwing

![JFrame](https://www.onworks.net/imagescropped/defaulticon.png_3.webp) 

##### Frame es una clase en la biblioteca de Java Swing que representa una ventana de nivel superior en una interfaz gráfica de usuario (GUI). La ventana JFrame puede contener y organizar otros componentes de Swing, como botones, etiquetas, campos de texto, paneles y más.

---

[Estructura basica](https://github.com/meditux27/JFrame-JavaSwing/blob/main/principal/MiVentana.java)

Algunas características clave de `JFrame`:

1. **Ventana Principal**: `JFrame` generalmente se utiliza como la ventana principal de una aplicación de escritorio. Cuando creas un objeto `JFrame`, estás creando una ventana en la que los usuarios pueden interactuar con tu aplicación.

2. **Decoración de Ventana**: `JFrame` proporciona una variedad de opciones para personalizar la decoración de la ventana, como el título, el ícono, los botones de minimizar, maximizar y cerrar, y la apariencia de la barra de título.

3. **Layout Manager**: Puedes usar un administrador de diseño (Layout Manager) para organizar y posicionar los componentes dentro de un JFrame. Esto te permite crear diseños flexibles y adaptables.

4. **Eventos de Ventana**: Puedes agregar controladores de eventos a un JFrame para responder a eventos de ventana, como abrir, cerrar o cambiar de tamaño. Esto te permite controlar el comportamiento de tu aplicación en respuesta a las acciones del usuario.

5. **Tamaño y Posición**: Puedes controlar el tamaño y la posición inicial de la ventana JFrame mediante métodos y propiedades. También puedes hacer que la ventana se ajuste automáticamente al contenido.

6. **Visibilidad**: Puedes controlar la visibilidad de un JFrame utilizando métodos como `setVisible()`. Esto te permite mostrar u ocultar la ventana según sea necesario.

7. **Cierre de la Aplicación**: Cuando un JFrame se cierra, puedes controlar si la aplicación completa debe cerrarse o simplemente ocultarse. Esto se puede configurar utilizando métodos como `setDefaultCloseOperation()`.

Algunos de los métodos más comunes de la clase `JFrame` en Java Swing, que se utilizan con frecuencia para configurar y trabajar con ventanas en aplicaciones gráficas son los siguientes:

---

> :beginner: setTitle

- Descripción

Establece el título de la ventana 

- Sintaxis

frame.setTitle(" texto ");

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

<sub> Crear un JFrame</sub>  
`JFrame frame = new JFrame();`

<sub>Agregar setTitle </sub>  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo

[ setTitle]( https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

[setTitle2](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample2.java)

---

> :beginner: setSize(int width, int height)

- Descripción

Establece el tamaño inicial de la ventana en píxeles

- Sintaxis

frame.setSize(800,600);

- Nota

Para el uso del metodo setSize se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setSize(400,400)

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setSize(400,400);`

- Ejemplo

[setSize](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetSize.java)

---

> :beginner: setDefaultCloseOperation(int operation)

- Descripción

Configura el comportamiento de cierre de la ventana

- Sintaxis

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`

- Ejemplo

[setDefaultCloseOperation](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/setDefaultCloseOperation.java)

---

> :beginner: setVisible

- Descripción

Hace que la ventana sea visible o invisible

- Sintaxis

frame.setVisible(boolean);

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setVisble(true), por default java tiene a utilizar el valor false, por lo cual se requiere establecerlo en true

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setVisible(true);`

- Ejemplo

[setVisible](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/setVissible.java)

[setVisible2](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/setVissible2.java)

---

> :beginner: setTitle

- Descripción

Establece el título de la ventana

- Sintaxis

frame.setTitle(" texto ");

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo

[setTitle](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

---

> :beginner: setTitle

- Descripción

Establece el título de la ventana

- Sintaxis

frame.setTitle(" texto ");

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo

[setTitle](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

---

> :beginner: setTitle

- Descripción

Establece el título de la ventana

- Sintaxis

frame.setTitle(" texto ");

- Nota

Para el uso del metodo setTitle se debe instanciar JFrame, posteriormente llamar la variable asignada y agregar .setTitle(" texto ")

Crear un JFrame  
`JFrame frame = new JFrame();`

Agregar setTitle  
`frame.setTitle("Titulo de la ventana");`

- Ejemplo

[setTitle](https://github.com/meditux27/JFrame-JavaSwing/blob/main/Example/JFrameSetTitleExample.java)

---


