# CVDS_LAB0555

PARTE I. - JUGANDO A SER UNCLIENTEHTTP

## PARTE II. -HACIENDO UNA APLICACIÓN WEB DINÁMICA A BAJO NIVEL.

En este ejercicio, va a implementar una aplicación Web muy básica, haciendo uso de los elementos de más bajo nivel de Java-EE (Enterprise Edition),con el fin
de revisar losconceptos del protocoloHTTP. En este caso,se trata de un módulo de consulta de clientes Web que hace uso de una librería de acceso a datos
disponible en un repositorio Maven local.

I. Para esto,cree un proyecto maven nuevo usando el arquetipo de aplicación Web estándar maven-archetype-webapp y realice lo siguiente:

Los servlets, que se ejecutan en un servidor web habilitado para Java, amplían las funciones de un servidor web.

arquetipo mvn : generar - DarchetypeGroupId = org . apache _ experto _ arquetipos - DarchetypeArtifactId = maven - arquetipo - aplicación web - DarchetypeVersion = 1.4

se deberia ver de la siguiente manera:

![image](https://user-images.githubusercontent.com/123812926/224491128-fea70863-1a12-4c7b-ac12-3df3d8748312.png)

Luego tendremos que anotar lo siguiente:

" groupId " : edu.eci.cvds
" artifactId " : CVDS_LAB05
" version " : 1.0-SNAPSHOT
" package " : edu.eci.cvds.servlet

una ves anotado eso, damos "ENTER". Se vera lo siguiente:

![image](https://user-images.githubusercontent.com/123812926/224491155-7baf1902-26b1-49cb-b0a3-e7774ecffdbf.png)

2. En el pom.xml, modifique la propiedad "packaging" con el valor "war". Agregue la siguiente dependencia y y agregue la seccion build al final del tag project en el archivo pom.xml:

<dependency>
<groupId>javax</groupId>
<artifactId>javaee-web-api</artifactId>
<version>7.0</version>
<scope>provided</scope>
</dependency>

![image](https://user-images.githubusercontent.com/123812926/225691101-b6a299bd-4e1b-4345-8f43-44ecd547b8a6.png)

3. Revise en el pom.xml para qué puerto TCP/IP está configurado el servidor embebido de Tomcat (ver sección de plugins).

El puerto para Tomcat es 8080.

![image](https://user-images.githubusercontent.com/123812926/225691587-27a835fa-61e6-47e8-b7c1-e8f91b5b35f4.png)

4. Compile y ejecute la aplicación en el servidor embebido Tomcat, a través de Maven con:

mvn package
mvn tomcat7:run

5. Abra un navegador, y en la barra de direcciones ponga la URL con la cual se le enviarán peticiones al ‘SampleServlet’. Tenga en cuenta que la URL tendrá
como host ‘localhost’, como puerto, el configurado en el pom.xml y el path debe ser el del Servlet. Debería obtener un mensaje de saludo.

![image](https://user-images.githubusercontent.com/123812926/224491506-6cc3ff3f-9bf5-452b-8840-c9cf72411867.png)

6. Observe que el Servlet ‘SampleServlet’ acepta peticiones GET, y opcionalmente, lee el parámetro ‘name’. Ingrese la misma URL, pero ahora agregando
un parámetro GET (si no sabe como hacerlo, revise la documentación en http://www.w3schools.com/tags/ref_httpmethods.asp).

![image](https://user-images.githubusercontent.com/123812926/224491495-8f4f08a5-b656-437b-b5f0-2a3a833dabc2.png)

links de mvn
https://maven.apache.org/archetypes/maven-archetype-webapp/
