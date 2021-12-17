package Dominio;


public class Encomienda extends Envio{
  private double peso;
  private double largo;
  private double ancho;
  private double profundidad;

  public Encomienda(double peso, double largo, double ancho, double profundidad,int codigo, String rutRemitente, String rutDestinario){
    super(codigo, rutRemitente, rutDestinario);
    this.peso = peso;
    this.largo = largo;
    this.ancho = ancho;
    this.profundidad = profundidad;
  }

  @Override
  public double calcularValor() {
    return (peso* (largo*ancho*profundidad))*50;
  }
}
