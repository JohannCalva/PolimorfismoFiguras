public class Rectangulo extends Forma {
    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String nombre, String color, double cX, double cY, double menor, double mayor){
        super(nombre, color, cX, cY);
        this.ladoMenor = menor;
        this.ladoMayor = mayor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Lado menor: " + this.ladoMenor);
        System.out.println("Lado mayor: " + this.ladoMayor);
    }

    @Override
    public double calcularArea(){
        return (this.ladoMayor*this.ladoMenor);
    }

    public double calcularPerimetro(){
        return (2*(this.ladoMayor + this.ladoMenor));
    }
    public void cambiarTamanio(double factorEscala){
        this.ladoMenor *= factorEscala;
        this.ladoMayor *= factorEscala;
    }
}
