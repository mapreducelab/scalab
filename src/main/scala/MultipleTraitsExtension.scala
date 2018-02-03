
trait trait1 {
   var id = 0
  def move()={println ("this is trait 1")}
   }


 trait trait2 extends trait1 {
   override def move()={println ("this is trait 2")}
 }

trait trait3 extends trait2 {

  override def move() = {println ("this is trait 3")}

}


class C extends  trait1  with trait2 with trait3 {
def cdef = {println("this is class C")}

}

// override is needed for the class as well
class C1 extends trait2  {
  override def move() = {println("C1 is moving")}

 }

object MultipleTraitsExtension {
  def main(arg: Array[String]): Unit = {
    val c = new C
    c.move

  val c1 = new C1
      c1.move
    }
  }



