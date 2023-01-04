public class Ejercicio_coche {

    public static void main(String[] args) {

// Llamado de la clase coche con el metodo de incremento
        Coche micoche = new Coche();
        // Invocando la función para incrementar las puertas
        micoche.ponerpuerta();
        micoche.ponerpuerta();
        micoche.ponerpuerta();
        micoche.ponerpuerta();

// Impresión en la consola del número de puertas del coche
        System.out.println("las puertas de mi coche son: " + micoche.Puerta);

        // Invocando la función para incrementar las llantas
        micoche.ponerllantas();
        micoche.ponerllantas();
        micoche.ponerllantas();
        micoche.ponerllantas();
        micoche.ponerllantas();

// Impresión en la consola del número de llantas del coche
        System.out.println("las llantas  de mi coche son: "+ micoche.llantas);
    }
}
// Creación del objeto coche
class Coche {
    // definiendo el tipo de variable puerta y llanta
    int Puerta = 0;
    int llantas = 0;
    // Creación del método de incremento de la puerta.
    public void ponerpuerta() {
        this.Puerta++;
    }
    // Creación del método de incremento de las lllantas.
    public void ponerllantas() {
        this.llantas++;
    }
}