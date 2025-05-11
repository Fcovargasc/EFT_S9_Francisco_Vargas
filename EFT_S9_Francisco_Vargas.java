
package eft_s9_francisco_vargas;
import java.util.Scanner;
import java.util.ArrayList;

public class EFT_S9_Francisco_Vargas {
        
        static double valorTotal=0.0;
        static String descuento;
        static String ubiAsientos;
        static double valorBase=0.0;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList <Double>  asientos = new ArrayList<>();
        ArrayList <String> asientos2 =new ArrayList<>();
        ArrayList <String> info = new ArrayList <>();
        ArrayList <String> info2 = new ArrayList<>();
        ArrayList <Double> acoAsientos = new ArrayList<>();
        String[] informacion ={"Descuento niños 10%","Descuento Mujeres 20%","Descuento Estudiantes 15%","Tercera Edad 25%"};
        int opcion ;
        int opcion2;
        int opcion3=0;
        int hOm;
        int est;
        int edad;
        double ninos=0.90;
        double mujeres=0.80;
        double estudiante=0.85;
        double terceraEdad=0.75;
        int vip=20000;
        int palco=18000;
        int plateaBaja=15000;
        int plateaAlta=13000;
        int galeria=10000;
        double seleccion;
        int asientosDisponibles=45;
        double remplazo=0.0;
        double nuevo=0;
        double eliminar=0.0;
        
        
        
        System.out.println("Bienvenidos al Teatro Moro");
         do{
        System.out.println("Presione ");
        System.out.println("1 Para Venta de Boleto.");
        System.out.println("2 Para Actualizar Info.");
        System.out.println("3 Para Informacion de Promociones.");
        System.out.println("4 Para Salir.");
        opcion=scanner.nextInt();
        scanner.nextLine();
        
        
        switch(opcion){
            case 1: 
              
                System.out.println("Venta de Boletos");
                
               
                System.out.println("Seleccione un tipo de Asiento ");
                do{
                System.out.println("Precione");
                System.out.println("1. para VIP");
                System.out.println("2. para Palco");
                System.out.println("3. para Platea Baja");
                System.out.println("4. para Platea Alta");
                System.out.println("5. Para Galeria");
                opcion2=scanner.nextInt();
                
                
        }       while(opcion2>5|| opcion2<1);
                    
                     switch (opcion2){
                         case 1:    
                             System.out.println(" Asientos VIP ");
                     System.out.println("");
                     
                     do{
                     System.out.println("Digite 1 si es Mujer 2 si es Hombre");
                     hOm=scanner.nextInt();
                     }while(hOm<1 ||hOm >2);
                     do{
                     System.out.println("¿Eres Estudiante?");
                     System.out.println("Digite 1 si es Estudiante Digite 2 si NO es Estudiante");
                     est=scanner.nextInt();
                     }while(est<1||est>2);
                     do{
                     System.out.println("Introdusca su edad");
                     edad=scanner.nextInt();
                     
                     }while(edad<1||edad>100);
                     do{
                     System.out.println("Seleccione su asiento");
                    
                     for (int i = 1; i <= 9; i++) {
                    
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    System.out.println(); 
                }
            }
                     seleccion=scanner.nextInt();
                     }while(seleccion<1||seleccion>9);
                     
                     if (edad>1&&edad<6 && hOm==1) {
                         valorTotal=vip*mujeres;
                         descuento="20%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }
                    else if (edad<12 && edad>6 && hOm==1 ) {
                         valorTotal=vip*mujeres;
                         descuento="20%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                     }else if (edad>12 && edad<60 && hOm==1) {
                         valorTotal=vip*mujeres;
                         descuento="20%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                     }else if (edad>=60&& hOm==1) {
                         valorTotal=vip*terceraEdad;
                         descuento="20%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Tercera Edad a sido efectivo");      
                     }else if (edad<6 && edad>1 && hOm==2 ) {
                         valorTotal=vip*ninos;
                         descuento="10%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Niño a sido efectivo");
                    
                      }else if (edad>12 && edad<60 && hOm==2 && est==1) {
                         valorTotal=vip*estudiante;
                         descuento="15%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Estudiante a sido efectivo");
                    
                      }else if (edad>12 && edad<18 && est==1) {
                         valorTotal=vip*estudiante;
                         descuento="15%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Estudiante a sido efectivo");
                         
                     }else if (edad > 18 && edad<60) {
                         valorTotal=vip;
                         descuento="0%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("No tiene descuento");
                     }  else if (edad>=60&& hOm==2) {
                         valorTotal=vip*terceraEdad;
                         descuento="25%";
                         ubiAsientos="VIP";
                         valorBase=vip;
                         System.out.println("Descuento Tercera Edad a sido efectivo");
                }
                     
                info2.add("Tipo Asiento:");
                info.add("Valor Asiento:");
                info.add("Numero de asiento");
                info2.add("Descuento Aplicado: ");
                info.add("Valor Final: ");
                asientos2.add(ubiAsientos);
                
                asientos.add(valorBase);
                asientos.add(seleccion);
                asientos2.add(descuento);
                asientos.add(valorTotal);
                
                acoAsientos.add(seleccion);
                asientosDisponibles--;
                System.out.println("---BOLETA---");
         for (int i = 0; i <asientos.size();i++){
                 System.out.println(info.get(i)+" "+ asientos.get(i));
                 
         }for (int i = 0; i <asientos2.size();i++){
                 System.out.println(info2.get(i)+" "+ asientos2.get(i));
         }
                             
                 System.out.println(" ");
                 info.removeAll(info);
                 info2.removeAll(info2);
                 asientos.removeAll(asientos);
                 asientos2.removeAll(asientos2);
                             break;
                         case 2:
                             
                             System.out.println(" Asientos Palco ");
                     System.out.println("");
                //tengo que preguntar si es hombre o mujer despues preguntar si es estudiante , el mayor descuento es el que prodemona
                     do{
                     System.out.println("Digite 1 si es Mujer 2 si es Hombre");
                     hOm=scanner.nextInt();
                     }while(hOm<1 ||hOm >2);
                     do{
                     System.out.println("¿Eres Estudiante?");
                     System.out.println("Digite 1 si es Estudiante Digite 2 si NO es Estudiante");
                     est=scanner.nextInt();
                     }while(est<1||est>2);
                     do{
                     System.out.println("Introdusca su edad");
                     edad=scanner.nextInt();
                     }while(edad<1||edad>100);
                     do{
                     System.out.println("Seleccione su asiento");
                    
                     for (int i = 10; i <= 18; i++) {
                    
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    System.out.println(); 
                }
            }
                     seleccion=scanner.nextInt();
                     }while(seleccion<10||seleccion>18);
                     if (edad>1&&edad<6 && hOm==1) {
                         valorTotal=palco*mujeres;
                         descuento="20%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }
                    else if (edad<12 && edad>6 && hOm==1 ) {
                         valorTotal=palco*mujeres;
                         descuento="20%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                     }else if (edad>12 && edad<60 && hOm==1) {
                         valorTotal=palco*mujeres;
                         descuento="20%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }else if (edad>=60&& hOm==1) {
                         valorTotal=palco*terceraEdad;
                         descuento="20%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Tercera Edad a sido efectivo");      
                }else if (edad<6 && edad>1 && hOm==2 ) {
                         valorTotal=palco*ninos;
                         descuento="10%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Niño a sido efectivo");
                    
                }else if (edad>12 && edad<60 && hOm==2 && est==1) {
                         valorTotal=palco*estudiante;
                         descuento="15%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Estudiante a sido efectivo");
                    
                }else if (edad>12 && edad<18 && est==1) {
                         valorTotal=palco*estudiante;
                         descuento="15%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Estudiante a sido efectivo");
                         
               }else if (edad > 18 && edad<60) {
                         valorTotal=palco;
                         descuento="0%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("No tiene descuento");
               }  else if (edad>=60&& hOm==2) {
                         valorTotal=palco*terceraEdad;
                         descuento="25%";
                         ubiAsientos="Palco";
                         valorBase=palco;
                         System.out.println("Descuento Tercera Edad a sido efectivo");
                }
                     
                info2.add("Tipo Asiento:");
                info.add("Valor Asiento:");
                info.add("Numero de asiento");
                info2.add("Descuento Aplicado: ");
                info.add("Valor Final: ");
                asientos2.add(ubiAsientos);
                
                asientos.add(valorBase);
                asientos.add(seleccion);
                asientos2.add(descuento);
                asientos.add(valorTotal);
                
                acoAsientos.add(seleccion);
                asientosDisponibles--;
                System.out.println("----BOLETA----");
                for (int i = 0; i <asientos.size();i++){
                 System.out.println(info.get(i)+" "+ asientos.get(i));
                 
         }for (int i = 0; i <asientos2.size();i++){
                 System.out.println(info2.get(i)+" "+ asientos2.get(i));
         }
                             
                 System.out.println(" ");
                 info.removeAll(info);
                 info2.removeAll(info2);
                 asientos.removeAll(asientos);
                 asientos2.removeAll(asientos2);
                             break;
                         case 3:
                              System.out.println(" Asientos Platea Baja");
                     System.out.println("");
                //tengo que preguntar si es hombre o mujer despues preguntar si es estudiante , el mayor descuento es el que prodemona
                     do{
                     System.out.println("Digite 1 si es Mujer 2 si es Hombre");
                     hOm=scanner.nextInt();
                     }while(hOm<1 ||hOm >2);
                     do{
                     System.out.println("¿Eres Estudiante?");
                     System.out.println("Digite 1 si es Estudiante Digite 2 si NO es Estudiante");
                     est=scanner.nextInt();
                     }while(est<1||est>2);
                     do{
                     System.out.println("Introdusca su edad");
                     edad=scanner.nextInt();
                     }while(edad<1||edad>100);
                     do{
                     System.out.println("Seleccione su asiento");
                    
                     for (int i = 19; i <= 27; i++) {
                    
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    System.out.println(); 
                }
            }
                     seleccion=scanner.nextInt();
                     }while(seleccion<19||seleccion>27);
                     if (edad>1&&edad<6 && hOm==1) {
                         valorTotal=plateaBaja*mujeres;
                         descuento="20%";
                         ubiAsientos="PLatea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }
                    else if (edad<12 && edad>6 && hOm==1 ) {
                         valorTotal=plateaBaja*mujeres;
                         descuento="20%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                     }else if (edad>12 && edad<60 && hOm==1) {
                         valorTotal=plateaBaja*mujeres;
                         descuento="20%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }else if (edad>=60&& hOm==1) {
                         valorTotal=plateaBaja*terceraEdad;
                         descuento="20%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Tercera Edad a sido efectivo");      
                }else if (edad<6 && edad>1 && hOm==2 ) {
                         valorTotal=plateaBaja*ninos;
                         descuento="10%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Niño a sido efectivo");
                    
                }else if (edad>12 && edad<60 && hOm==2 && est==1) {
                         valorTotal=plateaBaja*estudiante;
                         descuento="15%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Estudiante a sido efectivo");
                    
                }else if (edad>12 && edad<18 && est==1) {
                         valorTotal=plateaBaja*estudiante;
                         descuento="15%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Estudiante a sido efectivo");
                         
               }else if (edad > 18 && edad<60) {
                         valorTotal=plateaBaja;
                         descuento="0%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("No tiene descuento");
               }  else if (edad>=60&& hOm==2) {
                         valorTotal=plateaBaja*terceraEdad;
                         descuento="25%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaBaja;
                         System.out.println("Descuento Tercera Edad a sido efectivo");
                }
                     
                info2.add("Tipo Asiento:");
                info.add("Valor Asiento:");
                info.add("Numero de asiento");
                info2.add("Descuento Aplicado: ");
                info.add("Valor Final: ");
                asientos2.add(ubiAsientos);
                
                asientos.add(valorBase);
                asientos.add(seleccion);
                asientos2.add(descuento);
                asientos.add(valorTotal);
                
                acoAsientos.add(seleccion);
                asientosDisponibles--;
                
                System.out.println("----BOLETA----");
                for (int i = 0; i <asientos.size();i++){
                 System.out.println(info.get(i)+" "+ asientos.get(i));
                 
         }for (int i = 0; i <asientos2.size();i++){
                 System.out.println(info2.get(i)+" "+ asientos2.get(i));
         }
                             
                 System.out.println(" ");
                 info.removeAll(info);
                 info2.removeAll(info2);
                 asientos.removeAll(asientos);
                 asientos2.removeAll(asientos2);
                             
                             break;
                         case 4:
                              System.out.println(" Asientos Platea Alta");
                     System.out.println("");
                //tengo que preguntar si es hombre o mujer despues preguntar si es estudiante , el mayor descuento es el que prodemona
                     do{
                     System.out.println("Digite 1 si es Mujer 2 si es Hombre");
                     hOm=scanner.nextInt();
                     }while(hOm<1 ||hOm >2);
                     do{
                     System.out.println("¿Eres Estudiante?");
                     System.out.println("Digite 1 si es Estudiante Digite 2 si NO es Estudiante");
                     est=scanner.nextInt();
                     }while(est<1||est>2);
                     do{
                     System.out.println("Introdusca su edad");
                     edad=scanner.nextInt();
                     }while(edad<1||edad>100);
                     do{
                     System.out.println("Seleccione su asiento");
                    
                     for (int i = 28; i <= 36; i++) {
                    
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    System.out.println(); 
                }
            }
                     seleccion=scanner.nextInt();
                     }while(seleccion<28||seleccion>36);
                     if (edad>1&&edad<6 && hOm==1) {
                         valorTotal=plateaAlta*mujeres;
                         descuento="20%";
                         ubiAsientos="PLatea Alta";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }
                    else if (edad<12 && edad>6 && hOm==1 ) {
                         valorTotal=plateaAlta*mujeres;
                         descuento="20%";
                         ubiAsientos="Platea Alta";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                     }else if (edad>12 && edad<60 && hOm==1) {
                         valorTotal=plateaAlta*mujeres;
                         descuento="20%";
                         ubiAsientos="Platea Alta";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }else if (edad>=60&& hOm==1) {
                         valorTotal=plateaAlta*terceraEdad;
                         descuento="20%";
                         ubiAsientos="Platea Alta";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Tercera Edad a sido efectivo");      
                }else if (edad<6 && edad>1 && hOm==2 ) {
                         valorTotal=plateaAlta*ninos;
                         descuento="10%";
                         ubiAsientos="Platea Alta";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Niño a sido efectivo");
                    
                }else if (edad>12 && edad<60 && hOm==2 && est==1) {
                         valorTotal=plateaAlta*estudiante;
                         descuento="15%";
                         ubiAsientos="Platea Baja";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Estudiante a sido efectivo");
                    
                }else if (edad>12 && edad<18 && est==1) {
                         valorTotal=plateaAlta*estudiante;
                         descuento="15%";
                         ubiAsientos="Platea Alta";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Estudiante a sido efectivo");
                         
               }else if (edad > 18 && edad<60) {
                         valorTotal=plateaAlta;
                         descuento="0%";
                         ubiAsientos="Platea Alta";
                         valorBase=plateaAlta;
                         System.out.println("No tiene descuento");
               }  else if (edad>=60&& hOm==2) {
                         valorTotal=plateaAlta*terceraEdad;
                         descuento="25%";
                         ubiAsientos="Platea Alta";
                         valorBase=plateaAlta;
                         System.out.println("Descuento Tercera Edad a sido efectivo");
                }
                     
                info2.add("Tipo Asiento:");
                info.add("Valor Asiento:");
                info.add("Numero de asiento");
                info2.add("Descuento Aplicado: ");
                info.add("Valor Final: ");
                asientos2.add(ubiAsientos);
                
                asientos.add(valorBase);
                asientos.add(seleccion);
                asientos2.add(descuento);
                asientos.add(valorTotal);
                
                acoAsientos.add(seleccion);
                asientosDisponibles--;
                
                System.out.println("----BOLETA----");
                for (int i = 0; i <asientos.size();i++){
                 System.out.println(info.get(i)+" "+ asientos.get(i));
                 
         }for (int i = 0; i <asientos2.size();i++){
                 System.out.println(info2.get(i)+" "+ asientos2.get(i));
         }
                             
                 System.out.println(" ");
                 info.removeAll(info);
                 info2.removeAll(info2);
                 asientos.removeAll(asientos);
                 asientos2.removeAll(asientos2);
                             break;
                         case 5:
                             System.out.println(" Asientos Galeria");
                     System.out.println("");
                //tengo que preguntar si es hombre o mujer despues preguntar si es estudiante , el mayor descuento es el que prodemona
                     do{
                     System.out.println("Digite 1 si es Mujer 2 si es Hombre");
                     hOm=scanner.nextInt();
                     }while(hOm<1 ||hOm >2);
                     do{
                     System.out.println("¿Eres Estudiante?");
                     System.out.println("Digite 1 si es Estudiante Digite 2 si NO es Estudiante");
                     est=scanner.nextInt();
                     }while(est<1||est>2);
                     do{
                     System.out.println("Introdusca su edad");
                     edad=scanner.nextInt();
                     }while(edad<1||edad>100);
                      do{
                     System.out.println("Seleccione su asiento");
                    
                     for (int i = 37; i <= 45; i++) {
                    
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    System.out.println(); 
                }
            }
                     seleccion=scanner.nextInt();
                     }while(seleccion<37||seleccion>45);
                     if (edad>1&&edad<6 && hOm==1) {
                         valorTotal=galeria*mujeres;
                         descuento="20%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }
                    else if (edad<12 && edad>6 && hOm==1 ) {
                         valorTotal=galeria*mujeres;
                         descuento="20%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                     }else if (edad>12 && edad<60 && hOm==1) {
                         valorTotal=galeria*mujeres;
                         descuento="20%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Mujer a sido efectivo");
                    
                }else if (edad>=60&& hOm==1) {
                         valorTotal=galeria*terceraEdad;
                         descuento="20%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Tercera Edad a sido efectivo");      
                }else if (edad<6 && edad>1 && hOm==2 ) {
                         valorTotal=galeria*ninos;
                         descuento="10%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Niño a sido efectivo");
                    
                }else if (edad>12 && edad<60 && hOm==2 && est==1) {
                         valorTotal=galeria*estudiante;
                         descuento="15%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Estudiante a sido efectivo");
                    
                }else if (edad>12 && edad<18 && est==1) {
                         valorTotal=galeria*estudiante;
                         descuento="15%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Estudiante a sido efectivo");
                         
               }else if (edad > 18 && edad<60) {
                         valorTotal=galeria;
                         descuento="0%";
                         ubiAsientos="galeria";
                         valorBase=galeria;
                         System.out.println("No tiene descuento");
               }  else if (edad>=60&& hOm==2) {
                         valorTotal=galeria*terceraEdad;
                         descuento="25%";
                         ubiAsientos="Galeria";
                         valorBase=galeria;
                         System.out.println("Descuento Tercera Edad a sido efectivo");
                }
                     
                info2.add("Tipo Asiento:");
                info.add("Valor Asiento:");
                info.add("Numero de asiento");
                info2.add("Descuento Aplicado: ");
                info.add("Valor Final: ");
                asientos2.add(ubiAsientos);
                
                asientos.add(valorBase);
                asientos.add(seleccion);
                asientos2.add(descuento);
                asientos.add(valorTotal);
                
                acoAsientos.add(seleccion);
                asientosDisponibles--;
                
                System.out.println("----BOLETA----");
                for (int i = 0; i <asientos.size();i++){
                 System.out.println(info.get(i)+" "+ asientos.get(i));
                 
         }for (int i = 0; i <asientos2.size();i++){
                 System.out.println(info2.get(i)+" "+ asientos2.get(i));
         }
                             
                 System.out.println(" ");
                 info.removeAll(info);
                 info2.removeAll(info2);
                 asientos.removeAll(asientos);
                 asientos2.removeAll(asientos2);
                             
                             break;
                     }
                break;
            case 2:    
                System.out.println("Actualizar Info");
                
                if (acoAsientos.isEmpty()) {
                    System.out.println("Debe tener un asiento activo para poder modificar");
                    break;
                }
                do{
                System.out.println("Para cambiar asiento  presione 1 ");
                System.out.println("Para eliminar asiento presione 2");
                 opcion3=scanner.nextInt();
                }while(opcion3<1||opcion3>2);
                if (opcion3==1) {
                    System.out.println("Actualizacion de asientos");
                    System.out.println("Digite el asiento a remplazar");
                    remplazo=scanner.nextDouble();
                    if (remplazo>=1&&remplazo<=9&&acoAsientos.contains(remplazo)) {
                        do{
                        System.out.println("Digite Nuevo Asiento");
                        for (int i = 1; i <= 9; i++) {
                    
                            System.out.print(i + " ");
                            if (i % 3 == 0) {
                             System.out.println(); 
                }
            }            nuevo =scanner.nextInt();
                        }while(nuevo==remplazo);
                        System.out.println("Remplazo Exitoso Su Nuevo Asiento Es: "+nuevo);
                    }else if (remplazo>=19&&remplazo<=27&&acoAsientos.contains(remplazo)) {
                        do{
                        System.out.println("Digite Nuevo Asiento");
                        for (int i = 19; i <= 27; i++) {
                    
                            System.out.print(i + " ");
                            if (i % 3 == 0) {
                             System.out.println(); 
                }
            }            nuevo =scanner.nextInt();
                        }while(nuevo==remplazo);
                        System.out.println("Remplazo Exitoso Su Nuevo Asiento Es: "+nuevo);
                    }else if (remplazo>=28&&remplazo<=36&&acoAsientos.contains(remplazo)) {
                        do{
                        System.out.println("Digite Nuevo Asiento");
                        for (int i = 28; i <= 36; i++) {
                    
                            System.out.print(i + " ");
                            if (i % 3 == 0) {
                             System.out.println(); 
                }
            }            nuevo =scanner.nextInt();
                        }while(nuevo==remplazo);
                        System.out.println("Remplazo Exitoso Su Nuevo Asiento Es: "+nuevo);
                    }else if (remplazo>=37&&remplazo<=45&&acoAsientos.contains(remplazo)) {
                        do{
                        System.out.println("Digite Nuevo Asiento");
                        for (int i = 37; i <= 45; i++) {
                    
                            System.out.print(i + " ");
                            if (i % 3 == 0) {
                             System.out.println(); 
                }
            }            nuevo =scanner.nextInt();
                        }while(nuevo==remplazo);
                        System.out.println("Remplazo Exitoso Su Nuevo Asiento Es: "+nuevo);
                    }
                    acoAsientos.remove(remplazo);
                    acoAsientos.add(nuevo);
                }else if (opcion3==2) {
                    System.out.println("Eliminacion de Asientos");
                    System.out.println("Digite el asito a Eliminar");
                    eliminar=scanner.nextDouble();
                        if (acoAsientos.contains(eliminar));{
                        System.out.println("Eliminando Asiento");
                        acoAsientos.remove(eliminar);
                        System.out.println("........................");
                        System.out.println("Asiento eliminado con exito");
                       
                        
                    }   
                }
                
                break;
            case 3:
                System.out.println("Info Promociones");
                System.out.println(informacion[0]);
                System.out.println(informacion[1]);
                System.out.println(informacion[2]);
                System.out.println(informacion[3]);
                break;
                
            case 4 : 
                System.out.println("Saliendo del Programa.... \n Gracias por comprar en Teatro Moro");
                break;
        } 
        }while (opcion!=4);
         System.out.println(acoAsientos);
        
    }
    
}