import javax.imageio.ImageReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //-Vehiculo

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce los datos sobre el vehículo:");
        System.out.print("Matrícula: ");
        String Matricula=sc.nextLine();
        System.out.print("Marca: ");
        String Marca=sc.nextLine();
        System.out.print("Modelo:");
        String Modelo=sc.nextLine();
        System.out.print("Color: ");
        String Color=sc.nextLine();
        System.out.print("Combustible: ");
        String Combustible=sc.nextLine();
        System.out.print("Motor: ");
        String Motor=sc.nextLine();
        System.out.print("Caballos: ");
        String Caballos=sc.nextLine();

        System.out.println("----------------------Vehículo---------------------");
        Vehiculo vehiculo1 =new Vehiculo();
        vehiculo1.setMatricula(Matricula);
        vehiculo1.setMarca(Marca);
        vehiculo1.setModelo(Modelo);
        vehiculo1.setColor(Color);
        vehiculo1.setCombustible(Combustible);
        vehiculo1.setMotor(Motor);
        vehiculo1.setCaballos(Caballos);

        System.out.println("Matricula: "+ vehiculo1.getMatricula());
        System.out.println("Marca: "+ vehiculo1.getMarca());
        System.out.println("Modelo: "+ vehiculo1.getModelo());
        System.out.println("Color: "+ vehiculo1.getColor());
        System.out.println("Combustible: "+ vehiculo1.getCombustible());
        System.out.println("Motor: "+ vehiculo1.getMotor());
        System.out.println("Caballos: "+ vehiculo1.getCaballos());



        //-Cliente

        System.out.println("Introduzca sus datos por favor:");
        System.out.print("DNI: ");
        String Dni=sc.nextLine();
        System.out.print("Nombre: ");
        String Nombre=sc.nextLine();
        System.out.print("Apellidos: ");
        String Apellidos=sc.nextLine();
        System.out.print("Dirección: ");
        String Direccion=sc.nextLine();


        Cliente cliente1 = new Cliente();
        cliente1.setNombre(Nombre);
        cliente1.setDni(Dni);
        cliente1.setApellidos(Apellidos);
        cliente1.setDireccion(Direccion);


        System.out.println("------------------Cliente-----------------------");
        System.out.println("DNI: "+ cliente1.getDni());
        System.out.println("Cliente: "+ cliente1.getNombre() +" "+ cliente1.getApellidos());
        System.out.println("Dirección: "+ cliente1.getDireccion());



        //-Venta

        System.out.println("Por favor rellena los siguientes datos para realizar la venta del "+ vehiculo1.getVenta().getVehiculo());
        System.out.print("Código de venta: ");
        String CodigoVenta=sc.nextLine();
        System.out.print("Fecha de venta: ");
        String FechaVenta=sc.nextLine();
        System.out.print("Forma de pago: ");
        String FormaPago=sc.nextLine();
        System.out.print("Precio de venta: ");
        String PrecioVenta=sc.nextLine();


        Venta venta1 = new Venta();
        venta1.setCodigoVenta(CodigoVenta);
        venta1.setFechaVenta(FechaVenta);
        venta1.setFormaPago(FormaPago);
        venta1.setPrecioVenta(venta1.getPrecioVenta());


        System.out.println("-----------------Venta----------------------");
        System.out.println("Vehiculo: "+ vehiculo1.getMarca());
        System.out.println("Cliente: "+ cliente1.getNombre() +" "+ cliente1.getApellidos());
        System.out.println("Fecha de venta: "+ venta1.getFechaVenta());
    }
}