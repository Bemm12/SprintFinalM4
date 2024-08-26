package SprintFinalM4;

public class Accidente {
    // Atributos
    private int idAccidente; // Identificador del accidente
    private String rutCliente; // RUT Cliente
    private String dia; // Día del accidente en formato DD/MM/AAAA
    private String hora; // Hora del accidente en formato HH:MM
    private String lugar; // Lugar del accidente
    private String origen; // Origen del accidente
    private String consecuencias; // Consecuencias del accidente

    // Constructor vacío
    public Accidente() {
    }

    // Constructor con todos los atributos
    public Accidente(int idAccidente, String rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.idAccidente = idAccidente;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    // Métodos getters y setters
    public int getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
    	if (lugar.length() < 10 || lugar.length() > 50) {
			throw new IllegalArgumentException("Lugar  debe tener entre 10 y 50 caracteres.");
		}
		this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
    	if (origen.length() > 100) {
			throw new IllegalArgumentException("El campo origen debe tener menos de 100 caracteres.");
		}
		this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
    	if (consecuencias.length() > 100) {
			throw new IllegalArgumentException("El campo consecuencias debe tener menos de 100 caracteres.");
		}
		this.consecuencias = consecuencias;
    }

    // Método toString
    @Override
    public String toString() {
        return "Accidente{" +
                "idAccidente=" + idAccidente +
                ", rutCliente='" + rutCliente + '\'' +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
