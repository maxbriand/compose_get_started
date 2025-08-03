

fun main(){
  val timeSpendToday = 220
  val timeSpendYesterday = 200
  println(timeSpendComparator(timeSpendToday, timeSpendYesterday))
}

fun timeSpendComparator(timeSpendToday: Int, timeSpendYesterday: Int): Boolean {
  if(timeSpendToday > timeSpendYesterday) {
    return (true)
  }
  else{
    return (false)
  }
}