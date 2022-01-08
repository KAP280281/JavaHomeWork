package com.pb.kravets.hw14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Klient {


    public static void main(String[] args) throws Exception{
        String serverIp = "127.0.0.1";
        int serverPort = 1234;

        Socket server = new Socket(serverIp, serverPort);
        BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter outServer = new PrintWriter(server.getOutputStream(), true);

        System.out.println("Введите сообщение:");
        BufferedReader inConsole = new BufferedReader(new InputStreamReader(System.in));

        String dataFromUser, dataFromServer;

        // Основной цикл отправки сообщений серверу
        while ((dataFromUser = inConsole.readLine()) != null) {
            outServer.println(dataFromUser);
            dataFromServer = inServer.readLine();
            System.out.println(dataFromServer);
            System.out.println("Введите сообщение:");
            if ("exit".equalsIgnoreCase(dataFromUser)) {
                break;
            }
        }
        outServer.close();
        inServer.close();
        server.close();
    }

}
