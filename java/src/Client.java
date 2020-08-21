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
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
        public static void main(String[] args)
        {
                try
                {
                        //create client socket
                        Socket client = new Socket("127.0.0.1", 20);

                        //upon establishing connection, print
                        //successful message
                        System.out.println("connection eastablished");

                }
                catch (UnknownHostException e)
                {
                        e.printStackTrace();
                }
                catch (IOException e)
                {
                        e.printStackTrace();
                }
        }
}
