package main.io.github.nashemncube.tinybasic.ast

import main.io.github.nashemncube.tinybasic.lexer.Lexer
/**
  * Created by nashe on 27/01/2018.
  */
abstract class Statement(lexer: Lexer) {

  var args: Option[String]
  var expr: Option[Expression]
}