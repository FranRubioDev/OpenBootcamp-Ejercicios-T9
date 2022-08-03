/*
Crea una clase Persona con las siguientes variables:

        La edad

        El nombre

        El teléfono

        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
*/

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Fran";
        cliente.edad = 29;
        cliente.telefono = 666666666;
        cliente.credito = 300;
        System.out.println("Yo soy " + cliente.nombre + ", tengo " + cliente.edad + " anos, mi telefono es " + cliente.telefono
                + " y mi saldo disponible es " + cliente.credito + " euros");

        trabajador.nombre = "Francisco";
        trabajador.edad = 30;
        trabajador.telefono = 777777772;
        trabajador.salario = 27000;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " anos, mi telefono es " + trabajador.telefono
                + " y mi salario es " + trabajador.salario + " euros netos al mes");

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona {
    int salario;
}

