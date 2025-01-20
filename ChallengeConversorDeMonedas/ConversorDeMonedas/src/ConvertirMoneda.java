import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget,ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion ara hoy\n1"+monedaBase+" = " + monedas.coversion_rate()+ " "+monedaTarget);
        System.out.println("Ïngrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.coversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida +" "+ monedas.target_code());
    }
    public static void convertrOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Ingrese el codigo de la mooneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetvo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetvo, consulta, lectura);
    }
}
