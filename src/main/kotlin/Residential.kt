class Residential(customerName: String,
                  customerPhone: String,
                  customerAddress: String,
                  squareFootage: String,
                  var senior: Boolean)
    :Customer(customerName, customerPhone, customerAddress, squareFootage) {

    var rate = ((squareFootage.toDouble()/1000)*6)

    init{

    }

    fun calculate(){
        if (senior == true){
            rate = (rate - (rate * .15))
        }
        else{
            rate = rate.toDouble()
        }
        println("Name: $customerName" +
                "\nPhone: $customerPhone" +
                "\nAddress: $customerAddress" +
                "\nSquare footage: $squareFootage" +
                "\nIs a senior: $senior" +
                "\nWeekly Charge: $$rate")
    }


}
