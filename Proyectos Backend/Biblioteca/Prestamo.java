
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestamo{
    private int CodigoLibro,identificacionSocio;

    private LocalDateTime FechaPrestamo;

    public Prestamo(int codigoLibro, int identificacionSocio, LocalDateTime fechaPrestamo) {
        CodigoLibro = codigoLibro;
        this.identificacionSocio = identificacionSocio;
        FechaPrestamo = fechaPrestamo;
    }

    public int getCodigoLibro() {
        return CodigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        CodigoLibro = codigoLibro;
    }

    public int getIdentificacionSocio() {
        return identificacionSocio;
    }

    public void setIdentificacionSocio(int identificacionSocio) {
        this.identificacionSocio = identificacionSocio;
    }

    public LocalDateTime getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        FechaPrestamo = fechaPrestamo;
    }


    public String getFechaFormateada() {
        String formato = "yyyy-MM-dd HH:mm";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        return formateador.format(this.FechaPrestamo);
    }
    
    
    @Override
    public String toString() {
        return "Prestamo{" + "Codigo Libro=" + CodigoLibro + ", Identificacion del Socio =" + identificacionSocio + ", Fecha del Prestamo=" + FechaPrestamo + '}';
    }
}
