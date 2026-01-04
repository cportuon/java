public class BeginnerExercises {

    public static void main(String[] args){

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "Cosme Portuondo Bárcena";
        System.out.println(myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myDate = 37;
        System.out.println(myDate);

        // 3. Crea una variable double con tu altura en metros.
        double myHeigth = 1.69;
        System.out.println(myHeigth);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // 5. Declara una constante con tu email.
        final String MYMAIL = "cosmeportubar@gmail.com";
        System.out.println(MYMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInitial = 'c';
        System.out.println(myInitial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String myLocality = "Getxo";
        System.out.println(myLocality);
        myLocality = "Sopela";
        System.out.println(myLocality);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
       int a = 2;
       int b = 3;
       System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(myLocality.getClass().getSimpleName());
        System.out.println(myName.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int n;

        n = 5;
        System.out.println(n);
    }

}
