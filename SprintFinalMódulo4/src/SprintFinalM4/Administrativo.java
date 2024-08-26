package SprintFinalM4;

public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;
    
    public Administrativo() {}

    /**
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 */
	public Administrativo(String nombre, String fechaNacimiento, String run, String area, String experienciaPrevia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
        this.experienciaPrevia = experienciaPrevia;
	}

	

   



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		if (area.length() < 5 || area.length() > 20) {
			throw new IllegalArgumentException("El caompo  area debe tener entre 10 y 50 caracteres.");
		}
		this.area = area;
	}



	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}



	public void setExperienciaPrevia(String experienciaPrevia) {
		if (experienciaPrevia.length() <= 100) {
            this.experienciaPrevia = experienciaPrevia;
        } else {
            throw new IllegalArgumentException("El campo experiencia previadebe tener máximo 100 caracteres.");
        }
	}



	@Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area + ", Experiencia Previa: " + experienciaPrevia);
    }

    @Override
    public String toString() {
        return super.toString() + " Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}

