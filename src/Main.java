import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero=0, aleatorio, contador = 0;
        aleatorio = (int)(Math.random()*100);

        while (numero!=aleatorio){

            System.out.println("POR FAVOR SEÑOR USUARIO INGRESE UN NUMERO");
            numero=entrada.nextInt();
            contador++;

            if (numero<aleatorio) {
                System.out.println("el numero que intenta adivinar es mayor al que ingreso");
            } else if (numero>aleatorio) {
                System.out.println("el numero que intenta adivinar es menor al que ingreso");


            }
        }
        System.out.println("Muchas felicidades logro adivinar el numero en " + contador + "intentos.");




    }
}