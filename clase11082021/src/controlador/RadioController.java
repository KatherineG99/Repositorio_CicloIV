
package controlador;
import modelo.Radio;
import dao.RadioDao;
public class RadioController {
    
    public static void main(String[] args) {
      Radio radio=new Radio();
      RadioDao rd=new RadioDao();
      //llenado de el objeto tipo Radio
      radio.setId(1);
      radio.setEstacion(100.1);
      radio.setNombrerad("ABC");
      //finaliza el llenado
      //aqui se pasa el parametro como objeto de tipo Radio para pasarlo a dao
      rd.consultarRadio(radio);
    }
}
