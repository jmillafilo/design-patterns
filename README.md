# patrones-de-disenio

Se sube proyecto ocn distintas aplicaciones de los patrones de diseño mas usados.
en esos estan:

## Patrones de Creación (Creational Patterns)

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


##Patrones de Comportamiento (Behavioral Patterns)

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
