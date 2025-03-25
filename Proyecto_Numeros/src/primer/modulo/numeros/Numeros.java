package primer.modulo.numeros;



import java.util.Scanner;


public class Numeros{



    public static void main(String[] args) {
        
        //bucle WHILE que imprime los numeros del 1 al 100
        System.out.println("\nBucle WHILE que imprime los numeros del 1 al 100");
        int num=0; 

        while(num<100){

            num++;

            int mostrar = num;
            System.out.println(mostrar);
        }

        //bucle FOR que imprime los números del 1 al 100
       System.out.println("\nBucle FOR que imprime los numeros del 1 al 100");
        
        for (int num2=1; num2<=100; num2++) {

            System.out.println(num2);
            

            
        }

        //Crear objetos sirve para poder utilizar lo que está dentro de la clase 

        Numeros obj = new Numeros(); //Se crea un objeto de la clase principal Numeros llamada obj
        //Como la clase unoalcien está dentro de la clase Numeros, primero se necesita un objeto de Numeros para poder crear un objeto de unoalcien.
        unoalcien obj1 = obj.new unoalcien();  // Se crea un objeto de la clase interna unoalcien llamada obj1 
        obj1.pantalla(); //Se llama al metodo pantalla el cual esta dentro de la clase unoalciens
        mayoroigual obj2 = obj.new mayoroigual();
        obj2.leerusuario();
        


    }

    class unoalcien{

        public void pantalla(){

             System.out.println("\nBucle FOR que imprime los numeros del 1 al 100 DIVIDIBLES ENTRE 2");
            //bucle FOR que imprime los números del 1 al 100
             for (int num2=1; num2<=100; num2++) {

                if(num2%2 ==0){

                    System.out.println(num2);

                }
            
            
             }
             System.out.println("\nBucle FOR que imprime los numeros del 1 al 100 DIVIDIBLES ENTRE 3");

             for (int num3=1; num3<=100; num3++) {
                if(num3%3 ==0){

                    System.out.println(num3);

                }
            
            }

        }

    

    }


    class mayoroigual{

        
        public void leerusuario(){

            int ingreso;

            System.out.println("Ingresa un valor numerico");
        do{
            Scanner leer = new Scanner(System.in); //sirve para leer lo que sea que sea ingresado por el usuario
            ingreso = leer.nextInt(); //lo que ingrese el usuario se leerá por la variable leer y se guardará en la variable ingreso

            
            if (ingreso<0){

                System.out.println("Ingrese un nusmero mayor o igual a 0");

            }

            //compruebes que es mayor o igual a cero, si no le deberá pedir al usuario nuevamente el numero
        }while(ingreso<0); 


        }
    }
}

