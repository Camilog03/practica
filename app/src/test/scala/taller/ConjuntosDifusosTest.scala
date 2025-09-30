package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import taller.ConjuntosDifusos

class ConjuntosDifusosTest extends AnyFunSuite {
    test("Test 1"){
      val conjDi = new ConjuntosDifusos()
      conjDi.grande(3,5)
    }

}
