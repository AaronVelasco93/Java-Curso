package sockets;



import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
                
                Thread mihilo = new Thread(this);//hilo
		mihilo.start();//se inicia el hilo
		}
	
	private	JTextArea areatexto;

    @Override
    public void run() {//codigo que este a la escucha
        try {
        
                
        
        ServerSocket servidor = new ServerSocket(9999);//abren conexiones conexiones
        
            while (true) {                
            
                 Socket misocket=servidor.accept();//aceptan datos
        
        DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());//leen lo que esta en flujo de datos
        
        String mensaje_texto=flujo_entrada.readUTF();//lee el mensaje
        areatexto.append("\n"+mensaje_texto);//anota en el jlabel
        
        misocket.close();
       
            }
       
            } catch (IOException ex) {
                Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
