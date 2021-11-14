/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.práctica.obligatoria.java;
import java.util.Scanner;
/**
 *
 * @author Sheppard
 */
public class ActividadPrácticaObligatoriaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
         int opc=0;
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editorDeCodigoPreferido;
        String sistemaOperativoQueUtiliza;

        System.out.println("Bienvenido al Sistema");
        System.out.println("Ingrese Nombre");
        nombre= sc.next();
        System.out.println("Ingrese Apellido");
        apellido= sc.next();
        System.out.println("Ingrese Edad");
        edad= sc.nextInt();
        System.out.println("Ingrese Hobbie");
        hobbie= sc.next();
        System.out.println("Ingrese editor de codigo Preferido");
        editorDeCodigoPreferido= sc.next();
        System.out.println("Ingrese Sistema Operativo Que Utiliza");
        sistemaOperativoQueUtiliza= sc.next();          
        
        System.out.println("Su Nombre es :" +nombre + " Su Apellido es : "+apellido+" Su Edad es:" +edad +
                " El Hobbie ingresado es " +hobbie + " Su editor de codigo preferido es : "+ editorDeCodigoPreferido+" y el sistema operativo utilizado es: "+sistemaOperativoQueUtiliza);
        
       
                
             
                
    }
    
}
