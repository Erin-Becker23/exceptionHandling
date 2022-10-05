class Commercial(customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: String,
                 var propertyName: String,
                 var multiProp: Boolean)
    :Customer(customerName, customerPhone, customerAddress, squareFootage) {

    var rate = ((squareFootage.toDouble() / 1000) * 5)

    init{

    }

    fun calculate(){
        if (multiProp == true ){
            rate = (rate - (rate * .01))
        }
        else {
            rate = rate.toDouble()
        }
        println("Name: $customerName" +
                "\nPhone: $customerPhone" +
                "\nAddress: $customerAddress" +
                "\nProperty Name: $propertyName" +
                "\nSquare footage: $squareFootage" +
                "\nMultiple Properties: $multiProp" +
                "\nWeekly Charge: $$rate")
    }



}