# Índice
- [Índice](#índice)
  - [Introduccion <a name="introduction"></a>](#introduccion-)
  - [Propuesta inicial <a name="propuestaInicial"></a>](#propuesta-inicial-)
    - [Descripción de la idea <a name="descripcionDeLaIdea"></a>](#descripción-de-la-idea-)
  - [Funcionalidades principales <a name="funcionalidadesprincipales"></a>](#funcionalidades-principales-)
  - [Análisis <a name="analisis"></a>](#análisis-)
    - [Casos de uso estructurales <a name="casosdeusoestructurales"></a>](#casos-de-uso-estructurales-)
    - [Casos de uso no estructurales <a name="casosdeusonoestructurales"></a>](#casos-de-uso-no-estructurales-)
    - [Conjuntos de casos de uso <a name="conjuntosdecasosdeuso"></a>](#conjuntos-de-casos-de-uso-)
  - [Metodologías de desarrollo <a name="metodologiasdedesarrollo"></a>](#metodologías-de-desarrollo-)
    - [Proceso de desarrollo <a name="procesodedesarrollo"></a>](#proceso-de-desarrollo-)
    - [Planificación del proyecto <a name="planificaciondelproyecto"></a>](#planificación-del-proyecto-)
      - [Proceso de planificación <a name="procesodeplanificacion"></a>](#proceso-de-planificación-)
      - [Distribución de casos de uso <a name="distribuciondecasosdeuso"></a>](#distribución-de-casos-de-uso-)
      - [Análisis de la distribución <a name="analisisdeladistribucion"></a>](#análisis-de-la-distribución-)
      - [Planificación del proyecto <a name="planificaciondelproyecto2"></a>](#planificación-del-proyecto--1)
      - [Análisis de la planificación <a name="analisisdelaplanificacion"></a>](#análisis-de-la-planificación-)


## Introduccion <a name="introduction"></a>

### Motivación

<p>

&emsp;En los últimos años, la plataforma Android ha gobernado notablemente el mercado móvil, de tal manera que iOS nunca ha sido capaz de recuperar el status con el que se inició en el “mundillo” tecnológico. Además, junto con el crecimiento exponencial del “Big Data”, apareció un nuevo formato de aplicaciones móviles que accedían a grandes cantidades de datos. Como consecuencia,  los servicios que proporcionaban grandes fuentes de datos debían incorporar la forma de brindar datos con un acceso libre y seguro, conocido como “Open Data”. 
</p>

<p>
&emsp;En cuanto al nicho de mercado, apenas existen propuestas novedosas de aplicaciones meteorológicas, puesto que la mayoría de dispositivos Android incorporan estas aplicaciones de fábrica. Del mismo modo, los usuarios no parecen ser tan exigentes con este tipo de aplicaciones al ser conformistas con lo que disponen. 
</p>

<p>
&emsp;Hoy en día, las aplicaciones móviles no se centran únicamente en una tarea, sino que aglutinan diversas funcionalidades relacionadas entre sí. Por otro lado, el hardware móvil ha evolucionado hasta tal punto en que los desarrolladores tienen un gran abanico de opciones para desarrollar una IU con una alta usabilidad y accesibilidad.
</p>


### Objetivos

<p>

&emsp;El propósito del equipo de desarrollo es afianzar conocimientos: cómo utilizar Android Studio, cómo tratar el gran flujo de información devuelto por la API y la forma en la que se presentan los datos al usuario.  Asimismo, se va a focalizar en el diseño de la interfaz de usuario, haciéndola atractiva, novedosa y cumpliendo los requisitos de usabilidad y accesibilidad. Se pretende aportar al mercado un servicio de buena calidad a primera vista.
</p>


### Resumen
<p>

&emsp;En los siguientes apartados, hablaremos de la propuesta inicial del proyecto con una descripción y su funcionalidad inicial. A continuación, se detalla el marco de desarrollo, en otras palabras, la planificación y el proceso seguido para cumplir con los objetivos propuestos. La metodología empleada por el equipo es el “Proceso Unificado”, un marco de desarrollo iterativo e incremental basado en casos de uso y centrado en la arquitectura del sistema.  Por último, se presentará el funcionamiento interno de la aplicación, así como los mockup (interfaz de usuario primigenia) y la navegación entre las diferentes pantallas.
</p>

<p>&nbsp;</p>


## Propuesta inicial <a name="propuestaInicial"></a>


### Descripción de la idea <a name="descripcionDeLaIdea"></a>
<p>
&emsp; El objetivo principal de este trabajo es el desarrollo de una aplicación móvil Android llamada <b>ClimApp</b> centrada en la visualización del tiempo meteorológico de una localización en España, dicha información proporcionada por la API de AEMET. 
</p>
</p>&emsp;El usuario puede crear eventos personalizados ligados a una ubicación, los cuales tendrán asignado las condiciones meteorológicas a tiempo real en dicha localización. De igual importancia, se favorece la interacción de los usuarios con el medio ambiente, permitiéndoles crear eventos tanto en municipios como en montañas.
<p>

<p>&nbsp;</p>


## Funcionalidades principales <a name="funcionalidadesprincipales"></a>


<p>
&emsp;Para poder utilizar las diferentes funcionalidades de la aplicación, un usuario debe registrarse con unas credenciales. Una vez se registre e inicie sesión, podrá :

<ul>
    <li>Visualizar el tiempo meteorológico de la ubicación actual del dispositivo.
    </li>
    <li>Visualizar el listado de eventos en municipios o montañas  creados por el usuario.
    </li>
    <li>Gestionar un evento, así como su creación, edición y borrado, mediante las preferencias (fecha, nombre, descripción, color, ubicación, etc).
    </li>
    <li>Consultar en detalle el tiempo meteorológico de una ubicación específica.
    </li>
    <li>Borrar la cuenta de usuario.
    </li>
</ul>
</p>


## Análisis <a name="analisis"></a>


### Casos de uso estructurales <a name="casosdeusoestructurales"></a>

<ul>
    <li>CU-01: Añadir Evento de Municipio.
    </li>
    <li>CU-02: Añadir Evento de Ruta Montaña.
    </li>
    <li>CU-03: Añadir Usuario.
    </li>
    <li>CU-04: Añadir una barra de búsqueda y filtrado de ubicaciones.
    </li>
    <li>CU-05: Añadir preferencias desde el menú de AppBar (ajustes …)
    </li>
</ul>


### Casos de uso no estructurales <a name="casosdeusonoestructurales"></a>

<ul>
    <li>CU-06: Consultar el tiempo detallado de una ubicación.
    </li>
    <li>CU-07: Modificar un evento.
    </li>
    <li>CU-08: Eliminar un evento.
    </li>
    <li>CU-09: Consultar tiempo meteorológico en la ubicación actual
    </li>
    <li>CU-10: Modificar idioma y tema a modo oscuro
    </li>
    <li>CU-11: Consultar lista de eventos.
    </li>
    <li>CU-12: Consultar un evento.
    </li>
    <li>CU-13: Iniciar sesión.
    </li>
    <li>CU-14: Cerrar sesión.
    </li>
    <li>CU-15: Modificar usuario..
    </li>
    <li>CU-16: Eliminar usuario.
    </li>
</ul>

### Conjuntos de casos de uso <a name="conjuntosdecasosdeuso"></a>

| ID | Nombre | Descripción | 
|----|---|---|
|CU-01|Añadir Evento de Municipio.|El usuario podrá añadir un nuevo evento de municipio en una fecha determinada, estando asignado a una condición meteorológica en tiempo real de la ubicación del municipio.|
|CU-02|Añadir Evento de Ruta Montaña.|El usuario podrá añadir un nuevo evento de montaña en una fecha determinada, estando asignado a una condición meteorológica en tiempo real de la ubicación de la montaña.|
|CU-03|Añadir Usuario.|El sistema permite al usuario registrarse con unas credenciales.|
|CU-04|Añadir una barra de búsqueda y filtrado de ubicaciones.|El sistema deberá incorporar una barra de búsqueda para buscar una ubicación con su tiempo meteorológico asignado.|
|CU-05|Añadir preferencias desde el menú de AppBar (ajustes …)|El sistema deberá incorporar un apartado de configuración que permite al usuario personalizar su experiencia con la aplicación, así como el modo oscuro, preferencias, etc.|
|CU-06|Consultar el tiempo detallado de una ubicación.|El usuario podrá visualizar el tiempo meteorológico de una ubicación específica en tiempo real.|
|CU-07|Modificar un evento.|El usuario podrá modificar los datos de un evento, así como su nombre, descripción, fecha y ubicación.|
|CU-08|Eliminar un evento.|El usuario podrá borrar un evento creado y configurado previamente en la lista de eventos.|
|CU-09|Consultar el tiempo meteorológico en la ubicación actual.|El usuario podrá consultar los detalles del tiempo asociado a la localización/municipio más cercano.|
|CU-10|Modificar idioma y tema a modo oscuro.|El usuario podrá realizar una serie de modificaciones en la aplicación para configurar esta a su gusto como cambiar el idioma, el tema a modo oscuro, etc.|
|CU-11|Consultar lista de eventos.|El usuario podrá visualizar el listado completo de eventos de municipios y montañas creados por su parte.|
|CU-12|Consultar un evento.|El usuario podrá visualizar en detalle los datos pertinentes de un evento de municipio o montaña.|
|CU-13|Iniciar sesión.|El sistema permite iniciar sesión con las credenciales asociadas a su cuenta de usuario.|
|CU-14|Cerrar sesión.|El sistema permite cerrar sesión a un usuario.|
|CU-15|Modificar usuario.|El usuario podrá modificar su nombre de usuario, contraseña asociadas a su cuenta en un apartado “perfil”.| 
|CU-16|Eliminar usuario.|En el apartado “perfil”, el usuario podrá eliminar su cuenta de la aplicación y cerrar sesión.|

<p>&nbsp;</p>

## Metodologías de desarrollo <a name="metodologiasdedesarrollo"></a>

### Proceso de desarrollo <a name="procesodedesarrollo"></a>

Para llevar a cabo la realización del proyecto se ha utilizado el método denominado como <b>Proceso Unificado</b> (SCRUM), que consiste en una metodología ágil gracias a la cual se pueden desarrollar proyectos pudiendo realizar modificaciones en este fácilmente.
Así mismo, este proceso divide su desarrollo en <b>fases</b> utilizando el concepto de Casos de Uso para representar a los requisitos. Las fases se desarrollarán de forma incremental mediante una serie de <b>iteraciones</b>.
En este proceso, los <b>casos de uso</b> se crean e implementan a través de <b>cuatro fases</b>:
1. <b>Inicio</b>: Se especifica o declara el requisito en concreto, madurando dicha idea hasta un concepto más sólido.
2. <b>Elaboración</b>: El requisito pasa por un proceso de análisis y diseño, que amplían el concepto y cómo se debería implementar.
3. <b>Construcción</b>: El requisito se implementa en código software para ser utilizado en el programa.
4. <b>Transición</b>: Se prueba la versión final del requisito para saber si el código software es correcto, y en caso afirmativo se integra este junto con el resto en el programa. 

### Planificación del proyecto <a name="planificaciondelproyecto"></a>

#### Proceso de planificación <a name="procesodeplanificacion"></a>

En la planificación de este proyecto, existirán **cuatro roles ** que influyen de forma distinta la creación de casos de uso. Estos roles son:
1. <b>Jefe de proyecto</b>: Es el encargado principal de gestionar el desarrollo del proyecto.
2. <b>Desarrollador de software Senior</b>: Es un programador de Software relativamente experimentado.
3. <b>Desarrollador de software Junior</b>: Es un programador de software que cuenta con poca experiencia.
4. <b>Arquitecto de software</b>: Es un experto en la Arquitectura de Software.
Cada uno de estos roles tendrá que realizar una serie de tareas que les serán asignadas al comienzo del proyecto, las cuales ocupan cierta cantidad de tiempo designada durante la planificación.      

#### Distribución de casos de uso <a name="distribuciondecasosdeuso"></a>

#### Análisis de la distribución <a name="analisisdeladistribucion"></a>

#### Planificación del proyecto <a name="planificaciondelproyecto2"></a>

#### Análisis de la planificación <a name="analisisdelaplanificacion"></a>