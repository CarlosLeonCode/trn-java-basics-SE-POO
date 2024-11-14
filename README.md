## Object
it could a conceptual or physical representation that has properties and behaviors.

- Example:
    - Physical: User (age, name, lastname = properties) | (run, walk, talk = actions or behaviors)
    - Conceptual: Session.

---
## Definitions - Key concepts

### Abstraction:
- When you analyze an object to become it a class representation

### Classes:
- Are like molds that allow to us create objects. They are created after abstraction.

### Objects:
- Are the result of the model (classes)

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
> (Check UIMenu class as example)

### Constants
Constants doesn't change its value.
- We declare it with the keyword `final`. E.x: `public static final double PI = 3.14`.
- We define it as capital.

### Methods Overload (Sobrecarga)
- We use them when we need methods with the same name but with different arguments.
> Check Doctor constructor on Doctor Class as example.

### Encapsulation
- Defines the access level of a variable or attribute.
- We use Access modifiers. Those are:
  - Public: Scope -> Class, Package, SubClass, others.
  - Protected: Scope -> Class, Package, SubClass.
  - Default: Scope -> Class, Package.
  - Private: Scope -> Class, Package.
> Check Patient class as example.

### Getters & Setters
