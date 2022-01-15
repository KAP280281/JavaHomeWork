package com.pb.kravets.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Klient {
    private JTextField text;
    private static String dataFromUser, dataFromServer;
    public static void main(String[] args) throws Exception{
        String serverIp = "127.0.0.1";
        int serverPort = 1234;

        //рисуем окно
        JFrame f = new JFrame ("Клиент");
        f.setSize(500, 200);
        f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextField text = new JTextField("vvod",30);
        JButton button = new JButton("Отправить сообщение");
        JTextArea vivod = new JTextArea(8,40);
        panel.add(BorderLayout.WEST,text);
        panel.add(BorderLayout.EAST, button);
        f.getContentPane().add(BorderLayout.NORTH,new JScrollPane(vivod));
        f.getContentPane().add(BorderLayout.SOUTH,panel);
        f.setVisible(true);


        Socket server = new Socket(serverIp, serverPort);
        BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter outServer = new PrintWriter(server.getOutputStream(), true);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dataFromUser=text.getText();
                outServer.println(dataFromUser);
                vivod.append("Отправка сообщения: "+dataFromUser+"\n");
                try {
                    dataFromServer = inServer.readLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                vivod.append("Ответ сервера: "+dataFromServer+"\n");
               text.setText("");
            }
        });


           if ("exit".equalsIgnoreCase(dataFromUser)) {
              outServer.close();
              inServer.close();
              server.close();
           }

    }

}
