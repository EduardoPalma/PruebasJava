package Dominio;

public class Ciudad {

  private String nombre;
  private int cantidadEnviados;
  private int cantidadRecibidos;

  public Ciudad(String nombre){
    this.nombre = nombre;
    this.cantidadEnviados = 0;
    this.cantidadRecibidos = 0;
  }

  public void agregarEnvio() {
    this.cantidadEnviados++;
  }

  public void agregarRecibidos(){
    this.cantidadRecibidos++;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCantidadEnviados() {
    return cantidadEnviados;
  }

  public void setCantidadEnviados(int cantidadEnviados) {
    this.cantidadEnviados = cantidadEnviados;
  }

  public int getCantidadRecibidos() {
    return cantidadRecibidos;
  }

  public void setCantidadRecibidos(int cantidadRecibidos) {
    this.cantidadRecibidos = cantidadRecibidos;
  }
}
