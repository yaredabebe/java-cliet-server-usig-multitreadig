/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_chat_using_multithreadingconcept;



import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author SWL
 */
public class clientSide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String message, inFromServer;
        
        Socket clientSocket = new Socket("localhost", 8088);
        
        
        Scanner inputFromUser = new Scanner(System.in);
        PrintWriter outputToServer = new PrintWriter(clientSocket.getOutputStream(),true);
        Scanner inputFromServer = new Scanner(clientSocket.getInputStream());
        
        
             String mesage;
              while(true){
              System.out.print("Client: ");
              mesage = inputFromUser.nextLine();
            
              outputToServer.println(mesage);
            
              mesage = inputFromServer.nextLine();
              System.out.println("Server: "+mesage);
            
        }  
         
      
          
    }
    
}

