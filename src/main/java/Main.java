import models.Auto;
import models.Vehiculo;
import services.ServiciosVentas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        ServiciosVentas ventas = new ServiciosVentas();


        int opcion;

        do {
            System.out.println("Bienvenido al sistema de ventas de vehículos");
            System.out.println("1. Agregar un Auto");
            System.out.println("2. Agregar una Motocicleta");
            System.out.println("3. Agregar una Camioneta");
            System.out.println("4. Mostrar Vehiculos");
            System.out.println("5. Registar Venta");
            System.out.println("6. Mostrar Ventas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();        // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el codigo del auto: ");
                    int codigoAuto = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAuto = sc.nextLine();
                    System.out.print("Ingrese el modelo del auto: ");
                    String modeloAuto = sc.nextLine();
                    System.out.print("Ingrese el kilometraje del auto: ");
                    int kilometrajeAuto = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    Auto auto = new Auto(codigoAuto, marcaAuto, "Auto", modeloAuto, kilometrajeAuto);
                    vehiculos.add(auto);
                    System.out.println("Auto agregado exitosamente");
                    break;


                case 2:
                    System.out.print("Ingrese el codigo de la motocicleta: ");
                    int codigoMoto = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la marca de la motocicleta: ");
                    String marcaMoto = sc.nextLine();
                    System.out.print("Ingrese el modelo de la motocicleta: ");
                    String modeloMoto = sc.nextLine();
                    System.out.print("Ingrese el kilometraje de la motocicleta: ");
                    int kilometrajeMoto = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    Vehiculo moto = new Vehiculo(codigoMoto, marcaMoto, "Motocicleta", modeloMoto, kilometrajeMoto);
                    vehiculos.add(moto);
                    System.out.println("Motocicleta agregada exitosamente");
                    break;


                case 3:
                    System.out.print("Ingrese el codigo de la camioneta: ");
                    int codigoCamioneta = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la marca de la camioneta: ");
                    String marcaCamioneta = sc.nextLine();
                    System.out.print("Ingrese el modelo de la camioneta: ");
                    String modeloCamioneta = sc.nextLine();
                    System.out.print("Ingrese el kilometraje de la camioneta: ");
                    int kilometrajeCamioneta = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    Vehiculo camioneta = new Vehiculo(codigoCamioneta, marcaCamioneta, "Camioneta", modeloCamioneta, kilometrajeCamioneta);
                    vehiculos.add(camioneta);
                    System.out.println("Camioneta agregada exitosamente")
                    ;
                    break;

                case 4:
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehiculos registrados");
                    } else {
                        System.out.println("Los vehiculos registrados son: ");
                        for (Vehiculo vehiculo : vehiculos) {
                            System.out.println(vehiculo);
                        }

                    }

                    break;

                case 5:
                    System.out.print("Ingrese el monto de la venta: ");
                    double montoVenta = sc.nextDouble();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el codigo del vehiculo: ");
                    int codigoVehiculo = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el apellido del cliente: ");
                    String apellidoCliente = sc.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = sc.nextLine();
                    System.out.print("Ingrese el documento del cliente: ");
                    String documentoCliente = sc.nextLine();

                    Vehiculo vehiculoEncontrado = null;
                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo.getCódigo() == codigoVehiculo) {
                            vehiculoEncontrado = vehiculo;
                            break;
                        }
                    }

                    if (vehiculoEncontrado != null) {
                        ventas.registrarVenta(montoVenta, vehiculoEncontrado, apellidoCliente, nombreCliente, documentoCliente);
                        System.out.println("Venta registrada exitosamente");
                    } else {
                        System.out.println("No se encontró un vehículo con el código ingresado.");
                    }

                    break;

                case 6:
                    ventas.mostrarVentas();
                    break;

                default:
                    if (opcion != 7) {
                        System.out.println("Opción no válida, por favor intente nuevamente.");
                    }
                    break;
            }


        }while (opcion != 7) ;
        System.out.println("Gracias por usar el sistema de ventas de vehículos");


    }

    }

