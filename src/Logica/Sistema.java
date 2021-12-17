package Logica;

import Dominio.Ciudad;

public interface Sistema {

  public void ingresarCiudad(String nombre);

  public void ingresarCliente(String rut, String nombre, String apellido, int saldo, String ciudad);

  public void ingresarDocumento(double peso, double grosor, int codigo, String rutRemitente,
      String rutDestinario);

  public void ingresarValija(String tipoMaterial, double peso, int codigo, String rutRemitente,
      String rutDestinario);

  public void ingresarEncomienda(double peso, double largo, double ancho, double profundidad,
      int codigo, String rutRemitente, String rutDestinario);

  public boolean realizarEntrega(String rutDestinatario, String rutRemitente);

}
