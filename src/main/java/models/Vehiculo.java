package models;

public class Vehiculo {

    // Atributos

    private  int código;
    private String marca;
    private  String tipo; // Auto, Camioneta, Motocicleta
    private String modelo;
    private int kilometraje;

    public Vehiculo(int código, String marca, String tipo, String modelo, int kilometraje) {
        this.código = código;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Getters y Setters
    public int getCódigo() {
        return código;
    }
    public void setCódigo(int código) {
        this.código = código;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo [código=" + código + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo
                + ", kilometraje=" + kilometraje + "]";
    }
}
