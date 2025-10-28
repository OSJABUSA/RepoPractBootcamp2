public class Practicante {
    private String universidad;
    private int horasPorSemana;

     // Constructores sin parametros y con parametros

     public Practicante(){
        super();
        this.universidad = "";
        this.horasPorSemana = 0;
    }

     public Practicante(String universidad, int horasPorSemana) {
        this.universidad = universidad;
        this.horasPorSemana = horasPorSemana;
     }

     public String getUniversidad() {
         return universidad;
     }

     public void setUniversidad(String universidad) {
         this.universidad = universidad;
     }

     public int getHorasPorSemana() {
         return horasPorSemana;
     }

     public void setHorasPorSemana(int horasPorSemana) {
         this.horasPorSemana = horasPorSemana;
     }

     @Override
     public String toString() {
        return "Practicante [universidad=" + universidad + ", horasPorSemana=" + horasPorSemana + "]";
     }

    
}
