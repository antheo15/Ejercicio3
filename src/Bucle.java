public class Bucle {

    public static void main(String[] args) {

        String[] nombres = {"Hola", " ", "mundo", "!"};
        String resultado = "";

        for (String texto : nombres) {
            resultado += texto;
        }

        System.out.println(resultado);
    }

}

