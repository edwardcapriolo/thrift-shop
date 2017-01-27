package server;
import java.util.List;

import org.apache.thrift.TException;

import thriftshop.Delivery;

public class ThriftShopImpl implements thriftshop.ThiftShop.Iface {

	@Override
	public double priceCheck(String item) throws TException {
		System.out.println("someone asked about "+ item);
		if (item.equals("fishsticks"))
		    return 10;
		else 
			return 1;
	}

	@Override
	public List<Double> priceCheckList(List<String> items) throws TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sold(String item) throws TException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void item_delivered(Delivery d) throws TException {
		// TODO Auto-generated method stub
		
	}

}
