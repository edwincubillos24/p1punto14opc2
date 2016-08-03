package punto14opc2;

import java.util.Scanner;

public class Punto14opc2 {

    //atributos
    private double base, altura, lado, radio,area;    
    Scanner lector;
    //metodos
    
    public void calcular_cuadrado(){
        lector = new Scanner(System.in);
        System.out.print("Digite lado del cuadrado: ");
        lado= lector.nextDouble();
        area = lado*lado;
        System.out.println("El area del cuadrado es: "+area);    
    }
    public void Area_Triangulo(){
        lector = new Scanner(System.in);
        System.out.print("Digite lado del base: ");
        base= lector.nextDouble();
        System.out.print("Digite lado del altura: ");
        altura= lector.nextDouble();
        area = base*altura/2;
        System.out.println("El area del cuadrado es: "+area);        
    }
    
    public static void main(String[] args) {
        int seleccion=0;
        Punto14opc2 figura = new Punto14opc2();
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("0. Cuadrado");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            System.out.println("Ingrese número de Figura geométrica: ");
            seleccion=lector.nextInt();
            if (seleccion==0){
                figura.calcular_cuadrado();
            }
            else if (seleccion==1){
                //Figura1.Area_Rectangulo();
            }
            else if (seleccion==2){
                figura.Area_Triangulo();
            }
            else if (seleccion==3){
               // Figura1.Area_Circulo();
            }
            else {
                //Figura1.Escoger_Figura();    
                
                
            }
        }while (seleccion!=4);
    }
    
}
