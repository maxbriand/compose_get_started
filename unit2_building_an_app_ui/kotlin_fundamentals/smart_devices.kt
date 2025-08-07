
class SmartDevices {
  val name: String = "Android TV"
  val status: String = "Online"
  val category: String = "Entertainment"
  var speakerVolume: Int = 1
    set(value){
      if (value in 0..100){
        field = value}
    }

  fun turnOff(){println("SmartDevice is turned on!")}
  fun turnOn(){println("SmartDevice is turned off!")}

}

fun main() {
  val smartTvDevice = SmartDevices() 
  smartTvDevice.turnOff()
  smartTvDevice.turnOn()
  println("The name of the tv is: ${smartTvDevice.speakerVolume}")
  smartTvDevice.speakerVolume = 2
  println("The name of the tv is: ${smartTvDevice.speakerVolume}")
  smartTvDevice.speakerVolume = 200
  println("The name of the tv is: ${smartTvDevice.speakerVolume}")


}