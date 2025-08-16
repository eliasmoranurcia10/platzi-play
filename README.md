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

  ![image.png](image.png)


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





