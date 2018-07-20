package creacional.builder;

/**
 * Created by jmillafilo 
 */
public class Heroe {

    private String nombre;
    private ProfesionEnum profesion;
    private ArmaduraEnum armadura;
    private ArmaEnum arma;

    public Heroe(){

    }
    
    


    public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public ProfesionEnum getProfesion() {
		return profesion;
	}




	public void setProfesion(ProfesionEnum profesion) {
		this.profesion = profesion;
	}




	public ArmaduraEnum getArmadura() {
		return armadura;
	}




	public void setArmadura(ArmaduraEnum armadura) {
		this.armadura = armadura;
	}




	public ArmaEnum getArma() {
		return arma;
	}




	public void setArma(ArmaEnum arma) {
		this.arma = arma;
	}




	@Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Este heroe es un ");
        sb.append(profesion);
        sb.append(" llamado ");
        sb.append(nombre);

        if (armadura != null) {
            sb.append(" viste ");
            sb.append(armadura);
        }
        if (arma != null) {
            sb.append(" y posee un ");
            sb.append(arma);
        }

        sb.append(".");
        return sb.toString();
    }

}
