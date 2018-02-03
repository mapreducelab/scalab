


trait trait1 {
   var id = 0;
  def move()={println ("this is trait 1")};
   }


 trait t2 extends trait1 {
   override def move()={println ("this is trait 2")};
 }

trait t3  extends t2{

  override def move() = {println ("this is trait 3")};

}


class C extends  trait1  with t2 with t3 {
def cdef = {println("this is class C")}

}




object MultipleTraitDemo {
  def main(arg: Array[String]): Unit = {
    val c = new C
    c.move

  }
}


