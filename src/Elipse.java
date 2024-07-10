public class Elipse extends Forma {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String nombre, String color, double cX, double cY, double menor, double mayor){
        super(nombre, color, cX, cY);
        this.radioMayor = mayor;
        this.radioMenor = menor;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Radio menor: " + this.radioMenor);
        System.out.println("Radio mayor: " + this.radioMayor);
    }
    @Override
    public double calcularArea() {
        return (PI*this.radioMayor*this.radioMenor);
    }
}
