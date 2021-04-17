package gungi
import org.scalatest.flatspec.AnyFlatSpec

class PosTest extends AnyFlatSpec {
  "touches" should "always return true" in {
    val pos1 = new Pos(1, 1);
    val pos2 = new Pos(2, 1);
    assert(pos1.touches(pos2) == true)
  }

}
