public abstract class Forma {
    protected String nombre;
    protected String color;
    protected double coordenadaX;
    protected double coordenadaY;
    public static double PI = 3.1416;
    public Forma(String nombre, String color, double coordX, double coordY){
        this.nombre = nombre;
        this.color = color;
        this.coordenadaX = coordX;
        this.coordenadaY = coordY;
    }
    public void imprimir(){
        System.out.println("\nNombre: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Posicion centro (x,y): (" + this.coordenadaX + ", " + this.coordenadaY + ")");

    }

    public void cambiarColor(String nuevoColor){
        this.color = nuevoColor;
    }
    public void cambiarCentro(double x, double y){
        this.coordenadaX = x;
        this.coordenadaY = y;
        System.out.println("\nEl nuevo centro es: (" + this.coordenadaX + ", " + this.coordenadaY + ")");
    }
    public abstract double calcularArea();
}
