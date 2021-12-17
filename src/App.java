import Dominio.*;
import Logica.ListaEnvios;

public class App {

  //programa para señor nicolas que estudie
  public static void main(String [] args){

    Envio e = new Documento(10,5,1234,"1234","4321");
    Envio e1 = new Documento(10,5,1222,"1234","4321");
    Envio e2 = new Documento(10,5,1233,"1234","4321");
    ListaEnvios le = new ListaEnvios();
    le.ingresar(e);
    le.ingresar(e1);
    le.ingresar(e2);
    System.out.println(le.buscar(1234));
    le.mostrarLista();

  }

}
