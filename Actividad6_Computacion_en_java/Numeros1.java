

public class Numeros1 {

    // Variable de instancia
    int num = 0;  // Ahora 'num' es accesible por toda la clase

    public static void main(String[] args) {
        
        // Llamada al método de la clase unoalcien
        Numeros1 obj = new Numeros1();
        obj.bucleWhile();  // Ejecutamos el bucle while usando el método

        unoalcien obj2 = obj.new unoalcien();
        obj2.pantalla();  // Llamamos a la clase unoalcien para mostrar el valor de 'num'

        System.out.println("\nBucle FOR que imprime los numeros del 1 al 100");
        // Bucle FOR
        for (int num2 = 1; num2 <= 100; num2++) {
            System.out.println(num2);
        }
    }

    // Método para el bucle WHILE
    public void bucleWhile() {
        System.out.println("\nBucle WHILE que imprime los numeros del 1 al 100");
        while(num < 100) {
            num++;
            System.out.println(num);
        }
    }

    // Clase unoalcien
    class unoalcien {

        public void pantalla() {
            // Usamos el valor de 'num' aquí
            System.out.println("El valor de 'num' es: " + num);
        }
    }
}
