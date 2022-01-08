package com.pb.kravets.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    static class Handler implements Runnable {
        private final Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Клиент " + name.charAt(name.length() - 1)+" подключился" );

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                String clientMessage;
                while ((clientMessage = in.readLine()) != null) {
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        break;
                    }
                    out.println(LocalDateTime.now().toString()+" Клиент " + name.charAt(name.length() - 1) + ": " + clientMessage);
//                    System.out.println(clientMessage);
                }

                System.out.println("Клиент "+name.charAt(name.length() - 1)+" разорвал соединение.");
                out.close();
                in.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (Exception ex) {
                    // ignore
                }
            }
        }

        public static void main(String[] args) throws Exception {
            int port = 1234;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Сервер запущен на порту : " + port);
            ExecutorService threadPool = Executors.newFixedThreadPool(10);

            // В цикле ждем запроса клиента
            while (true) {
                Socket clientSocket = serverSocket.accept();
                threadPool.submit(new Handler(clientSocket));
            }

        }
    }
}