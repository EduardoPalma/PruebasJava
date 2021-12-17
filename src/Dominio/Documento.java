package Dominio;


public class Documento extends Envio {

  private double peso;
  private double grosor;

  public Documento(double peso, double grosor, int codigo, String rutRemitente,
      String rutDestinario) {
    super(codigo, rutRemitente, rutDestinario);
    this.peso = peso;
    this.grosor = grosor;
  }

  @Override
  public double calcularValor() {
    return this.peso * this.grosor * 100;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getGrosor() {
    return grosor;
  }

  public void setGrosor(double grosor) {
    this.grosor = grosor;
  }
}
