package services;

import models.Vehiculo;
import models.Venta;

import java.util.ArrayList;
import java.util.List;

public class ServiciosVentas {

    List<Venta> ventas = new ArrayList<>();

    public void registrarVenta(double montoventa, Vehiculo vehiculo, String apellidoCliente, String nombreCliente, String documentoCliente) {
        Venta venta = new Venta(montoventa, vehiculo, apellidoCliente, nombreCliente, documentoCliente);
        ventas.add(venta);
    }

    public void mostrarVentas() {

        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas");
        } else {
            System.out.println("Las ventas registradas son: ");
            for (Venta venta : ventas) {
                System.out.println(venta);
            }

        }

    }
}
