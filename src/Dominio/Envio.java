package Dominio;


public abstract class Envio {
  private int codigo;
  private String rutRemitente;
  private String rutDestinario;

  public Envio(int codigo, String rutRemitente, String rutDestinario){
    this.codigo = codigo;
    this.rutDestinario = rutDestinario;
    this.rutRemitente = rutRemitente;
  }

  public Envio() {

  }

  public abstract double calcularValor();

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getRutRemitente() {
    return rutRemitente;
  }

  public void setRutRemitente(String rutRemitente) {
    this.rutRemitente = rutRemitente;
  }

  public String getRutDestinario() {
    return rutDestinario;
  }

  public void setRutDestinario(String rutDestinario) {
    this.rutDestinario = rutDestinario;
  }
}
