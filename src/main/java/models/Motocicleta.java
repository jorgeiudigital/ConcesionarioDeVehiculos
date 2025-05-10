package models;

public class Motocicleta extends Vehiculo {

    // Constructor
    public Motocicleta(int código, String marca, String tipo, String modelo, int kilometraje) {
        super(código, marca, "Motocicleta", modelo, kilometraje);
    }

    @Override
    public String toString() {
        return "Motocicleta [Código=" + getCódigo() + ", Marca=" + getMarca() + ", Tipo=" + getTipo() + ", Modelo="
                + getModelo() + ", Kilometraje=" + getKilometraje() + "]";
    }
}
