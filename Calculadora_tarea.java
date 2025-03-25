import java.util.Scanner;

public class Calculadora_tarea{
    public static void main(String[] args) {
        System.out.println("\nCalculadora");
        System.out.println("Ingrese el primer valor numerico");
         Scanner leer = new Scanner(System.in); //lee lo que ingreso el usuario y lo guarda en variable leer 

    do{
            if (!leer.hasNextDouble()) { //si leer es diferente a un numero
                System.out.println("El valor ingresado no es un numero. Intente nuevamente.");//imprimira esto
                  leer.next();  // Limpiar la entrada incorrecta
            }
    }while(!leer.hasNextDouble())  ; //hacerlo mientras la variable sea diferente de un numero
    int primernum = leer.nextInt();
    
    System.out.println("Ingrese el segundo valor numerico");
    Scanner leer2 = new Scanner(System.in);

    do { 
        if(!leer2.hasNextDouble()){
            System.out.println("El valor ingresado no es un numero. Intente nuevamente.");
            leer2.next();
        }
        
    } while (!leer2.hasNextDouble());
    int segundonum = leer2.nextInt();

    System.out.println("Numeros ingresados: " + primernum + " y " + segundonum);
    System.out.println("Que operacion desea hacer?");
    System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Elevar al cuadrado");

    Scanner leer3 = new Scanner(System.in);

    
    int operacion;


//para verificar si es un numero
do {
            
            while (!leer3.hasNextInt()) {  // Verifica que el usuario ingrese un número
                System.out.println("El valor ingresado no es un numero. Intente nuevamente.");
                leer3.next(); // Limpia el input incorrecto
            }
            operacion = leer3.nextInt();

            if (operacion < 1 || operacion > 5) {
                System.out.println("Debe ingresar un numero de la lista de opciones.");
            }
        } while (operacion < 1 || operacion > 5);

    
    switch (operacion){

        case 1:
            System.out.println("Suma:");
            int suma = primernum + segundonum;
            System.out.println(primernum + " + " + segundonum + " es igual a: " + suma);
        break;

        case 2:
            System.out.println("Resta:");
            int resta = primernum - segundonum;
            System.out.println(primernum + " - " + segundonum + " es igual a: " +resta);
        break;

        case 3:
            System.out.println("Multiplicacion:");
            int multiplicar = primernum * segundonum;
            System.out.println(primernum +" * " +segundonum+ " es igual a: "+multiplicar);
        break;

        case 4:
            System.out.println("Division:");
            int dividir = primernum / segundonum;
            System.out.println(primernum +" / "+segundonum+" es igual a: " +dividir);
        break;

        case 5:
            System.out.println("Elevado al cuadrado:");
            int primerelevado = primernum*primernum;
            int segundoelevado = segundonum*segundonum;

            System.out.println("Los numeros elevados al cuadrado son: \n"+ primernum+"^2 = "+primerelevado+"\n"+segundonum+ "^2 = "+segundoelevado);
    }
    

    
    
    }





}