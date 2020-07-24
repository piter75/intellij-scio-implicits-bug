package pl.dtv.test

import com.spotify.scio.ContextAndArgs

object MissingImplicts {

  case class MyClass(name: String)

  def main(cmdArgs: Array[String]): Unit = {
    val (sc, _) = ContextAndArgs(cmdArgs)

    sc.empty[MyClass]()

    sc.run()
  }
}
