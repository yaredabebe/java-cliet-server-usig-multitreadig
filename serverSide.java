
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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author SWL
 */
public class serverSide  {

   
    private static  ArrayList<connector> con=new ArrayList<>();
    private static ExecutorService p=Executors.newFixedThreadPool(5);
    
    
    public static void main(String[] args) throws IOException {
        try{
        String input, output;
        
        ServerSocket serverSocket = new ServerSocket(8088);
        

         while (true) {
               Socket socket = serverSocket.accept();
               System.out.println("connected....");
               connector client=new connector(socket);
                con.add(client);
                p.execute(client);
              
            }
         

    
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}

