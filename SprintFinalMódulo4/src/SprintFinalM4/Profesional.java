package SprintFinalM4;

public class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;
    
    public Profesional () {}
    
    
    

    /**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	public Profesional(String nombre, String fechaNacimiento, String run, String titulo, String fechaIngreso) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
	}

	

    public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		if (titulo.length() < 10 || titulo.length() > 50) {
			throw new IllegalArgumentException("El campo  título debe tener entre 10 y 50 caracteres.");
		}
		this.titulo = titulo;
	}



	public String getFechaIngreso() {
		return fechaIngreso;
	}



	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}



	@Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo + ", Fecha de Ingreso: " + fechaIngreso);
    }

    @Override
    public String toString() {
        return super.toString() + " Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}
