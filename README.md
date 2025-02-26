# Lista de Tareas

Este es un programa en **Java** que permite gestionar una lista de tareas, permitiendo al usuario agregar y eliminar tareas de manera interactiva desde la consola.

## 🚀 Características
- Permite ingresar múltiples tareas.
- Evita la duplicación de tareas utilizando `LinkedHashSet`.
- Permite eliminar una tarea específica.
- Muestra la lista actualizada de tareas después de cada operación.

## 🛠️ Tecnologías utilizadas
- **Java**
- **LinkedHashSet** para evitar tareas duplicadas.
- **Scanner** para entrada de datos desde la consola.

## 📌 Requisitos previos
Para ejecutar este programa, necesitas:
- Tener instalado **GIT**.
- Tener instalado **Java (JDK) 17.0.13 o superior**.
- Tener instalado **Visual Studio Code** con la extensión **Code Runner** o **Debugger for Java**.

## 📖 Uso
### 1️⃣ Clonar el repositorio
```bash
 git clone https://github.com/RicardoArevaloB/Lista-de-Tareas-con-LinkedHashSet.git
```

### 2️⃣ Abrir en Visual Studio Code
- Abre **Visual Studio Code**.
- Ve a **Archivo > Abrir carpeta** y selecciona la carpeta del proyecto.
- Instala la extensión **Debugger for Java** si aún no la tienes.

### 3️⃣ Ejecutar el programa
- Abre el archivo `ListaTareas.java` en **Visual Studio Code**.
- Presiona `Ctrl + F5` para ejecutar el programa.
- Alternativamente, puedes usar el botón **Ejecutar** en la parte superior.

### 4️⃣ Interactuar con la aplicación
- Ingresa las tareas una por una.
- Escribe **"fin"** para finalizar el registro de tareas.
- La aplicación mostrará la lista de tareas.
- Luego, se te pedirá que ingreses el nombre de la tarea que deseas eliminar.
- Finalmente, se mostrará la lista de tareas actualizada.

## 📷 Ejemplo de ejecución
```
Ingrese sus tareas y escriba 'fin' para terminar el registro de las tareas:
Tarea: Asistir a clases a la 1 pm 
Tarea: Estudiar Java
Tarea: Terminar el proyecto de Java 
Tarea: fin

Lista de tareas:
- Asistir a clases a la 1 pm 
- Estudiar Java
- Terminar el proyecto de Java

Ingrese el nombre de la tarea que desea eliminar: Estudiar Java
La tarea 'Estudiar Java' ha sido eliminada.

Lista de tareas actualizada:
- Asistir a clases a la 1 pm 
- Terminar el proyecto de Java
```

Hecho por [Ricardo Arevalo Boorquez](https://github.com/RicardoArevaloB)

>[!NOTE]
>Este es un proyecto que esta hecho con fines educativos.

