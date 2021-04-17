package gungi
case class Piece(    
    role: Role,
    color: Boolean,
){
    def canMove(from: Pos, to: Pos): Boolean = 
    this.role match{
        case King => from touches to
    }
}