package Fundamentals.Lesson1;

class Person {
    private final String nombre;
    private final int edad;

    // Constructor
    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // toString
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    record PersonWithRecord(String name, int age) {
        // Método adicional
        public String greet() {
            return "Hola, mi nombre es " + name + " y tengo " + age + " años.";
        }
    }

    public static void main(String[] args) {
        // Uso de la clase tradicional
        Person person1 = new Person("Carlos", 30);
        System.out.println(person1); // Person[name=Carlos, age=30]

        // Uso del record
        PersonWithRecord person2 = new PersonWithRecord("Ana", 25);
        System.out.println(person2); // PersonWithRecord[name=Ana, age=25]
        System.out.println(person2.greet()); // Hola, mi nombre es Ana y tengo 25 años.
    }

}
