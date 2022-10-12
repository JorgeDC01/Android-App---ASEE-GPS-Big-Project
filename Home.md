# Autores
* Luis Alfonso Huertas Delgado
* Miguel Jara Arroyo
* Pedro del Castillo Gómez
* Jorge del Castillo Gómez
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
    <li>En la pantalla principal, visualizar el tiempo meteorológico de la ubicación actual del dispositivo.
    </li>
    <li>Visualizar el listado de eventos en municipios o montañas  creados por el usuario.
    </li>
    <li>Gestionar un evento, así como su creación, edición y borrado, mediante las preferencias (fecha, nombre, descripción, color, ubicación, etc).
    </li>
    <li>Consultar en detalle el tiempo meteorológico de una ubicación específica.
    </li>
    <li>Editar los datos personales y borrar la cuenta de usuario.
    </li>
</ul>
</p>
<p>&nbsp;</p>

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

&emsp;Para llevar a cabo la realización del proyecto se ha utilizado el método denominado como <b>Proceso Unificado</b> (SCRUM), que consiste en una metodología ágil gracias a la cual se pueden desarrollar proyectos pudiendo realizar modificaciones en este fácilmente.
Así mismo, este proceso divide su desarrollo en <b>fases</b> utilizando el concepto de Casos de Uso para representar a los requisitos. Las fases se desarrollarán de forma incremental mediante una serie de <b>iteraciones</b>.
En este proceso, los <b>casos de uso</b> se crean e implementan a través de <b>cuatro fases</b>:
1. <b>Inicio</b>: Se especifica o declara el requisito en concreto, madurando dicha idea hasta un concepto más sólido.
2. <b>Elaboración</b>: El requisito pasa por un proceso de análisis y diseño, que amplían el concepto y cómo se debería implementar.
3. <b>Construcción</b>: El requisito se implementa en código software para ser utilizado en el programa.
4. <b>Transición</b>: Se prueba la versión final del requisito para saber si el código software es correcto, y en caso afirmativo se integra este junto con el resto en el programa. 

### Planificación del proyecto <a name="planificaciondelproyecto"></a>

#### Proceso de planificación <a name="procesodeplanificacion"></a>

&emsp;En la planificación de este proyecto, existirán <b>cuatro roles</b> que influyen de forma distinta la creación de casos de uso. Estos roles son:
1. <b>Jefe de proyecto</b>: Es el encargado principal de gestionar el desarrollo del proyecto.
2. <b>Desarrollador de software Senior</b>: Es un programador de Software relativamente experimentado.
3. <b>Desarrollador de software Junior</b>: Es un programador de software que cuenta con poca experiencia.
4. <b>Arquitecto de software</b>: Es un experto en la Arquitectura de Software, el cual, además de trabajar en la creación de la aplicación, también ayudará al jefe de proyecto con la gestión.

Cada uno de estos roles tendrá que realizar una serie de tareas que les serán asignadas al comienzo del proyecto, las cuales ocupan cierta cantidad de tiempo designada durante la planificación.      

#### Distribución de casos de uso <a name="distribuciondecasosdeuso"></a>
<p>
&emsp;Para seguir este proceso, los casos de uso especificados se desarrollan e implementan a lo largo de una serie de iteraciones, las cuales duran una semana, en las que los cuatro roles distinguidos llevarán a cabo una las distintas disciplinas de desarrollo de los casos de uso, además de tareas de gestión del proyecto.
</p>

<p>
&emsp;Estas disciplinas permitirán marcar la vida de desarrollo de los casos de uso, y estarán relacionados con las cuatro fases existentes en el método de Proceso Unificado. Las disciplinas son las siguientes:
</p>

* Modelado del negocio (Previa al inicio)
* Requisitos (Relacionada con la fase de inicio)
* Análisis y Diseño (Relacionada con la fase de elaboración)
* Implementación (Relacionada con la fase de construcción)
* Test e Integración (Relacionada con la fase de transición)
* Despliegue (Posterior a la transición)

De esta forma, cada rol realiza las siguientes disciplinas:
* Jefe del proyecto: Realiza la disciplina de Modelado del negocio (BM) y también tareas de gestión del proyecto.
* Arquitecto del software: Realiza las disciplinas Requisitos (R), Análisis y Diseño (A&D) e Implementación (Imp). También colaborará en situaciones extraordinarias en la disciplina de Test e Integración (T&I).
* Desarrollador de Software Junior: Realiza las disciplinas de Implementación (Imp), Test e integración (T&I) y Despliegue (D).
* Desarrollador de Software Senior: Realiza las disciplinas de Requisitos (R), Análisis y Diseño (A&D), Implementación (Imp), Test e integración (T&I) y Despliegue (D).

<p>Para resumir y poder visualizar mejor esto, realizamos la siguiente tabla:</p>
<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/sadsad.png" width="450"/>

#### Análisis de la distribución <a name="analisisdeladistribucion"></a>

<p>
&emsp;Para calcular el tiempo total que tendrá disponible cada rol y cada caso de uso en número de horas se tendrá en cuenta una jornada laboral de 8 horas. Trabajando 5 días a la semana y teniendo en cuenta las 7 iteraciones (semanas), con lo que se obtiene la siguiente cantidad de tiempo:
</p>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/a1.png"/>

<p>
&emsp;Esto nos da que la jornada laboral tiene 280 horas por semana, de las cuales, según la implicación de cada rol en el proyecto se obtiene el tiempo que emplean:

* Jefe del proyecto: **20%**
* Arquitecto del Software: **100%** 
* Desarrollador de software Senior: **100%** 
* Desarrollador de software Junior: **50%** 

Con esto, el tiempo total empleado en el proyecto es de **756 horas**.
</p>

<p>&emsp;Según las investigaciones proporcionadas por el periódico [diariodeSevilla](https://www.diariodesevilla.es/canalempleo/espanoles-productivos-jornada-laboral_0_1615338736.html) , en España, existe una estimación de productividad general de un 93% del tiempo trabajado.
</p>
<p>
<strong>Tiempo productivo en el proyecto: 93% de 756 h ≈ 703,08 horas</strong>
</p>
<p>&emsp;Con lo cual contamos con 703,08 horas de trabajo real, de las cuales el <b>15%</b> se dedica a <b>tareas de gestión del proyecto (Tareas de Project)</b>, y el resto del tiempo <b>(85%)</b> a la creación de los casos de uso, por lo que tenemos <b>597,618 horas</b> para realizar todos los casos de uso.
</p>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/a2.png"/>

<p>&emsp;En esta tabla se pueden observar los <b>porcentajes de tiempo</b> que se van a dedicar a cada uno de los <b>casos de uso</b>.

* Definición de requisitos: 10%
* Análisis y Diseño: 20%
* Implementación: 45%
* Test e Integración: 20%
* Despliegue: 5%
</p>

<p>
El tiempo que tenemos para cada caso de uso es calculado con: <b>Tiempo bruto total / Número de casos de uso</b>
</p>
<p>
&emsp;De este tiempo, tanto el <b>Jefe del proyecto</b> como el <b>Arquitecto del software</b> emplearán tiempo para las <b>tareas de Modelado de Negocio</b>, lo cual se ha estimado que ocupará un <b>5%</b> del tiempo.

Por lo cual las <b>Tareas de Gestión + Modelado de negocio</b> ocupan un total de:

*105,46 + 29,89 = 135,35 horas.*

Con lo que nos quedan <b>47,31 horas</b> para realizar el resto de fases de los CU.

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/a3.png"/>

&emsp;En la tabla anterior podemos ver que los trabajadores disponen de <b>93 horas semanales</b> para realizar los casos de uso, así como las distintas cantidades de tiempo que dedicará cada rol en el proyecto.
</p>

#### Planificación inicial <a name="planificaciondelproyecto2"></a>
<p>
&emsp;Se ha priorizado que sea el arquitecto de software el que tenga tiempo restante, como se puede ver en cada una de las siguientes tablas, para así dedicárselo a la gestión del proyecto.

&emsp;El proyecto se desarrollará a lo largo de <b>7 iteraciones</b>, cada una de una semana de duración, las cuales se organizará de la siguiente manera:
</p>

<p>
&emsp;De esta forma, cada una de las iteraciones se han planificado en función de las distintas <b>fases</b> que pueden realizar cada uno de los <b>roles</b>.
</p>

<p>Con lo cual la planificación por iteración quedaría de la siguiente manera:
</p>

##  Fase de Inicio:
<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/p2.png"/>

##  Fase de Elaboración:
<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/p3.png"/>

##  Fase de Construcción:
<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/p4.png"/>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/p5.png"/>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/p6.png"/>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/p7.png"/>

##  Fase de Transición:
<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/p8.png"/>

#### Planificación modificada <a name="planificaciondelproyecto3"></a>
Posteriormente, el **cliente** añadió cuatro casos de uso más para un total de **dieciséis** , **uno** de ellos **estructural** (CU-05), y los otros **tres no estructurales** (CU-14, CU-15 y CU-16). Puesto que no hay suficiente tiempo para realizar estas nuevas funcionalidades con la actual planificación del proyecto,  se han añadido **2 iteraciones** más en la fase de **transición**, las cuales han permitido solucionar esta falta de tiempo.

Esto da lugar a una planificación compuesta por:
* Una iteración en la fase de Inicio.
* Una iteración en la fase de Elaboración.
* Cinco iteracoines en la fase de Construcción.
* Dos iteraciones en la fase de Transición.

De esta forma, la planificación por iteración después de realizar las modificaciones sería:
<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/12.png"/>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/12.1.png"/>

Debido a que las cuatro primeras iteraciones tienen la misma planificación que en la [inicial](https://docs.google.com/document/d/15MAbGp-y2Dv0iQTNwV9q1wjejY8h0Thr/edit#heading=h.vjimrnjjoclx), son las iteraciones de la IT5 a la IT9 las que deben ser realizadas de nuevo, dejando la planificación modificada como la siguiente:

##  Fase de Inicio:
##  Fase de Elaboración:
##  Fase de Construcción:
##  Fase de Transición:

Como podemos ver, en esta **última iteración** ha sido necesario que el **arquitecto** ayude a los dos roles de desarrolladores a realizar ciertas tareas de **test e integración.**

También hay que tener en cuenta que todo el **tiempo que le sobra** al arquitecto es tiempo que dedica a **tareas de gestión Project** en conjunto con el jefe de proyecto.

Una vez finalizados todos los cálculos y cuadradas las horas del proyecto, se procede a **migrar el mismo a Microsoft Project**, una herramienta que nos permite detallar más información acerca de fechas, horas laborales, planificación, diagramas, tareas... etc.

Para ello, primero es necesario obtener la jornada laboral de cada uno de los roles basándose en su implicación en el desarrollo. Esta es la siguiente:


* Jornada diaria del <b>Jefe de Proyecto</b>: 8 horas semanales / 5 días = 1.6h
* Jornada diaria del <b>Arquitecto Software</b>: 40 horas semanales / 5 días = 8h
* Jornada diaria del <b>Desarrollador Software Senior</b>: 40 horas semanales / 5 días = 8h
* Jornada diaria del <b>Desarrollador Software Junior</b>: 20 horas semanales / 5 días = 4h

A estas horas les aplicamos el porcentaje de productividad <b>93%</b> para calcular el tiempo que realmente le dedican al proyecto:

* <b>Jefe de Proyecto</b>: 1,488h
* <b>Arquitecto Software</b>: 7,44h
* <b>Desarrollador Software Senior</b>: 7,44h
* <b>Desarrollador Software Junior</b>: 3,72

En Microsoft Project  se han realizado **2 tipos de planificaciones**, una planificación por **iteraciones **y una posterior planificación por **casos de uso**.

Como se puede observar se ha planificado el proyecto basándose en la intervención de los roles en cada iteración.

Por ello, en cada iteración se encuentran **2 secciones** dedicadas a:

* <b>Management disciplines</b>: Esta sección está dedicada para las tareas de gestión del proyecto, en ella trabajan tanto el jefe de proyecto como el arquitecto software, y se divide en 3 subsecciones, Project Management, Environment y Configuration & Change Management.
* <b>Use Cases Disciplines</b>: Esta sección está utilizada para las distintas fases de los casos de uso, en ella trabaja todo el equipo y sus posibles subsecciones son las siguientes:
   - <b>Business Modeling</b>: Esta sección se encarga por completo del jefe del proyecto, entrando dentro de lo que conocemos como el modelado del negocio.
   - <b>Requirements</b>: Esta sección corresponde con los requerimientos de cada caso de uso.
   - <b>Analysis and Design</b>: Esta sección corresponde con el análisis y el diseño de cada caso de uso del proyecto.
   - <b>Implementation</b>: Esta subsección corresponde con la implementación de cada caso de uso
   - <b>Test y Integration</b>: En estas dos subsecciones corresponden con la fase de test e integración del Excel
   - <b>Deployment</b>: Esta subsección corresponde con el despliegue, y es la última que se realiza antes de que el caso de uso esté completamente desarrollado en la aplicación.

Cada iteración corresponde con una semana, por lo que en esta planificación se han ido repartiendo las horas de cada trabajador en cada una de las tareas que había que realizar para dicha integración, de tal forma que la repartición de horas, en función de los siguientes días y respetando su jornada laboral, se puede ver en la siguiente imagen:

Planificación por casos de uso:
    Para realizarla, se ha tenido en cuenta la planificación previa por iteraciones y se han agrupado todas las intervenciones de los roles en esta por caso de uso.
En concreto, se compone de <b>3 secciones</b>:

* <b>Management</b>: Dedicada a la gestión del proyecto y el modelado de negocio, con las intervenciones del jefe del proyecto y el Arquitecto del Software
* <b>Use Cases</b>: Contiene las disciplinas realizadas de los casos de uso, en la fecha y hora que se realizaron y los roles que intervinieron.
* <b>Despliegues</b>: Contiene los despliegues de cada caso de uso, con la fecha y hora de su realización

#### Análisis de la planificación <a name="analisisdelaplanificacion"></a>
En primer lugar, la planificación ha requerido <b>más horas</b> de las que realmente se disponen para completarse, esto es debido a que en la planificación inicial, los cálculos se realizaron en torno a <b>7 semanas y 12 casos de uso</b>, obteniendo un total de <b>41,23 horas</b> por cada caso de uso. Sin embargo, fue necesario modificar la planificación del proyecto expandiendo 2 semanas su duracion. 

Se ha decidido que el <b>Arquitecto del Software</b> se encargará de aquellas tareas que no debía realizar por su cualificación, pero que no se disponía del tiempo requerido para llevarlas a cabo. En este caso se trata de la disciplina de <b>Test e Integración</b>, pues a lo largo de las <b>últimas iteraciones</b> era necesario completarla para llevar a cabo el despliegue.

Considerando la falta de horas para realizar todo el trabajo, el <b>arquitecto software</b> priorizará trabajar en las disciplinas dedicadas a los <b>casos de uso</b>, y tras su realización, dedicará el tiempo sobrante de cada iteración en realizar <b>horas de gestión</b>. En la siguiente tabla se observan las <b>13,16</b> horas de gestión que realizará el arquitecto tras finalizar tu contribución en las tareas dedicadas a los casos de uso.

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/22.png"/>


Respecto a la distribución de horas de los distintos roles en las distintas disciplinas,  el <b>Jefe de proyecto</b> es el que se encarga de todo el tiempo de <b>Business Modeling</b>, tras ello, dedica sus horas restantes a la <b>gestión</b>.

El <b>arquitecto de software</b> por tanto se dedica a las disciplinas de Requisitos, Análisis y Diseño, Implementación y extraordinariamente en la última iteración realizará Tests e Integración. Como se comentó previamente, invertirá las horas restantes que tenga en cada iteración en tareas de <b>gestión</b>.

El <b>desarrollador senior</b>, dedica todas sus horas a las siguientes disciplinas de los casos de uso: Requisitos, Análisis y Diseño, Implementación, Test e Integración y Despliegue. 

Finalmente el <b>desarrollador junior</b>, dedica sus horas a las siguientes disciplinas de los casos de uso: Implementación, Test e Integración y Despliegue.

A continuación se muestra la distribución de horas que se ha seguido en las disciplinas de los casos de uso para cada uno de los <b>roles</b>, exceptuando el jefe de proyecto:


Datos:

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/23.png"/>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/24.png"/>

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/25.png"/>

Gráficos:


De esta forma, las <b>horas máximas</b> que se han dedicado al proyecto respecto de las que se <b>disponen</b> en primer lugar son las siguientes:

<img src="https://github.com/UniExtremadura/proyecto-gps-asee-2022-23-ga04/blob/main/img/31.png"/>

Con estos datos, se puede comprobar el **rendimiento** que se ha tenido por cada iteración:
Se puede apreciar que existe un descenso en el trabajo realizado en la octava y novena iteración, esto es debido a que estas iteraciones corresponden a las tareas de Test e Integración y despliegue, que no puede realizar el Arquitecto del Software.
A continuación, se muestra una gráfica de coste de los recursos de la planificación:

####  Camino Crítico
Por último, dentro del análisis de la planificación nos encontramos ante el camino crítico. Este nos informará si hay algún punto crítico dentro del proyecto  ya sea por culpa de horas mal planificadas o sobrecarga de trabajo.

Como se puede ver en estas dos fotos anteriores, hay zonas críticas debido a las horas, algunas acciones empiezan y acaban el mismo día (Business Modeling) la cual es predecesora de las disciplinas de los casos de usos.

