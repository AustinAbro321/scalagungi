package gungi

import scala.math.{ abs, max, min }

case class Pos (row: Int,column: Int){
  def touches(other: Pos): Boolean = true;
}

object Pos {

}