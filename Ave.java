public class Ave {
    String  color;
    int     patas;
    int     alas;
    int     plumas;


    public Ave(String color_de_ave){
        System.out.println("Hola soy un ave");
        color = color_de_ave;
    }

    String getColor(){
    return "El color del ave es: " + color;
    }

    void setColor(String color_de_ave){
        color = color_de_ave;
    }
    
    void comer(){
        System.out.println("El ave está comiendo");
    }
}
