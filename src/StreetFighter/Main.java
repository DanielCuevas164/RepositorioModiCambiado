package StreetFighter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje personaje1 = null;
		Personaje personaje2 = null;
		
		System.out.println("Selecciona tu personaje: ");
		inicializarPersonajes();
		System.out.println("Selecciona personaje rival: ");
		inicializarPersonajes();
		
		simulaCombate(personaje1, personaje2);
		
	}
	public static Personaje inicializarPersonajes() {
		Scanner sn = new Scanner(System.in);
		int opcion = 0;
		System.out.println("1. Ryu ,Un karateka que perfecciona sus habilidades.");
		System.out.println("2. E. Honda, Luchador de sumo profesional.");
		System.out.println("3. Blanka, Un mutante con forma de bestia criado en la jungla.");
		System.out.println("4. Guile, Antiguo miembro militar estadounidense.");
		System.out.println("5. Ken, Rival de Ryu, practicante de artes marciales.");
		System.out.println("6. Chun-Li, Artista marcial que trabaja para la Interpol.");
		System.out.println("7. Zangief, Luchador profesional de la URSS.");
		System.out.println("8. Dhalsim, Maestro de yoga con poderes místicos.");
		System.out.println("Escoja una opcion: ");
		opcion = sn.nextInt();
		
		switch(opcion) {
		case 1:
			Personaje ryu = new Personaje("Ryu", "Japón", "Un karateka que perfecciona sus habilidades.", 1.75, 68, "Negro", "Kimono Blanco", "Dojo", 7, 8);
			System.out.println("Personaje inicializado.");
			return ryu;
		case 2:
			Personaje eHonda = new Personaje("E. Honda", "Japón", "Luchador de sumo profesional.", 1.85, 130, "Negro", "Cinturón Azul", "Ring de Sumo", 5, 9);
			System.out.println("Personaje inicializado.");
			return eHonda;

		case 3: 
			Personaje blanka = new Personaje("Blanka", "Brasil", "Un mutante con forma de bestia criado en la jungla.", 1.92, 98, "Verde", "Pantalones Naranjas", "Selva Brasileña", 6, 7);
			System.out.println("Personaje inicializado.");
			return blanka;

		case 4:
			Personaje guile = new Personaje("Guile", "Estados Unidos", "Antiguo miembro militar estadounidense.", 1.82, 86, "Rubio", "Ropa Militar", "Base Militar", 8, 8);
			System.out.println("Personaje inicializado.");
			return guile;

		case 5:
			Personaje ken = new Personaje("Ken", "Estados Unidos", "Rival de Ryu, practicante de artes marciales.", 1.78, 72, "Rubio", "Kimono Rojo", "Dojo", 7, 8);
			System.out.println("Personaje inicializado.");
			return ken;
		case 6:
			Personaje chunLi = new Personaje("Chun-Li", "China", "Artista marcial que trabaja para la Interpol.", 1.70, 55, "Castaño", "Traje Azul", "Calle de Hong Kong", 9, 7);
			System.out.println("Personaje inicializado.");
			return chunLi;
		case 7:
			Personaje zangief = new Personaje("Zangief", "Unión Soviética", "Luchador profesional de la URSS.", 2.14, 140, "Pelirrojo", "Pantalones Rojos", "Fábrica Abandonada", 4, 10);
			System.out.println("Personaje inicializado.");
			return zangief;
		case 8:
			Personaje dhalsim = new Personaje("Dhalsim", "India", "Maestro de yoga con poderes místicos.", 1.76, 48, "Calvo", "Pantalones Amarillos", "Templo Indio", 6, 6);
			System.out.println("Personaje inicializado.");
			return dhalsim;
		default:
            System.out.println("Opcion no valida");
            return null;
		}
		
        
    }

    public static void simulaCombate(Personaje personaje1, Personaje personaje2) {
        System.out.println("Combate entre " + personaje1.getNombre() + " y " + personaje2.getNombre());
        System.out.println("Lugar: " + personaje1.getPais() + " - " + personaje1.getEscenario());

        while (personaje1.getPuntosDeVida() > 0 && personaje2.getPuntosDeVida() > 0) {
            if (personaje1.getVelocidad() >= personaje2.getVelocidad()) {
                int daño = (int) personaje1.ataque("puño rápido");
                personaje2.setPuntosDeVida(personaje2.getPuntosDeVida() - daño);
                System.out.println(personaje1.getNombre() + " golpea a " + personaje2.getNombre() + " por " + daño + " puntos de daño.");
            } else {
                int daño = (int) personaje2.ataque("patada rápida");
                personaje1.setPuntosDeVida(personaje1.getPuntosDeVida() - daño);
                System.out.println(personaje2.getNombre() + " golpea a " + personaje1.getNombre() + " por " + daño + " puntos de daño.");
            }
        }

        if (personaje1.getPuntosDeVida() > 0) {
            System.out.println(personaje1.getNombre() + " gana el combate.");
        } else {
            System.out.println(personaje2.getNombre() + " gana el combate.");
        }
    }
}
