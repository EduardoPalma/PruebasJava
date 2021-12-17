package Logica;

import Dominio.Ciudad;
import Dominio.Cliente;
import Dominio.Documento;
import Dominio.Encomienda;
import Dominio.Envio;
import Dominio.Valija;
import java.util.ArrayList;
import java.util.LinkedList;

public class SistemaImpl implements Sistema {

  private ListaEnvios le;
  private ArrayList<Ciudad> lc;
  private LinkedList<Cliente> lCl;

  public SistemaImpl(){
    this.le = new ListaEnvios();
    this.lc = new ArrayList<>();
    this.lCl = new LinkedList<>();
  }


  @Override
  public void ingresarCiudad(String nombre) {
    Ciudad ciudad = new Ciudad(nombre);
    this.lc.add(ciudad);
  }

  @Override
  public void ingresarCliente(String rut, String nombre, String apellido, int saldo,
      String nombreCiudad) {
    Cliente c = new Cliente(rut,nombre,apellido,saldo,nombreCiudad);
    this.lCl.add(c);
  }

  @Override
  public void ingresarDocumento(double peso, double grosor, int codigo, String rutRemitente,
      String rutDestinario) {
    Envio e = new Documento(peso,grosor,codigo,rutRemitente,rutDestinario);
    this.le.ingresar(e);
  }

  @Override
  public void ingresarValija(String tipoMaterial, double peso, int codigo, String rutRemitente,
      String rutDestinario) {
    Envio e = new Valija(tipoMaterial,peso,codigo,rutRemitente,rutDestinario);
    this.le.ingresar(e);
  }

  @Override
  public void ingresarEncomienda(double peso, double largo, double ancho, double profundidad,
      int codigo, String rutRemitente, String rutDestinario) {
    Envio e = new Encomienda(peso,largo,ancho,profundidad,codigo,rutRemitente,rutDestinario);
    this.le.ingresar(e);
  }

  @Override
  public boolean realizarEntrega(String rutDestinatario, String rutRemitente) {
    for(Cliente c : this.lCl){
      if(c.getRut().equalsIgnoreCase(rutDestinatario)) return true;
    }
    return false;
  }
}
