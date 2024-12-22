# Random User Generator

Este proyecto es una aplicación que genera usuarios aleatorios utilizando la API de RandomUser. Los datos de los usuarios se adaptan y se muestran en una interfaz gráfica.

## Descripción

El objetivo de este proyecto es demostrar cómo consumir una API externa, adaptar los datos recibidos y mostrarlos en una interfaz gráfica. Utiliza la API de RandomUser para obtener datos de usuarios aleatorios y los adapta a un modelo de usuario definido en el proyecto.

## Estructura del Proyecto

El proyecto contiene las siguientes clases y paquetes:

- `control`
  - `pojo`
    - `RandomUser`: Clase que representa un usuario aleatorio.
    - `RandomUserResponse`: Clase que representa la respuesta de la API de RandomUser.
  - `RandomUserAdapter`: Clase que adapta los datos de `RandomUser` al modelo `User`.
  - `RandomUserProvider`: Clase que proporciona nuevos usuarios utilizando la API de RandomUser.
  - `RandomUsersLoaderCommand`: Clase que carga una lista de usuarios aleatorios.
  - `UserAdapter`: Interfaz para adaptar datos de usuarios.
  - `UserProvider`: Interfaz para proporcionar nuevos usuarios.
- `model`
  - `User`: Clase que representa un usuario en el modelo de la aplicación.
- `view`
  - `UserPanel`: Clase que representa el panel de usuario en la interfaz gráfica.
- `main`
  - `Main`: Clase principal que ejecuta la aplicación.
