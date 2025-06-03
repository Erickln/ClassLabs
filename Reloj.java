public class Reloj {

    private int horas,
                minutos;

    private String meridiano = "";

    final private String meridianoAM = "AM";
    final private String meridianoPM = "PM";


    public Reloj(int horas, int minutos, String meridiano){
        this.horas      = horas;
        this.minutos    = minutos;
        this.meridiano  = meridiano;
    }

    void setHoras(int horas){
        if( horas >= 1 && horas <= 12 ){
            this.horas = horas;
        }

        System.out.println("Cantidad de horas a modificar inválida");
        return;
    }

    int getHoras(){
        return this.horas;
    }

    void setMinutos(int minutos){
        if (minutos >= 0 && minutos <= 60) {
            this.minutos = minutos;
        }
        System.out.println("Cantidad de minutos a modificar inválida");
        return;
    }

    int getMinutos(){
        return this.minutos;
    }

    public void setMeridiano(String meridiano) { //TODO Tarea
        //AM
        //PM
        if (meridiano == "AM" ) {
            
        } else{
            System.out.println("El meridiano proporcionado no es válido");
        }
        if (meridiano == "PM") {
            
        } else{
            System.out.println("El meridiano proporcionado no es válido");
        }


        this.meridiano = meridiano;
    }

    public String getMeridiano() {
        return meridiano;
    }

    void sumarHoras(int horasASumar){ //TODO 
        // La hora final debe ser válida
    }
    
    void sumarMinutos(int horasASumar){ //TODO
        // La hora final debe ser válida
    }

    @Override
    public String toString() {
        return this.horas + ":" + this.minutos + " " + this.meridiano;
    }

    //TODO Investigar métodos, atrivutos y clases estáticos con identifiadores "static"
}

class Main {

    public static void main(String[] args) {
        Reloj miReloj = new Reloj(10,10,"PM");
        

        System.out.println("El reloj tiene la hora:"    + miReloj.getHoras() +
                            "con los minutos:"          + miReloj.getMinutos() +
                            "con el meridiano:"         + miReloj.getMeridiano());

        miReloj.setHoras(20);

        
        System.out.println("El reloj tiene la hora:"    + miReloj.getHoras() +
                            "con los minutos:"          + miReloj.getMinutos() +
                            "con el meridiano:"         + miReloj.getMeridiano());

        miReloj.setMeridiano("XD");


        
        System.out.println("El reloj tiene la hora:"    + miReloj.getHoras() +
                            "con los minutos:"          + miReloj.getMinutos() +
                            "con el meridiano:"         + miReloj.getMeridiano());


        /* String a = "aaa";
        String b = "bbb";

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(a);
        stringBuffer.append(b);
        stringBuffer.append(miReloj); */
       /*  System.out.println(miReloj); */

        

        System.out.println(miReloj);
        System.out.println(miReloj.toString()); // TODO investigar cuando se usa o no el toString()
    }    

}

