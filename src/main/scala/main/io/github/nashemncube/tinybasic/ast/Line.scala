package main.io.github.nashemncube.tinybasic.ast
/**
  * Created by nashe on 27/01/2018.
  */
class Line(lineNumber: Option[String], statement: Statement) {

  def this(stmt: Statement) = this(Option.empty, stmt)
}