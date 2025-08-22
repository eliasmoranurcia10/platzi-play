# 01-¿Qué es Spring y por qué es tan popular?

Creado: 6 de agosto de 2025 23:04
ítem principal: 01-INTRODUCCIÓN A SPRING BOOT (https://www.notion.so/01-INTRODUCCI-N-A-SPRING-BOOT-248f5b42f77080fc87b5eb31d84c2f3f?pvs=21)

El framework Java Spring ha revolucionado la forma en que creamos aplicaciones backend, convirtiéndose en el estándar de la industria por excelentes razones. Con su enfoque moderno y eficiente, Spring permite a los desarrolladores construir servicios robustos y APIs escalables mientras mantiene la esencia que ha hecho grande a Java: su confiabilidad y capacidad para manejar entornos de alta demanda. Descubre por qué tantos profesionales confían en Spring para sus proyectos más exigentes.

## **¿Por qué Spring se ha convertido en el framework más popular de Java?**

Spring se ha posicionado como el framework predilecto en el ecosistema Java gracias a su capacidad para **simplificar el desarrollo backend** sin sacrificar potencia. Su popularidad radica en varios factores clave:

- **Desarrollo ágil y limpio**: Permite escribir menos código centrándose en lo que realmente importa.
- **Robustez inherente**: Mantiene las características de confiabilidad que han hecho de Java un lenguaje empresarial por excelencia.
- **Escalabilidad probada**: Funciona eficientemente en entornos de alto rendimiento y demanda.
- **Aplicaciones autocontenidas**: Las aplicaciones SpringBoot se configuran, ejecutan y despliegan por sí mismas.

Esta combinación de factores ha llevado a que **7 de cada 10 desarrolladores backend de Java** utilicen SpringBoot en sus proyectos. No es una tendencia pasajera, sino que se ha establecido como un estándar de facto en la industria.

### ¿Qué empresas de clase mundial confían en Spring?

El poder y la eficiencia de Spring se refleja en su adopción por gigantes tecnológicos que manejan cargas de trabajo extraordinarias:

- **Netflix**: Utiliza Spring para gestionar su infraestructura de streaming.
- **Amazon**: Implementa servicios Spring en partes críticas de su ecosistema.
- **Spotify**: Confía en Spring para procesar millones de peticiones diarias de streaming musical.

Estas empresas, junto con muchas otras, utilizan Spring para construir **sistemas capaces de procesar millones de peticiones diarias**, demostrando su capacidad para operar a escala masiva sin comprometer el rendimiento.

### ¿Cómo ha transformado Spring el desarrollo backend?

Spring y SpringBoot no solo han cambiado cómo escribimos código en Java, sino que han **transformado fundamentalmente la forma en que conceptualizamos el desarrollo backend**. Este cambio de paradigma incluye:

- **Enfoque en la productividad**: Menos tiempo configurando, más tiempo resolviendo problemas de negocio.
- **Arquitectura moderna**: Facilita la implementación de microservicios y arquitecturas distribuidas.
- **Integración simplificada**: Conexión sencilla con bases de datos, servicios externos y otras tecnologías.
- **Despliegue simplificado**: Las aplicaciones SpringBoot contienen todo lo necesario para ejecutarse, incluido el servidor web.

Este enfoque ha revolucionado el desarrollo en Java, permitiendo crear soluciones modernas que responden a las necesidades actuales del mercado.

## **¿Qué aprenderás en este curso de Spring?**

A lo largo de este curso, aprenderás a construir una API completa en Java utilizando Spring, siguiendo un enfoque práctico y profesional. El recorrido incluirá:

- Construcción paso a paso de una API limpia y robusta
- Implementación de buenas prácticas de desarrollo
- Integración de inteligencia artificial como herramienta de apoyo
- Preparación del proyecto para entornos de producción reales

El objetivo no es simplemente enseñar un framework, sino **desarrollar habilidades para crear backends con propósito, fundamento y calidad**. Este enfoque práctico te permitirá comprender los conceptos esenciales mientras construyes soluciones que funcionan en escenarios del mundo real.

Spring ha transformado el panorama de desarrollo en Java, ofreciendo una combinación perfecta de agilidad y robustez que ha cautivado tanto a desarrolladores individuales como a grandes corporaciones. Si buscas dominar una tecnología con alta demanda en el mercado y capacidad para construir soluciones escalables, este curso te dará las bases para empezar tu camino. ¿Ya utilizas Spring en tus proyectos o será tu primera experiencia con este poderoso framework? ¡Comparte tu experiencia en los comentarios!


# 02-Configuración inicial de proyecto Spring Boot con Java 21

Creado: 11 de agosto de 2025 23:53
ítem principal: 01-INTRODUCCIÓN A SPRING BOOT (https://www.notion.so/01-INTRODUCCI-N-A-SPRING-BOOT-248f5b42f77080fc87b5eb31d84c2f3f?pvs=21)

Comenzar a construir una API robusta y moderna en Java es más sencillo hoy gracias a herramientas como Spring Boot e IntelliJ IDEA. Aquí aprenderás a crear paso a paso tu base de proyecto empleando tecnologías actualizadas, asegurando así un entorno de desarrollo óptimo y productivo para servicios RESTful.

## **¿Qué necesitas para iniciar con Spring Boot y cómo preparar el entorno?**

Antes de iniciar, asegúrate de tener **conocimientos previos en Java** y de contar con el **JDK versión 21** instalado en tu equipo. Si aún no lo tienes, IntelliJ IDEA te permite descargarlo e instalarlo fácilmente desde el propio editor. IntelliJ IDEA de JetBrains es reconocido por su soporte completo para Java y sus herramientas impulsadas por inteligencia artificial para mejorar la experiencia de desarrollo.

Para probar tu API, necesitarás el navegador y **Postman**, ideal para pruebas avanzadas de servicios. Además, utilizarás **Docker** para levantar una instancia de **PostgreSQL** para la base de datos. Si ya tienes PostgreSQL instalado, puedes usar tu propia configuración sin complicaciones.

## **¿Cómo crear un nuevo proyecto Spring Boot paso a paso?**

- Dirígete a *start.spring.io*, la plataforma oficial Spring Initializer.
- Elige la configuración sugerida: **proyecto Gradle, lenguaje Java, versión 3.5.3 de Spring Boot**.
- Establece el grupo como `com.platzi` y el artefacto como `Platzi Play`.
- Especifica que el objetivo del proyecto es una plataforma de gestión de películas donde podrás consultar, actualizar y agregar títulos.
- Usa `com.platzi.play` como nombre de paquete y selecciona el empaquetado **JAR** para aprovechar el servidor embebido.
- Selecciona la dependencia **Spring Web** para crear servicios RESTful apoyados por Spring MVC y el servidor embebido Apache Tomcat.

Explora la estructura que generará la herramienta, incluyendo el archivo `build.gradle` y la carpeta `src` para tu código fuente. Haz clic en **Generar** para descargar el archivo `.zip` y descomprímelo en una ubicación fácilmente accesible: evita usar la carpeta de descargas para prevenir borrados accidentales.

## **¿Cómo abrir y preparar el proyecto en IntelliJ IDEA?**

Abre IntelliJ IDEA y selecciona **Open** para cargar la carpeta descomprimida del proyecto. Al ubicar el archivo `build.gradle`, elige abrirlo como proyecto, lo que permitirá gestionar automáticamente todas las dependencias.

Verifica que el proyecto esté corriendo con Java 21 desde los ajustes del módulo (Open Module Settings) en el SDK. Dentro del paquete `com.platzi.play`, encontrarás la clase `PlatziPlayApplication` con el método principal *main*, encargado de iniciar la aplicación Java.

Ejecuta tu aplicación desde IntelliJ; verás en la consola que el servicio Tomcat inicia rápidamente y la aplicación está disponible en el puerto 8080. Al ingresar a *localhost:8080* desde el navegador, verás un mensaje de error 404, lo cual indica que tu servidor responde correctamente, aunque aún no hay endpoints activos.

Este entorno autocontenido hace innecesarias configuraciones complejas o la instalación en servidores externos, agilizando la puesta en marcha de APIs modernas en Java. ¿Quieres compartir tu experiencia inicial configurando Spring Boot o tienes dudas sobre algún paso? ¡Tu comentario es bienvenido para fortalecer la comunidad de desarrolladores!


# 03-Crear un endpoint REST con Spring Boot e integrarlo con IA usando LangChain4j

Creado: 12 de agosto de 2025 9:39
ítem principal: 01-INTRODUCCIÓN A SPRING BOOT (https://www.notion.so/01-INTRODUCCI-N-A-SPRING-BOOT-248f5b42f77080fc87b5eb31d84c2f3f?pvs=21)

Domina cómo **crear un endpoint REST en Java con Spring Boot** y **potenciarlo rápidamente con inteligencia artificial utilizando LangChain4j**. Aquí exploramos paso a paso cómo lograr que tu aplicación responda a peticiones y, además, integre respuestas impulsadas por IA usando OpenAI, todo dentro de un entorno organizado y moderno como IntelliJ IDEA.

## **¿Cómo crear un endpoint REST en Java con Spring Boot?**

Primero, asegúrate de tener tu proyecto cargado y corriendo en IntelliJ IDEA; si puedes ver una respuesta desde el navegador, vas por buen camino.

- Debes crear una nueva clase llamada `HelloController` dentro del paquete `com.platzi.play`.
- Anota la clase con `@RestController`, lo que le indica a Spring Boot que aceptará y gestionará peticiones HTTP.
- Agrega un método que retorne, por ejemplo, *Hello world*. Usa la anotación `@GetMapping` para especificar que este método responderá a peticiones GET.
- Si accedes desde el navegador al endpoint raíz, obtendrás la respuesta definida, por ejemplo: “Hola mundo, Hello world”.

Así queda tu primer endpoint operativo en un proyecto Java con Spring Boot.

## **¿Cómo integrar inteligencia artificial a un proyecto Spring Boot con LangChain4j?**

El siguiente paso es **sumar inteligencia artificial a tu proyecto**. Para esto, sigue estos puntos:

- Usa la librería `LangChain4j`, especialmente diseñada para conectar APIs de inteligencia artificial con tus servicios Java.
- Busca la documentación oficial de LangChain4j y agrega sus dependencias en el archivo `build.gradle`. Incluye las dependencias para OpenAI y Spring Boot usando la versión 1.0.0-beta1, que permite el uso de una demo API key gratuita.

    ```groovy
    // https://docs.langchain4j.dev/tutorials/spring-boot-integration
        implementation 'dev.langchain4j:langchain4j-open-ai-spring-boot-starter:1.3.0-beta9'
        implementation 'dev.langchain4j:langchain4j-spring-boot-starter:1.3.0-beta9'
    ```

- Refresca el proyecto Gradle para descargar e instalar las dependencias.
- En el archivo `application.properties` dentro de la carpeta Resources, configura los parámetros necesarios para LangChain4j:

    ```
    langchain4j.open-ai.chat-model.api-key=demo
    langchain4j.open-ai.chat-model.model-name=gpt-4o-mini
    langchain4j.open-ai.chat-model.base-url=http://langchain4j.dev/demo/openai/v1
    ```


Esto habilita a tu aplicación para procesar solicitudes de IA fácilmente.

## **¿Cómo crear y consumir un servicio de inteligencia artificial personalizado en Spring Boot?**

- Crea una nueva **interface** llamada `PlatziPlayAIService`.
- Anótala con `@AIServices` para indicar que será usada como servicio de IA.
- En la interface, añade un método llamado `generateGreeting` anotado con `@UserMessage`. Usa triple comilla para definir el prompt: pide un saludo de bienvenida, con menos de 120 caracteres y el estilo de Platzi.

    ```java
    @AiService
    public interface PlatziPlayAiService {
    
        @UserMessage(
                "Genera un saludo a la plataforma de Gestión de Películas PlatziPlay.Usa menos de 120 caracteres y hazlo con el estilo de Platzi"
        )
        String generateGreeting();
    }
    ```

- Llegó el momento de integrar este servicio al `HelloController`. Decláralo como `final`, agréga una instancia en el constructor para permitir la inyección por Spring.
- Modifica el endpoint para que retorne la respuesta de `generateGreeting()` en vez de *Hello world*.

    ```java
    @RestController
    public class HelloController {
        @Autowired
        public final PlatziPlayAiService aiService;
    
        public HelloController(PlatziPlayAiService aiService) {
            this.aiService = aiService;
        }
    
        @GetMapping("/")
        public String hello() {
            return this.aiService.generateGreeting();
        }
    }
    ```

- Relanza la aplicación, accede al endpoint y visualiza un saludo personalizado generado por OpenAI; cada petición puede recibir un mensaje diferente.

¿Te imaginas otros casos de uso para esta integración? ¿Qué otras funciones de IA podrías probar con LangChain4j? Comparte tus ideas en los comentarios y sigue explorando el potencial de estas herramientas.


# 04-Configuración de application.properties y perfiles en Spring Boot

Creado: 12 de agosto de 2025 14:25
ítem principal: 01-INTRODUCCIÓN A SPRING BOOT (https://www.notion.so/01-INTRODUCCI-N-A-SPRING-BOOT-248f5b42f77080fc87b5eb31d84c2f3f?pvs=21)

Configurar correctamente el archivo *application.properties* es esencial para personalizar y controlar el comportamiento de una aplicación Spring Boot. Aquí aprenderás cómo gestionar distintos entornos, definir variables clave y sacar el máximo provecho a los perfiles en tus proyectos.

## **¿Cómo se utilizan application.properties y perfiles en Spring para configurar la aplicación?**

El archivo *application.properties* **centraliza la configuración en una app Spring Boot.** Permite establecer desde el *API key* y el modelo usado con librerías como LangChain4j, hasta aspectos cruciales como el puerto del servidor o el contexto de la URL.

- Puedes definir parámetros como `server.port` para cambiar el puerto (por ejemplo, a 8090).
- Para cambiar el contexto raíz, se usa `server.servlet.contextPath` (e.g., `/platzi-play/api`).
- Los cambios se reflejan tras reiniciar la aplicación, afectando cómo y dónde responde tu API.

    ```
    # Perfil por defecto que tiene que usar cuando se lance la aplicacion
    spring.profiles.active=dev
    
    # Nombre y la ruta de contexto de la aplicacion
    spring.application.name=Cinema TV First
    server.servlet.context-path=/platzi-play/api
    
    # LangChain4j
    langchain4j.open-ai.chat-model.model-name=gpt-4o-mini
    ```


## **¿Qué ventajas ofrecen los diferentes archivos de propiedades para cada entorno?**

Spring permite tener múltiples archivos de configuración según ambiente: desarrollo, pruebas o producción. Esto se gestiona creando archivos como `application-dev.properties` o `application-prod.properties` dentro del directorio *resources*.

- Cada archivo puede contener variables específicas solo para ese entorno.
- El archivo principal (`application.properties`) mantiene las configuraciones generales.
- Se activa un perfil con la propiedad `spring.profiles.active`, por ejemplo, `dev` o `prod`, para que Spring use ese archivo.

    ```
    # Perfil por defecto que tiene que usar cuando se lance la aplicacion
    spring.profiles.active=dev
    ```

- Así puedes, por ejemplo, habilitar logs detallados solo en desarrollo y desactivarlos en producción.

## **¿Cómo se acceden y utilizan las variables de configuración en el código Spring?**

Las variables en *application.properties* pueden ser utilizadas directamente en el código de la aplicación a través de la anotación `@Value`.

- Por ejemplo, puedes inyectar el nombre de la aplicación usando `@Value("${spring.application.name}")` en el constructor de tu controlador.

    ```java
    @RestController
    public class HelloController {
    		// Inyección de la variable que contendrá el nombre de la aplicación
    		// Ubicado en *application.properties*
        private final String plataform;
        public final PlatziPlayAiService aiService;
    
        public HelloController(
    				    // Inyección del nombre de la aplicación
                @Value("${spring.application.name}") String plataform,
                PlatziPlayAiService aiService
        ) {
            this.plataform = plataform;
            this.aiService = aiService;
        }
    
        @GetMapping("/")
        public String hello() {
    		    // La variable es tomada como parámetro
            return this.aiService.generateGreeting(plataform);
        }
    }
    ```

- Así se evita "quemar" valores en el código y permite una gestión centralizada y flexible.

    ```java
    @AiService
    public interface PlatziPlayAiService {
    		// la variable es utilizada mediante 2 llaves {{parametro}}
        @UserMessage(
                "Genera un saludo a la plataforma de Gestión de Películas {{plataform}}.Usa menos de 120 caracteres y hazlo con el estilo de Platzi"
        )
        String generateGreeting(@V("plataform") String plataform);
    }
    ```

- Cambios en las variables del properties se reflejan al reiniciar la app, mostrando los resultados, por ejemplo, en las respuestas de la API.




## **¿Cómo se configuran logs y otros parámetros específicos según el entorno?**

- En el archivo `application-dev.properties` puedes agregar parámetros para mostrar logs de request y response, permitiendo ver internamente cómo opera una librería como LangChain4j.

    ```
    # Puerto de Ambiente de desarrollo
    server.port=8090
    
    # LangChain4j
    langchain4j.open-ai.chat-model.api-key=demo
    langchain4j.open-ai.chat-model.base-url=http://langchain4j.dev/demo/openai/v1
    
    # logs de reguests y response
    langchain4j.open-ai.chat-model.log-requests=true
    langchain4j.open-ai.chat-model.log-responses=true
    
    # Mirar lo que realiza LangChain4j
    logging.level.dev.langchain4j=DEBUG
    logging.level.dev.openai4j=DEBUG
    ```

- En producción, se recomienda minimizar los logs para evitar exponer información sensible o saturar la consola.

    ```
    # Puerto de Ambiente de desarrollo
    server.port=8080
    
    # LangChain4j
    langchain4j.open-ai.chat-model.api-key=demo
    langchain4j.open-ai.chat-model.base-url=http://langchain4j.dev/demo/openai/v1
    ```

- Cada entorno puede personalizar el nivel de logueo y otros detalles de configuración según sea necesario.

¿Has explorado ya la documentación oficial de Spring sobre propiedades de configuración? Comparte tu experiencia o pregunta sobre situaciones específicas que hayas enfrentado usando perfiles y properties en tus proyectos.



# 05-Arquitectura por capas orientada al dominio en Java

Creado: 12 de agosto de 2025 16:01
ítem principal: 01-INTRODUCCIÓN A SPRING BOOT (https://www.notion.so/01-INTRODUCCI-N-A-SPRING-BOOT-248f5b42f77080fc87b5eb31d84c2f3f?pvs=21)

Organizar correctamente un proyecto desde el inicio es crucial para asegurar la claridad, el mantenimiento y la escalabilidad de cualquier aplicación en crecimiento. En este material aprenderás paso a paso cómo establecer una estructura por capas, orientada al dominio, que mejora la responsabilidad y visibilidad del código en aplicaciones modernas.

## **¿Qué es una arquitectura de proyecto por capas y orientada al dominio?**

Una **arquitectura por capas** **divide la aplicación en distintas áreas de responsabilidad**. Esto facilita tanto la legibilidad como el crecimiento del sistema. La **orientación al dominio** significa que el núcleo de la aplicación estará claramente definido, separando la lógica de negocio de otros componentes.

### ¿Cuáles son los paquetes principales y su función en esta organización?

- **Dominio (domain):** Aquí se sitúa todo el núcleo (core) de la aplicación. Contiene reglas y servicios de negocio esenciales.
- Dentro del dominio, se recomienda crear a su vez un subpaquete `domain.service` para las interfaces de servicios, como `PlatziAIService`.
- **Web:** En este paquete se encuentra la capa encargada de recibir y procesar solicitudes externas, generalmente controladores.
- Es útil agregar un subpaquete `web.controller` para concentrar todos los controladores del proyecto, por ejemplo, la clase `HelloController`.
- **Persistence:** Aquí estará toda la comunicación con la base de datos, manejando el acceso y la persistencia de datos. Es común crear este paquete aunque inicialmente se encuentre vacío.

### ¿Cómo organizar las clases y archivos existentes según esta estructura?

1. **Mover los controladores:** Ubica las clases controladoras, como `HelloController`, dentro del subpaquete `web.controller`.
2. **Organizar servicios de dominio:** Arrastra las interfaces y servicios relevantes al subpaquete `domain.service`.
3. **Actualizar imports automáticamente:** IDEs como IntelliJ ayudan a modificar los imports y referencias de paquetes cuando se reorganizan archivos.
4. **Mantener la clase ejecutora:** La clase principal, como `PlatziPlay`, debe quedar en la raíz del paquete base, ya que es responsable de lanzar la aplicación.

## **¿Qué ventajas tiene esta estructura al trabajar en equipo o en proyectos grandes?**

- **Separación clara de responsabilidades** ayuda a que múltiples desarrolladores trabajen en paralelo sin interferir entre sí.
- **Mejor mantenimiento y legibilidad**, facilitando encontrar y modificar componentes específicos.
- **Facilidad para escalar**, ya que la organización permite agregar nuevas funcionalidades o modificar las existentes con menor riesgo de errores.

## **¿Cómo practicar y validar que la estructura funciona correctamente?**

Una vez realizado el cambio de estructura: - Modifica las rutas para que los controladores respondan en los endpoints deseados, como `/hello` en vez de la raíz (`/`). - Lanza la aplicación y prueba en el navegador la nueva ruta para verificar el correcto funcionamiento.

## **¿Por qué elegir esta arquitectura versus otras?**

No existe un único tipo de arquitectura "correcta" para todos los contextos. La elección depende del tipo de aplicación, el equipo, la infraestructura y necesidades específicas. La arquitectura por capas orientada al dominio, sin embargo, es ampliamente aceptada por su claridad y eficacia en aplicaciones medianas o grandes.

Ahora que tu proyecto tiene una base estructural sólida, el siguiente paso será conectar tu aplicación a una base de datos usando Docker y Postgres. Si te interesa profundizar más, también existen cursos especializados sobre arquitecturas en la misma plataforma. ¿Te gustaría compartir cómo estructuras tus proyectos o cuáles paquetes consideras imprescindibles?



# 06-Conexión de Spring Boot con PostgreSQL usando Docker

Creado: 14 de agosto de 2025 10:00
ítem principal: 01-INTRODUCCIÓN A SPRING BOOT (https://www.notion.so/01-INTRODUCCI-N-A-SPRING-BOOT-248f5b42f77080fc87b5eb31d84c2f3f?pvs=21)

¿Quieres aprender cómo integrar **Spring Boot** con **PostgreSQL** de forma eficiente? Aquí exploramos cómo conectar tu API de Spring Boot a una base de datos moderna usando *Docker*, siguiendo prácticas estándar en la industria. Este proceso te permitirá manejar bases de datos de manera fácil, rápida y sin complicaciones de instalación manual.

## **¿Cómo utilizar Docker para bases de datos en desarrollo Spring Boot?**

Docker es una herramienta que ejecuta aplicaciones en **contenedores**. Estos entornos son livianos, portables y garantizan que todo funcione igual en cualquier máquina. Al usar Docker, puedes iniciar una base PostgreSQL "limpia" dentro de un contenedor, facilitando su administración y, cuando sea necesario, eliminarla sin afectar el resto de tu sistema.

- **Asegúrate de tener Docker o Docker Desktop instalado.**
- Si ya tienes PostgreSQL local, puedes conectarte sin contenedor; los pasos son similares, solo omitiendo Docker.

## **¿Qué dependencias debes agregar a tu proyecto para conectar Spring Boot y PostgreSQL?**

En *start.spring.io* (Spring Initializr), busca y añade estas dependencias esenciales:

- **Spring Data JPA:** Para acceder y manipular tus datos fácilmente.
- **Driver de PostgreSQL:** Hace posible la conexión entre tu aplicación y la base de datos.
- **Docker Compose:** Disponible desde Spring Boot 3.1, detecta y gestiona automáticamente los contenedores necesarios en desarrollo.

Agrega estas dependencias en tu archivo `build.gradle`. Recuerda refrescar Gradle para que descargue todos los paquetes y construya el entorno correctamente.

## **¿Cómo configurar Docker Compose para PostgreSQL con persistencia de datos?**

Spring Initializr genera un archivo `compose.yaml` con la configuración básica de la base de datos. Debes ajustarlo para asegurar que los datos persistan entre reinicios y la gestión sea sencilla:

- Usar la propiedad **restart: unless-stopped** para reinicios automáticos solo si el contenedor se apaga por error.
- Mapear correctamente el puerto local (`5432:5432`).
- Definir un **volumen pgdata** en `data/postgres` para que la información no se borre después de cada reinicio.
- Ajustar las variables de entorno, como el nombre de la base de datos, usuario y contraseña.

Al final, importa el volumen para asegurar la persistencia, y verifica que la configuración apunte a la imagen más reciente de PostgreSQL.

```yaml
services:
  postgres:
    image: 'postgres:latest'
    restart: unless-stopped
    environment:
      - 'POSTGRES_DB=platzi_play_db'
      - 'POSTGRES_PASSWORD=root'
      - 'POSTGRES_USER=postgres'
    ports:
      - '5432:5432'
    volumes:
      - pgdata:/data/postgres

volumes:
  pgdata:
```

## **¿Cómo conectar Spring Boot al contenedor de PostgreSQL?**

Ve a `src/main/resources` y configura las propiedades necesarias:

- **spring.datasource.driver-class-name:** `org.postgresql.Driver`
- **spring.datasource.url:** `jdbc:postgresql://localhost:5432/platzi_play_db`
- **spring.datasource.username:** el usuario que configuraste en Docker Compose (por ejemplo, `postgres`).
- **spring.datasource.password:** la contraseña elegida (por ejemplo, `Alejandro.Platzi`).

Guarda estos datos en un archivo de configuración general para que estén disponibles en todo tu entorno de desarrollo.

En [application.properties](http://application.properties) se agrega:

```
# Nombre del driver PostgreSQL
spring.datasource.driver-class-name=org.postgresql.Driver

```

En [application-dev.properties](http://application-dev.properties) se agrega:

```
# Spring Data JPA
spring.datasource.url=jdbc:postgresql://localhost:5432/platzi_play_db
spring.datasource.username=postgres
spring.datasource.password=root
```

## **¿Cómo verificar la conexión y administrar la base de datos?**

1. **Inicia Docker** si aún no está corriendo.
2. **Ejecuta tu aplicación Spring Boot:** detectará que el contenedor de PostgreSQL está listo y se conectará automáticamente. Si es la primera vez, descargará la imagen; las siguientes veces será mucho más rápido.
3. **Supervisa el contenedor** en Docker; deberías ver un contenedor con el nombre asignado (por ejemplo, `Platzi play`).

Para administrar la base:

- Puedes usar programas como **DataGrip**, **PgAdmin** o cualquier otro cliente de PostgreSQL.
- Crea un nuevo *data source* usando la URL, usuario y contraseña que configuraste.
- Prueba la conexión desde tu programa para confirmar que todo está en orden.

Cuando la conexión es exitosa, tu base de datos estará lista para su uso, aunque inicialmente no tenga tablas; eso se realizará en los siguientes pasos del desarrollo.

## **¿Qué sigue después de la integración?**

Con la base ya conectada, el siguiente paso será crear una **entity** en tu proyecto. Al hacerlo, Spring Boot generará automáticamente la tabla correspondiente en la base de datos, permitiendo trabajar con datos reales y persistentes. ¿Ya probaste tu integración? Cuéntanos tu experiencia en los comentarios.



# 07-Crear entidad con anotaciones JPA para tabla de base de datos

Creado: 14 de agosto de 2025 16:51
ítem principal: 01-INTRODUCCIÓN A SPRING BOOT (https://www.notion.so/01-INTRODUCCI-N-A-SPRING-BOOT-248f5b42f77080fc87b5eb31d84c2f3f?pvs=21)

En el desarrollo de aplicaciones Java con acceso a bases de datos, entender cómo se construye una entidad (*entity*) y se conecta a una tabla es esencial para un código limpio y mantenible. Gracias a las anotaciones de JPA presentes en Spring Data JPA, el proceso resulta directo y muy flexible. A continuación se resume cómo definir una entidad desde cero, estableciendo el puente entre el modelo de tu aplicación y la base de datos bajo mejores prácticas y tips reales del entorno profesional.

## **¿Qué es una entidad en Java y cómo se asocia con una tabla?**

Una **entidad** representa una tabla de la base de datos, mientras que los atributos de la clase corresponden a columnas. Utilizando las anotaciones de JPA, se define:

- Con `@Entity` se marca la clase para que JPA la reconozca.
- Con `@Table(name = "nombre_tabla")` se especifica el nombre exacto de la tabla.

Esto facilita que el código refleje fielmente la estructura de la base de datos, incluso cuando el nombre de las columnas esté en español o provenga de esquemas heredados.

## **¿Cómo se estructura y anota una clase entidad en un proyecto Java?**

El primer paso es crear un paquete `entity` dentro de tu carpeta de persistencia y una clase, por ejemplo, *MovieEntity*. Se agregan atributos que coinciden con las columnas esperadas:

- `private Long id;` como identificador primario.
- `private String título;` para el nombre de la película.
- `private Integer duración;` de la película, permitiendo nulos si es necesario.
- `private String género;` con longitud máxima configurada.
- `private LocalDate fechaEstreno;` para almacenar día, mes y año.
- `private BigDecimal clasificación;` respetando precisión y escala para decimales.
- `private String estado;` para indicar disponibilidad: D/N.

Mediante anotaciones de columna (`@Column`) se establecen restricciones y características:

- `nullable = false` asegura que el campo no sea nulo.
- `length` o `precision` y `scale` limitan la cantidad de caracteres o decimales.
- `unique = true` garantiza unicidad en valores clave como el título.

La clave primaria se marca como `@Id` y se genera automáticamente usando `@GeneratedValue(strategy = GenerationType.IDENTITY)`, lo que asegura que el identificador no se repita.

Los *getters* y *setters* se pueden generar automáticamente (o con la librería *Lombok* para mayor simpleza), permitiendo manipular los datos de manera segura y práctica.

```java
@Getter
@Setter
@Entity
@Table(name = "platzi_play_peliculas")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150, unique = true)
    private String titulo;

    // precision = 3 -> numero de maximo 3 caracteres
    @Column(nullable = false, precision = 3)
    private Integer duracion;

    @Column(nullable = false, length = 40)
    private String genero;

    @Column(name = "fecha_estreno")
    private LocalDate fechaEstreno;

    // precision = 3 -> numero de maximo 3 caracteres, scale = 2 -> maximo 2 decimales
    @Column(precision = 3, scale = 2)
    private BigDecimal clasificacion;

    @Column(nullable = false, length = 1)
    private String estado;
    
}
```

## **¿Cómo se crea y sincroniza la tabla desde la configuración de Spring?**

Si la tabla aún no existe en la base de datos, Spring puede crearla automáticamente para fines de desarrollo y pruebas. En el archivo `application-dev.properties`, se agregan las siguientes configuraciones:

- `spring.jpa.hibernate.ddl-auto=update`: actualiza el esquema según sea necesario.
- `spring.jpa.show-sql=true`: muestra en consola las operaciones SQL que ejecuta la aplicación.
- `spring.jpa.properties.hibernate.format_sql=true`: formatea el SQL para facilitar la lectura.

Al reiniciar la aplicación, Spring detecta si la tabla está ausente y la crea junto con las restricciones definidas. Si ya existe, no realiza cambios adicionales. Puedes verificar la creación y contenido usando herramientas visuales de base de datos o ejecutando un *select* sobre la tabla.

En [aplication-dev.properties](http://aplication-dev.properties) :

```
# Crear una tabla en la base de datos según sea necesario
spring.jpa.hibernate.ddl-auto=update
# Muestra en consola lo que esta haciendo con la base de datos
spring.jpa.show-sql=true
# Colocar formato a los resultados
spring.jpa.properties.hibernate.format_sql=true
```

## **¿Qué sigue después de definir una entidad básica en Java?**

Tras vincular entidad y tabla, el siguiente paso es implementar funcionalidades CRUD (crear, leer, actualizar, borrar) utilizando repositorios de Spring. Esto permite manejar los registros mediante operaciones encapsuladas y seguras sin necesidad de escribir consultas SQL complejas. ¡Explora más para gestionar relaciones entre entidades y aprovechar otras anotaciones de JPA!


# 08-Repositorios CRUD con Spring Data sin escribir SQL

Creado: 14 de agosto de 2025 22:58
ítem principal: 02-PERSISTENCIA CON SPRING DATA Y MODELADO DE DATOS (https://www.notion.so/02-PERSISTENCIA-CON-SPRING-DATA-Y-MODELADO-DE-DATOS-248f5b42f77080d2ab73ea6269bffed0?pvs=21)

Trabajar con bases de datos en Java es mucho más eficiente gracias a **Spring Data y sus repositorios**. En este material, aprenderás cómo implementar operaciones CRUD completas sin escribir SQL manualmente, junto con la forma recomendada de cargar datos de prueba usando Spring.

## **¿Cómo se configuran los repositorios para CRUD en Spring Data?**

**Spring Data permite implementar operaciones CRUD extendiendo una interfaz llamada `CrudRepository`.** Solo necesitas indicar el nombre de la *entity* y el tipo de su clave primaria. Por ejemplo, utilizar `CrudRepository<MovieEntity, Long>` te da acceso a los métodos esenciales para manipular registros.

- Puedes crear, leer, actualizar y eliminar datos desde Java directamente.
- Spring automáticamente genera e implementa todos los métodos estándar de CRUD.
- No es necesario programar consultas SQL para operaciones sencillas.

La extensión adecuada del repositorio conserva tus *entities* ordenadas dentro de paquetes, siguiendo la estructura que recomienda Spring para proyectos escalables.

persistence > crud > CrudMovieEntity

```java
public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
}
```

## **¿Qué operaciones CRUD están disponibles en el repositorio?**

Al extender de `CrudRepository`, obtienes acceso inmediato a métodos útiles como:

- Guardar un registro o una lista completa.
- Buscar por clave primaria.
- Verificar la existencia de un registro por su ID.
- Obtener todos los registros almacenados.
- Encontrar varios registros por una lista de IDs.
- Contar los registros guardados en la tabla.
- Eliminar por ID o por la entidad completa.

Esto facilita el manejo de datos y permite enfocarse en la lógica de negocio sin distraerse escribiendo SQL.

## **¿Cómo se cargan datos iniciales con Data.sql en Spring?**

Para trabajar con ejemplos reales desde el principio, es recomendable **cargar datos de prueba con un archivo `data.sql`**:

- El archivo debe ubicarse en la raíz de la carpeta `Resources` y llamarse exactamente `data.sql` para que Spring lo reconozca.
- Utiliza sentencias `insert into` para agregar registros; se recomienda utilizar `on conflict do nothing` para evitar errores por duplicados.
- Si alguna columna o atributo está mal escrita en el archivo o la entidad, se mostrará un error al arrancar la aplicación. Revisa los nombres cuidadosamente.

    ```sql
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Shrek', 90, 'ANIMADA', NULL, '2024-06-01', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Inception', 148, 'CIENCIA_FICCION', NULL, '2010-07-16', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Titanic', 195, 'DRAMA', 4.6, '1997-12-19', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('John Wick', 101, 'ACCION', NULL, '2014-10-24', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('El Conjuro', 112, 'TERROR', 3.0, '2013-07-19', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Coco', 105, 'ANIMADA', 4.7, '2017-10-27', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Interstellar', 169, 'CIENCIA_FICCION', 5.0, '2014-11-07', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Joker', 122, 'DRAMA', NULL, '2019-10-04', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Toy Story', 81, 'ANIMADA', 4.5, '1995-11-22', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    
    INSERT INTO platzi_play_peliculas (titulo, duracion, genero, clasificacion, fecha_estreno, estado)
    VALUES ('Avengers: Endgame', 181, 'ACCION', 3.9, '2019-04-26', 'D')
        ON CONFLICT (titulo) DO NOTHING;
    ```


Además, debes agregar la siguiente configuración en el archivo de propiedades para asegurar que los datos siempre se carguen: Se debe agregar al archivo: [application-dev.properties](http://application-dev.properties)

`spring.sql.init.mode=always`

Así, cada vez que inicies tu aplicación, Spring revisa si los datos deben inicializarse, pero gracias a `on conflict do nothing`, no sobrescribe datos ni arroja errores si ya existen.

¿Te animas a practicar con repositorios y cargar tus propios datos iniciales? Cuéntanos cómo vas aplicando estos conceptos o si necesitas orientación al crear tus primeras consultas en Spring Data.



# 09-Creación de endpoints GET en Spring Boot para consultar películas

Creado: 15 de agosto de 2025 14:55
ítem principal: 02-PERSISTENCIA CON SPRING DATA Y MODELADO DE DATOS (https://www.notion.so/02-PERSISTENCIA-CON-SPRING-DATA-Y-MODELADO-DE-DATOS-248f5b42f77080d2ab73ea6269bffed0?pvs=21)

Crear un backend eficiente y moderno implica exponer información de forma sencilla y segura. Una de las tareas más comunes es crear servicios HTTP que permitan consultar datos, guardar registros o eliminar información utilizando métodos como GET, POST o DELETE. Aquí te explicamos, paso a paso, cómo realizar una petición GET para consultar todas las películas almacenadas en tu base de datos usando Spring Boot.

## **¿Cómo crear un endpoint GET en Spring Boot para listar películas?**

Para que tu aplicación pueda mostrar todas las películas, es necesario implementar un **endpoint GET** en un controlador especial. Se recomienda nombrar la clase como *MovieController* dentro del paquete de controladores web. Usa la anotación **@RestController** para indicar que los métodos en esta clase serán expuestos a través de la API.

- Crea un método que regrese una lista del objeto *MovieEntity*.
- El método debe consultar las películas del CRUD creado anteriormente.
- Declara la variable *crudMovieEntity* como final, porque no cambiará tras inicializarse.
- Inicializa *crudMovieEntity* en el **constructor**. Spring Boot se encarga de pasar la dependencia correcta automáticamente.
- Para obtener todas las películas, utiliza el método **findAll** de *crudMovieEntity*. Este retorna un *Iterable*, por lo que se debe convertir (cast) a una *List*.
- Añade la anotación **@GetMapping("/movies")** para que Spring entienda que se trata de una solicitud GET y el recurso será accesible en */movies*.

    ```java
    @RestController
    public class MovieController {
    
        private final CrudMovieEntity crudMovieEntity;
    
        public MovieController(CrudMovieEntity crudMovieEntity) {
            this.crudMovieEntity = crudMovieEntity;
        }
    
        @GetMapping("/movies")
        public List<MovieEntity> getAll() {
            return (List<MovieEntity>) this.crudMovieEntity.findAll();
        }
    }
    ```


## **¿Qué se muestra al consumir el endpoint GET de películas?**

Una vez implementado y reiniciada la aplicación, puedes consumir el servicio desde un navegador web. Al acceder a la ruta */movies*, verás un listado de todas las películas en formato **JSON**, un estándar ampliamente usado para intercambiar información.

Los datos de cada película incluyen: - ID (clave primaria). - Título. - Duración. - Género. - Fecha de estreno. - Clasificación (promedio de calificaciones dentro de la plataforma). - Estado.

Puedes visualizarlo de manera más ordenada usando herramientas que formatean JSON para mayor legibilidad.

## **¿Cómo probar el endpoint GET con Postman y por qué funciona automáticamente?**

Para verificar el correcto funcionamiento del endpoint, puedes usar *Postman*, una herramienta ideal para probar servicios API sin escribir código adicional. Solo necesitas:

1. Crear una petición GET hacia la URL correspondiente (por ejemplo, *localhost:8090/play/api/movies*).
2. Enviar la solicitud y observarás las películas recuperadas, presentadas en un formato claro y visual.
3. Notarás que todo esto ocurre sin haber escrito código específico de conexión a la base de datos ni creado instancias manualmente.

Esto es posible gracias a que Spring Boot gestiona las dependencias y la inyección de objetos automáticamente. Así, tu código permanece limpio y enfocado en la lógica del negocio, sin preocuparte por detalles de infraestructura.



# 10-Inyección de dependencias y contenedor IoC en Spring Boot

Creado: 16 de agosto de 2025 1:16
ítem principal: 03-BUENAS PRÁCTICAS EN DISEÑO DE APIS (https://www.notion.so/03-BUENAS-PR-CTICAS-EN-DISE-O-DE-APIS-248f5b42f77080278ae7d55a6c91df5e?pvs=21)

La **inyección de dependencias** y el **contenedor IoC de Spring** son claves para cualquier desarrollador que busca escribir código limpio, flexible y fácil de probar usando Spring Boot. Entender estos conceptos te permite crear aplicaciones desacopladas, eficientes y alineadas con los principios SOLID.

## **¿Qué es la inyección de dependencias en Spring Boot?**

La inyección de dependencias se basa en un **patrón de diseño donde los objetos que una clase necesita le son proporcionados en vez de ser creados internamente.** Este enfoque reduce el acoplamiento, mejora la cohesión y facilita las pruebas.

- **Facilita la limpieza y flexibilidad del código.**
- **Permite remplazar y probar dependencias con facilidad.**
- *Promueve best practices* y principios como SOLID.

## **¿Cómo funciona el contenedor IoC de Spring?**

El contenedor de **Inversión de Control (IoC)** de Spring se encarga de crear y administrar automáticamente todos los objetos necesarios, llamados *beans*.

- Las clases no generan sus propias dependencias; el contenedor se encarga de ello.
- Spring escanea el proyecto y detecta clases con anotaciones como `@Repository` para acceso a datos, `@Service` para lógica de negocio, `@Controller` y `@RestController` para la exposición web, y `@Component` para componentes genéricos.
- Al detectar estas anotaciones, Spring crea los objetos y gestiona sus dependencias por nosotros.
- Esto mejora la estructura del sistema y facilita mantener un bajo acoplamiento y alta cohesión.

## **¿Cómo se implementa la inyección de dependencias en Spring Boot?**

En el ejemplo del `MovieController`, se utiliza la inyección de dependencias para agregar instancias como `CrudMovieEntity` automáticamente mediante el constructor. Esto significa que no hay necesidad de llamar explícitamente al constructor; basta con la anotación adecuada y Spring hace el resto.

- Puede usarse la anotación `@Autowired` sobre campos, pero se recomienda hacerlo siempre por el constructor.
- Si se usa la anotación `@RestController`, el componente entra de lleno en el contenedor IoC y las dependencias se inyectan automáticamente.
- Declarar las dependencias en el constructor mantiene el código limpio y fácil de entender.

    ```java
    @RestController
    public class MovieController {
    		@Autowired
        private CrudMovieEntity crudMovieEntity;
    
        @GetMapping("/movies")
        public List<MovieEntity> getAll() {
            return (List<MovieEntity>) this.crudMovieEntity.findAll();
        }
    }
    ```


## **¿Qué buenas prácticas destacan al usar dependencias en Spring Boot?**

- **Inyectar siempre por el constructor,** evitando la inyección por campos, ya que el primero es el método recomendado y más limpio.
- Borrar los imports innecesarios y mantener la configuración mínima, dejando que Spring gestione automáticamente las dependencias.
- No acceder directamente al `CrudRepository` desde el controlador, pues, aunque funciona, no es la mejor práctica.
- El patrón *data mapper* es una opción para separar el acceso a datos y orientar el desarrollo al dominio.

¿Tienes una forma favorita de inyectar dependencias o algún consejo para mantener bajo acoplamiento? ¡Comparte tu experiencia en los comentarios!




# 11-Separación de dominio y persistencia con DTOs en Java

Creado: 16 de agosto de 2025 10:05
ítem principal: 03-BUENAS PRÁCTICAS EN DISEÑO DE APIS (https://www.notion.so/03-BUENAS-PR-CTICAS-EN-DISE-O-DE-APIS-248f5b42f77080278ae7d55a6c91df5e?pvs=21)

Una API robusta, limpia y preparada para cambios necesita una arquitectura sólida. ¿Por qué? Porque un código acoplado a la base de datos limita la evolución y expone detalles que deberían permanecer internos. Aquí exploramos cómo estructurar adecuadamente una API de películas en Java usando buenas prácticas, enfocándonos en la introducción de la capa de dominio y el uso del patrón Data Mapper.

## **¿Cómo afecta el acoplamiento entre controlador y base de datos el diseño de tu API?**

Actualmente, **el controlador llama directamente al CRUD del Movie Entity**, exponiendo la estructura interna de la base de datos. Esto implica varios riesgos:

- **Alto acoplamiento**: cualquier cambio en la base de datos puede romper la API fácilmente.
- **Exposición de datos sensibles o innecesarios**: al no filtrar la salida, pueden aparecer campos indeseados.
- **Mezcla de idiomas**: el endpoint es /movies pero el contenido de la respuesta está en español.

Estos problemas hacen que la API sea **difícil de mantener, frágil y dependiente** de la estructura interna de la base de datos.

## **¿Por qué es clave separar responsabilidades entre capas en una API?**

**Separar responsabilidades** permite que cada parte del sistema cumpla una función clara y focalizada. Dejar fuera la capa de dominio va contra los principios de una buena arquitectura. Con una correcta separación:

- Cada capa conoce solo lo necesario de las demás.
- La evolución de una capa no obliga a reescribir las otras.
- La lógica de dominio es independiente de la infrastructura técnica.

**El patrón Data Mapper** ayuda a lograr esto separando el modelo de dominio de cómo se expone en la API o se almacena en la base de datos.

## **¿Cómo implementar Movie DTO y Movie Repository siguiendo buenas prácticas?**

1. **Definir el Movie DTO (Data Transfer Object):**
2. Se crea dentro del paquete `domain.dto`.
3. Usando *Java record* se obtiene una clase inmutable adecuada para representar los datos expuestos.
4. Ejemplo de atributos:
    - String title (en inglés, consistente con la API)
    - Integer duration
    - String genre
    - LocalDate releaseDate
    - Double rating

    ```java
    public record MovieDto(
            String title,
            Integer duration,
            String genre,
            LocalDate releaseData,
            Double rating
    ) {
    
    }
    ```

5. **Crear la interfaz Movie Repository:**
6. Ubicada dentro del paquete `domain.repository`.
7. Define el método `getAll`, que retorna una lista de MovieDTO.
8. Permite **desacoplar la lógica del acceso a la base de datos**.

    ```java
    public interface MovieRepository {
        List<MovieDto> getAll();
    }
    ```

9. **Implementar Movie Service:**
10. Ubicada en el paquete `service`.
11. Se anota con *@Service* para participación en el ecosistema Spring.
12. Recibe por inyección la interfaz MovieRepository.
13. Expone el método `getAll`, que internamente usa la interfaz y retorna los MovieDTO.

    ```java
    @Service
    public class MovieService {
    
        private final MovieRepository movieRepository;
    
        public MovieService(MovieRepository movieRepository) {
            this.movieRepository = movieRepository;
        }
    
        public List<MovieDto> getAll() {
            return this.movieRepository.getAll();
        }
    }
    ```

14. **Actualizar el Movie Controller:**
15. Ahora inyecta MovieService en vez del CRUD directamente.
16. Expone el endpoint de películas solicitando la lista a MovieService, ya desacoplada del Entity o CRUD.

    ```java
    @RestController
    public class MovieController {
    
        private final MovieService movieService;
    
        public MovieController(MovieService movieService) {
            this.movieService = movieService;
        }
    
        @GetMapping("/movies")
        public List<MovieDto> getAll() {
            return this.movieService.getAll();
        }
    }
    ```


## **¿Qué ventajas aporta esta nueva estructura a tu API?**

- **Reduce la dependencia directa de la base de datos.**
- Los cambios internos (estructura, nombres o tipo de base) no afectan el contrato público de la API.
- **Facilita la evolución y el mantenimiento.**
- Permite cumplir con convenciones internacionales en endpoints y respuestas.

## **¿Qué sigue para perfeccionar la capa de persistencia?**

Aún falta adaptar la capa de persistencia para que devuelva **MovieDTO** en vez de MovieEntity. Además, se mencionó el uso de *map struct* para transformar entre entidades y DTOs y así seguir manteniendo un dominio limpio y desacoplado.

¿Te gustaría saber cómo implementar la conversión entre entidades y DTOs usando map struct? ¡Comparte tus dudas o comenta tu experiencia en proyectos similares!




# 12-Configuración de MapStruct con Spring para convertir entidades a DTO

Creado: 16 de agosto de 2025 14:36
ítem principal: 03-BUENAS PRÁCTICAS EN DISEÑO DE APIS (https://www.notion.so/03-BUENAS-PR-CTICAS-EN-DISE-O-DE-APIS-248f5b42f77080278ae7d55a6c91df5e?pvs=21)

Optimiza el desarrollo en Java usando *Spring* y *Mapstruct* para transformar entidades a DTO de forma sencilla y limpia. Esta guía destaca cómo estructurar código escalable, claro y mantenible en la capa de persistencia de una aplicación basada en Spring.

## **¿Qué problema resuelve Mapstruct al convertir entidades en DTO en Java con Spring?**

Al trabajar en aplicaciones empresariales, suele ser necesario separar las entidades de base de datos (*MovieEntity*) y los objetos de transferencia de datos (*MovieDTO*). Usar Mapstruct permite convertir de forma automática y sin esfuerzo manual entre estos dos tipos, logrando:

- **Desacoplar** la lógica de persistencia de la lógica de dominio y de presentación.
- **Evitar errores** y simplificar el código al eliminar transformaciones manuales.
- Mantener el código limpio y preparado para cambios futuros en el modelo de datos.

## **¿Cómo se configura Mapstruct en un proyecto Spring con Gradle?**

https://mapstruct.org/documentation/installation/

Mapstruct se integra fácilmente añadiendo sus dependencias en el archivo *build.gradle*. Basta agregar la línea de la dependencia principal junto a la del *annotation processor* recomendado para proyectos Gradle. Ordenar y comentar las dependencias es útil para mantener claridad sobre los paquetes incluidos, como se mostró junto a las de *Spring Data JPA*.

```groovy
// MapStruct
    implementation 'org.mapstruct:mapstruct:1.6.3'
    annotationProcessor 'org.mapstruct:mapstruct-processor:1.6.3'
```

## **¿Cómo crear un repositorio que devuelva DTO usando Mapstruct?**

Se crea una clase llamada **MovieEntityRepository** en la raíz de la capa de persistencia. Sus principales pasos:

- Implementa la interfaz *MovieRepository* y anota la clase con `@Repository` para permitir la inyección vía Spring.
- Recibe como dependencia un objeto *CRUD* y el propio *MovieMapper* en el constructor.
- Implementa el método *getAll*, el cual regresa una lista de *MovieDTO*, no de entidades.

    ```java
    @Repository
    public class MovieEntityRepository implements MovieRepository {
    
        private final CrudMovieEntity crudMovieEntity;
        private final MovieMapper movieMapper;
    
        public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
            this.crudMovieEntity = crudMovieEntity;
            this.movieMapper = movieMapper;
        }
    
        @Override
        public List<MovieDto> getAll() {
            return this.movieMapper.toDto(this.crudMovieEntity.findAll());
        }
    }
    ```


## **¿Cómo se define y configura el mapper con Mapstruct?**

Al construir el mapeador personalizado:

- Crear una interfaz *MovieMapper* en el paquete *persistence.mapper*, anotada con `@Mapper(componentModel = "spring")`.
- Definir métodos usando reglas con `@Mapping`, especificando claramente el campo de origen (*source*) y de destino (*target*).
- Por ejemplo:
- source: *título*, target: *title*.
- source: *duración*, target: *duration*.
- y así sucesivamente para género, fecha de estreno y clasificación.
- Para omitir campos innecesarios como *estado* o *ID*, simplemente no se declaran en las reglas.
- El mapper puede aceptar tanto un solo objeto como listas o iterables, lo que flexibiliza el uso en el repositorio.

    ```java
    @Mapper(componentModel = "spring")
    public interface MovieMapper {
        @Mapping(source = "titulo", target = "title")
        @Mapping(source = "duracion", target = "duration")
        @Mapping(source = "genero", target = "genre")
        @Mapping(source = "fechaEstreno", target = "releaseData")
        @Mapping(source = "clasificacion", target = "rating")
        MovieDto toDto(MovieEntity entity);
        List<MovieDto> toDto(Iterable<MovieEntity> entities);
    }
    ```


## **¿Cómo se inyecta y utiliza el mapper en el repositorio?**

El *MovieMapper* se inyecta en el repositorio y se usa directamente en el método *getAll* para convertir la lista que regresa el CRUD, asegurando que se devuelvan DTOs a las capas superiores. Todo el proceso es transparente:

- El método utiliza `this.movieMapper.toDTO` sobre el resultado de `this.crudmoviedentity.findall`.
- El resultado es una respuesta orientada al dominio, fácil de usar en la aplicación o exponer vía API.

    ```java
    @Override
        public List<MovieDto> getAll() {
            return this.movieMapper.toDto(this.crudMovieEntity.findAll());
        }
    ```


## **¿Qué limitaciones tiene Mapstruct y cómo abordarlas?**

Aunque Mapstruct hace muy sencillo el mapeo automático, hay escenarios donde se requiere más control:

- Para tipos de datos no compatibles, como pasar de *Boolean* a *string* o de *string* a *enum*.
- Se recomienda crear conversores personalizados para estos casos, aprovechando la extensibilidad de Mapstruct.

¿Te gustaría compartir cómo configuras tus mapeos o si has enfrentado casos complejos con Mapstruct? Comenta tu experiencia y ayuda a otros a optimizar sus integraciones.



# 13-Creación de conversores personalizados en MapStruct para enums y strings

Creado: 17 de agosto de 2025 19:49
ítem principal: 03-BUENAS PRÁCTICAS EN DISEÑO DE APIS (https://www.notion.so/03-BUENAS-PR-CTICAS-EN-DISE-O-DE-APIS-248f5b42f77080278ae7d55a6c91df5e?pvs=21)

MapStruct potencia la conversión entre objetos en Java, pero en muchos casos los tipos de datos no coinciden exactamente. Dominar la creación de conversores personalizados es clave para asegurar que aplicaciones de backend gestionen correctamente enums, strings y valores booleanos, garantizando así robustez y claridad en el código de mapeo.

## **¿Cómo manejar conversiones personalizadas en MapStruct para enums y strings?**

En situaciones donde los tipos de datos del modelo de dominio y del DTO (Data Transfer Object) difieren, como un string en la base de datos que debe convertirse a un enum en la lógica de dominio, MapStruct requiere métodos de conversión personalizados.

- Se crea un *enum* (por ejemplo, *Genre*) que defina posibles valores: action, comedy, drama, animated, horror, science fiction.
- El DTO ahora utiliza este enum en vez de un string para mayor control y coherencia.

Esto obliga a adaptar el mapeo, pues los valores guardados en el almacenamiento pueden diferir (por ejemplo, “animada” en la base de datos versus “animated” en el enum). El conversor personalizado soluciona esta diferencia.

```java
public enum Genre {
    ACTION,
    COMEDY,
    DRAMA,
    ANIMATED,
    HORROR,
    SCI_FI
}
```

## **¿Cómo implementar un conversor personalizado para string y enum en Java?**

El conversor personalizado consta de dos métodos estáticos. Uno convierte de string a enum, y el otro, de enum a string.

- El método `stringToGenre` recibe el string de la base de datos y retorna el enum correspondiente tomando en cuenta las diferencias de nombres y mayúsculas/minúsculas.
- Utiliza una estructura *switch* y verifica primero si el string recibido es nulo, en cuyo caso devuelve null.
- Cada valor de string se asigna al valor correcto del enum (por ejemplo, "acción" a *action*, "animada" a *animated*).

El método inverso, `genreToString`, sigue la misma lógica:

- Recibe un valor enum y devuelve el string que almacena la base de datos.
- También verifica si el valor es nulo y asigna los textos correctos según el caso.

Ambos métodos deben anotarse con `@Named` de org.mapstruct para que el framework los reconozca y los aplique automáticamente al mapear campos específicos.

```java
public class GenreMapper {

    @Named("stringToGenre")
    public static Genre stringToGenre(String genero) {
        if(genero == null) return null;

        return switch (genero.toUpperCase()) {
            case "ACCION" -> Genre.ACTION;
            case "COMEDIA" -> Genre.COMEDY;
            case "DRAMA" -> Genre.DRAMA;
            case "ANIMADA" -> Genre.ANIMATED;
            case "TERROR" -> Genre.HORROR;
            case "CIENCIA_FICCION" -> Genre.SCI_FI;
            default -> null;
        };
    }

    @Named("genreToString")
    public static String genreToString(Genre genre) {
        if(genre == null) return null;

        return switch (genre) {
            case ACTION -> "ACCION";
            case COMEDY -> "COMEDIA";
            case DRAMA -> "DRAMA";
            case ANIMATED -> "ANIMADA";
            case HORROR -> "TERROR";
            case SCI_FI -> "CIENCIA_FICCION";
        };
    }
}
```

## **¿Cómo integrar el conversor personalizado en el mapper principal de MapStruct?**

Para emplear los conversores dentro de MapStruct, se sigue este proceso:

- Se indica en la anotación `@Mapper` del MovieMapper que utilizará la clase `GenreMapper` en su atributo `uses`.

`uses = {GenreMapper.*class*}`
- En el método de mapeo que convierte de entity a DTO, se especifica el uso del método personalizado mediante la propiedad `qualifiedByName`, usando el nombre del método anotado.

De este modo, los campos de género se traducirán correctamente entre string y enum sin necesidad de lógica adicional fuera del mapper. El resultado es un código más limpio, claro y alineado con buenas prácticas.

```java
// Utilizará la clase GenreMapper en su atributo uses. 
@Mapper(componentModel = "spring", uses = {GenreMapper.class})
public interface MovieMapper {
    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "duracion", target = "duration")
    // Se especifica el uso del método personalizado 
    // mediante la propiedad qualifiedByName, usando el nombre del método anotado.
    @Mapping(source = "genero", target = "genre", qualifiedByName = "stringToGenre")
    @Mapping(source = "fechaEstreno", target = "releaseData")
    @Mapping(source = "clasificacion", target = "rating")
    MovieDto toDto(MovieEntity entity);
    List<MovieDto> toDto(Iterable<MovieEntity> entities);
}
```

## **¿Cómo crear un conversor para otros tipos no compatibles, como string a boolean?**

Se plantea el reto de extender este enfoque a otros campos, como un estado representado por una letra (“D” para disponible, “N” para no disponible) que debe convertirse en un valor booleano para el DTO y viceversa.

- El método personalizado recibiría el string y retornaría `true` si es “D” y `false` en otro caso.
- Este método también sería añadido con anotaciones `@Named` e integrado en el mapper principal usando `qualifiedByName`.

Este patrón garantiza que cualquier diferencia entre los modelos se pueda resolver de forma centralizada y mantenible, haciendo el mejor uso de MapStruct para tipos de datos heterogéneos.

¿Te animas a escribir tu propio conversor para el campo de estado o a comentar cómo resolverías un caso parecido en tu proyecto?



# 14-Captura de parámetros con @PathVariable en Spring Boot

Creado: 17 de agosto de 2025 23:19
ítem principal: 03-BUENAS PRÁCTICAS EN DISEÑO DE APIS (https://www.notion.so/03-BUENAS-PR-CTICAS-EN-DISE-O-DE-APIS-248f5b42f77080278ae7d55a6c91df5e?pvs=21)

Las API modernas deben ser flexibles y escalables, permitiendo acceder tanto a colecciones completas de recursos como a elementos individuales de manera eficiente. Entender cómo implementar rutas dinámicas usando *@PathVariable* en Spring Boot es clave para construir servicios robustos y responder solicitudes personalizadas que optimicen la experiencia del usuario y la gestión de datos.

## **¿Cómo se configuran rutas dinámicas para acceder a una sola película?**

Las rutas dinámicas en los controladores permiten **capturar parámetros directamente desde la URL**, facilitando peticiones específicas como obtener una sola película por su identificador único. Al usar *@PathVariable*, el ID se toma automáticamente del path y se habilita el procesamiento específico del recurso dentro del método definido en el controlador.

- **@GetMapping** se utiliza para definir la ruta.
- Una estructura típica sería: *@GetMapping("/{id}")*, donde *id* es el parámetro dinámico.
- La notación *@RequestMapping("/movies")* en el controlador estandariza el prefijo de las rutas, manteniendo el código ordenado y fácil de mantener.
- El método asociado recibe el parámetro (ejemplo: *long id*) directamente desde la URL.

    ```java
    @RestController
    @RequestMapping("/movies")
    public class MovieController {
    
        private final MovieService movieService;
    
        public MovieController(MovieService movieService) {
            this.movieService = movieService;
        }
    
        @GetMapping
        public List<MovieDto> getAll() {
            return this.movieService.getAll();
        }
    
        @GetMapping("/{id}")
        public MovieDto getById(long id) {
            return this.movieService.getById(id);
        }
    }
    ```


## **¿Para qué sirve el método getById en el repositorio y el servicio?**

La lógica para **buscar una película** utilizando su identificador implica separar responsabilidades entre controlador, servicio y repositorio, lo que permite mantener el código modular y escalable:

- El repositorio agrega un nuevo método: *getById(long id)*, que retorna un *MovieDTO*.

    ```java
    public interface MovieRepository {
        List<MovieDto> getAll();
        MovieDto getById(long id);
    }
    ```

- Dentro de la implementación, se usa el método *findById* de Spring, el cual ya existe y permite buscar por clave primaria.
- Este método retorna un *Optional*. Si la película no existe, se puede manejar devolviendo null con *orElse(null)*.
- El siguiente paso es mapear la entidad encontrada a un *DTO* usando el mapper correspondiente, facilitando la transferencia de datos al cliente.

    ```java
    @Repository
    public class MovieEntityRepository implements MovieRepository {
    
        private final CrudMovieEntity crudMovieEntity;
        private final MovieMapper movieMapper;
    
        public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
            this.crudMovieEntity = crudMovieEntity;
            this.movieMapper = movieMapper;
        }
    
        @Override
        public List<MovieDto> getAll() {
            return this.movieMapper.toDto(this.crudMovieEntity.findAll());
        }
    		// Caso de ejemplo
        @Override
        public MovieDto getById(long id) {
            MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
            return movieMapper.toDto(movieEntity);
        }
    }
    ```

    ```java
    @Service
    public class MovieService {
    
        private final MovieRepository movieRepository;
    
        public MovieService(MovieRepository movieRepository) {
            this.movieRepository = movieRepository;
        }
    
        public List<MovieDto> getAll() {
            return this.movieRepository.getAll();
        }
    
        public MovieDto getById(long id) {
            return this.movieRepository.getById(id);
        }
    }
    ```


## **¿Cómo responde la API ante consultas específicas y cómo se valida la funcionalidad?**

Con la ruta dinámica implementada, la API puede:

- Responder a *.../movies/{id}* con un único recurso, permitiendo consultas como recibir sólo la información de "Interestelar" o "Avengers: Endgame".
- Integrar la prueba de los endpoints mediante herramientas como Postman o directamente desde el navegador, validando que los recursos retornados correspondan con la base de datos.
- La funcionalidad también permite volver a la lista completa simplemente consultando *.../movies* sin parámetros adicionales.

El enfoque presentado facilita además el manejo de casos donde el recurso solicitado no existe, abriendo la puerta a personalizar respuestas más adelante usando *ResponseEntity* y los códigos HTTP adecuados. ¿Te gustaría compartir tu experiencia implementando rutas dinámicas o tienes algún caso de uso en mente?




# 15-Códigos HTTP y Response Entity en APIs REST

Creado: 18 de agosto de 2025 9:01
ítem principal: 03-BUENAS PRÁCTICAS EN DISEÑO DE APIS (https://www.notion.so/03-BUENAS-PR-CTICAS-EN-DISE-O-DE-APIS-248f5b42f77080278ae7d55a6c91df5e?pvs=21)

En el desarrollo backend, **responder con el código HTTP adecuado** es esencial para comunicar correctamente el resultado de cada petición en tu API. Esta práctica incrementa la claridad, profesionalismo y permite a clientes interpretar con precisión cada respuesta, conforme al estándar de la web.

## **¿Qué son los códigos HTTP y por qué son importantes?**

Los códigos HTTP son valores numéricos estándar que indican el resultado de una petición entre un cliente y un servidor.

- El *200* muestra que la solicitud fue exitosa.
- El *201* indica que se creó un recurso nuevo.
- El *400* señala una petición incorrecta.
- El *404* se refiere a recursos no encontrados.
- El *500* marca errores internos del servidor.

Utilizar estos códigos correctamente guía a quienes consumen tu API sobre lo que realmente ocurrió con cada solicitud. Así, tu backend envía respuestas precisas y profesionales.

## **¿Cómo personalizar las respuestas de una API con Response Entity?**

Al emplear la clase **Response Entity**, se gana control total sobre el contenido y código de cada respuesta. Por ejemplo, al buscar una película por ID:

- Si el recurso existe, se devuelve con un *200* y el JSON correspondiente.
- Si el recurso no está, lo adecuado es responder con un *404*.

**Pasos clave en la implementación:**

1. Cambia el tipo de retorno a `ResponseEntity<MovieDTO>` en el controlador.
2. Busca la entidad por su ID y almacénala en una variable.
3. Si el resultado es nulo, devuelve `ResponseEntity.notFound().build()`.
4. Si existe, usa `ResponseEntity.ok(movieDTO)`.

    ```java
    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(@PathVariable long id) {
        MovieDto movieDto = this.movieService.getById(id);
        if(movieDto == null) {
           return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movieDto);
    }
    ```


Este patrón permite respuestas claras, acordes a la lógica de negocio, y mejora la experiencia para quienes interactúan con tu API.

## **¿Cómo aplicar Response Entity para listas y otros métodos?**

Cuando necesitas devolver listas u otro tipo de información, igual puedes beneficiarte de *Response Entity*:

- Retorna `ResponseEntity<List<MovieDTO>>` en vez de solo una lista.
- Usa `ResponseEntity.ok(listaDePeliculas)` para empaquetar la respuesta.

    ```java
    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll() {
        List<MovieDTO> listaDePeliculas = this.movieService.getAll();
        return ResponseEntity.ok(listaDePeliculas);
    }
    ```


Esto fortalece la coherencia y manejo de errores en todos los endpoints, haciendo el código más mantenible y robusto.

¿Tienes dudas sobre códigos HTTP o el uso de Response Entity en tus proyectos? Comparte tus experiencias o preguntas para seguir aprendiendo juntos.



# 16-Crear endpoint POST para guardar películas en Spring Boot

Creado: 18 de agosto de 2025 13:56
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

Crear un endpoint que permita almacenar datos desde el frontend hacia el backend es fundamental para cualquier API moderna. Aquí descubrirás cómo implementar en Spring un endpoint POST, aprovechando patrones como DTO, mapeadores automáticos y buenas prácticas para la persistencia de datos.

## **¿Cómo funciona el método POST en una API para guardar recursos?**

El método POST permite **recibir información y agregar nuevos recursos** en la base de datos. Todo comienza dentro del controlador (`MovieController`), donde se define un método que:

- Responde con un `ResponseEntity<MovieDTO>`.
- Recibe como parámetro un objeto MovieDTO con la anotación `@RequestBody` para indicar que los datos llegan en el cuerpo de la petición.
- Se anota con `@PostMapping` para asociar la ruta y el verbo HTTP.

    ```java
    @PostMapping
    public ResponseEntity<MovieDto> add(@RequestBody MovieDto movieDto) {
        MovieDto movieDtoResponse = this.movieService.add(movieDto);
        return ResponseEntity.status(HttpStatus.CREATED).body( movieDtoResponse );
    }
    ```


Esto habilita la ruta `/movies` para guardar películas nuevas usando solicitudes POST con datos en formato JSON.

## **¿Qué pasos hay que seguir para transformar y guardar los datos recibidos?**

Para **persistir la información recibida** es fundamental preparar todos los componentes:

- El repositorio (`CrudMovieEntity`) ofrece un método `save` que requiere una entidad (`MovieEntity`), no un DTO.

    ```java
    public interface MovieRepository {
        List<MovieDto> getAll();
        MovieDto getById(long id);
        MovieDto save(MovieDto movieDto);
    }
    ```

- Por ello, es necesario crear en el mapper (`MovieMapper`) una función `toEntity`, usando `@InheritInverseConfiguration` de MapStruct, que convierte un `MovieDTO` en una entidad lista para guardar.
- El campo especial `genre` necesita un mapeo adicional usando `qualifiedByName`, ajustando de `stringToGenre` a `genreToString` según el sentido de la conversión.

    ```java
    @Mapper(componentModel = "spring", uses = {GenreMapper.class, StatusMapper.class})
    public interface MovieMapper {
        @Mapping(source = "titulo", target = "title")
        @Mapping(source = "duracion", target = "duration")
        @Mapping(source = "genero", target = "genre", qualifiedByName = "stringToGenre")
        @Mapping(source = "fechaEstreno", target = "releaseData")
        @Mapping(source = "clasificacion", target = "rating")
        @Mapping(source = "estado", target = "status", qualifiedByName = "stringToBoolean")
        MovieDto toDto(MovieEntity entity);
        List<MovieDto> toDto(Iterable<MovieEntity> entities);
        
    		// convierte un MovieDTO en una entidad lista para guardar. 
        @InheritInverseConfiguration
        @Mapping(source = "genre", target = "genero", qualifiedByName = "genreToString")
        @Mapping(source = "status", target = "estado", qualifiedByName = "booleanToString")
        MovieEntity toEntity(MovieDto movieDto);
    }
    ```

- Para asignar el `estado` por defecto al guardar, se establece manualmente como 'Disponible'. El campo `ID` no se debe definir, ya que la base de datos lo genera automáticamente.

    ```java
    @Repository
    public class MovieEntityRepository implements MovieRepository {
    
       //...//
    
        @Override
        public MovieDto save(MovieDto movieDto) {
            MovieEntity movieEntity = this.movieMapper.toEntity(movieDto);
            return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
        }
    }
    ```


Después de guardar la entidad, el resultado se transforma nuevamente a DTO para devolverlo al cliente.

```java
@Service
public class MovieService {

    //...//

    public MovieDto add(MovieDto movieDto) {
        return this.movieRepository.save(movieDto);
    }
}
```

## **¿Cuál es la forma correcta de responder una creación exitosa?**

Es una buena práctica responder con el estado HTTP correcto cuando se crea un recurso. Aplicando Spring, puedes hacer esto así:

- Utilizar `ResponseEntity.status(HttpStatus.CREATED)` para indicar que se creó algo nuevo.
- El **cuerpo de la respuesta** es el DTO que representa la película efectivamente guardada.
- No es indispensable retornar una URI específica si no está disponible: el enfoque flexible muestra cómo elegir entre soluciones y adaptarlas al flujo deseado.

    ```java
    @PostMapping
        public ResponseEntity<MovieDto> add(@RequestBody MovieDto movieDto) {
            MovieDto movieDtoResponse = this.movieService.add(movieDto);
            return ResponseEntity.status(HttpStatus.CREATED).body( movieDtoResponse );
        }
    ```


## **¿Cómo probar el endpoint POST y visualizar los resultados?**

Para probar el endpoint, se recomienda emplear herramientas como **Postman**, ya que los navegadores no permiten enviar cuerpos en solicitudes POST de forma sencilla. Los pasos para realizar la prueba serían:

- Enviar una solicitud POST a la ruta api/movies, indicando los campos de la película en **JSON** (example: título, duración, género, año de lanzamiento y rating).

    ```json
    {
        "title": "Son como niños",
        "duration": 102,
        "genre": "COMEDY",
        "releaseData": "2010-06-25",
        "rating": 3.5,
        "status": true
    }
    ```

- Al recibir la respuesta con `HTTP 201 Created` y el nuevo `ID`, puedes consultar dicha película con un GET y corroborar que fue agregada correctamente.
- También es posible recuperar el listado de todas las películas y verificar que la nueva se encuentra al final del listado.

¿Has probado ya crear endpoints similares? Comparte tus experiencias y dudas para seguir creciendo juntos.



# 17-Creación de endpoint PUT para actualizar películas en base de datos

Creado: 19 de agosto de 2025 9:09
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

Actualizar información en una base de datos es esencial para gestionar aplicaciones modernas de manera segura. En este resumen aprenderás cómo implementar de forma controlada y eficiente un *endpoint* PUT para modificar solo campos permitidos de una película, usando buenas prácticas y herramientas propias del desarrollo backend.

## **¿Cómo controlar qué campos pueden modificarse con un endpoint PUT?**

Permitir la edición parcial evita errores y mantiene la integridad de los datos. Se recomienda crear un **UpdateMovieDTO** exclusivo para las actualizaciones, que incluya únicamente los campos editables como título, fecha de lanzamiento y calificación (rating).

- El ID y otros valores sensibles como género o duración quedan excluidos del UpdateMovieDTO.
- Usar DTOs separados promueve la seguridad y claridad en la lógica de actualización.
- Copiar la estructura de MovieDTO y modificar los campos según lo necesario facilita la implementación.

    ```java
    public record UpdateMovieDto(
            String title,
            LocalDate releaseData,
            Double rating,
            Boolean status
    ) {}
    ```


## **¿Cómo diseñar el controlador para recibir las actualizaciones?**

La **anotación @PutMapping** se utiliza para recibir el ID de la película como parte de la URL, y el cuerpo del request incluye el UpdateMovieDTO.

- El ID se captura con la anotación *@PathVariable*.
- El método controlador recibe ambos valores para identificar correctamente el registro y su información a modificar.
- Esta separación asegura que la actualización se realice sobre la entidad correcta y con datos controlados.

    ```java
    @PutMapping("/{id}")
    public ResponseEntity<MovieDto> update(
            @PathVariable long id, 
            @RequestBody UpdateMovieDto updateMovieDto
    ) {
        return ResponseEntity.ok(this.movieService.update(id, updateMovieDto));
    }
    ```


## **¿Cómo validar la existencia y actualizar los datos en la base de datos?**

Es fundamental comprobar que el registro existe antes de intentar cualquier cambio.

- Utiliza el repositorio para buscar la entidad por ID con *findById*.
- Si no existe, retorna null: así evitas intentos de modificar datos inexistentes.
- Si existe, solo se asignan los nuevos valores permitidos con los métodos *set* correspondientes (título, release date y rating).
- Se recomienda realizar conversiones de tipos, por ejemplo, de double a BigDecimal usando *BigDecimal.valueOf* si es necesario.

    ```java
    public interface MovieRepository {
        List<MovieDto> getAll();
        MovieDto getById(long id);
        MovieDto save(MovieDto movieDto);
        MovieDto update(long id, UpdateMovieDto updateMovieDto);
    }
    ```

    ```java
    @Repository
    public class MovieEntityRepository implements MovieRepository {
    
        //...//
        @Override
        public MovieDto update(long id, UpdateMovieDto updateMovieDto) {
    		    //Utiliza el repositorio para buscar la entidad por ID con *findById*.
            MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
    				//Si no existe, retorna null: 
    				//así evitas intentos de modificar datos inexistentes
            if(movieEntity == null) return null;
    
            this.movieMapper.updateEntityFromDto(updateMovieDto, movieEntity);
            /*
            movieEntity.setTitulo(updateMovieDto.title());
            movieEntity.setFechaEstreno(updateMovieDto.releaseData());
            movieEntity.setClasificacion(BigDecimal.valueOf(updateMovieDto.rating()));
            movieEntity.setEstado(updateMovieDto.status()? "D":"N");
            */
            return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
        }
    }
    ```


## **¿Cómo automatizar la asignación de valores con Mapstruct y MappingTarget?**

Para simplificar y hacer más seguro el mapeo entre el DTO y la entidad, Mapstruct permite crear un método especial:

- Define un método en el MovieMapper llamado *updateEntityFromDTO* que recibe el UpdateMovieDTO y la entidad a modificar.
- Agrega la anotación *@MappingTarget* al segundo parámetro para aplicar los cambios por referencia.
- Usa la notación *@Mapping* para señalar qué campos mapea cada vez (target y source).
- Este método no retorna valor (void), ya que modifica directamente la instancia recibida.

    ```java
    @Mapper(componentModel = "spring", uses = {GenreMapper.class, StatusMapper.class})
    public interface MovieMapper {
        //...//
    
        @Mapping(target = "titulo", source = "title")
        @Mapping(target = "fechaEstreno", source = "releaseData")
        @Mapping(target = "clasificacion", source = "rating")
        @Mapping(target = "estado", source = "status", qualifiedByName = "booleanToString")
        @Mapping(target = "id", ignore = true)
        @Mapping(target = "duracion", ignore = true)
        @Mapping(target = "genero", ignore = true)
        void updateEntityFromDto(UpdateMovieDto updateMovieDto, @MappingTarget MovieEntity movieEntity);
    }
    ```


## **¿Cómo integrar el flujo en el servicio y controlador?**

El método *update* en el servicio centraliza la lógica:

- Recibe el ID y UpdateMovieDTO.
- Llama al repositorio para validar la existencia y actualizar solo los campos permitidos.

    ```java
    @Service
    public class MovieService {
    
        //...//
    
        public MovieDto update(long id, UpdateMovieDto updateMovieDto) {
            return this.movieRepository.update(id, updateMovieDto);
        }
    }
    ```

- El controlador responde con *ResponseEntity.ok* llamando al servicio de actualización.

    ```java
    @RestController
    @RequestMapping("/movies")
    public class MovieController {
    		//...//
        @PutMapping("/{id}")
        public ResponseEntity<MovieDto> update(
                @PathVariable long id,
                @RequestBody UpdateMovieDto updateMovieDto
        ) {
            return ResponseEntity.ok(this.movieService.update(id, updateMovieDto));
        }
    }
    ```

- Las pruebas se pueden realizar con Postman enviando una petición PUT a la URL correspondiente, verificando la actualización correcta solo de los campos seleccionados.

    ```
    PUT > http://localhost:8090/platzi-play/api/movies/231
    ```

    ```json
    {
        "title": "Son como niños",
        "releaseData": "2010-06-29",
        "rating": 4.5,
        "status": true
    }
    ```


## **¿Qué retos adicionales pueden implementarse para gestionar recursos?**

Como ejercicio recomendable, se propone crear un servicio que permita eliminar películas utilizando la anotación *@DeleteMapping* y el ID del recurso. Esto completa el ciclo de gestión CRUD y fortalece la API.

Si tienes una solución diferente o quieres compartir resultados, la sección de comentarios está abierta para tus aportaciones y preguntas.



# 18-Sistema de recomendaciones de películas con IA en Java

Creado: 19 de agosto de 2025 17:12
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

En este material te comparto cómo implementar un sistema de recomendaciones de películas usando **Java, LangChain4j e inteligencia artificial** en la plataforma Platzi Play. Aquí verás el potencial real de integrar inteligencia artificial para personalizar las sugerencias de contenido según los intereses del usuario, aprovechando la potencia de herramientas modernas y buenas prácticas en desarrollo backend.

## **¿Cómo eliminar películas en la base de datos usando Java?**

Eliminar películas es sencillo empleando la notación *@DeleteMapping*. El método recibe el ID de la película como variable de ruta y responde con un *ResponseEntity.ok().build()*, ya que el método delete no retorna datos. El uso de *Void* en el *ResponseEntity* es importante porque Delete no regresa un objeto, solo indica que la operación fue realizada.

Para probar esta operación, se puede utilizar Postman enviando una petición *DELETE* al endpoint correspondiente con el ID de la película. Si el borrado es exitoso, se recibirá un status code 200 y el cuerpo estará vacío, confirmando la eliminación.

```java
public interface MovieRepository {
    //...//
    void delete(long id);
}
```

```java
@Repository
public class MovieEntityRepository implements MovieRepository {
		//...//
    @Override
    public void delete(long id) {
        this.crudMovieEntity.deleteById(id);
    }
}
```

```java
@Service
public class MovieService {
		//....//
    public void delete(long id) {
        this.movieRepository.delete(id);
    }
}
```

```java
@RestController
@RequestMapping("/movies")
public class MovieController {
		//...//
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        this.movieService.delete(id);
        return ResponseEntity.ok().build();
    }
}
```

## **¿Cómo funciona el sistema de sugerencias de películas potenciado por IA?**

El corazón del sistema es el servicio **Platzi Play AiService**, donde se integra la anotación A*iService* de LangChain4j. El método principal, llamado *generateMovieSuggestions*, toma como entrada un mensaje del usuario (las preferencias) usando la anotación *@UserMessage*.

Se define un mensaje de sistema personalizado para que la IA actúe como un experto en cine. El prompt restringe la respuesta a un máximo de tres películas y exige que solo se sugieran títulos disponibles en Plazy Play, asegurando recomendaciones relevantes y precisas.

```java
@AiService
public interface PlatziPlayAiService {
		//...//
    @SystemMessage("""
            Eres un experto en cine que recomienda películas personalizadas según los gustos del usuario
            Debes recomendar máximo 3 películas.
            No incluyas películas que estén por fuera de la plataforma de PlatziPlay
            """)
    String generateMoviesSuggestion(@UserMessage String userMessage);
}
```

## **¿Cómo se estructuran las peticiones y la transferencia de datos del usuario?**

El controlador recibe las preferencias del usuario como un objeto llamado **SuggestRequestDTO**, implementado como un *record* en Java. Este DTO solo contiene el campo *userPreference*, que captura los gustos expresados por la persona.

```java
public record SuggestRequestDto(
        String userPreferences
) {
}
```

Se utiliza *@PostMapping* para definir el endpoint `/suggest`, el cual responde con una lista de sugerencias generadas dinámicamente.

La inyección del servicio se realiza gracias a la anotación correspondiente y el uso de constructores. El controlador envía las preferencias del usuario al método *generateMovieSuggestions* del aiService y retorna la respuesta de forma segura y eficiente empleando *ResponseEntity*.

```java
@RestController
@RequestMapping("/movies")
public class MovieController {

    //...//
    private final PlatziPlayAiService aiService;

    public MovieController(MovieService movieService, PlatziPlayAiService aiService) {
        //...//
        this.aiService = aiService;
    }
		//....//
    @PostMapping("/suggest")
    public ResponseEntity<String> generateMoviesSuggestion(
            @RequestBody SuggestRequestDto suggestRequestDto
    ) {
        return ResponseEntity.ok(this.aiService.generateMoviesSuggestion(suggestRequestDto.userPreferences()));
    }
    //...//
}
```

## **¿Cómo conoce la IA las películas disponibles en la plataforma?**

Se aprovecha el método *getAll* del *MovieService*, anotado con *@Tool* de LangChain4j. Esta anotación convierte el método en una herramienta disponible para el modelo, permitiéndole consultar la lista actualizada de películas durante la generación de recomendaciones. El prompt asociado indica: "busca todas las películas que existan dentro de la plataforma", asegurando que las respuestas estén alineadas con el catálogo real.

```java
@Service
public class MovieService {
		//...//
    @Tool("Busca todas las películas que existan dentro de la plataforma")
    public List<MovieDto> getAll() {
        return this.movieRepository.getAll();
    }
    //...//
}
```

## **¿Qué resultados genera el sistema de recomendación con ejemplos prácticos?**

El proceso completo se visualiza probando el endpoint `/suggest` desde Postman, enviando preferencias como *me gustan las películas del espacio o las que están ambientadas en Nueva York*. El resultado son recomendaciones personalizadas como "Inception", "Interestellar" y "Joker", explicando brevemente por qué se sugieren.

```
POST > http://localhost:8090/platzi-play/api/movies/suggest
```

```json
{
    "userPreferences": "Me gustan las películas del espacio o las que están ambientadas en Nueva York."
}
```

Al introducir otras preferencias como *me gustan las animadas que sean emotivas*, el sistema recomienda "Coco", "Toy Story" y "Shrek". Las respuestas contienen información relevante extraída directamente de la base de datos como año, duración y descripción, mostrando la potencia del enfoque.

El flujo interno incluye:

- La petición del usuario es enviada al endpoint.
- LangChain4j utiliza el rol de sistema y el mensaje del usuario para contextualizar la consulta.
- El modelo llama automáticamente al *tool* que consulta las películas disponibles.
- La IA selecciona sugerencias alineadas con los gustos del usuario y limita la respuesta a títulos de la plataforma.

¿Te gustaría explorar más sobre LangChain4j o el API de OpenAI? Comparte en los comentarios cuáles otras integraciones o casos de uso te parecen interesantes.

https://docs.langchain4j.dev/tutorials/tools/

https://platzi.com/cursos/openai-api/



# 19-Control de excepciones con @RestControllerAdvice en Spring Boot

Creado: 19 de agosto de 2025 23:34
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

Diseñar una API profesional implica pensar más allá de los escenarios ideales. Es igual de importante establecer un control efectivo de errores y excepciones, facilitando respuestas claras para el usuario y manteniendo la integridad de los datos. Esta guía práctica explora el manejo centralizado de excepciones en Spring Boot utilizando la anotación **@RestControllerAdvice** y cómo implementarlo en el contexto de una API para controlar títulos únicos de películas.

## **¿Por qué es clave el control de errores en una API Spring?**

Gestionar los posibles errores garantiza una experiencia de usuario transparente y una API robusta. Por ejemplo, al guardar películas, puede ser necesario evitar que existan títulos duplicados—aunque la base de datos lanza un error, debemos traducirlo en mensajes útiles, amigables y específicos para quien consume la API.

- **Evitar errores inesperados reduce frustración del usuario.**
- **Centralizar excepciones simplifica el mantenimiento y mejora la trazabilidad.**
- **Proveer mensajes claros ayuda a los desarrolladores a comprender rápidamente los problemas.**

## **¿Cómo se valida la unicidad de títulos antes de guardar?**

El código implementa una validación previa a la creación de registros, consultando si ya existe una película con el mismo título utilizando un query method:

- **Método personalizado:** Se define `findFirstBytitulo` en el repositorio para verificar la existencia previa del título.
- **Lógica de control:** Si el título ya está en la base de datos, se lanza una excepción personalizada.

Esto evita confiar solo en restricciones de la base de datos, respondiendo de forma proactiva ante posibles colisiones.

```java
public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
    MovieEntity findFirstByTitulo(String titulo);
}
```

## **¿Cómo crear y lanzar excepciones personalizadas en Spring?**

Ante la detección de un intento de guardar una película repetida, se genera una excepción específica:

- **Paquete nuevo para excepciones:** Se crea un paquete `domain/exception` en donde residen todas las clases relacionadas.
- **Clase propia para el caso:** `MovieAlreadyExistsException` extiende `RuntimeException` y recibe el título problemático para personalizar el mensaje de error.

    ```java
    public class MovieAlreadyExistsException extends RuntimeException{
        public MovieAlreadyExistsException(String movieTitle) {
            super("La película " + movieTitle + " ya existe");
        }
    }
    ```

- **Lanzamiento de la excepción:** Al detectar duplicidad, se utiliza `throw new MovieAlreadyExistsException(nombreDeLaPelicula)`.

    ```java
    @Repository
    public class MovieEntityRepository implements MovieRepository {
    		//....//
        @Override
        public MovieDto save(MovieDto movieDto) {
            // Verificar si existe el elemento previo, detecta la duplicidad
            if(this.crudMovieEntity.findFirstByTitulo(movieDto.title()) != null ) {
                throw new MovieAlreadyExistsException(movieDto.title());
            }
            MovieEntity movieEntity = this.movieMapper.toEntity(movieDto);
            return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
        }
    		//.....//
    }
    ```


Esta estrategia ayuda a identificar el tipo de conflicto y detalla el motivo a quienes consumen la API.

## **¿De qué manera @RestControllerAdvice permite capturar y procesar excepciones?**

Centralizar el control de errores mediante **@RestControllerAdvice** beneficia la organización del código y la claridad en la respuesta:

- **Clase manejadora:** Se crea `web/exception/RestExceptionHandler`, anotada con `@RestControllerAdvice`, para capturar excepciones en toda la aplicación.

    ```java
    @RestControllerAdvice
    public class RestExceptionHandler {
    
        @ExceptionHandler(MovieAlreadyExistsException.class)
        public ResponseEntity<Error> handleException(MovieAlreadyExistsException ex) {
            Error error = new Error("movie-already-exists", ex.getMessage());
            return ResponseEntity.badRequest().body(error);
        }
    }
    ```

- **Registro de error estructurado:** Se define un record `Error` que retorna el tipo y la descripción del problema.

    ```java
    public record Error(
            String type,
            String message
    ) {
    }
    ```

- **Método de manejo:** Al capturar `MovieAlreadyExistsException`, se responde con un código 400 (Bad Request) y un cuerpo claro:
- Tipo: `MovieAlreadyExists`.
- Mensaje: “La película 'Son como niños' ya existe.”

Así, los errores internos se transforman en respuestas interpretables y útiles para clientes externos.

## **¿Qué otros escenarios comunes deben controlarse en una API REST?**

La práctica de capturar errores se puede extender fácilmente a otros casos:

- **Intentos de editar o eliminar recursos inexistentes.**
- **Recepción de datos incorrectos (lo que se abordará en la próxima lección mediante anotaciones).**

Abordar dichos escenarios eleva la calidad de la API y evita respuestas ambiguas.

¿Te animas a implementar el control para edición o eliminación de películas inexistentes? ¡Comparte cómo lo resolviste y mantén una API cada vez más robusta!


# 20-Validación automática de datos en APIs con Spring Boot

Creado: 21 de agosto de 2025 0:12
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

Contar con **validaciones automáticas en las APIs** es clave para la calidad y seguridad de tus servicios. En este resumen aprenderás cómo aprovechar *Spring Boot* y las anotaciones de *jakarta.validation* para controlar los datos que recibe tu aplicación, evitando errores comunes y mejorando la experiencia de quienes consumen tus endpoints.

## **¿Por qué validar los datos de entrada en APIs es fundamental?**

Validar los datos desde el inicio evita que información errónea llegue al núcleo de la lógica de la aplicación. Así, tu API responde de manera constructiva ante intentos de enviar datos incompletos o inconsistentes.

- Mejora la experiencia del usuario final al recibir mensajes claros.
- Previene fallos antes de que afecten procesos lógicos internos.
- Facilita el mantenimiento y robustez del código.

## **¿Cómo agregar una capa de validación en Spring Boot usando anotaciones?**

Se recomienda **agregar la dependencia "Validation"** en tu proyecto mediante *Spring Initializer* (start.spring.io). Para ello, busca *bean validation with Hibernate Validator* o agrega 'Spring Boot Starter Validation' en tu archivo build.gradle y actualiza las dependencias.

```groovy
dependencies {
		//...//
    // Validation
    implementation 'org.springframework.boot:spring-boot-starter-validation'
    //...//
}
```

Luego, utiliza las anotaciones en el *DTO* que representa el cuerpo de la petición:

- Aplica la anotación *@Valid* directamente en el parámetro que recibe el *request body* (por ejemplo, un objeto update movie DTO).

    ```java
    @RestController
    @RequestMapping("/movies")
    public class MovieController {
    		//...code...//
        @PutMapping("/{id}")
        public ResponseEntity<MovieDto> update(
                @PathVariable long id,
                // Uso de la anotación @Valid
                @RequestBody @Valid UpdateMovieDto updateMovieDto
        ) {
            return ResponseEntity.ok(this.movieService.update(id, updateMovieDto));
        }
    		//...code...//
    }
    ```

- Entre las validaciones más útiles están:
- `@NotBlank` para campos obligatorios que no pueden ser vacíos (ejemplo: título).
- `@PastOrPresent` para fechas que no pueden ser futuras (ejemplo: fecha de lanzamiento).
- `@Min` y `@Max` para restringir valores numéricos (ejemplo: rating entre 0 y 5).
- Puedes definir mensajes personalizados para cada validación, lo que permite ofrecer retroalimentación clara como "El título es obligatorio" o "El rating no puede ser mayor que cinco".

    ```java
    public record UpdateMovieDto(
            @NotBlank(message = "El titulo es obligatorio")
            String title,
    
            @PastOrPresent(message = "La fecha de lanzamiento debe ser anterior a la actual")
            LocalDate releaseDate,
    
            @Min(value = 0, message = "El rating no puede ser menor que 0")
            @Max(value = 5, message = "El rating no puede ser mayor que 5")
            Double rating,
    
            @NotNull(message = "Colocar true o false")
            Boolean status
    ) {}
    ```


## **¿Cómo reportar errores de validación y manejar excepciones en tu API?**

Cuando se incumple alguna de estas reglas, Spring lanza una excepción *method argument not valid exception*. Para manejarla de forma adecuada:

- Implementa un método anotado con *@ExceptionHandler* para capturar esta excepción específica.
- Devuelve un objeto *ResponseEntity* con una lista de errores detallada por cada campo que falló.
- Extrae la información relevante mediante `getBindingResult().getFieldErrors()` y agrega mensaje y campo a dicho listado.

Este enfoque permite que el cliente reciba una lista con los problemas específicos, en vez de una respuesta genérica sin detalles.

Además, es recomendable agregar un manejador general para captar cualquier otra excepción no controlada (mediante *@ExceptionHandler(Exception.class)*), y responder con un *internal server error* y un mensaje explicativo. Así, ninguna excepción quedará sin procesar, y siempre sabrás qué está fallando.

```java
@RestControllerAdvice
public class RestExceptionHandler {
		//...code...//
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<Error>> handleException(MethodArgumentNotValidException ex) {
        List<Error> errors = new ArrayList<>();

        ex.getBindingResult().getFieldErrors().forEach(error -> {
            errors.add(new Error(error.getField(), error.getDefaultMessage()));
        });

        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception ex){
        Error error = new Error("unknow", ex.getMessage());
        return ResponseEntity.internalServerError().body(error);
    }
}
```

## **¿Qué prácticas adicionales potencian la robustez de tu API con Spring Validation?**

- Crea validadores para todos los endpoints críticos, no solo para actualizaciones.
- Ofrece siempre mensajes orientados al usuario para facilitar la solución del problema.
- Lleva seguimiento de los fallos en un log para futuras auditorías o depuración.
- Realiza pruebas simulando envíos incorrectos desde herramientas como *Postman* para garantizar la cobertura de escenarios.

¿Ya implementaste validaciones en todos los puntos de entrada de tu servicio? Cuéntanos cómo mejoró la calidad de tus endpoints o comparte tu reto en los comentarios.



# 21-Documentación automática de APIs con OpenAPI en Spring Boot

Creado: 21 de agosto de 2025 15:38
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

Una documentación clara y profesional en una API REST asegura facilidad de uso, comprensión y adopción tanto por personas como por otros sistemas. Te comparto cómo integrar OpenAPI en un proyecto Spring Boot para generar documentación automática, personalizable y directamente ligada al código de tu aplicación.

## **¿Cómo generar documentación para una API con OpenAPI en Spring Boot?**

Una API profesional no solo cumple su función, también debe ser sencilla de consumir y entender. Para lograrlo, puedes integrar **OpenAPI** en tu proyecto. Solo necesitas agregar una dependencia al archivo *build.gradle* siguiendo el formato *grupo:artefacto:versión*, basado en la documentación oficial de springdoc.org. Tras sincronizar y lanzar la aplicación, la documentación estará disponible en *localhost:8090/platzi-play/api/swagger-ui.html*. Se genera de forma automática y muestra todos los métodos disponibles, permitiendo incluso probarlos desde el navegador.

```groovy
dependencies{
		//...code...//
    //Doc OpenAPI
    implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.10'
    //...code...//
}
```

### ¿Por qué es útil la documentación generada automáticamente?

- Refleja todos los endpoints construidos en el proyecto.
- Permite probar llamadas a la API directamente desde el navegador.
- Muestra todos los parámetros y posibles respuestas.
- Incluye validaciones y reglas definidas por anotaciones en el código, como campos obligatorios y rangos aceptados.

## **¿Cómo personalizar la documentación de la API en Spring Boot?**

Tu API puede tener descripciones a medida para cada endpoint y parámetro. Por ejemplo, usando la anotación *@Tag* de *io.swagger.v3.oas.annotations*, se define un nombre y descripción para un controlador. Esto mejora el entendimiento y la presentación de los recursos en la documentación. Además, cada método puede ser anotado con *@Operation* y describir brevemente su función, lo que espera recibir y retornar, así como las posibles respuestas, usando *@ApiResponse*.

- *@ApiResponse* permite definir el código de respuesta (como 200 u 404) y su significado, ajustando los ejemplos y el cuerpo de respuesta según corresponda.
- El parámetro de un endpoint puede anotarse con *@Parameter* y agregar descripción y ejemplo, lo que ayuda a quienes consumen la API a comprender cada campo.

Al personalizar estos detalles, la documentación habla el idioma y contexto deseado, mostrando títulos y descripciones adecuadas.

```java
@RestController
@RequestMapping("/movies")
@Tag(name = "Movies", description = "Operaciones acerca de películas de PlatziMovies")
public class MovieController {
		//...code...//
    @Operation(
            summary = "Obtener una película por su identificador",
            description = "Retorna la película que coincida con el identificador enviado",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Película encontrada"),
                    @ApiResponse(responseCode = "404", description = "Película no encontrada", content = @Content),
            }
    )
    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(
            @Parameter(description = "Identificador de la película a recuperar", example = "9")
            @PathVariable long id
    ) {
        MovieDto movieDto = this.movieService.getById(id);
        if(movieDto == null) {
           return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movieDto);
    }
    //...code...//
}
```

## **¿Qué ventajas ofrece la documentación automática para el desarrollo y la integración?**

La documentación con **OpenAPI** automatiza la actualización de las descripciones cuando tu proyecto crece, sin requerir trabajo adicional en cada cambio. Los beneficios principales son:

- **Facilita las pruebas** de métodos y validaciones desde la interfaz Swagger UI.
- **Mejora el trabajo en equipo**, porque todos acceden a un único manual actualizado.
- **Simplifica la integración** con otros sistemas y plataformas.

Gracias a su flexibilidad y autonomía, ahora cualquier servicio que agregues quedará reflejado y podrás compartir el uso correcto de tu API de forma clara y estandarizada.

¿Tienes dudas, inquietudes o quieres contar cómo personalizarías los endpoints de tu API? Comparte tu experiencia y sigamos aprendiendo juntos.



# 22-Compilación de aplicación Java para producción con PostgreSQL

Creado: 21 de agosto de 2025 17:23
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

Preparar y desplegar tu API en un entorno real demanda atención especial a cada detalle técnico. Conectar tu aplicación Java a una base de datos en la nube y empacar el proyecto para producción permite que las pruebas sean precisas y el funcionamiento sea similar al despliegue final. Aquí, verás los pasos para lograrlo usando Render y PostgreSQL, recursos esenciales para cualquier desarrollador comprometido con aplicaciones modernas y escalables.

## **¿Cómo se crea la base de datos PostgreSQL gratis en Render?**

Render facilita crear una base de datos PostgreSQL dedicada en la nube. Primero, selecciona la opción de nueva base de datos desde el dashboard de Render. Debes definir:

- **Nombre de la instancia**: Por ejemplo, platzi_play_db.
- **Usuario y región**: Ajusta según tus preferencias, como "Alejandro" y Oregón.
- **Versión**: Escoge la más reciente, aquí la 16.
- **Plan gratuito**: Permite hasta 1GB de almacenamiento y caduca en 30 días.

Recuerda que solo se puede tener una base gratuita por cuenta. Eligiendo Render, puedes testear en producción sin costos adicionales en la etapa inicial.

## **¿Qué datos de conexión se utilizan para vincular la app con la base de datos?**

Al terminar la creación, Render muestra la información de conexión:

- **Usuario, contraseña y nombre de base de datos**: Específicos para tu instancia.
- **Puerto y URLs**: Existen versiones interna y externa; normalmente se usa la externa para desarrollo.
- **Formato JDBC**: La cadena debe adaptarse conforme a las propiedades requeridas por tu app Java.

La cadena se añade en el archivo de propiedades de producción (por ejemplo, `application-prod.properties`) y se ajusta el usuario, contraseña y dirección del servidor, reemplazando el clásico localhost por el dominio de Render.

```
# Puerto de Ambiente de desarrollo
server.port=8080

# Spring Data JPA
#postgresql://eliasmoran:a6oIldoOBmNRTiySCe8XCh6VKykHuPx3@dpg-d2joscemcj7s739fsv2g-a.oregon-postgres.render.com/platzi_play_db_en33
spring.datasource.url=jdbc:postgresql://dpg-d2joscemcj7s739fsv2g-a.oregon-postgres.render.com:5432/platzi_play_db_en33
spring.datasource.username=eliasmoran
spring.datasource.password=a6oIldoOBmNRTiySCe8XCh6VKykHuPx3

# Crear una tabla en la base de datos
spring.jpa.hibernate.ddl-auto=update
# Siempre inicializa los datos
spring.sql.init.mode=always
```

## **¿Cómo se configura la app para funcionar en modo producción?**

En el proyecto Java:

1. En el archivo de propiedades, copia la URL y credenciales de la base de datos proporcionadas por Render.
2. Elimina configuraciones innecesarias que solo atrasarían la operación en producción, como logs excesivos.
3. Establece los perfiles activos para distinguir entre desarrollo y producción, usando la variable `spring.profiles.active=prod`.
4. Actualiza el archivo `build.gradle` para asignar la versión final de la app.

    ```
    version = '1.0.0'
    ```


## **¿Qué pasos se siguen para compilar y ejecutar el JAR en ambiente productivo?**

Con la configuración lista, procede así:

- Sincroniza Gradle y ejecuta la tarea *bootJar* para empaquetar la app en un archivo JAR listo para producción.
- Dirígete a la carpeta `/build/libs/`, donde estará el archivo generado, por ejemplo: `platzi-play-1.0.0.jar`.
- Antes de ejecutar, valida que Java versión 21 esté instalada usando el comando `java -version`.
- Lanza la app con el comando:
- `java -Dspring.profiles.active=prod -jar platzi-play-1.0.0.jar`

Esto conecta tu servicio a la nueva base de datos, activa el puerto designado (8080 para producción) y lo deja listo para recibir peticiones.

## **¿Cómo se validan los datos y resultados en la base en la nube?**

Ingresa a `localhost:8080/platzi-play/api/movies` para consultar los datos a través de la API. Si la base recién fue creada, al principio estará vacía. Para inicializarla con información:

- Añade la configuración que permite cargar los datos del archivo `data.sql` durante el despliegue.

    ```
    spring.sql.init.mode=always
    ```

- Detén la app, recompila el JAR con el ajuste y vuelve a ejecutar el servicio.

Así, los registros estarán disponibles y podrás operar con la API como en desarrollo, pero en configuración productiva y conectada a la nube.

¿Te gustaría compartir cómo fue tu experiencia vinculando una app a una base de datos en la nube? Cuéntanos en los comentarios.


# 23-Despliegue de API Java con Docker en Render

Creado: 21 de agosto de 2025 19:44
ítem principal: 04-CALIDAD, DOCUMENTACIÓN Y PRODUCCIÓN (https://www.notion.so/04-CALIDAD-DOCUMENTACI-N-Y-PRODUCCI-N-248f5b42f7708063b8d9edd64e8b138e?pvs=21)

Llevar una API a la nube es un paso crucial para transformar un proyecto local en un servicio público y listo para crecer. En este material, aprenderás cómo **desplegar tu API en Render usando Docker**, asegurando que el código esté disponible en Internet para cualquier usuario interesado. Este proceso es clave dentro del ciclo de desarrollo profesional de software backend.

## **¿Cómo configurar un Dockerfile para una aplicación Java en Render?**

Un **Dockerfile** funciona como una receta que le indica a Docker cómo construir la imagen de la aplicación. Hay dos etapas esenciales:

- **Etapa de compilación:** Se utiliza una imagen específica de *Gradle* (por ejemplo, 8.14.2-jdk21), alineada con la versión definida en *Gradle wrapper*.
- Se copia el contenido de la aplicación al contenedor (`/app`) y se ejecuta el comando *gradle boot jar*.

    ```docker
    # Etapa 1: Build con Gradle 8.14.2 y JDK 21 (Compilacion)
    FROM gradle:8.14.3-jdk-21-and-24 AS build
    COPY --chown=gradle:gradle . /app
    WORKDIR /app
    RUN gradle bootJar --no-daemon
    ```

- **Etapa de ejecución:** Se utiliza una imagen de *JDK21* (en el ejemplo, *Eclipse Temurin*) para correr la aplicación.
- Se trasladan los archivos generados como `.jar` desde el build a la ruta preferida y se ejecuta el archivo con el perfil de producción tal cual como se configuró localmente.

    ```docker
    # Etapa 2: Runtime con JDK 21 (Ejecucion)
    FROM eclipse-temurin:21-jdk
    WORKDIR /app
    COPY --from=build /app/build/libs/*.jar platzi_play.jar
    EXPOSE 8080
    ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "platzi_play.jar"]
    ```


Así, Docker encapsula la app y asegura la consistencia entre ambientes.

## **¿Qué aspectos debes considerar en la configuración de Render y la base de datos?**

Render facilita el despliegue ofreciendo capas gratuitas y manejo sencillo de repositorios. Algunos aspectos importantes a considerar:

- El archivo *application.properties* requiere ajustar la URL de la base de datos. Al ejecutarse dentro de Render, la cadena se simplifica, quitando referencias externas (como `oregon-postgres.render.com`).
- Mantener la referencia del puerto en la URL luego de remover el prefijo.
- Subir los cambios a GitHub es necesario, pues Render obtiene el código directamente del repositorio.
- Se recomienda agregar variables de entorno si tu aplicación las requiere, como *API keys*.

    ```
    # Spring Data JPA
    #postgresql://eliasmoran:a6oIldoOBmNRTiySCe8XCh6VKykHuPx3@dpg-d2joscemcj7s739fsv2g-a.oregon-postgres.render.com/platzi_play_db_en33
    #postgresql://eliasmoran:a6oIldoOBmNRTiySCe8XCh6VKykHuPx3@dpg-d2joscemcj7s739fsv2g-a/platzi_play_db_en33
    spring.datasource.url=jdbc:postgresql://dpg-d2joscemcj7s739fsv2g-a:5432/platzi_play_db_en33
    spring.datasource.username=eliasmoran
    spring.datasource.password=a6oIldoOBmNRTiySCe8XCh6VKykHuPx3
    ```


Render mostrará en su consola cada paso del proceso de compilación y despliegue, permitiendo visualizar advertencias relevantes, por ejemplo, *spring-jpa-open-in-view*, relacionada con la gestión de conexiones a la base de datos durante la renderización de respuestas.

## **¿Cómo validar y acceder a tu API tras el despliegue en la nube?**

Una vez desplegada la aplicación y completadas las configuraciones, Render te proporcionará una URL pública para acceder al servicio. Aquí algunos puntos clave:

- La URL puede devolver un código 404 si no se incluye el contexto definido en *application.properties*.
- Recuerda usar los endpoints configurados (ejemplo: `/movies` para comprobar la lista de películas o `/hello` para saludar, según lo definido durante el desarrollo).
- Si aparece un error inesperado, confirma que estés invocando los servicios correctamente y que el contexto de ruta sea el adecuado.

Este proceso marca el paso de un desarrollo local a un proyecto en producción, preparado para escalar y adaptarse a retos futuros.

¿Ya probaste subir tu propia API? Cuéntanos tu experiencia y comparte tus aprendizajes para seguir creciendo juntos.




