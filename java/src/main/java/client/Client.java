package client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;

public class Client {
  public static void main(String[] args) throws TException {
      TSocket transport = new TSocket("localhost", 7911);
      transport.open();
      TProtocol protocol = new TBinaryProtocol(transport);
      thriftshop.ThiftShop.Client client = new thriftshop.ThiftShop.Client(protocol);
      
      
      double result = client.priceCheck("fishsticks");
      System.out.println("Return from server: " + result);
      
      
      transport.close();
  }
}