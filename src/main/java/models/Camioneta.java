package models;

public class Camioneta extends Vehiculo {

    // Constructor
    public Camioneta(int código, String marca, String tipo, String modelo, int kilometraje) {
        super(código, marca, "camioneta", modelo, kilometraje);
    }

    @Override
    public String toString() {
        return "Camioneta [Código=" + getCódigo() + ", Marca=" + getMarca() + ", Tipo=" + getTipo() + ", Modelo="
                + getModelo() + ", Kilometraje=" + getKilometraje() + "]";
    }
}
