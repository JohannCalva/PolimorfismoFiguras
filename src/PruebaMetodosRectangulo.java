import java.util.Scanner;
//En esta clase se encuentra lo solicitado sobre la prueba de los metodos implementados en Rectangulo
//Este es un main independiente realizado exclusivamente para probar los metodos del rectangulo
public class PruebaMetodosRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double factor;
        System.out.print("Ingrese el color: ");
        String color = sc.nextLine();
        System.out.println("Coordenadas del centro:");
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        System.out.print("Medida del lado de menor tamaño: ");
        double menor = sc.nextDouble();
        System.out.print("Medida del lado de mayor tamaño: ");
        double mayor = sc.nextDouble();

        Rectangulo rec = new Rectangulo("Rectangulo", color, x, y, menor, mayor);

        do{
            System.out.println("\nSeleccione la opcion que desea realizar: ");
            System.out.println("1. Imprimir datos");
            System.out.println("2. Calcular area");
            System.out.println("3. Calcular perimetro");
            System.out.println("4. Cambiar tamanio");
            System.out.println("5. Cambiar centro");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    rec.imprimir();
                    break;
                case 2:
                    System.out.println("\nArea: " + rec.calcularArea());
                    break;
                case 3:
                    System.out.println("\nPerimetro: " + rec.calcularPerimetro());
                    break;
                case 4:
                    System.out.println("\nIngrese el factor de escala para aumentar o disminuir tamanio");
                    factor = sc.nextDouble();
                    rec.cambiarTamanio(factor);
                    break;
                case 5:
                    System.out.println("Ingrese las nuevas coordenadas: ");
                    System.out.println("X: ");
                    double xC = sc.nextDouble();
                    System.out.println("Y: ");
                    double yC = sc.nextDouble();
                    rec.cambiarCentro(xC, yC);
                    break;
                case 6:
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion !=6);
    }
}
