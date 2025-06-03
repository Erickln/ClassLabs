class Gallo extends Ave {
    public Gallo(String color_de_ave) {
        super(color_de_ave);
    }

    @Override
    void setColor(String color_de_gallo) {
        System.out.println("El color del gallo es: " + color);
    }

    void kikiriquear(){
        System.out.println("Kikiriki");
    }
}

/* class Main {

    public static void main(String[] args) {
        Gallo gallito = new Gallo("Rojo");

        gallito.kikiriquear();

        gallito.setColor("Blanco");

        System.out.println(gallito.getColor());

        
    }
    
}
 */