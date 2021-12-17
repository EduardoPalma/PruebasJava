package Dominio;


import Logica.ListaEnvios;

public class Cliente {
  private String rut;
  private String nombre;
  private String apellido;
  private int saldo;
  private ListaEnvios le;
  private Ciudad ciudad;

  public Cliente(String rut, String nombre, String apellido, int saldo, String nombreCiudad) {
    this.rut = rut;
    this.nombre = nombre;
    this.apellido = apellido;
    this.saldo = saldo;
    this.le = new ListaEnvios();
    this.ciudad = ciudad;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public ListaEnvios getLe() {
    return le;
  }

  public void setLe(ListaEnvios le) {
    this.le = le;
  }

  public Ciudad getCiudad() {
    return ciudad;
  }

  public void setCiudad(Ciudad ciudad) {
    this.ciudad = ciudad;
  }
}
