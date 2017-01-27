import sys
import glob
sys.path.append('gen-py')

from thriftshop import ThiftShop
from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol

transport = TSocket.TSocket('localhost', 7911)

transport = TTransport.TBufferedTransport(transport)

protocol = TBinaryProtocol.TBinaryProtocol(transport)

client = ThiftShop.Client(protocol)

transport.open()

print( client.priceCheck('fishsticks'))

