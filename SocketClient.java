import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;


public class SocketClient {

    public static String IpAddress;
    public static int TcpPort;
    public static double BufferSize; //65k
    public static long SocketTimeOut; //1hour
    public static SocketAddress IpAddr;
    public static void main(String[] arg) throws UnknownHostException, IOException{
        System.out.println("Socket Entry Point");
        SocketClient s = new SocketClient();
        s.setIpAddress("LocalHost");
        s.setTcpPort(4194);
        s.setBufferSize(65000);
        s.setSocketTimeOut(3600);
        Server(IpAddr,s.getTcpPort());
        Client(s.getIpAddress(), s.getTcpPort());
    }

    public SocketClient() {
    }

    /* Setters */
    public void setIpAddress(String IpAddress){
        this.IpAddress = IpAddress;
    }

    public void setTcpPort(int TcpPort){
        this.TcpPort = TcpPort;
    }
    
    public void setBufferSize(double BufferSize){
        this.BufferSize = BufferSize;
    }

    public void setSocketTimeOut(long SocketTimeOut){
        this.SocketTimeOut = SocketTimeOut;
    }

    /* Getters */
    public String getIpAddress(){
        return IpAddress;
    }

    public int getTcpPort(){
        return TcpPort;
    }
    
    public double getBufferSize(){
        return BufferSize;
    }

    public long getSocketTimeOut(){
        return SocketTimeOut;
    }

    private static void Client(String ipAddress, int tcpPort) throws UnknownHostException, IOException {
        Socket client = null;
        OutputStream os = null;
        String string = "Hello I'm a Client";
        try{
            client = new Socket(SocketClient.IpAddress, SocketClient.TcpPort);
        } catch (UnknownHostException e) {
            System.err.println(e.getMessage());
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
 
        try {
            os = client.getOutputStream();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        byte [] buffer = string.getBytes();
        try {
            os.write(buffer);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void Server(SocketAddress IpAddr, int tcpPort) throws UnknownHostException, IOException{
        ServerSocket server = null;
        try{
            server = new ServerSocket(SocketClient.TcpPort);
        } catch (UnknownHostException e) {
            System.err.println(e.getMessage());
        } catch (IOException e){
            System.err.println(e.getMessage());
        }

        try {
            server.accept();
            server.bind(IpAddr);
            System.out.println("Connection accepted from " + server.getLocalPort());
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

}