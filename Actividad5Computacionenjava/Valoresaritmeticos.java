public class Valoresaritmeticos{

    public static void main(String[] args) {

        //Definir cuatro variables de tipo flotante 
        float Op1;
        float Op2;
        float Op3;
        float Op4;

        //Define tres variables más
        int num1= 3;
        int num2= 2;
        int num3= 8;


        //Suma el primer valor más el segundo valor y al resultado réstale el tercer valor.
        float resultado = num1+num2;
        Op1 = resultado - num3;

        //Resta el segundo valor menos el tercer valor y multiplica el resultado por el primer valor.
        float resultado1 = num2 - num3;
        Op2 = resultado1 * num1;

        //Multiplica el primer valor por el segundo valor y el resultado multiplícalo por el tercer valor.
        float resultado2 = num1 * num2;
        Op3=resultado2 * num3;

        //Divide el tercer valor entre el primer valor y al resultado súmale el segundo valor.
        float resultado3 = num3/num1;
        Op4=resultado3+num2;

        //Imprime en pantalla los resultados    
        System.out.println("\nTus valores son: \nPrimer valor: " + num1 + "\nSegundo valor: " + num2 + "\nTercer valor: " +  num3);
        System.out.println("\nTus resultados de tus operaciones son : \nPrimera operacion: " + Op1 + "\nSegunda operacion: " + Op2 + "\nTercera operacion: " +  Op3 + "\nCuarta operacion " +Op4);
    }
    
    
}