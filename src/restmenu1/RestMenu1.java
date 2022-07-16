
package restmenu1;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Jakke
 */
public class RestMenu1 {

    public static void main(String[] args) {
        String nom, seguir = " ";
        int opcion, opc2 = 0, opc3 = 0,cants, cant2, cant3, cant4, cant5, cant6, cant7, cant8, cant9, cant10, cant11,precio = 0; 
        double    preciota = 0, preciopo = 0, preciosli = 0, precioham = 0, precioen = 0, precioj= 0, preciopiz= 0, precioc=0, preciom=0, preciocer=0, preciococ=0;
        double precio1 = 0, precio2 = 0, precio3 = 0;
        double   subtotal, paga, vuelto, faltante;
        double total;
        
        
        
        
         String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        JOptionPane.showMessageDialog(null,"""
                                            ** >> BIENVENIDOS A JAKKE'S FOOD << ** 
                                                              """+timeStamp+"\n");
        nom =  String.valueOf(JOptionPane.showInputDialog(null, " Quien nos visita hoy? "));
        JOptionPane.showMessageDialog(null, "Hola, " +nom+ " !!"+"\n"+"\nHecha un vistazo a lo que tenemos preparado para vos..."); 
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                           >> Menu Jakke's Food <<
                                                               
                                                                 \n1- Plato Principal
                                                                \n 2 - Refresco
                                                                \n 3 - Factura   
                                                                \n 4 - Salir
                                                               
                                                          Digite su opción a elegir : """));
            
           switch(opcion) {
               case 1:
                   while ( opc2<=5) {
                        opc2 =  Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                     > > Menu Platos Principales Jakke's Food <<
                                                                                                      1 - Tacos ................................ ₡3.700
                                                                                                      2 - Pollo asado (con verduras)............ ₡5.400
                                                                                                      3 - Hamburguesa de la casa ............... ₡4.500
                                                                                                      4 - Ensalada y Salmon..................... ₡6.000
                                                                                                      5 -  Pizza de la casa   ........ ₡1.500 slide  |  ₡ 8.000 grande
                                                                                                                    Digite su opción a elegir """));
                        switch (opc2) {
                            case 1:
                                cants = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas ordenes de tacos desea: "));
                                precio= precio +3700;
                                preciota = cants * precio;
                          
                                        JOptionPane.showMessageDialog(null,"Son "+cants+ " ordenes de tacos el precio es de:  ₡ "+preciota);
                                        
                                        do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                                break;
                                
                                
                             case 2:
                                 cant2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas ordenes de pollo asado con verduras desea: "));
                                precio1= precio1 + 5400;
                                 preciopo = cant2 * precio1;
                                        JOptionPane.showMessageDialog(null,"Son "+cant2+ " ordenes de pollo asado con verduras y el precio es de:  ₡ "+preciopo);
                                        
                                        do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                                break;
                                
                             case 3:
                                 cant3 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas ordenes de hamburguesa de la casa  desea: "));
                                precio2 = precio2 + 4500;
                                 precioham = cant3 * precio2;
                                        JOptionPane.showMessageDialog(null,"Son "+cant3+ " ordenes de hamburguesa y el precio  es de:  ₡ "+precioham);
                                        do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                                break;   
                                
                             case 4:
                                 cant4 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas ordenes de ensalada y salmon desea: "));
                                precio3 = precio3 + 6000;
                                 precioen = cant4 * precio3;
                                        JOptionPane.showMessageDialog(null,"Son "+cant4+ " ordenes ensalada y salmon y el precio por ellos es de:  ₡ "+precioen);
                                        do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                                break;   
                                
                             case 5:
                                 while ( opc3<=2) {
                                    
                                    opc3 =  Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                                                < Pizza de la casa >
                                                                                                                                         1 - Slide ................  ₡1.500
                                                                                                                                         2 - Grande ...............  ₡10.000
                                                                                                                                           Digite su opción a elegir """));
                                    if (opc3==1 ){
                                        cant5 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantos slides quiere: "));
                                        preciosli= cant5 * 1500;
                                        JOptionPane.showMessageDialog(null,"Son "+cant5+ " slides y el precio por ellos es de:  ₡ "+preciosli);                             
                                    }
                                    else
                                        if  (opc3==2) {
                                            cant6 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas pizzas quiere: "));
                                            preciopiz = cant6 * 8000;
                                        JOptionPane.showMessageDialog(null,"Son "+cant6+ " pizzas y el precio por ellos es de:  ₡ "+preciopiz);
                                    }
                                                                  do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                                } //case 5 
                                 do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transacción?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                                break;

                             default: JOptionPane.showMessageDialog(null, "Opción digitada no valida\n", "** Intente de nuevo**", JOptionPane.WARNING_MESSAGE);
                        } // fin segundo switch
                   break; // break primer case primer swicth
                   }
                   
               case 2 :
                   while (opc2<=2) {
                      opc2 =  Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                   >>  Menú de Refrescos Jakke's Food <<
                                                                                                                      1 - Té Jazmín (tetera)
                                                                                                                      2 - Cas
                                                                                                                      3 - Maracuya
                                                                                                                      4 - Bavaria Gold
                                                                                                                      5 - CocaCola
                                                                                                                      6 - No deseo refresco
                                                                                                           Digite su opcion a elegir """));
                      
                      switch(opc2) {
                          case 1:
                              cant7 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas teteras de te de jazmin desea: "));
                              precioj = cant7 * 1500;     
                              JOptionPane.showMessageDialog(null,"Son "+cant7+ " te de jazmin y el precio por ellos es de:  ₡ "+precioj);
                              do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                              break;
                              
                          case 2:
                              cant8 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantos cas desea: "));
                              precioc = cant8 * 1000;
                              JOptionPane.showMessageDialog(null,"Son "+cant8+ " cas y el precio por ellos es de:  ₡ "+precioc); 
                              do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                              break;    
                              
                          case 3:
                              cant9 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantos maracuya desea: "));
                              preciom = cant9 * 1000;
                              JOptionPane.showMessageDialog(null,"Son "+cant9+ " maracuya y el precio por ellos es de:  ₡ "+preciom); 
                              do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                              break;
                              
                          case 4:
                              cant10 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas cervezas desea: "));
                              preciocer = cant10 * 2000;
                              JOptionPane.showMessageDialog(null,"Son "+cant10+ " cervezas y el precio por ellos es de:  ₡ "+preciocer); 
                              do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                              break; 
                              
                          case 5:
                               cant11 = Integer.parseInt(JOptionPane.showInputDialog(" Digite cuantas cocacola desea: "));
                              preciococ = cant11 * 1400;
                              JOptionPane.showMessageDialog(null,"Son "+cant11+ " cocacola y el precio por ellos es de:  ₡ "+preciococ); 
                              do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                              break;
                            
                          case 6:
                              JOptionPane.showMessageDialog(null,"No se desea refresco"); 
                              do {
                                         seguir = JOptionPane.showInputDialog("Desea realizar otra transaccion?(S/N) ");
                                         }  while ((!"N".equals(seguir)) && (!"n".equals(seguir)) && (!"S".equals(seguir)) &&  (!"s".equals(seguir)));
                              break;
                              
                          default: JOptionPane.showMessageDialog(null, "Opción digitada no valida\n", "** Intente de nuevo**", JOptionPane.WARNING_MESSAGE);
                      }
                   break;
                   } // primer while segundo case
                   
               case 3:
                   subtotal = preciota + preciopo + preciosli + precioham + precioen+ precioj+ preciopiz+ precioc+ preciom+ preciocer+ preciococ;
                  double iva = subtotal * 0.13;
                   total = subtotal + iva;
                   JOptionPane.showMessageDialog(null, """
                                                       Esta es su factura: 
                                                       Nombre: """+nom+" \nSubtotal: "+subtotal+"\n TOTAL:"+total);
                    paga =  Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese el monto con el que cancela: ")); 
                    vuelto = paga - total ;
                    faltante = total - paga;
                    
                    if(vuelto<0){
                        JOptionPane.showMessageDialog(null, "Falta dinero para realizar el pago. El dinero faltante es de: "+faltante);
                    }
                    else if(vuelto==0){
                        JOptionPane.showMessageDialog(null, "Se ha pagado exacto. No es necesario dar cambio");
                    }
                    else if(vuelto>0){
                        JOptionPane.showMessageDialog(null, "Su cambio es de: "+vuelto);
                    }
   
                   break;
                   
               case 4:
                   JOptionPane.showMessageDialog(null, " Saliendo del programa ...");
                   break;
                   
               default: JOptionPane.showMessageDialog(null, "Opción digitada no valida\n", "** Intente de nuevo**", JOptionPane.WARNING_MESSAGE);
               
           } // fin del primer switch
          
        } while (opcion!=4 &&  "S".equalsIgnoreCase(seguir));  // final del do primero
        

        
    }  //
} //
