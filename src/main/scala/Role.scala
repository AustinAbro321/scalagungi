package gungi
sealed trait Role{
    val shortName: Char;
    val name: String;
    val tier: Int;
    val stackable: Boolean;
    val canBeStackedUpon: Boolean;
}

case object King extends Role{
    val shortName = 'K';
    val name = "King"
    val tier = 1;
    val stackable: Boolean = false;
    val canBeStackedUpon: Boolean = false;
}