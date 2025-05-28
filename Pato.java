class Pato {
    private String  color;
    private int     patas;
    private int     alas;
    private int     plumas;

    public Pato(String color_de_pato){
        System.out.println("Hola soy un pato");
        color = color_de_pato;
    }

    // Getters
    // Setters

    String getColor(){
        return "El color del pato es: " + color;
    }

    void setColor(String color_de_pato){
        color = color_de_pato;
    }

    void planear(){
        System.out.println("El pato está planeando");
    }

    void comer(){
        System.out.println("El pato está comiendo");
    }

    void gaznar(){
        System.out.println("El pato está gaznando");

    }
}

class Main {

    public static void main(String[] args) {
        Pato pato = new Pato("Naranja");
        Pato pata = new Pato("Blanco");
        pato.gaznar();

        
        System.out.println(pato.getColor());
        pato.setColor("Negro");
        System.out.println(pato.getColor());


        
    }
    
}
