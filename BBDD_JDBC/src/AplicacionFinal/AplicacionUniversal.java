
package AplicacionFinal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;




public class AplicacionUniversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBBDD mimarco=new MarcoBBDD();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoBBDD extends JFrame{

	public MarcoBBDD(){
		
		setBounds(300,300,700,700);
		
		LaminaBBDD milamina=new LaminaBBDD();
		
		add(milamina);
		
	}	
	
}

class LaminaBBDD extends JPanel{
	
	public LaminaBBDD(){
		
		setLayout(new BorderLayout());
		
		comboTablas=new JComboBox();
		
		areaInformacion=new JTextArea();
		
		add(areaInformacion,BorderLayout.CENTER);
                 ConectarBBDD();
		obtenerTablas();
                
                comboTablas.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        String nombreTabla=(String) comboTablas.getSelectedItem();//se guarda el nombre de la tabla
                        
                        mostrarInfoTabla(nombreTabla);
                        }
                });
		
		add(comboTablas, BorderLayout.NORTH);
		
               
		
		}
	
	
	public void ConectarBBDD(){
            miConexion=null;
            
            try {
                
                miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba_venta", "root", "");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        public void obtenerTablas(){
            
            ResultSet miResulset=null;
            
            try {
                DatabaseMetaData datosBBDD=miConexion.getMetaData();//se alamcenan los metadatos de la DB
                
                miResulset=datosBBDD.getTables(null, null,null, null);
                
                while (miResulset.next()) {       
                    
                    comboTablas.addItem(miResulset.getString("TABLE_NAME"));//nombre de la tablas
                    
                }
                
                
            } catch (Exception e) {
            }
            
        }
        
        public void mostrarInfoTabla(String tabla){
            
            ArrayList<String> campos=new ArrayList<String>();
            
            String consulta="SELECT * FROM "+tabla;
            
            try {
                areaInformacion.setText("");
                
                Statement miStatement = miConexion.createStatement();
                ResultSet miResulset = miStatement.executeQuery(consulta);
                ResultSetMetaData rsBBDD=miResulset.getMetaData();//se almacenanlos datos de resulset en metadata
                
                for (int i = 0 ; i < rsBBDD.getColumnCount(); i++) {
                    campos.add(rsBBDD.getColumnLabel(i));
                    
                }
                
                while (miResulset.next()) {                    
                    
                    for (String nombreCampo : campos) {
                        areaInformacion.append(miResulset.getString(nombreCampo)+" ");
                        
                    }
                    areaInformacion.append("\n");
                }
                
            } catch (Exception e) {
            }
            
            
        }
	
	private JComboBox comboTablas;

	private JTextArea areaInformacion;
        
        private Connection miConexion;
	
	
	
}


		
