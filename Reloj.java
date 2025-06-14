public class Reloj {

    private int horas,
            minutos;

    private String meridiano = "";

    public static int cantidadDeRelojes = 0;
    final public static String meridianoAM = "AM";
    final public static String meridianoPM = "PM";

    public Reloj(int horas, int minutos, String meridiano) {
        this.horas = horas;
        this.minutos = minutos;
        this.meridiano = meridiano;
        cantidadDeRelojes++;
    }

    void setHoras(int horas) {
        if (horas >= 1 && horas <= 12) {
            this.horas = horas;
        }

        System.out.println("Cantidad de horas a modificar inválida");
        return;
    }

    int getHoras() {
        return this.horas;
    }

    void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Cantidad de minutos a modificar inválida");
        }
    }

    int getMinutos() {
        return this.minutos;
    }

    public void setMeridiano(String meridiano) {
        if (meridiano.equals("AM") || meridiano.equals("PM")) {
            this.meridiano = meridiano;
        } else {
            System.out.println("El meridiano proporcionado no es válido");
        }
    }

    public String getMeridiano() {
        return this.meridiano;
    }

    void sumarHoras(int horasASumar) {
        if (horasASumar <= 0)
            return;

        int totalHoras = this.horas + horasASumar;
        while (totalHoras > 12) {
            totalHoras -= 12;
            cambiarMeridiano(); // TODO Crear el método para que funcione
        }
        this.horas = totalHoras;
    }



    void sumarMinutos(int minutosASumar) {
        if (minutosASumar <= 0)
            return;

        int totalMinutos = this.minutos + minutosASumar;
        int horasExtra = totalMinutos / 60;
        this.minutos = totalMinutos % 60;
        sumarHoras(horasExtra);
    }

    void cambiarMeridiano(){
        //this.meridiano = this.meridiano.equals(meridiano);

    }

    @Override
    public String toString() {
        return this.horas + ":" + this.minutos + " " + this.meridiano;
    }

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

        System.out.println(Reloj.cantidadDeRelojes);

        System.out.println(miReloj.getMeridiano() == Reloj.meridianoAM || miReloj.getMeridiano() == Reloj.meridianoPM);

        miReloj.sumarHoras(5);

        
        System.out.println(miReloj.getHoras()==3);

        miReloj.sumarMinutos(87);

        
        System.out.println(miReloj.getHoras()==4);
        System.out.println(miReloj.getHoras()==37);


        if ("AM" == Reloj.meridianoAM || "AM" == Reloj.meridianoPM){
        miReloj.setMeridiano("AM");
        }

        
        System.out.println(miReloj.getMeridiano() == Reloj.meridianoAM || miReloj.getMeridiano() == Reloj.meridianoPM);

        
        miReloj.sumarHoras(15);


        
        System.out.println(miReloj.getHoras()==7);
        System.out.println(miReloj.getHoras()==37);
        System.out.println(miReloj.getMeridiano()=="PM");


        miReloj.sumarHoras(-540);
        miReloj.sumarMinutos(-30);
        miReloj.setMeridiano("DX");


        //TODO Investigar covneciones de nombres de varaibles, métodos y clases
        //TODO agregar comentarios descriptivos y nombres de varaibles significativos
        //TODO Investigar variable genéricas
        /**TODO Crear la clase Calculadora:
         * Poder Sumar, restar, multiplcar, dividir, exponenciales y logaritmos. 
         * (Al menos dos métodos de esta clase deben de reutilizar código de si mismo) 
         * Todos los métodos van a ser estáticos
         * Contener constantes significativas de calculadora, PI, Euler, ...
         * Un atributo ANS que guarde el último resultado que haya regresado algún método de la clase
         * 
         * areaDeUnCirculo{
         * 
         *  return Calculadora.exponencial(Calculadora.PI,2) * 10
         * 
         * 
         * }
         * 
         * 
         * 
         * Métodos para:
         * Sacar el area de cuadrado
         * Sacar el area de circulo
         * Sacar el area de esfera
         * Sacar el area de dodecaedro
         * 
         **/




    }    
    
    static{System.out.println("statico");}

}

