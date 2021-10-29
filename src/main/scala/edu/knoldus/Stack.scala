package edu.knoldus

trait Stack[A] {
  def push(s:A): List[A]
  def pop() :A
  def top : A
  def isEmpty: Boolean
}

class Implement[A](var list: List[A]) extends Stack[A] {
  override def push(s: A): List[A] = {
    list = s :: list
    list
  }

  override def pop(): A = {
    val topElement = list.head
    list = list.tail
    topElement
  }


  override def top: A = list.head

  override def isEmpty: Boolean = if(list==Nil) true else false
}

