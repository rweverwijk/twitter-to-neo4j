package com.godatadriven.twitter_classifier

object Bootstrap {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      System.err.println("You must provide the checkpoint directory")
      System.exit(1)
    }
    StoreToNeo4j(args.head).run()
  }
}