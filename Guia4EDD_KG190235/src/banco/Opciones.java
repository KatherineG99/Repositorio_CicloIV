
package banco;
import javax.swing.JOptionPane;


public class Opciones {
    Cliente cl= new Cliente();
    Contador ct = new Contador();
    Cuenta cn1= new Cuenta();
    Cuenta cn2= new Cuenta();
    int opc1;
    Fecha fc = new Fecha();
    Infopriv ip= new Infopriv();
    
    public void Formatofinal1(){
        JOptionPane.showMessageDialog(null,"*********************************************************************"
        +" \n Bienvenido al servicio de inscripcion de usuario para una cuenta "
                + "\n presione si para empezar a crear su cuenta"
        +"\n **********************************************************************************");
       
                
                cl.registro();
                cl.infoimpresion();
                cn1.setNombrecliente(cl.nombrecompleto);
                cn1.setNumcuenta(cl.cuenta);
                cn1.setTipoint(5);
                cn1.ingreso(cl.monto);
                fc.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de ingreso")));
                fc.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                fc.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                fc.getDia();
                fc.getMes();
                fc.getAño();
               
    
                
                JOptionPane.showConfirmDialog(null, "Datos de la cuenta 1"
                +"\n Nombre del titular "+cn1.getNombrecliente()+"\n Numero de cuenta "+cn1.getNumcuenta()
                +"\n Tipo de interes "+cn1.getTipoint()+"\n saldo disponible en su cuenta "+cn1.getSaldo()
                +"\n Fecha de apertura de cuenta "+fc.toString());
                
                String opc;
                do{
                    opc= JOptionPane.showInputDialog("Desea hacer algun otro movimiento ?"
                    +"\n presione S para si"
                    +"\n presione x para salir").toUpperCase();
                    opc1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Que desea hacer hoy?"
                    +"\n 1 - Transaccion de una cuenta existente a la recien creada"
                    +"\n 2 - Aumentar el saldo de una cuenta existente"
                    +"\n 3 - Aumentar el saldo de su cuenta recien creada "
                    +"\n 4 - Sacar dinero de cuenta existente"
                    ));
                    
                    switch(opc1){
                        case 1:
                            
                            JOptionPane.showMessageDialog(null,"Porfavor ingrese los datos de su cuenta existente a continuacion");
                            cn2.setNombrecliente(JOptionPane.showInputDialog(null,"Ingrese su nombre de Usuario"));
                            cn2.setNumcuenta(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                            cn2.setTipoint(5);
                            cn2.setSaldo(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el saldo de la cuenta ")));
                            JOptionPane.showConfirmDialog(null, "Datos de la cuenta 2"
                                +"\n Nombre del titular "+cn2.getNombrecliente()+"\n Numero de cuenta "+cn2.getNumcuenta()
                                +"\n Tipo de interes "+cn2.getTipoint()+"\n saldo disponible en su cuenta "+cn2.getSaldo());
                            
                            int saldo= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad que quiere transferir"));
                            
                            cn2.transferencia(cn1,saldo );
                            fc.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de ingreso")));
                            fc.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                            fc.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                            fc.getDia();
                            fc.getMes();
                            fc.getAño();
                            
                            JOptionPane.showMessageDialog(null, "Saldo de la cuenta 2"+
                                    "\n saldo actual "+ cn2.getSaldo()+"\n movimiento hecho en : "+fc.toString());
                            
                            JOptionPane.showMessageDialog(null, "Saldo de la cuenta 1"+
                                    "\n saldo actual "+ cn1.getSaldo()+"\n movimiento hecho en : "+fc.toString());
                            
                            break;
                        case 2:
                             JOptionPane.showMessageDialog(null,"Porfavor ingrese los datos de su cuenta existente a continuacion");
                            cn2.setNombrecliente(JOptionPane.showInputDialog(null,"Ingrese su nombre de Usuario"));
                            cn2.setNumcuenta(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                            cn2.setTipoint(5);
                            cn2.setSaldo(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el saldo de la cuenta ")));
                            
                            JOptionPane.showConfirmDialog(null, "Datos de la cuenta 2"
                                +"\n Nombre del titular "+cn2.getNombrecliente()+"\n Numero de cuenta "+cn2.getNumcuenta()
                                +"\n Tipo de interes "+cn2.getTipoint()+"\n saldo disponible en su cuenta "+cn2.getSaldo());
                            int ingresox =(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad que va a depositar en su cuenta ")));
                            cn2.ingreso(ingresox);
                            fc.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de ingreso")));
                            fc.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                            fc.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                            fc.getDia();
                            fc.getMes();
                            fc.getAño();
                            JOptionPane.showMessageDialog(null, "Saldo de tu cuenta es"+
                                    "\n saldo actual "+ cn2.getSaldo()+"\n movimiento hecho en : "+fc.toString());
                            break;
                        case 3:
                            
                            JOptionPane.showConfirmDialog(null, "Datos de la cuenta 1"
                                +"\n Nombre del titular "+cn1.getNombrecliente()+"\n Numero de cuenta "+cn1.getNumcuenta()
                                +"\n Tipo de interes "+cn1.getTipoint()+"\n saldo disponible en su cuenta "+cn1.getSaldo());
                            
                            int ingreso =(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad que va a depositar en su cuenta ")));
                            
                            cn1.ingreso(ingreso);
                            fc.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de ingreso")));
                            fc.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                            fc.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                            fc.getDia();
                            fc.getMes();
                            fc.getAño();
                            
                            JOptionPane.showMessageDialog(null, "Saldo de tu cuenta es"+
                                    "\n saldo actual "+ cn1.getSaldo()+"\n movimiento hecho en : "+fc.toString());
                            break;
                        case 4:
                            
                            JOptionPane.showMessageDialog(null,"Porfavor ingrese los datos de su cuenta existente a continuacion");
                            cn2.setNombrecliente(JOptionPane.showInputDialog(null,"Ingrese su nombre de Usuario"));
                            cn2.setNumcuenta(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                            cn2.setTipoint(5);
                            cn2.setSaldo(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el saldo de la cuenta ")));
                            
                            JOptionPane.showConfirmDialog(null, "Datos de la cuenta 2"
                                +"\n Nombre del titular "+cn2.getNombrecliente()+"\n Numero de cuenta "+cn2.getNumcuenta()
                                +"\n Tipo de interes "+cn2.getTipoint()+"\n saldo disponible en su cuenta "+cn2.getSaldo());
                            
                                int ingresox1 =(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad que va a depositar en su cuenta ")));
                                cn2.reintegro(ingresox1);
                                fc.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de ingreso")));
                                fc.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                                fc.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                                fc.getDia();
                                fc.getMes();
                                fc.getAño();
                                
                            JOptionPane.showMessageDialog(null, "Saldo de tu cuenta es"+
                                    "\n saldo actual "+ cn2.getSaldo()+"\n movimiento hecho en : "+fc.toString());
                            break;
                        default:
                            break;
                    }          
                }while(!opc.equals("X"));
                
                
               
        }
    
    public void Formatofinal2(){
        int opcion;
        do{
        opcion =Integer.parseInt( JOptionPane.showInputDialog(null, "Que clase desea provar?"
        +"\n 1 - Cliente"
        +"\n 2 - Cuenta"
        +"\n 3 - Contador"
        +"\n 4 - Fecha"
        +"\n 0 - salir"));
        
        switch(opcion){
            case 1:
                cl.registro();
                cl.infoimpresion();
                break;
            case 2:
                cn1.setNombrecliente(JOptionPane.showInputDialog(null,"Digita tu nombre de usuario  "));
                cn1.setNumcuenta(JOptionPane.showInputDialog(null,"Ingrese su numero de cuenta"));
                cn1.setTipoint(5);
                cn1.setSaldo(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el saldo bancario")));
                JOptionPane.showMessageDialog(null,"Datos de la cuenta 1 "+"\n Nombre de titular"+cn1.getNombrecliente()
                +"\n numero de cuenta "+ cn1.getNumcuenta()
                +"\n tipo de interes "+ cn1.getTipoint()
                +"\n saldo "+ cn1.getSaldo());
                cn1.getNombrecliente();

       


                Cuenta cuenta2 = new Cuenta("Ariel Gomez", "152635896541", 5.00, 300);                      
                cn1.ingreso(4000);


                JOptionPane.showMessageDialog(null,"Saldo: " + cn1.getSaldo());


                JOptionPane.showMessageDialog(null,"Datos de la cuenta 2 "+"\n Nombre de titular"+cuenta2.getNombrecliente()
                        +"\n numero de cuenta "+ cuenta2.getNumcuenta()
                        +"\n tipo de interes "+ cuenta2.getTipoint()
                        +"\n saldo "+ cuenta2.getSaldo());
                        cuenta2.getNombrecliente();




                cn1.transferencia(cuenta2, 10);

                JOptionPane.showMessageDialog(null,"Saldo de la cuenta 2 "+"\n saldo: "+cuenta2.getSaldo());
                JOptionPane.showMessageDialog(null,"Saldo de la cuenta 1 "+"\n saldo: "+cn1.getSaldo());
                break;
            case 3:
                ct.setCont(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero que dara inicio al contador")));
                String opc3;
                do{
                    opc3=JOptionPane.showInputDialog(null,"Que desea hacer? "
                    +"\n I - Incrementarel contador" 
                    +"\n D - Decrementar el contador" 
                    +"\n S - Salir").toUpperCase();
                    
                    switch(opc3)
                    {
                        case "I":
                            ct.incrementar();
                            JOptionPane.showMessageDialog(null,ct.getCont());
                            break;
                        case "D":
                            ct.decrementar();
                             JOptionPane.showMessageDialog(null,ct.getCont());
                            break;
                        default:
                            break;     
                    }
                    
                }while(!opc3.equals("S"));
                
                JOptionPane.showMessageDialog(null, "Valor final del contador "+ ct.getCont());
                
                break;
            case 4:
                
                fc.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de ingreso")));
                fc.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                fc.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia de la solicitud")));
                fc.getDia();
                fc.getMes();
                fc.getAño();
                
                 if (fc.fechacor()) { 

                JOptionPane.showMessageDialog(null,"Fecha introducida: " + fc.toString());

                JOptionPane.showMessageDialog(null,"Los 30 dias siguientes son: ");
                    
                    for (int i = 1; i <= 30; i++) {
                        fc.Dsiguiente();
                        JOptionPane.showMessageDialog(null,"Fecha introducida: " + fc.toString());
                    }

                } else { 
                    JOptionPane.showMessageDialog(null,"fecha no valida ");
                }
                
                break;
            default:
                
                break;
        }
        
        
        }while(opcion>0);    
    }
    
    public void desfinal(){
        String dec;
        dec=JOptionPane.showInputDialog("Que desea ver? "
        +"\n CT - clases trabajando juntas "
        +"\n CU - Clases una por una ").toUpperCase();
        
        switch(dec){
            case "CT":
                Formatofinal1();
                break;
            case "CU":
                Formatofinal2();
                break;
            default:
                JOptionPane.showMessageDialog(null, "No valido");
                break;
        }
        
    }
        
    }
    
