package Logica;

import Dominio.Envio;


public class NodoEnvio {

  private NodoEnvio next;
  private NodoEnvio prev;
  private Envio envio;

  public NodoEnvio(Envio envio){
    this.next = null;
    this.prev = null;
    this.envio = envio;
  }

  public NodoEnvio getNext() {
    return next;
  }

  public void setNext(NodoEnvio next) {
    this.next = next;
  }

  public NodoEnvio getPrev() {
    return prev;
  }

  public void setPrev(NodoEnvio prev) {
    this.prev = prev;
  }

  public Envio getEnvio() {
    return envio;
  }

  public void setEnvio(Envio envio) {
    this.envio = envio;
  }
}
