/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_chat_using_multithreadingconcept;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author SWL
 */
public class connector implements Runnable {
    private  ServerSocket serverSocket ;
    private PrintWriter outFromServer;
   // private ServerSocket serverSocket;
     private Scanner inFromClient,inconsole;
     private Socket socket;
    connector(Socket s) throws IOException {
        socket=s;
        inFromClient = new Scanner(socket.getInputStream());
        outFromServer = new PrintWriter(socket.getOutputStream(),true);
    }
   
        String input, output;
     
        
       

    @Override
    public void run() {
          inconsole=new Scanner(System.in);
              while (true) {
              input = inFromClient.nextLine();
              System.out.println("Client: "+input);
            
           
            System.out.print("Server: ");
            output = inconsole.nextLine();

            outFromServer.println(output);
           
            //outFromServer.flush();
            
        }
              
    }
    
    }