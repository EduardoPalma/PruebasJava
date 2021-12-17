package Dominio;


public class Valija extends Envio{
  private String tipoMaterial;
  private double peso;

  public Valija(String tipoMaterial, double peso, int codigo, String rutRemitente, String rutDestinario){
    super(codigo, rutRemitente, rutDestinario);
    this.tipoMaterial = tipoMaterial;
    this.peso = peso;
  }
  @Override
  public double calcularValor() {
    return 0;
  }
}
