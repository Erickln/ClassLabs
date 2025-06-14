public class ContenedorDeArreglo<T>{ //TODO el contenedor tiene que ser capaz de contener dos arreglos diferentes de diferentes clases
    private T[] contenedor;


    public ContenedorDeArreglo(T[] contenerdor){
        //TODO Terminar el método para igualar los atributos al parametros
    }
    @Override
    public String toString() { // TODO probar que imprima las clases de manera legible
        // TODO Imprimir los dos contenedores en lugar de solo uno
        String temp = "";

        for (int i = 0; i < contenedor.length; i++) {
            temp += contenedor[i];
        }
        return temp;
    }
}

class Main{
    public static void main(String[] args) {
        Integer[] arreglo = {1,2,3,4};

        ContenedorDeArreglo<Integer> CDArr = new ContenedorDeArreglo<Integer>(arreglo);

        System.err.println(CDArr);
        
    }
}