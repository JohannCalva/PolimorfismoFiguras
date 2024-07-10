import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;
//Elaborado por Johann Calva
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Forma> formas = new ArrayList<>();
    //Algunos metodos utilizados en el main fueron hechos fuera del main pero si dentro de la clase main para que
    // no se haga muy largo, todos estos metodos se declararon estaticos
    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("\nSeleccione la opcion que desea realizar");
            System.out.println("1. Ingresar formas");
            System.out.println("2. Poner todas las formas del mismo color");
            System.out.println("3. Ver la información de las formas");
            System.out.println("4. Mostrar forma con el area maxima");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    ingresarFormas();
                    break;
                case 2:

                    formasMismoColor();
                    break;
                case 3:

                    imprimirFormas();
                    break;
                case 4:
                    try{
                        formaMayorArea();
                    }catch(Exception error){
                        System.out.println("ERROR: No existen formas agregadas");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(opcion != 5);
    }
    public static void ingresarFormas(){
        int op;
        char respuesta;
        do{
            do{
                System.out.println("\nSeleccione la forma que quiere ingresar: ");
                System.out.println("1. Rectangulo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Elipse");
                System.out.println("4. Circulo");
                System.out.print("Opcion: ");
                op = sc.nextInt();

            }while(op < 1 || op > 4);

            switch(op){
                case 1:
                    llenarRectangulo();
                    break;
                case 2:
                    llenarCuadrado();
                    break;
                case 3:
                    llenarElipse();
                    break;
                case 4:
                    llenarCirculo();
                    break;
            }
            System.out.println("Desea ingresar otra figura? (s/n)");
            respuesta = sc.next().charAt(0);
        }while(respuesta == 's'|| respuesta == 'S');
    }

    public static void llenarRectangulo(){
        System.out.println("\nLlenando Rectangulo: ");
        System.out.print("\nIngrese el color: ");
        String color = sc.next();
        System.out.println("Coordenadas del centro:");
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        System.out.print("Medida del lado de menor tamaño: ");
        double menor = sc.nextDouble();
        System.out.print("Medida del lado de mayor tamaño: ");
        double mayor = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo("Rectangulo", color, x, y, menor, mayor);
        formas.add(rectangulo);
    }

    public static void llenarCuadrado(){
        System.out.println("\nLlenando Cuadrado: ");
        System.out.print("\nIngrese el color: ");
        String color = sc.next();
        System.out.println("Coordenadas del centro:");
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        System.out.print("Medida del lado: ");
        double lado = sc.nextDouble();

        Cuadrado cuadrado = new Cuadrado(color, x, y, lado);
        formas.add(cuadrado);
    }

    public static void llenarElipse(){
        System.out.println("\nLlenando Elipse: ");
        System.out.print("\nIngrese el color: ");
        String color = sc.next();
        System.out.println("Coordenadas del centro:");
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        System.out.print("Medida del radio de mayor tamaño: ");
        double mayor = sc.nextDouble();
        System.out.print("Medida del lado de menor tamaño: ");
        double menor = sc.nextDouble();

        Elipse elipse = new Elipse("Elipse", color, x, y, menor, mayor);
        formas.add(elipse);
    }

    public static void llenarCirculo(){
        System.out.println("\nLlenando Circulo: ");
        System.out.print("\nIngrese el color: ");
        String color = sc.next();
        System.out.println("Coordenadas del centro:");
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        System.out.print("Medida del radio: ");
        double radio = sc.nextDouble();

        Circulo circulo = new Circulo(color, x, y, radio);
        formas.add(circulo);
    }

    public static void imprimirFormas(){
        if(formas == null){
            System.out.println("\nAun no se han agregado formas");
        }else{
            for(Forma forma: formas){
                forma.imprimir();
                System.out.println("Area: " + forma.calcularArea());
            }
        }
    }

    public static void formasMismoColor(){
        String nuevoColor;
        System.out.print("\nIngrese el color que le quiere poner a todas las formas: ");
        nuevoColor = sc.next();
        for(Forma forma: formas){
            forma.cambiarColor(nuevoColor);
        }
    }
    
    public static void formaMayorArea(){
        Forma mayorArea = null;
        double areaMaxima = 0;
        for(Forma forma: formas){
            double area = 0;
            area = forma.calcularArea();

            if(area > areaMaxima){
                areaMaxima = area;
                mayorArea = forma;
            }
        }
        System.out.println("\nLa forma con la mayor area es: ");
        mayorArea.imprimir();
        System.out.println("Area: " + areaMaxima);
    }
}