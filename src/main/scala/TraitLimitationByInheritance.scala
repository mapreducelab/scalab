
    abstract class HealthCare {
      def drinkWater()

      def takePills()
    }

    trait Surgery extends HealthCare {
      var id = 0;

      def takePills() {
        println("Take pils after surgery")
      }

      def sleep()
    }


    abstract class Pain extends HealthCare with Surgery { // Will compile
      def takeCareOfPain()

      override def takePills {
        println("Take pills if the pain persist")
      }
    }

    abstract class Recovery extends Surgery { // still needs to be abstract because has 2 it has 2 unimplemented members in the HealthCare which is extension of Surgery
      override def takePills = {
        println("Take pills for the faster recovery")
      }
    }

    class Treatment {
      def drinkWater = {
        print("Drink more water")
      }
    }

    class GoodHealth extends Pain {   // Need to override three method in order to present class without abstract key word
      def feelGreat = {("Do not forgot to exersice")}

      override def drinkWater() = {
        println(" Don't forgot to drink plenty of water")
      }

      override def takeCareOfPain() = {
        println(" Don't forgot to drink plenty of water")
      }

      override def sleep() = {
        println("Sleep at least 8 hours in a day!!!")
      }
    }

      // The below code will never compile

    //    $ scalac TraitLimitationByInheritance.scala
    //    TraitLimitationByInheritance.scala:44: error: illegal inheritance; superclass Treatment
    //      is not a subclass of the superclass HealthCare
    //      of the mixin trait Surgery
    //    class Appointments extends Treatment with Surgery {
    //      ^
    //   Please uncomment and try to reproduce the error:

    //      class Appointments extends Treatment with Surgery {
    //      override def takePills = {
    //        println("Do not forgot to make follow up appointment after surgery")
    //
    //      }
    //    }


    object TraitLimitationByInheritance {

      def main(arg: Array[String]): Unit = {

      val goodHealth: GoodHealth = new GoodHealth {

      }
        goodHealth.takeCareOfPain
        goodHealth.sleep
    }

  }






