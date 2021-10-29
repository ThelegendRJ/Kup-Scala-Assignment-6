package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class StackTest extends AnyFlatSpec {
  val obj=new Implement[Int](List(3,5,7,9))
  "Condition" should  "give true if stack is Empty" in{
      assert(!(obj.isEmpty==true))
    }
  "Condition" should  "give true if stack is not Empty" in{
    assert(obj.isEmpty==false)
  }
    "Condition" should " provide top element in stack" in {
      obj.push(11)
      obj.push(6)
      assert(obj.top==6)
    }
    "condition" should "Pop element from stack" in{
      obj.push(4)
      obj.push(9)
      obj.pop()
      assert(obj.top==4)
    }

  }

