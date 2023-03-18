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

7. Busque el artefacto gson en el repositorio de maven y agregue la dependencia.

<dependency>
 <groupId>com.google.code.gson</groupId>
 <artifactId>gson</artifactId>
 <version>2.10.1</version>
</dependency>

![image](https://user-images.githubusercontent.com/123812926/225692976-ba1325a5-4f30-4329-8198-b20d001119f3.png)

8. En el navegador revise la dirección https://jsonplaceholder.typicode.com/todos/1. Intente cambiando diferentes números al final del path de la url.

La pagina web se ve de esta manera:

![image](https://user-images.githubusercontent.com/123812926/225693255-e1c084b4-29c2-4bd2-9f52-bba3dfd3c9d7.png)

El numero que le asignamos es 5

![image](https://user-images.githubusercontent.com/123812926/225693521-48f90147-6530-4804-ad75-a0dc06b4d1bf.png)

9. Basado en la respuesta que le da el servicio del punto anterior, cree la clase edu.eci.cvds.servlet.model.Todo con un constructor vacío y los
métodos getter y setter para las propiedades de los "To Dos" que se encuentran en la url indicada.

![image](https://user-images.githubusercontent.com/123812926/225700281-e5463b83-3061-4b29-af9f-5d66aefed541.png)

10. Utilice la siguiente clase para consumir el servicio que se encuentra en la dirección url del punto anterior:

![image](https://user-images.githubusercontent.com/123812926/225700485-8daa7c60-dfc1-4dcf-a5ec-5da182977aab.png)

11. Cree una clase que herede de la clase HttpServlet (similar a SampleServlet), y para la misma sobrescriba el método heredado doGet. Incluya la
anotación @Override para verificar –en tiempo de compilación- que efectivamente se esté sobreescribiendo un método de las superclases.

12. Para indicar en qué URL el servlet interceptará las peticiones GET, agregue al método la anotación @WebServlet, y en dicha anotación, defina la
propiedad urlPatterns, indicando la URL (que usted defina) a la cual se asociará el servlet.

13. Teniendo en cuenta las siguientes métodos disponibles en los objetos ServletRequest y ServletResponse recibidos por el método doGet

![image](https://user-images.githubusercontent.com/123812969/226067156-e0921071-12fb-4298-ac9e-9ad4cc8b91a3.png)

15. Intente hacer diferentes consultas desde un navegador Web para probar las diferentes funcionalidades.

![image](https://user-images.githubusercontent.com/123812969/226073513-a960903f-495a-4bb8-aba2-17a288b10ded.png)

![image](https://user-images.githubusercontent.com/123812969/226073589-cda8ada6-ea51-4426-8f53-6e1df53c0eb7.png)

PARTE III.

16. En su servlet, sobreescriba el método doPost, y haga la misma implementación del doGet.

![image](https://user-images.githubusercontent.com/123812969/226068771-0ac8e136-1fe1-4edf-bb9b-3966443c88ff.png)

17. Cree el archivo index.html en el directorio src/main/webapp/index.html 

![image](https://user-images.githubusercontent.com/123812969/226068923-2539d2ed-e0c4-4749-9ebf-df9a472b3015.png)

18. En la página anterior, cree un formulario que tenga un campo para ingresar un número (si no ha manejado html antes, revise
http://www.w3schools.com/html/ ) y un botón. El formulario debe usar como método ‘POST’, y como acción, la ruta relativa del último servlet creado
(es decir la URL pero excluyendo ‘http://localhost:8080/’).

![image](https://user-images.githubusercontent.com/123812969/226074331-a3d67acd-cb74-4001-bdf6-0e522f0d9fb8.png)

19. Revise este ejemplo de validación de formularios con javascript y agruéguelo a su formulario, de manera que -al momento de hacer ‘submit’- desde el
browser se valide que el valor ingresado es un valor numérico.

![image](https://user-images.githubusercontent.com/123812969/226078148-43e792a8-a103-4484-808a-a1ea937537cd.png)

20. Recompile y ejecute la aplicación. Abra en su navegador en la página del formulario, y rectifique que la página hecha anteriormente sea mostrada.
Ingrese los datos y verifique los resultados. Cambie el formulario para que ahora en lugar de POST, use el método GET . Qué diferencia observa?

![image](https://user-images.githubusercontent.com/123812969/226078182-8cab8499-1bea-472a-8086-aac68344bbb7.png)






links de mvn
https://maven.apache.org/archetypes/maven-archetype-webapp/
