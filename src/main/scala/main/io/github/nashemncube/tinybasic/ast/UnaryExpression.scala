package main.io.github.nashemncube.tinybasic.ast

import main.io.github.nashemncube.tinybasic.lexer.Token
/**
  * Created by nashe on 11/02/2018.
  */
class UnaryExpression(operator: UnaryOperator, term: Either[Token, Expression]) extends Expression {

}
