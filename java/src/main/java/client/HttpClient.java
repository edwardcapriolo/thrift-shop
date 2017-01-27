package client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;

public class HttpClient {
	static String servletUrl = "http://localhost:8080/web-server/ThriftShopServlet";
	
  public static void main (String [] args) throws TException {
	thriftshop.ThiftShop.Client client;
		
	THttpClient thc = new THttpClient(servletUrl);
    TProtocol loPFactory = new TCompactProtocol(thc);
    client = new thriftshop.ThiftShop.Client(loPFactory);
    
    System.out.println(client.priceCheck("hamburgers"));
  }
}
