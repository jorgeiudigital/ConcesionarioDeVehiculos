package models;

public class Auto extends Vehiculo{

    //Constructor
    public Auto(int código, String marca, String tipo, String modelo, int kilometraje) {
        super(código, marca, "Auto", modelo, kilometraje);
    }

    @Override
    public String toString() {
        return "Auto [Código=" + getCódigo() + ", Marca=" + getMarca() + ", Tipo=" + getTipo() + ", Modelo="
                + getModelo() + ", Kilometraje=" + getKilometraje() + "]";
    }
}
