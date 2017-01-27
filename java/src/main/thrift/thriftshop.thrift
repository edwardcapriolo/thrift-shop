namespace java thriftshop

struct Delivery {
    1: optional i32 quantity = 0,
    2: optional string item,
    3: optional string delivered_by,
}

service ThiftShop {

  double priceCheck(string item),
  list<double> priceCheckList(list<string> items),

  oneway void sold(string item)

  void item_delivered (Delivery d)

}

