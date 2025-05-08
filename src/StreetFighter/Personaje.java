package StreetFighter;

public class Personaje {
    private String nombre;
    private String pais;
    private String historia;
    private double altura;
    private double peso;
    private String colorPelo;
    private String vestimenta;
    private String escenario;
    private int puntosDeVida;
    private int velocidad;
    private int fuerza;

    //Constructor
    public Personaje(String nombre, String pais, String historia, double altura, double peso, String colorPelo, String vestimenta, String escenario, int velocidad, int fuerza) {
        this.nombre = nombre;
        this.pais = pais;
        this.historia = historia;
        this.altura = altura;
        this.peso = peso;
        this.colorPelo = colorPelo;
        this.vestimenta = vestimenta;
        this.escenario = escenario;
        this.puntosDeVida = 100;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
    }
    
    //Getter y Setter
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public String getVestimenta() {
		return vestimenta;
	}

	public void setVestimenta(String vestimenta) {
		this.vestimenta = vestimenta;
	}

	public String getEscenario() {
		return escenario;
	}

	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}

	public int getPuntosDeVida() {
		return puntosDeVida;
	}

	public void setPuntosDeVida(int puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

    //Método Ataque
    public double ataque(String tipoAtaque) {
        double factorDaño = 0;
        switch (tipoAtaque.toLowerCase()) {
            case "puño rápido":
                factorDaño = 0.3;
                break;
            case "puño lento":
                factorDaño = 0.7;
                break;
            case "patada rápida":
                factorDaño = 0.5;
                break;
            case "patada lenta":
                factorDaño = 1;
                break;
            case "agarre rápido":
                factorDaño = 3;
                break;
            case "agarre lento":
                factorDaño = 5;
                break;
            case "ataque especial 1":
                factorDaño = 1.5;
                break;
            case "ataque especial 2":
                factorDaño = 2;
                break;
            case "ataque especial 3":
                factorDaño = 3;
                break;
            default:
                System.out.println("Ataque no válido");
                return 0;
        }
        return fuerza * factorDaño;
    }


	
}
