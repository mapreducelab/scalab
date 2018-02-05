
class Customers (var custumerId:Int, val customerName: String ,val customerYOB: String, var customerTemperature: Int) {


  println("Constructor begins")
  def display(defaultVal: Int) = {(customerTemperature * 2) + defaultVal}

  println("still inside contsructor")

// Axilary constructor
  def this(customerID: String, customerTemperature: Int) {
    this(10, Customers.defaultCustomerName, Customers.defaultCustomerYOB, customerTemperature)
  }

  def this(){
    this(Customers.defaultCustomerID, Customers.defaultCustomerName, Customers.defaultCustomerYOB,0)
  }

  println(s"Customer Info => $custumerId,$customerName, $customerYOB")

}

// Axilary constructor with 0 arguments


// Companion Object

object Customers{
  var defaultCustomerID = 1
  var defaultCustomerName ="Vasya Eremenko"
  var defaultCustomerYOB = "1910"
  var defaultCustomerTemperature = 35
  }


object CompanionObject {

  def main(arg: Array[String]): Unit = {
     val c = new Customers(10,"Liza Korotkaya","1975", 33)
    val defaulVal: Int = 32
    println("Your temperature is ", c.display(defaulVal))

   val c1 = new Customers(11,Customers.defaultCustomerName,Customers.defaultCustomerYOB, 30)
    println("Your temperature is ", c1.display(defaulVal))

   }
  }



