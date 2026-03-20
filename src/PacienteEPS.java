public class PacienteEPS extends Paciente{

    String nombreEPS;

    public PacienteEPS() {
    }

    public PacienteEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    public PacienteEPS(String nombre, int documento, double costoConsulta, String nombreEPS) {
        super(nombre, documento, costoConsulta);
        this.nombreEPS = nombreEPS;
    }

    public String getNombreEPS() {
        return nombreEPS;
    }

    public void setNombreEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    @Override
    public String toString() {
        return "PacienteEPS{" +
                "nombreEPS='" + nombreEPS + '\'' +
                '}';
    }

    public double calcularCostoFinal() {
        if (costoConsulta == 300000){
            total = aplicarRecargo(0.2);
        } else if (costoConsulta == 200000) {
            total = aplicarDescuento(0.10);
        } else if (costoConsulta == 50000) {
            total = aplicarRecargo(0.05);
        }
        return total;
    }



}
