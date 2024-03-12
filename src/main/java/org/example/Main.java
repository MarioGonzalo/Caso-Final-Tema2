package org.example;

import org.example.Trabajadores.Habitats.Acuatico;
import org.example.Visitantes.Visitantes;
import org.example.Trabajadores.Habitats.Aereo;
import org.example.Trabajadores.Habitats.Terrestre;
import org.example.Trabajadores.Especies.Peces.*;
import org.example.Trabajadores.Especies.Peces;
import org.example.Trabajadores.Especies.Aves.*;
import org.example.Trabajadores.Especies.Mamiferos.*;
import org.example.Zoo;




import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("Bienvenido al zoológico");
            System.out.println("1. Ver hábitats");
            System.out.println("2. Ver visitantes");
            System.out.println("3. Especies");
            System.out.println("4. Administrar recursos");
            System.out.println("5. Mantenimiento y seguridad");

            Scanner scOpcion = new Scanner(System.in);
            int opcion = scOpcion.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Hábitats");
                    System.out.println("1. Terrestre");
                    System.out.println("2. Aéreo");
                    System.out.println("3. Acuático");
                    Scanner scHabitat = new Scanner(System.in);
                    int opcionHabitat = scHabitat.nextInt();
                    switch (opcionHabitat) {
                        case 1:
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Ingrese la temperatura del hábitat");
                            int temp = sc.nextInt();
                            System.out.println("Ingrese la humedad del hábitat");
                            int humedad = sc.nextInt();
                            System.out.println("Ingrese la limpieza del hábitat");
                            int limpieza = sc.nextInt();
                            System.out.println("Ingrese la vegetación del hábitat");
                            int vegetacion = sc.nextInt();
                            Terrestre t1 = new Terrestre("Terrestre", temp, humedad, limpieza, vegetacion);
                            System.out.println(t1.toString());
                            t1.checkLimpieza(limpieza);
                            t1.checkVegetacion(vegetacion);
                            t1.checkHumedad(humedad);
                            t1.checkTemp(temp);
                            break;
                        case 2:
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Ingrese la temperatura del hábitat");
                            int temp2 = sc2.nextInt();
                            System.out.println("Ingrese la humedad del hábitat");
                            int humedad2 = sc2.nextInt();
                            System.out.println("Ingrese la limpieza del hábitat");
                            int limpieza2 = sc2.nextInt();
                            System.out.println("Ingrese la estado del aire del hábitat");
                            int estadoAire = sc2.nextInt();
                            Aereo a1 = new Aereo("Aereo", temp2, humedad2, limpieza2, estadoAire);
                            System.out.println(a1.toString());
                            a1.checkLimpieza(limpieza2);
                            a1.checkNidos(estadoAire);
                            a1.checkHumedad(humedad2);
                            a1.checkTemp(temp2);
                            break;
                        case 3:
                            Scanner sc3 = new Scanner(System.in);
                            System.out.println("Ingrese la temperatura del hábitat");
                            int temp3 = sc3.nextInt();
                            System.out.println("Ingrese la humedad del hábitat");
                            int humedad3 = sc3.nextInt();
                            System.out.println("Ingrese la limpieza del hábitat");
                            int limpieza3 = sc3.nextInt();
                            System.out.println("Ingrese el estado del agua del hábitat");
                            int estadoAgua = sc3.nextInt();
                            Acuatico ac1 = new Acuatico("Acuatico", temp3, humedad3, limpieza3, estadoAgua);
                            System.out.println(ac1.toString());
                            ac1.checkLimpieza(limpieza3);
                            ac1.checkEstadoAgua(estadoAgua);
                            ac1.checkHumedad(humedad3);
                            ac1.checkTemp(temp3);
                            break;
                        default:
                            System.out.println("Elija uno de estos del 1 al 3");
                    }

                    break;
                case 2:
                    System.out.println("Visitantes");
                    Visitantes v1 = new Visitantes();
                    v1.proporcionarTourPersonalizado();
                    v1.mostrarInformacion();
                    break;
                case 3:

                    System.out.println("Especies");
                    System.out.println("1. Aves");
                    System.out.println("2. Mamíferos");
                    System.out.println("3. Peces");
                    Scanner scEspecies = new Scanner(System.in);
                    int opcionEspecies = scEspecies.nextInt();
                    switch (opcionEspecies) {
                        case 1:
                            System.out.println("Elige una especie de ave");
                            System.out.println("1. Aguila");
                            System.out.println("2. Cotorro");
                            System.out.println("3. Loro");
                            System.out.println("4. Pinguino");
                            Scanner scAves = new Scanner(System.in);
                            int opcionAves = scAves.nextInt();
                            switch (opcionAves) {
                                case 1:
                                    Scanner scAguila = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del aguila");
                                    int limpiezaAguila = scAguila.nextInt();
                                    System.out.println("Ingrese la enfermedad del aguila");
                                    Boolean enfermedadAguila = scAguila.nextBoolean();
                                    System.out.println("Ingrese el hambre del aguila");
                                    int hambreAguila = scAguila.nextInt();
                                    System.out.println("Ingrese el plumaje del aguila");
                                    int plumajeAguila = scAguila.nextInt();
                                    Aguila aguila = new Aguila(limpiezaAguila, enfermedadAguila, hambreAguila, plumajeAguila);
                                    System.out.println(aguila.toString());
                                    aguila.checkHambre(hambreAguila);
                                    aguila.checkLimpieza(limpiezaAguila);
                                    aguila.checkEnfermedad(enfermedadAguila);
                                    break;
                                case 2:
                                    Scanner scCotorro = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del cotorro");
                                    int limpiezaCotorro = scCotorro.nextInt();
                                    System.out.println("Ingrese la enfermedad del cotorro");
                                    Boolean enfermedadCotorro = scCotorro.nextBoolean();
                                    System.out.println("Ingrese el hambre del cotorro");
                                    int hambreCotorro = scCotorro.nextInt();
                                    System.out.println("Ingrese el plumaje del cotorro");
                                    int plumajeCotorro = scCotorro.nextInt();
                                    Cotorro cotorro = new Cotorro(limpiezaCotorro, enfermedadCotorro, hambreCotorro, plumajeCotorro);
                                    System.out.println(cotorro.toString());
                                    cotorro.checkHambre(hambreCotorro);
                                    cotorro.checkLimpieza(limpiezaCotorro);
                                    cotorro.checkEnfermedad(enfermedadCotorro);
                                    break;
                                case 3:
                                    Scanner scLoro = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del loro");
                                    int limpiezaLoro = scLoro.nextInt();
                                    System.out.println("Ingrese la enfermedad del loro");
                                    Boolean enfermedadLoro = scLoro.nextBoolean();
                                    System.out.println("Ingrese el hambre del loro");
                                    int hambreLoro = scLoro.nextInt();
                                    System.out.println("Ingrese el plumaje del loro");
                                    int plumajeLoro = scLoro.nextInt();
                                    Loro loro = new Loro(limpiezaLoro, enfermedadLoro, hambreLoro, plumajeLoro);
                                    System.out.println(loro.toString());
                                    loro.checkHambre(hambreLoro);
                                    loro.checkLimpieza(limpiezaLoro);
                                    loro.checkEnfermedad(enfermedadLoro);
                                    break;
                                case 4:
                                    Scanner scPinguino = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del pinguino");
                                    int limpiezaPinguino = scPinguino.nextInt();
                                    System.out.println("Ingrese la enfermedad del pinguino");
                                    Boolean enfermedadPinguino = scPinguino.nextBoolean();
                                    System.out.println("Ingrese el hambre del pinguino");
                                    int hambrePinguino = scPinguino.nextInt();
                                    System.out.println("Ingrese el plumaje del pinguino");
                                    int plumajePinguino = scPinguino.nextInt();
                                    Pinguino pinguino = new Pinguino(limpiezaPinguino, enfermedadPinguino, hambrePinguino, plumajePinguino);
                                    System.out.println(pinguino.toString());
                                    pinguino.checkHambre(hambrePinguino);
                                    pinguino.checkLimpieza(limpiezaPinguino);
                                    pinguino.checkEnfermedad(enfermedadPinguino);
                                    break;
                                default:
                                    System.out.println("Elija uno de estos del 1 al 4");
                                    break;
                            }
                        case 2:
                            System.out.println("Elige una especie de mamífero");
                            System.out.println("1. Elefante");
                            System.out.println("2. Oso");
                            System.out.println("3. Leon");
                            System.out.println("4. Tigre");
                            Scanner scMamiferos = new Scanner(System.in);
                            int opcionMamiferos = scMamiferos.nextInt();
                            switch (opcionMamiferos) {
                                case 1:
                                    Scanner scElefante = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del elefante");
                                    int limpiezaElefante = scElefante.nextInt();
                                    System.out.println("Ingrese la enfermedad del elefante");
                                    Boolean enfermedadElefante = scElefante.nextBoolean();
                                    System.out.println("Ingrese el hambre del elefante");
                                    int hambreElefante = scElefante.nextInt();
                                    System.out.println("Ingrese el pelaje del elefante");
                                    int pelajeElefante = scElefante.nextInt();
                                    Elefante elefante = new Elefante(limpiezaElefante, enfermedadElefante, hambreElefante, pelajeElefante);
                                    System.out.println(elefante.toString());
                                    elefante.checkHambre(hambreElefante);
                                    elefante.checkLimpieza(limpiezaElefante);
                                    elefante.checkEnfermedad(enfermedadElefante);
                                    break;
                                case 2:
                                    Scanner scOso = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del oso");
                                    int limpiezaOso = scOso.nextInt();
                                    System.out.println("Ingrese la enfermedad del oso");
                                    Boolean enfermedadOso = scOso.nextBoolean();
                                    System.out.println("Ingrese el hambre del oso");
                                    int hambreOso = scOso.nextInt();
                                    System.out.println("Ingrese el pelaje del oso");
                                    int pelajeOso = scOso.nextInt();
                                    Oso oso = new Oso(limpiezaOso, enfermedadOso, hambreOso, pelajeOso);
                                    System.out.println(oso.toString());
                                    oso.checkHambre(hambreOso);
                                    oso.checkLimpieza(limpiezaOso);
                                    oso.checkEnfermedad(enfermedadOso);
                                    break;
                                case 3:
                                    Scanner scLeon = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del leon");
                                    int limpiezaLeon = scLeon.nextInt();
                                    System.out.println("Ingrese la enfermedad del leon");
                                    Boolean enfermedadLeon = scLeon.nextBoolean();
                                    System.out.println("Ingrese el hambre del leon");
                                    int hambreLeon = scLeon.nextInt();
                                    System.out.println("Ingrese el pelaje del leon");
                                    int pelajeLeon = scLeon.nextInt();
                                    Leon leon = new Leon(limpiezaLeon, enfermedadLeon, hambreLeon, pelajeLeon);
                                    System.out.println(leon.toString());
                                    leon.checkHambre(hambreLeon);
                                    leon.checkLimpieza(limpiezaLeon);
                                    leon.checkEnfermedad(enfermedadLeon);
                                    break;
                                case 4:
                                    Scanner scTigre = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del tigre");
                                    int limpiezaTigre = scTigre.nextInt();
                                    System.out.println("Ingrese la enfermedad del tigre");
                                    Boolean enfermedadTigre = scTigre.nextBoolean();
                                    System.out.println("Ingrese el hambre del tigre");
                                    int hambreTigre = scTigre.nextInt();
                                    System.out.println("Ingrese el pelaje del tigre");
                                    int pelajeTigre = scTigre.nextInt();
                                    Tigre tigre = new Tigre(limpiezaTigre, enfermedadTigre, hambreTigre, pelajeTigre);
                                    System.out.println(tigre.toString());
                                    tigre.checkHambre(hambreTigre);
                                    tigre.checkLimpieza(limpiezaTigre);
                                    tigre.checkEnfermedad(enfermedadTigre);
                                    break;
                                default:
                                    System.out.println("Elija uno de estos del 1 al 4");
                            }
                            break;
                        case 3:
                            System.out.println("Elige una especie de pez");
                            System.out.println("1. Pez globo");
                            System.out.println("2. Pez payaso");
                            System.out.println("3. Manta raya");
                            System.out.println("4. Caballito de mar");
                            Scanner scPeces = new Scanner(System.in);
                            int opcionPeces = scPeces.nextInt();
                            switch (opcionPeces) {
                                case 1:
                                    Scanner scPezGlobo = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del pez globo");
                                    int limpiezaPezGlobo = scPezGlobo.nextInt();
                                    System.out.println("Ingrese la enfermedad del pez globo");
                                    Boolean enfermedadPezGlobo = scPezGlobo.nextBoolean();
                                    System.out.println("Ingrese el hambre del pez globo");
                                    int hambrePezGlobo = scPezGlobo.nextInt();
                                    System.out.println("Ingrese las escamas del pez globo");
                                    int escamasPezGlobo = scPezGlobo.nextInt();
                                    PezGlobo pezGlobo = new PezGlobo(limpiezaPezGlobo, enfermedadPezGlobo, hambrePezGlobo, escamasPezGlobo);
                                    System.out.println(pezGlobo.toString());
                                    pezGlobo.checkHambre(hambrePezGlobo);
                                    pezGlobo.checkLimpieza(limpiezaPezGlobo);
                                    pezGlobo.checkEnfermedad(enfermedadPezGlobo);
                                    break;
                                case 2:
                                    Scanner scPezPayaso = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del pez payaso");
                                    int limpiezaPezPayaso = scPezPayaso.nextInt();
                                    System.out.println("Ingrese la enfermedad del pez payaso");
                                    Boolean enfermedadPezPayaso = scPezPayaso.nextBoolean();
                                    System.out.println("Ingrese el hambre del pez payaso");
                                    int hambrePezPayaso = scPezPayaso.nextInt();
                                    System.out.println("Ingrese las escamas del pez payaso");
                                    int escamasPezPayaso = scPezPayaso.nextInt();
                                    PezPayaso pezPayaso = new PezPayaso(limpiezaPezPayaso, enfermedadPezPayaso, hambrePezPayaso, escamasPezPayaso);
                                    System.out.println(pezPayaso.toString());
                                    pezPayaso.checkHambre(hambrePezPayaso);
                                    pezPayaso.checkLimpieza(limpiezaPezPayaso);
                                    pezPayaso.checkEnfermedad(enfermedadPezPayaso);
                                    break;
                                case 3:
                                    Scanner scMantaRaya = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza de la manta raya");
                                    int limpiezaMantaRaya = scMantaRaya.nextInt();
                                    System.out.println("Ingrese la enfermedad de la manta raya");
                                    Boolean enfermedadMantaRaya = scMantaRaya.nextBoolean();
                                    System.out.println("Ingrese el hambre de la manta raya");
                                    int hambreMantaRaya = scMantaRaya.nextInt();
                                    System.out.println("Ingrese las escamas de la manta raya");
                                    int escamasMantaRaya = scMantaRaya.nextInt();
                                    MantaRaya mantaRaya = new MantaRaya(limpiezaMantaRaya, enfermedadMantaRaya, hambreMantaRaya, escamasMantaRaya);
                                    System.out.println(mantaRaya.toString());
                                    mantaRaya.checkHambre(hambreMantaRaya);
                                    mantaRaya.checkLimpieza(limpiezaMantaRaya);
                                    mantaRaya.checkEnfermedad(enfermedadMantaRaya);
                                    break;
                                case 4:
                                    Scanner scCaballitoMar = new Scanner(System.in);
                                    System.out.println("Ingrese la limpieza del caballito de mar");
                                    int limpiezaCaballitoMar = scCaballitoMar.nextInt();
                                    System.out.println("Ingrese la enfermedad del caballito de mar");
                                    Boolean enfermedadCaballitoMar = scCaballitoMar.nextBoolean();
                                    System.out.println("Ingrese el hambre del caballito de mar");
                                    int hambreCaballitoMar = scCaballitoMar.nextInt();
                                    System.out.println("Ingrese las escamas del caballito de mar");
                                    int escamasCaballitoMar = scCaballitoMar.nextInt();
                                    CaballitoMar caballitoMar = new CaballitoMar(limpiezaCaballitoMar, enfermedadCaballitoMar, hambreCaballitoMar, escamasCaballitoMar);
                                    System.out.println(caballitoMar.toString());
                                    caballitoMar.checkHambre(hambreCaballitoMar);
                                    caballitoMar.checkLimpieza(limpiezaCaballitoMar);
                                    caballitoMar.checkEnfermedad(enfermedadCaballitoMar);
                                    break;
                                default:
                                    System.out.println("Elija uno de estos del 1 al 3");
                            }
                            break;
                        default:
                            System.out.println("Elija uno de estos del 1 al 3");
                    }
                case 4:
                    System.out.println("Administrar recursos");
                    System.out.println("1. Comprar recursos");
                    System.out.println("2. Vender recursos");
                    System.out.println("3. Alimentar animales");
                    Scanner scRecursos = new Scanner(System.in);
                    int opcionRecursos = scRecursos.nextInt();
                    switch (opcionRecursos) {
                        case 1:
                            Zoo.AdministradorRecursos administradorRecursos = new Zoo.AdministradorRecursos();
                            Scanner scComprar = new Scanner(System.in);
                            System.out.println("Ingrese qué quiere comprar");
                            String compra = scComprar.nextLine();
                            System.out.println("Ingrese la cantidad que quiere comprar");
                            int cantidad = scComprar.nextInt();
                            administradorRecursos.agregarRecurso(compra, cantidad);
                            System.out.println("Recursos comprados");
                            break;
                        case 2:
                            Zoo.AdministradorRecursos administradorRecursos2 = new Zoo.AdministradorRecursos();
                            Scanner scVender = new Scanner(System.in);
                            System.out.println("Ingrese qué quiere vender");
                            String venta = scVender.nextLine();
                            System.out.println("Ingrese la cantidad que quiere vender");
                            int cantidad2 = scVender.nextInt();
                            administradorRecursos2.actualizarCantidadRecurso(venta, cantidad2);
                            break;
                        case 3:
                            Zoo.AdministradorRecursos administradorRecursos3 = new Zoo.AdministradorRecursos();
                            Scanner scAlimentar = new Scanner(System.in);
                            System.out.println("Ingrese qué animal quiere alimentar");
                            String animal = scAlimentar.nextLine();
                            System.out.println("Ingrese la cantidad que quiere alimentar");
                            int cantidad3 = scAlimentar.nextInt();
                            administradorRecursos3.hacerPedido(animal, cantidad3);

                            break;

                    }
                case 5:
                    System.out.println("Mantenimiento y seguridad");
                    System.out.println("1. Tareas de mantenimiento");
                    System.out.println("2. Seguridad");
                    Scanner scMantenimiento = new Scanner(System.in);
                    int opcionMantenimiento = scMantenimiento.nextInt();
                    switch (opcionMantenimiento) {
                        case 1:
                            Zoo.TareaMantenimiento tareaMantenimiento = new Zoo.TareaMantenimiento( "Mantenimiento", true);
                            Scanner scMantenimiento2 = new Scanner(System.in);
                            System.out.println("Ingrese qué tarea de mantenimiento quiere realizar");
                            String tarea = scMantenimiento2.nextLine();
                            System.out.println("Tareas de mantenimiento realizadas");
                            break;
                        case 2:
                            System.out.println("Seguridad");
                            System.out.println("1. Cámaras de seguridad");
                            System.out.println("2. Guardias de seguridad");
                            Scanner scSeguridad = new Scanner(System.in);
                            int opcionSeguridad = scSeguridad.nextInt();
                            switch (opcionSeguridad) {
                                case 1:
                                    System.out.println("Cámaras de seguridad instaladas");
                                    break;
                                case 2:
                                    System.out.println("Guardias de seguridad contratados");
                                    break;
                            }
                    }
            }
        }
    }
}