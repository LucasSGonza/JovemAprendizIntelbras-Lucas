fun main() {
    val winningBid = Bid(5000, "Private Collector")
    val testBid = Bid(2000, "Da Silva")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
    println("Item C is sold at ${auctionPrice(testBid, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
   // Fill in the code.
   bid?.let {
       // se nao for nulo
       return bid.amount
   } ?: run {
       // se for nulo
       return minimumPrice       
   }
}