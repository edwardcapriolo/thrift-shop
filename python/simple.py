import sys
import glob
sys.path.append('gen-py')

from thriftshop import ThiftShop
from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol

    # Make socket
transport = TSocket.TSocket('localhost', 7911)

    # Buffering is critical. Raw sockets are very slow
transport = TTransport.TBufferedTransport(transport)

    # Wrap in a protocol
protocol = TBinaryProtocol.TBinaryProtocol(transport)

    # Create a client to use the protocol encoder
client = ThiftShop.Client(protocol)

    # Connect!
transport.open()

print( client.priceCheck('fishsticks'))

