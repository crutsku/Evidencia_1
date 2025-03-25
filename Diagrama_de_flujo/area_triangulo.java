import java.util.Scanner;

public class area_triangulo {
   
    public static void main(String[] args) {
        String respuesta;

    do{
        System.out.println("Area de un triangulo");

        System.out.println("\nEscribe la base de tu triangulo ");

         Scanner leer = new Scanner(System.in); //sirve para leer lo que sea que sea ingresado por el usuario
         int base = leer.nextInt(); //lo que ingrese el usuario se leerá por la variable leer y se guardará en la variable base

         System.out.println("Ecribe la altura de tu triangulo");
         int altura = leer.nextInt(); //lo que ingrese el usuario se guardará en la variable altura

         double area = (base * altura) / 2.0;
         System.out.println("El area del triangulo es: " + area);


         System.out.println("Desea repetir?");
        do {
         respuesta = leer.next().toLowerCase();
         // Si la respuesta es diferente de si o de no entonces
                if (!respuesta.equals("si") && !respuesta.equals("no")) {
                    //imprimirá este mensaje
                    System.out.println("Error: Solo puedes escribir 'si' o 'no'. Inténtalo de nuevo.");
                }

        // Si el usuario dice "no", mostrar "Finalizado" antes de salir
            if (respuesta.equals("no")) {
                System.out.println("Finalizado.");
            }
        //repetir el bucle hasta que la respuesa del usuario sea si o no
        } while (!respuesta.equals("si") && !respuesta.equals("no")); 
    }while(respuesta.equals("si"));

         

    }
}
