package server;

import thriftshop.*;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class ThriftShopServer {
	public static void main(String[] args) {
		try {
			TServerSocket serverTransport = new TServerSocket(7911);
			ThiftShop.Processor<ThiftShop.Iface> processor = new thriftshop.ThiftShop.Processor<ThiftShop.Iface>(
					new ThriftShopImpl());
			TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
			System.out.println("Starting server on port 7911 ...");
			server.serve();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
	}
}