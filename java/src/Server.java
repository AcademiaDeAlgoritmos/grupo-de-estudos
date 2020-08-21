//--------------------------------------------
// ____________Rodando________________________
//
// ________Java compiler in ubuntu____________
//
// utilize javac + nome do arquivo.java
// ex: javac Conta.java
// -------------------------------------------
// _______________Java lang___________________
//
// utilize o comando + nome da classe definida
// ex: java Conta
// -------------------------------------------
// _____________Errors de versão______________
//
// consulte o README
// -------------------------------------------
// Treinamento em Java - OOP
// Academia de Algoritmos https://github.com/AcademiaDeAlgoritmos/grupo-de-estudos
// github: Mila Zangirolame
//
// -------------------------------------------------------------------------------

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
        public static void main(String[] args)
        {
                try
                {
                        //create server Socket with demo port
                        ServerSocket server = new ServerSocket(20);

                        //wait for server connection
                        Socket s = server.accept();

                        //upon establishing connection, print
                       // successful message
                        System.out.println("connection eastablished");
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                }
        }
}
