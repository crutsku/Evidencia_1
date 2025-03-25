
public class PromedioCalif{

    //atributo nombre
    String nombre= "Juanita";
    //atributo array con las 5 calificaciones 
    int [] valoresnum = {90, 50, 30, 100, 75};
    
    

    //METODO que recibe las calificaciones (valoresnum) y da el promedio
    //utilizamos public int para que el método pueda retornar un número entero (el promedio)
    //Tambien utilizamos public int para poder utilizar la variable de este metodo en otro metodo
        public int promediocalif(){
            int suma = 0;
            

            //para saber cuantos numeros hay dentro del array (valoresnum) se utiliza .length
            //este bucle for solo está recorriendo las posiciones de cada numero, pero no sabe el valor que tiene cada posicion
            for (int i=0; i<valoresnum.length; i++){

                //Para ver qué números hay en el array, se tendría que acceder a ellos por sus posiciones utilizando valoresnum[i]
                //Aquí se suma la variable suma (inicializada en 0) con la posición del número en el array
                suma = suma+valoresnum[i];
            }
            
            //Una vez que se termina el bucle, o sea, que todos los numeros del array fueron sumados
            //se divide el resultado de suma entre la cantidad numérica de valoresnum
            return suma/valoresnum.length;

            
            
            
        }
        
    //METODO que obtiene la calificacion final segun el promedio
    //utilizamos public char para que el método pueda retornar un carácter (la calificación, A, B,C)
    //este método utiliza la variable promedio,  que contiene el promedio
        public char califfinal(int promedio){
            

            if (promedio<=50) return 'F';
            if (promedio>=51 && promedio<=60) return 'E';
            if (promedio>=61 && promedio<=70) return 'D';
            if (promedio>=71 && promedio<=80) return 'C';
            if (promedio>=81 && promedio<=90) return 'B';
            if (promedio>=91 && promedio<=100) return 'A';
            return 'S';
        }

        //método que imprimirá los valores en pantalla
        //se usa void porque este método no retornará nada
        //se definen las variables que se usarán
        public void imprimir(int promedio, String nombre, int [] valoresnum, char calificacion){
            
            System.out.println("\nNombre del estudiante: " +nombre);

           

                for (int i=0; i<valoresnum.length; i++){

                    int p=i+1;
                    
                    System.out.println("Califiacion "+ p + ": "+ valoresnum[i]);


                }

            System.out.println("Promedio del estudiante: "+ promedio);

            System.out.println("Calificacion final: " + calificacion+"\n");






            
            


        }

    
 
    public static void main(String[] args) {

         PromedioCalif obj = new PromedioCalif();

        //se llama al método promediocalif y lo que retorne el método (el promedio) se guarda en la variable promedio
        //obj sirve para acceder a un método de la clase
        int promedio = obj.promediocalif();
        //se llama al método califfinal y lo que retorne el método se guarda en la variable calificacion
        char calificacion = obj.califfinal(promedio);
        //se llama al método imprimir y se le define los parámetros que usará. Posteriormente se ejecuta lo que tenga el método
        obj.imprimir(promedio, obj.nombre, obj.valoresnum, calificacion);

    
        
    }
}

