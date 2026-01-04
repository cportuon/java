public class OperatorsExercises {

    public static void main(String[] args){

        // 1. Crea una variable con el resultado de cada operación aritmética.
            var result = 0;

            result = 2 + 3;
            System.out.println(result);
            result = 4 - 5;
            System.out.println(result);
            result = 3 * 6;
            System.out.println(result);
            result = 6 / 2;
            System.out.println(result);
            result = 7 % 4;

        // 2. Crea una variable para cada tipo de operación de asignación.
            var a = 2;
            var b = 3;

            a = b;
            System.out.println(a);
            a = b + 4;
            System.out.println(a);
            a += 1;
            System.out.println(a);
            a -= 2;
            System.out.println(a);
            a *= 2;
            System.out.println(a);
            a /= 2;
            System.out.println(a);
            a %= 2;
            System.out.println(a);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
            System.out.println(a == 0);
            System.out.println(a <= 7);
            System.out.println(a != 1);


        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

            System.out.println(a == 2);
            System.out.println(a >= 3);
            System.out.println(a != 0);

        // 5. Utiliza el operador lógico and.

            System.out.println(a < 3 && a != 7);

        // 6. Utiliza el operador lógico or.

            System.out.println(a < 3 || a != 7);

        // 7. Combina ambos operadores lógicos.
            System.out.println(a >= 3 &&  a == 0 || a == 7);
        // 8. Añade alguna negación.
            System.out.println(!(a < 3) || a == 7);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
            System.out.println(a);
            System.out.println(a--);
            System.out.println(a);
            System.out.println(++a);
            System.out.println(a);
            System.out.println(--a);
            System.out.println(a);

        // 10. Combina operadores aritméticos, de comparación y lógicos.

            System.out.println((a + 1) == 1 && a <= 5 );
    }


}
