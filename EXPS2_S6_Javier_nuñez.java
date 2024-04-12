/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s6_javier_nuñez;

import java.util.Scanner;

/**
 *
 * @author javier
 */
public class EXP2_S6_Javier_Nuñez {
        
    //VARIABLES ESTÁTICAS Y GLOBALES
        static int preciovip = 30000;
        static int preciopalco = 25000;
        static int precioplatea = 20000;
        static int preciogaleria = 15000;
        static int dospreciovip = 50000;
        static int dospreciopalco = 40000;
        static int dosprecioplatea = 30000;
        static int dospreciogaleria = 25000;
        static int trespreciovip = 70000;
        static int trespreciopalco = 55000;
        static int tresprecioplatea = 40000;
        static int trespreciogaleria = 35000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        //DEFINICIÓN DE VARIABLES
        
        int edad;  
        String comprarMasEntradas;
        boolean comprarMas = true;                                        
        int estudiante = 18;
        int terceraEdad = 65;
        int adulto = 0;
        String tipoDeEntrada = "";

        // BIENVENIDA Y OPCIÓN COMPRAR ENTRADA
        String opcion;
        boolean continuarComprando = true;

        for (;;) {
            System.out.println("Bienvenido a Teatro Moro");
            System.out.println(" ");
            System.out.println("----- Menú Principal -----");
            System.out.println("  ");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scan.next();
            
            if (opcion.equals("1") || opcion.equals("2")){
            
                do {
                    if (opcion.equals("1")) {
                    System.out.println(" ");
                    System.out.println("Ha seleccionado la opción: Comprar entrada");
                    
                    // CÓDIGO PARA LA COMPRA DE ENTRADA                    
                
                do {
                    System.out.println(" ");  
                    System.out.println("Por favor ingrese su edad:");
                while (!scan.hasNextInt()) {
                    System.out.println("Entrada no válida. Por favor ingrese un número entero:");
                    scan.next(); 
                }
                edad = scan.nextInt();
                
                     } while (edad <= 0);
                
                    // CONDICIONALES DE EDAD
                    if (edad <= 18) {
                        adulto = estudiante;
                    } else if (edad >= 65) {
                        adulto = terceraEdad;
                    } else {
                        adulto = edad;
                    }

                    // SOLICITUD DE UBICACIÓN DE ENTRADA
                    System.out.println(" ");
                    System.out.println("Indique la entrada que desea comprar:");
                    System.out.println("VIP:      $30000 ");
                    System.out.println("PALCO:    $25000 ");
                    System.out.println("PLATEA:   $20000 ");
                    System.out.println("GALERIA:  $15000 ");
                    tipoDeEntrada = scan.next();

                    while (!"vip".equalsIgnoreCase(tipoDeEntrada) && !"palco".equalsIgnoreCase(tipoDeEntrada) && !"platea".equalsIgnoreCase(tipoDeEntrada) && !"galeria".equalsIgnoreCase(tipoDeEntrada)) {
                        System.out.println("Tipo de entrada no válido, intente nuevamente.");
                        System.out.println(" ");
                        System.out.print("¿Qué tipo de entrada desea comprar?: ");
                        tipoDeEntrada = scan.next();
                    }

                    // CANTIDAD DE ENTRADAS A COMPRAR   
                    
                    System.out.println(" ");
                    System.out.println("¿Desea comprar más de una entrada? (Si/No)");
                    comprarMasEntradas = scan.next();
                    
                    if (!comprarMasEntradas.equalsIgnoreCase("Si")) {
                        comprarMas = false;
                    }                   
                    else{
                        System.out.println("  ");
                        System.out.println("Contamos con diferentes promociones al comprar múltiples entradas:");
                        System.out.println("VIP:      2 x $50000 y 3 x $70000");
                        System.out.println("PALCO:    2 x $40000 y 3 x $55000");
                        System.out.println("PLATEA:   2 x $30000 y 3 x $40000");
                        System.out.println("GALERIA:  2 x $20000 y 3 x $25000");
                        System.out.println("¿Cuántas entradas desea comprar?");
                        String cantidadDeEntradas = scan.next();
                        
                        if (cantidadDeEntradas.equals("2")){
                            
                            if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto == estudiante) {                            
                            System.out.println("Usted ha comprado 2 entradas VIP");
                            System.out.println("El precio base de la entrada es: $" + preciovip);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $50000");
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("El precio final a pagar es de: $" + (dospreciovip * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto == estudiante) {
                            System.out.println("Usted ha comprado 2 entradas PALCO");
                            System.out.println("El precio base de la entrada es: $" + preciopalco);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $40000");
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("El precio final a pagar es de: $" + (dospreciopalco * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto == estudiante) {
                            System.out.println("Usted ha comprado 2 entradas PLATEA");
                            System.out.println("El precio base de la entrada es: $" + precioplatea);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $30000");
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("El precio final a pagar es de: $" + (dosprecioplatea * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto == estudiante) {
                            System.out.println("Usted ha comprado 2 entradas GALERIA");
                            System.out.println("El precio base de la entrada es: $" + preciogaleria);
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("La promoción por haber comprado 2 entradas es de de $25000");
                            System.out.println("El precio final a pagar es de: $" + (dospreciogaleria * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 2 entradas VIP");
                            System.out.println("El precio base de la entrada es: $" + preciovip);
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("La promoción por haber comprado 2 entradas es de de $50000");
                            System.out.println("El precio final a pagar es de: $" + (dospreciovip * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 2 entradas PALCO");
                            System.out.println("El precio base de la entrada es: $" + preciopalco);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $40000");
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("El precio final a pagar es de: $" + (dospreciopalco * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 2 entradas PLATEA");
                            System.out.println("El precio base de la entrada es: $" + precioplatea);
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("La promoción por haber comprado 2 entradas es de de $30000");
                            System.out.println("El precio final a pagar es de: $" + (dosprecioplatea * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 2 entradas GALERIA");
                            System.out.println("El precio base de la entrada es: $" + preciogaleria);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $25000");
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("El precio final a pagar es de: $" + (dospreciogaleria * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 2 entradas VIP");
                            System.out.println("El precio base de la entrada es: $" + preciovip);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $50000");
                            System.out.println("El descuento aplicado por ser aduto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + dospreciovip);
                        } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 2 entradas PALCO");
                            System.out.println("El precio base de la entrada es: $" + preciopalco);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $40000");
                            System.out.println("El descuento aplicado por ser adulto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + dospreciopalco);
                        } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 2 entradas PLATEA");
                            System.out.println("El precio base de la entrada es: $" + precioplatea);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $30000");
                            System.out.println("El descuento aplicado por ser adulto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + dosprecioplatea);
                        } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 2 entradas GALERIA");
                            System.out.println("El precio base de la entrada es: $" + preciogaleria);
                            System.out.println("La promoción por haber comprado 2 entradas es de de $25000");
                            System.out.println("El descuento aplicado por ser adulto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + dospreciogaleria);
                        }                        
                    }
                        if (cantidadDeEntradas.equals("3")){

                        if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto == estudiante) {
                            System.out.println("Usted ha comprado 3 entradas VIP");
                            System.out.println("El precio base de la entrada es: $" + preciovip);
                            System.out.println("La promoción por haber comprado 3 entradas es de $70000");
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("El precio final a pagar es de: $" + (trespreciovip * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto == estudiante) {
                            System.out.println("Usted ha comprado 3 entradas PALCO");
                            System.out.println("El precio base de la entrada es: $" + preciopalco);
                            System.out.println("La promoción por haber comprado 3 entradas es de $55000");
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("El precio final a pagar es de: $" + (trespreciopalco * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto == estudiante) {
                            System.out.println("Usted ha comprado 3 entradas PLATEA");
                            System.out.println("El precio base de la entrada es: $" + precioplatea);
                            System.out.println("La promoción por haber comprado 3 entradas es de $40000");
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("El precio final a pagar es de: $" + (tresprecioplatea * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto == estudiante) {
                            System.out.println("Usted ha comprado 3 entradas GALERIA");
                            System.out.println("El precio base de la entrada es: $" + preciogaleria);
                            System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                            System.out.println("La promoción por haber comprado 3 entradas es de $35000");
                            System.out.println("El precio final a pagar es de: $" + (trespreciogaleria * 0.9));
                        } else if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 3 entradas VIP");
                            System.out.println("El precio base de la entrada es: $" + preciovip);
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("La promoción por haber comprado 3 entradas es $70000");
                            System.out.println("El precio final a pagar es de: $" + (trespreciovip * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 3 entradas PALCO");
                            System.out.println("El precio base de la entrada es: $" + preciopalco);
                            System.out.println("La promoción por haber comprado 3 entradas es de $55000");
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("El precio final a pagar es de: $" + (trespreciopalco * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 3 entradas PLATEA");
                            System.out.println("El precio base de la entrada es: $" + precioplatea);
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("La promoción por haber comprado 3 entradas es de $40000");
                            System.out.println("El precio final a pagar es de: $" + (tresprecioplatea * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto == terceraEdad) {
                            System.out.println("Usted ha comprado 3 entradas GALERIA");
                            System.out.println("El precio base de la entrada es: $" + preciogaleria);
                            System.out.println("La promoción por haber comprado 3 entradas es de $35000");
                            System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                            System.out.println("El precio final a pagar es de: $" + (trespreciogaleria * 0.85));
                        } else if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 3 entradas VIP");
                            System.out.println("El precio base de la entrada es: $" + preciovip);
                            System.out.println("La promoción por haber comprado 3 entradas es de $70000");
                            System.out.println("El descuento aplicado por ser aduto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + trespreciovip);
                        } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 3 entradas PALCO");
                            System.out.println("El precio base de la entrada es: $" + preciopalco);
                            System.out.println("La promoción por haber comprado 3 entradas es de $55000");
                            System.out.println("El descuento aplicado por ser adulto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + trespreciopalco);
                        } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 3 entradas PLATEA");
                            System.out.println("El precio base de la entrada es: $" + precioplatea);
                            System.out.println("La promoción por haber comprado 3 entradas es de $40000");
                            System.out.println("El descuento aplicado por ser adulto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + tresprecioplatea);
                        } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto > 18 && adulto < 65) {
                            System.out.println("Usted ha comprado 3 entradas GALERIA");
                            System.out.println("El precio base de la entrada es: $" + preciogaleria);
                            System.out.println("La promoción por haber comprado 3 entradas es de $35000");
                            System.out.println("El descuento aplicado por ser adulto es de un 0%");
                            System.out.println("El precio final a pagar es de: $" + trespreciogaleria);
                        }                       
                    }
                }
                   
                if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto == estudiante && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada VIP");
                    System.out.println("El precio base de la entrada es: $" + preciovip);
                    System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                    System.out.println("El precio final a pagar es de: $" + (preciovip * 0.9));
                } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto == estudiante && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada PALCO");
                    System.out.println("El precio base de la entrada es: $" + preciopalco);
                    System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                    System.out.println("El precio final a pagar es de: $" + (preciopalco * 0.9));
                } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto == estudiante && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada PLATEA");
                    System.out.println("El precio base de la entrada es: $" + precioplatea);
                    System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                    System.out.println("El precio final a pagar es de: $" + (precioplatea * 0.9));
                } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto == estudiante && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada GALERIA");
                    System.out.println("El precio base de la entrada es: $" + preciogaleria);
                    System.out.println("El descuento aplicado por ser estudiante es de un 10%");
                    System.out.println("El precio final a pagar es de: $" + (preciogaleria * 0.9));
                } else if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto == terceraEdad && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada VIP");
                    System.out.println("El precio base de la entrada es: $" + preciovip);
                    System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                    System.out.println("El precio final a pagar es de: $" + (preciovip * 0.85));
                } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto == terceraEdad && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada PALCO");
                    System.out.println("El precio base de la entrada es: $" + preciopalco);
                    System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                    System.out.println("El precio final a pagar es de: $" + (preciopalco * 0.85));
                } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto == terceraEdad && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada PLATEA");
                    System.out.println("El precio base de la entrada es: $" + precioplatea);
                    System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                    System.out.println("El precio final a pagar es de: $" + (precioplatea * 0.85));
                } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto == terceraEdad && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada GALERIA");
                    System.out.println("El precio base de la entrada es: $" + preciogaleria);
                    System.out.println("El descuento aplicado por ser tercera edad es de un 15%");
                    System.out.println("El precio final a pagar es de: $" + (preciogaleria * 0.85));
                } else if (tipoDeEntrada.equalsIgnoreCase("VIP") && adulto > 18 && adulto < 65 && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada VIP");
                    System.out.println("El precio base de la entrada es: $" + preciovip);
                    System.out.println("El descuento aplicado por ser aduto es de un 0%");
                    System.out.println("El precio final a pagar es de: $" + preciovip);
                } else if (tipoDeEntrada.equalsIgnoreCase("PALCO") && adulto > 18 && adulto < 65 && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada PALCO");
                    System.out.println("El precio base de la entrada es: $" + preciopalco);
                    System.out.println("El descuento aplicado por ser adulto es de un 0%");
                    System.out.println("El precio final a pagar es de: $" + preciopalco);
                } else if (tipoDeEntrada.equalsIgnoreCase("PLATEA") && adulto > 18 && adulto < 65 && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada PLATEA");
                    System.out.println("El precio base de la entrada es: $" + precioplatea);
                    System.out.println("El descuento aplicado por ser adulto es de un 0%");
                    System.out.println("El precio final a pagar es de: $" + precioplatea);
                } else if (tipoDeEntrada.equalsIgnoreCase("GALERIA") && adulto > 18 && adulto < 65 && !comprarMas) {
                    System.out.println("Usted ha comprado la entrada GALERIA");
                    System.out.println("El precio base de la entrada es: $" + preciogaleria);
                    System.out.println("El descuento aplicado por ser adulto es de un 0%");
                    System.out.println("El precio final a pagar es de: $" + preciogaleria);
                }                    
                
                } else if (opcion.equals("2")) {

                    continuarComprando = false;
                    break;
                } else {
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }

                 // Preguntar si desea continuar
                    System.out.println(" ");
                System.out.println("¿Desea comprar más entradas? (Sí/No): ");
                String continuar = scan.next();
                if (!continuar.equalsIgnoreCase("Si")) {
                    continuarComprando = false;
                    break;
                }
            } while (continuarComprando);
                System.out.println("¡Hasta luego!");
            break;
            }
                else{
                    System.out.println("Opción no válida, intente nuevamente.");
                    System.out.println(" ");
            }
        }
    }
}
