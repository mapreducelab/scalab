


trait Vehicles{
   var id = 0;
   def move() {println("Vehicle is moving ")}
   def charge()= {println ("Vehicle is charging")};
 }

 // define second trait

 trait Vehicles1{

    def not_move();
    def start1();
 }




abstract class Plain {
   def fly()
   def move() = {println("Plane is moving")}
 }

 abstract class AirPlain {
   def airplainStart()
  }


// abstract class can extend multiple trait

abstract class Car extends Vehicles with Vehicles1 {
  def start()  {println("car started")}
  def stop();
  override def move()  {println("Car is moving")}
}


// Class or Traits can not extend multiple abstract classes
// scalac ./traits_example.scala
 // .\traits_example.scala:40: error: class Car needs to be a trait to be mixed in

// class Train extends Plain with Car{
//
//
//   class Train extends Plain with Car{
//    def train_start() = {println("train is stated")}
//
// }


// Above example can only overwritted to extend one abstract class

class Train extends Plain{
  def fly = {println("train is stopped")}
  def train_start() = {println("train is stated")}

}

 // New class which extends the abstract class and Trait

 class TrainX extends AirPlain with Vehicles{
     def airplainStart = {println("airplane started")}
 }


// Program execution

 object Traint_Demo {
   def main (arg: Array[String]): Unit = {
     val train = new Train
     train.fly()

     val car: Car = new Car {

       override def stop(): Unit = {println ("car is stopped")}
       override def not_move(): Unit = {println ("car is not moving")}
       override def start1(): Unit =  {println ("car is started")}

           }
     car.start()
     car.start1()
     car.stop()
   }

 }


