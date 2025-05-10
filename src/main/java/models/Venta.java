package models;

public class Venta {

    //Atributos
    private double montoventa;
    private Vehiculo codigovehiculo;
    private String apellidoCliente;
    private String nombreCliente;
    private String documentoCliente;

    //Constructor
    public Venta(double montoventa, Vehiculo codigovehiculo, String apellidoCliente, String nombreCliente, String documentoCliente) {
        this.montoventa = montoventa;
        this.codigovehiculo = codigovehiculo;
        this.apellidoCliente = apellidoCliente;
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
    }

    @Override
    public String toString() {
        return "ServicioVentas{" +
                "montoventa=" + montoventa +
                ", vehiculo=" + codigovehiculo.getCódigo() +
                ", marca = " + codigovehiculo.getMarca() +
                ", apellidoCliente='" + apellidoCliente + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", documentoCliente='" + documentoCliente + '\'' +
                '}';
    }
}
