import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("\n---------CONVERSOR DE MONEDAS ----------\n"+
                    "Bienvenidos al conversor de monedas\n"+
                    "Ingrese la conversionn que desea realizar\n\n"+
                    "1. Dollar a Pesoo argentino\n"+
                    "1. Peso Argentino a Dollar\n"+
                    "1. Dollar a Pesoo argentino\n"+
                    "1. Dollar a Real Brasilero\n"+
                    "1. Real Brasilero a Dollar\n"+
                    "1. Dollar a Peso colombiano\n"+
                    "1. Peso colombiano a Dollar\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS ","USD",consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","cop",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertrOtraMoneda(consulta,lectura);
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}
