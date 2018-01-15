/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

/**
 *
 * @author MaLindu DiLshan
 */
public class Server {

    private DatagramSocket clientSocket;
    private InetAddress IPAddress;
    private DatagramPacket sendPacket, receivePacket;
    private String modifiedSentence;

    public String sentDatatoClient(String ipaddress, String keyword) throws Exception {

       //Catch those exceptions SocketException, UnknownHostException, IOException
        clientSocket = new DatagramSocket();
        IPAddress = InetAddress.getByName(ipaddress);

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        sendData = keyword.getBytes();
        //System.out.println("sendData..."+sendData);

        sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);

        clientSocket.setSoTimeout(1000);

        try {

            receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            modifiedSentence = new String(receivePacket.getData());

            System.out.println("From gaming PC :" + modifiedSentence);

        } catch (SocketTimeoutException e) {
            // timeout exception.
            System.out.println("Timeout reached...." + e.getMessage());
            modifiedSentence = "offline";
            clientSocket.close();
        }
        clientSocket.close();
        return modifiedSentence;
    }

    public String sentDatatoClientThread(String ipaddress, String keyword, String time) throws Exception {

               //Catch those exceptions SocketException, UnknownHostException, IOException
        clientSocket = new DatagramSocket();
        IPAddress = InetAddress.getByName(ipaddress);

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        String word = keyword+time; //  time
        //System.out.println("time sending..."+word);

        sendData = word.getBytes();

        sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        clientSocket.send(sendPacket);

        clientSocket.setSoTimeout(1000);

        try {

            receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            modifiedSentence = new String(receivePacket.getData());

            System.out.println("From gaming PC :" + modifiedSentence);

        } catch (SocketTimeoutException e) {
            // timeout exception.
            System.out.println("Timeout reached...." + e.getMessage());
            modifiedSentence = "offline";
            clientSocket.close();
        }
        clientSocket.close();
        return modifiedSentence;
    }

}
