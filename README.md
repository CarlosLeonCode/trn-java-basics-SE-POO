## Object

it could a conceptual or physical representation that has properties and behaviors.

- Example:
    - Physical: model.User (age, name, lastname = properties) | (run, walk, talk = actions or behaviors)
    - Conceptual: Session.

---
## Definitions - Key concepts

### Abstraction:

- When you analyze an object to become it a class representation

### Classes:

- Are like molds that allow to us create objects. They are created after abstraction.

### Objects:

- Are the result of the model (classes)
- these are compose by a group of attributes and methods.

### Variables

- They are elemental entities like numbers, characters, true or false, etc..

### Constructors methods:

- This creates new instances of a class.
- It has the same name that the class name.
- it uses the `new` keyword to call it.
- It could have 0 or more arguments.
- It does not return values.

### Static Methods:

- We can use them in all the class. That's why they belongs to them not to objects.
- They are defined by `static` keyword
- They are accessed through class name after a dot `.`, e.x:`Class.Method`
> (Check ui.UIMenu class as example)

### Constants

Constants doesn't change its value.
- We declare it with the keyword `final`. E.x: `public static final double PI = 3.14`.
- We define it as capital.

### Methods Overload (Sobrecarga)

- We use them when we need methods with the same name but with different arguments.
> Check model.Doctor constructor on model.Doctor Class as example.

### Encapsulation

- Defines the access level of a variable or attribute.
- We use Access modifiers. Those are:
  - Public: Scope -> Class, Package, SubClass, others.
  - Protected: Scope -> Class, Package, SubClass.
  - Default: Scope -> Class, Package.
  - Private: Scope -> Class, Package.
> Check model.Patient class as example.

### Getters & Setters

- Allow to us define methods for access to class attributes.

### Arrays

- These can storage primitives and objects

### Collections

- Only can storage objects.

### Variables vs Objects on Memory

- Variables use `Stack memory` who saves the value directly
- Objects (arrays or lists) use `heap memory` who saves the memory address of the object
```python
my_dict = {'key': 'value'}
another_dict = my_dict
another_dict['key'] = 'new_value'
print(my_dict['key'])  # Imprime 'new_value'. 
```
> La memoria Stack es mucho más rápida y nos permite almacenar nuestra información de forma “ordenada”. Aquí se guardan las variables y sus valores de tipos de datos primitivos (booleanos, números, strings, entre otros).
> Los objetos también usan la memoria Stack, pero no para guardar su información, sino para guardar las coordenadas a la verdadera ubicación del objeto en la memoria Heap, una memoria que nos permite guardar grandes cantidades de información, pero con un poco menos de velocidad.

### Nested Classes

Las clases anidadas son clases definidas dentro de otra clase. 
Esto permite estructurar y organizar el código en un 
nivel lógico jerárquico. En Java 
(y otros lenguajes orientados a objetos), las clases anidadas 
se dividen en dos tipos principales:
- Clases estáticas internas
- Clases internas (no estáticas)

Las Clases Anidadas o Clases Helper son clases dentro de otras 
clases que agrupamos por su lógica y/o 
características en común. Ejemplo:

```java
public class Product {
    // Clase anidada no estática
    class Details {
        private String manufacturer;
        private double weight;

        Details(String manufacturer, double weight) {
            this.manufacturer = manufacturer;
            this.weight = weight;
        }

        void printDetails() {
            System.out.println("Fabricante: " + manufacturer);
            System.out.println("Peso: " + weight + " kg");
        }
    }

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public void showProductInfo(String manufacturer, double weight) {
        System.out.println("Producto: " + name);
        Details details = new Details(manufacturer, weight); // Crear instancia de la clase anidada
        details.printDetails();
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop");
        product.showProductInfo("Dell", 2.5);
    }
}
```

### Inheritance

Allow to us abstract and share logic. We have Superclass and child classes.
- Superclass: It has defined basic logic to share and abstract
- child classes: It has logic defined into superclass.

### Multiple Inheritance
> Java doesn't allow multiple Inheritance!

### This and Super

- This: References to the local class.
- Super: References to the class from inheritance comes (Parent class).

### We have 2 kinds of polymorphism

#### En tiempo de ejecución (Dinámicos)
Ocurre cuando la decisión sobre qué método invocar se toma en tiempo de 
ejecución, basado en el objeto real (no en la referencia). En este tipo encontramos:

- Sobreescritura de métodos (Method Overriding):
  Cuando una clase hija redefine un método de la clase padre.

  ```java
    class Animal {
      public void sound() {
          System.out.println("El animal hace un sonido");
      }
    }
    
    class Dog extends Animal {
      @Override
      public void sound() {
        System.out.println("El perro ladra");
      }
    }
    
    class Cat extends Animal {
      @Override
      public void sound() {
        System.out.println("El gato maúlla");
      }
    }
    
    public class Main {
      public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Polimorfismo dinámico
        myAnimal.sound();           // Salida: El perro ladra
        
        myAnimal = new Cat();
        myAnimal.sound();           // Salida: El gato maúlla
      }
    }
  ```
Características:
- Resuelto en tiempo de ejecución.
- Requiere herencia.
- Se logra gracias al uso de referencias de clase padre y objetos de clase hija.

#### En tiempo de compilación (Estáticos)
Se logra cuando la decisión sobre qué método invocar se toma en tiempo de compilación.
En este tipo encontramos:

- Sobrecarga de métodos (Method Overloading):
  Cuando definimos varios métodos con el mismo nombre pero diferentes parámetros.

  ```java
    class Calculator {
      // Sobrecarga del método sum
      public int sum(int a, int b) {
          return a + b;
      }
      public double sum(double a, double b) {
          return a + b;
      }
    }
  
    public class Main {
      public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));         // Salida: 5
        System.out.println(calc.sum(2.5, 3.5));     // Salida: 6.0
      }
    }
  ```
Características:
- Resuelto durante la compilación.
- No depende de la herencia ni del uso de clases padre/hijo.


### Interfaces
These are almost similar to classes but their differences are:
- Defines behaviors and rules but not logic.
- Defines behaviors that are redundant, and we use in many classes.
- Defines how whe must write and define a class that implements the interface. This means:

  - Attributes
  - Methods
  - Arguments
  - Return lists

- We can implement all interfaces that we want in a class. 
- We have to implement all the definitions inside the interface into the class.

  Example
  ```java
    // Interface definition
    interface Animal {
        void sound();  // Abstract method
    }
    
    // Interface implementation and class definition
    class Dog implements Animal {
        public void sound() {
            System.out.println("Woof");
        }
    }
  
    // Usage
    public class Main {
        public static void main(String[] args) {
            Animal myDog = new Dog();  // Create a Dog object
            myDog.sound();  // Call the sound method
        }
    }
  ```
  
### Abstract classes
Allow to us:
1.	Provide a base structure for other classes while enforcing certain methods to be implemented by child classes.
2.	Allow partial implementation of functionality while leaving specific details to subclasses.
3.	Facilitate code reusability and maintain a common interface for a family of related classes.
4. These always are dad classes.

When to Use Abstract Classes
-	Use abstract classes when multiple related classes share some common behavior but also have specific behaviors that differ.
-	Example: In a game, all characters might have a move() method, but their movement logic may vary.

Example:

Abstract Class Definition
```java
abstract class Animal {
    void sleep() {
        System.out.println("This animal sleeps.");
    }

    abstract void sound(); // Abstract method (no implementation)
}
```

Concrete Implementation of Abstract Class
```java
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```
Usage
```java
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sleep();   // Shared behavior
        myDog.sound();   // Dog-specific behavior

        myCat.sleep();   // Shared behavior
        myCat.sound();   // Cat-specific behavior
    }
}
```
```bash
This animal sleeps.
Woof
This animal sleeps.
Meow
```

### Herencia en interfaces
Las interfaces pueden heredar de otras interfaces utilizando la palabra clave `extends`, 
el concepto de herencia se aplicará como naturalmente se practica en clases, 
es decir, la interfaz heredará y adquirirá los métodos de la interfaz padre.

Una cosa interesante que sucede en caso de herencia con interfaces es que, aquí 
sí es permitido la herencia múltiple como ves a continuación:

```java
public interface IReadable {
	public void read();
}


public interface Visualizable extends IReadable, Serializable {
	public void setViewed();
	public Boolean isViewed();
	public String timeViewed();
}
```