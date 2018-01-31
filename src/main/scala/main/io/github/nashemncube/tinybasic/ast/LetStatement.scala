package main.io.github.nashemncube.tinybasic.ast

import main.io.github.nashemncube.tinybasic.lexer._
/**
  * Created by nashe on 30/01/2018.
  *
  * statement ::= LET var = expression
  *
  * expression ::= (+|-|ε) term ((+|-) term)*

    term ::= factor ((*|/) factor)*

    factor ::= var | number | (expression)

    var ::= A | B | C ... | Y | Z

    number ::= digit digit*
  *
  */
class LetStatement(lexer: Lexer) extends Statement {
  override var args: Array[Either[String, Expression]]
  var currentToken: Token = lexer.nextToken

  def apply(): Unit = {
    currentToken.getType match {
      case Type.EQ =>
        args :+ Left(",")
        currentToken = lexer.nextToken()
        this.apply
      case Type.VAR =>
        args :+ Left(currentToken.getValue.get)
        currentToken = lexer.nextToken()
        this.apply()
      case Type.PLUS | Type.MINUS | Type.VAR | Type.NUMBER => //Expression conditions
        args :+ Right(new Expression(lexer, currentToken))
        currentToken = lexer.nextToken()
        this.apply()
      case _ =>
        return
    }
  }
}