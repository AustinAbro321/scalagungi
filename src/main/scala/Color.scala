package gungi
sealed trait color{
    val shortName: Char
    val name: String;
}

case object White extends color{
    val shortName = 'W';    
    val name = "White"; 
}

case object Black extends color{
    val shortName = 'B';
    val name = "Black"; 
}