# Patrones de diseño

Dentro de los patrones de diseño GOF (The Gang of Four), se hace una pequeña referencia de ciertos patrones de diseño, de los cuales considero que son los mas usados o simples de aplicar, como bien se sabe se pueden separar en 3 grandes aristas, estas son:
* Patrones de creación
* Patrones de estructura 
* Patrones de comportamiento

## Patrones de Creación (Creational Patterns)
Son patrones de diseño relacionados con la creación o construcción de objetos. Estos patrones intentan controlar la forma en que los objetos son creados implementando mecanismos que eviten la creación directa de objetos

### Builder
Mediante este patrón pretendemos crear objetos complejos a partir de un objeto fuente, también denominado producto, centralizando el proceso de creación en un único punto. Esto nos permite mediante un procedimiento único, crear objetos complejos de distintas clases únicamente configurando el Builder.
Usamos el patrón Builder cuando queremos...

* Construir un objeto compuesto de otros objetos.
* Que la creación de las partes de un objeto sea independiente del objeto principal.
* El algoritmo de creación del objeto complejo puede independizarse de las partes que lo componen y del ensamblado de las mismas.

**Ejemplo:**
Clase clase = new ClaseBuilder("atributos").metodosAdicionales().build();
* [Builder](https://github.com/jmillafilo/patrones-de-disenio/tree/master/creacional/builder)


### Factory
Mediante este patrón podemos crear objetos en una clase usando un método factory es más flexible que crear un objeto directamente. Es posible conectar la generación de familias de clases que tienen comportamientos en común. Elimina la necesidad de estar haciendo binding (casting) hacia clases específicas dentro del código, ya que este solo se entiende con las clases abstractas.
 Usamos el patrón Factory...
 
* Cuando una clase no puede anticipar que clase de objetos debe crear, esto se sabe durante el tiempo de ejecución.
* Cuando un método regresa una de muchas posibles clases que comparten características comunes a través de una superclase.
* Para encapsular la creación de objetos.

**Ejemplo:**
IFactory superClase = new ClaseExtendFactory();
IProducto clase = superClase.create("atributos");
clase.poseeInformacion();
* [Factory](https://github.com/jmillafilo/patrones-de-disenio/tree/master/creacional/factory)


### Singleton
Utilizaremos el patrón Singleton cuando por alguna razón necesitemos que exista sólo una instancia (un objeto) de una determinada Clase.

Dicha clase se creará de forma que tenga una propiedad estática y un constructor privado, así como un método público estático que será el encargado de crear la instancia (cuando no exista) y guardar una referencia a la misma en la propiedad estática (devolviendo ésta).
Usamos el patrón Singleton...

* La aplicación necesita una, y sólo una, instancia de una clase, además está instancia requiere ser accesible desde cualquier punto de la aplicación.
* Tipicamente para:
  o	Manejar conexiones con la base de datos.
  o	La clase para hacer Login.

**Ejemplo:**
* [Singleton](https://github.com/jmillafilo/patrones-de-disenio/tree/master/creacional/singleton)


## Patrones de Estructura (Structural Patterns)
Son patrones que tiene que ver con la forma en que las clases se relacionan con otras clases. Estos patrones ayudan a dar un mayor orden a nuestras clases ayudando a crear componentes más flexibles y extensibles.


### Decorator 
Adjuntar responsabilidades adicionales a un objeto de forma dinámica. Los decoradores proporcionan una alternativa flexible para ampliar la funcionalidad.
Usamos el patrón Decorator...

* Cuando necesitamos añadir o eliminar dinámicamente las responsabilidades a un objeto, sin afectar a otros objetos.
* Cuando queremos tener las ventajas de la Herencia pero necesitamos añadir funcionalidad durante el tiempo de ejecución. Es más flexible que la Herencia.
* Simplificar el código agregando funcionalidades usando muchas clases diferentes.
* Evitar sobreescribir código viejo agregando, envés, código nuevo.

**Ejemplo:**
* [Decorator](https://github.com/jmillafilo/patrones-de-disenio/tree/master/estructural/decorator)


### Facade
Proporcionar una interfaz unificada para un conjunto de interfaces de un subsistema. Facade define una interfaz de alto nivel que hace que el subsistema sea más fácil de usar.
Usamos el patrón facade...
* Este patrón protege los clientes de los componentes del subsistema, propiciando el menor uso de componentes para que el subsistema pueda ser utilizado.
* Además, promueve un bajo acoplamiento entre subsistemas y clientes.
* Este patrón no evita que los clientes usen las clases internas del subsistema, si es que es necesario.
* Es importante mencionar que el objeto Facade debe ser extremadamente simple. No debe convertirse en un objeto "dios".

**Ejemplo:**
Clase Base extend Ibase{
  metodoHeredado();
}
Facade{
  Clase extend;
  
  public facade{
    Ibase base= new Base();
    base.Metodo();
  }
  
}
* [Facade](https://github.com/jmillafilo/patrones-de-disenio/tree/master/estructural/facade)


## Patrones de Comportamiento (Behavioral Patterns) 
Son patrones que están relacionados con procedimientos y con la asignación de responsabilidad a los objetos. Los patrones de comportamiento engloban también patrones de comunicación entre ellos

### Strategy
Definir una familia de algoritmos, encapsular cada uno, y que sean intercambiables. Strategy permite al algoritmo variar independientemente de los clientes que lo utilizan.
Usamos el patrón Strategy...

* Definir una familia de comportamientos.
* Definir variantes de un mismo algoritmo.
* Poder cambiar el comportamiento en tiempo de ejecución, es decir, dinámicamente.
* Reducir largas listas de condicionales.
* Evitar código duplicado.
* Ocultar código complicado, o que no queremos revelar, del usuario.

**Ejemplo:**
interfase Strategy{
  algoritmo();
}

Clase claseUno implements Strategy{
  algoritmo()
  {
    //Mi logica
  }
}
Clase claseDos implements Strategy{
  algoritmo()
  {
    //Mi logica
  }
}

* [Strategy](https://github.com/jmillafilo/patrones-de-disenio/tree/master/comportamiento/strategy)


### Iterator
Proporcionar acceso secuencial a los elementos de un agregado, sin exponer su representación interna, convierte algun objeto en una lista iterator para lograr recorrerlo 
Usamos el patrón iterator...

* Para acceder al contenido de un agregado sin exponer su representación interna
* Para permitir varios recorridos sobre un agregado
* Para proporcionar una interfaz uniforme para recorrer distintos tipos de agregados (esto es, permitir iteración polimórfica)


**Ejemplo:**
* [Iterator](https://github.com/jmillafilo/patrones-de-disenio/tree/master/comportamiento/Iterador)


### Template Method
Este tipo patrones ayudan a resolver problemas de interacción entre clases y objetos. Este patrón nace de la necesidad de extender determinados comportamientos dentro de un mismo algoritmo por parte de diferentes entidades. 

Usamos el patrón template method...

* Una posible solución podría ser copiar el algoritmo en cada de las diferentes entidades cambiando la parte concreta en la que difieren.
* Esta solución tiene una consecuencia negativa ya que se genera código duplicado
* La solución que propone el patrón Template Method es abstraer todo el comportamiento que comparten las entidades en una clase (abstracta) de la que, posteriormente, extenderán dichas entidades

**Ejemplo:**
clase abstract Template{
  algoritmo(){
    //Logica BASE
  }
}

Clase claseUnoTemplate extends Template{
  algoritmo()
  {
   super.algoritmo();
   //logica adicional
  }
}
Clase claseDos implements Template{
  algoritmo()
  {
   
   super.algoritmo();
   //logica adicional
  }
}
* [templatemethod](https://github.com/jmillafilo/patrones-de-disenio/tree/master/comportamiento/templatemethod)



# SOLID
La intención es aplicar estos principios en conjunto para que sea
más probable obtener un software fácil de mantener y extender
en el tiempo

##S - Single Responsibility 
* Este principio se basa en el principio de
cohesión de Tom DeMarco.
* Principle Un objeto debería tener una única responsabilidad.
* Si una clase tiene más de una responsabilidad, entonces las mismas quedan acopladas.
* Los cambios en una responsabilidad pueden afectar o inhibir la capacidad de la clase para cumplir con el resto.
* Nunca debería haber más de una razón para que una clase cambie.
* Esta clase de acoplamiento conduce a diseños frágiles que se rompen de maneras inesperadas cuando se producen cambios


##O - Open/Closed Principle 
Las entidades de software deberían estar abiertas para extensión pero cerradas para modificación.

* Debiéramos escribir módulos que puedan ser extendidos sin necesidad de ser modificados.
* Al momento de hacer el diseño se tiene que pensar en hacerlo flexible para poder agregar una futura funcionalidad
* Están "Abiertos para Extensión": El comportamiento del módulo puede ser extendido.
* Están "Cerrados para Modificación": El código fuente del módulo es inviolable.


##L - Liskov Substitution Principle 
Un objeto en un programa podría ser reemplazado con instancias de sus subtipos sin alterar la
correctitud del programa.

* Liskov lo creo barbara Liskov.
* Al modificar el tipo de dato no deberia afectar al programa.
* En una interface se debe poner los metodos que comparten los tipos de datos y luego trabajar en base a dicha interface, como lo indica el patron de diseño *Facade*


##I - Interface Segregation Principle
Muchas interfaces específicas son mejores que interfaces de propósitos generales.

* esto es para no obligar a clases implementar clases que no utilizan.
* menos es más respecto a las interfaces


##D Dependency Inversion Principle
Deberíamos depender de las abstracciones y no de las concreciones.

* Los modulos de arto nivel no dependen de uno de menor nivel, al menos que utilice una abstracción
* 

