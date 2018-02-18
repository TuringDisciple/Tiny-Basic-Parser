package main.io.github.nashemncube.tinybasic.ast

import main.io.github.nashemncube.tinybasic.lexer._
/**
  * Created by nashe on 29/01/2018.
  */
class EndStatement(lexer: Lexer) extends Statement(lexer){
  override var args: Array[Either[Token, Expression]] = Array.empty

  override def getArgs(): Array[Either[Token, Expression]] = {
    throw new RuntimeException("End statement has no args, function getArgs should not be called")
  }
}
