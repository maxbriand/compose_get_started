
open class SmartDevices (var name: String, val category: String) {
  var status: String = "Online"
  open val deviceType: String = "Unknown"

  open fun turnOff(){
    status = "Off"
  }
  
  open fun turnOn(){
    status = "On"
  }
}

class SmartTv (val deviceName: String, val deviceCategory: String) 
  : SmartDevices (name = deviceName, category = deviceCategory){
    override val deviceType: String = "Smart Tv"

    var speakerVolume: Int = 1
      set(value){
      if (value in 0..100){
        field = value}
    }
  
    var channelNumber: Int = 2
    set (value){
      if (value in 0..200){
        field = value
      }
    }

    fun increaseSpeakerVolume() {
      speakerVolume++
      println("Speaker volume is increased at $speakerVolume!")
    }

    fun increaseChannelNumber() {
      channelNumber++
      println("The number of the channel is $channelNumber!")
    }
  
    override fun turnOn() {
        super.turnOn()
      println(
          "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
              "set to $channelNumber."
      )      
    }

    override fun turnOff() {
        super.turnOff()
          println("$name turned off")
    }
}

class SmartLight(deviceName: String, deviceCategory: String) 
  : SmartDevices (name = deviceName, category = deviceCategory) {

    var brightnessLevel = 0
    set (value) {
      if (value in 0..100){
        field = value}
    }

    fun increaseBrithnessLevel() {
      brightnessLevel++
      println("The brithness level of the light is increased to $brightnessLevel")
    }

    override fun turnOn() {
      super.turnOn()
      brightnessLevel = 2
      println("$name turned on. The brightness level is $brightnessLevel.")

    }

    override fun turnOff() {
      super.turnOff()
      brightnessLevel = 0
      println("Smart Light turned off")
    }
}

class SmartHome(
  val tv: SmartTv,
  val light: SmartLight) {

  fun turnOnTv() {
    tv.turnOn()
  }

  fun turnOffTv() {
    tv.turnOff()
  }

  fun increaseTvVolumne() {
    tv.increaseSpeakerVolume()
  }

  fun changeTvChannelToNext() {
      tv.increaseChannelNumber()
    }

  fun turnOnLight(){
    light.turnOn()
  }

  fun turnOffLight(){
      light.turnOff()
    }

    fun increaseLightBrightness() {
      light.increaseBrithnessLevel()
  }

  fun turnOffAllDevices() {
    light.turnOff()
    tv.turnOff()
  }
} 


fun main() {
  val smartTvDevice = SmartDevices(name = "Android TV", category = "Entertainment") 
  smartTvDevice.turnOff()
  smartTvDevice.turnOn()
  println("The name of the tv is: ${smartTvDevice.name}")
  smartTvDevice.name = "kdkd"
  println("The name of the tv is: ${smartTvDevice.name}")
  smartTvDevice.name = "kkdkd"
  println("The name of the tv is: ${smartTvDevice.name}")

  val tv = SmartTv("Apple", "TV")
  println("The name of the tv is: ${tv.deviceName}")
  tv.increaseSpeakerVolume()
  tv.increaseSpeakerVolume()

  val lights = SmartLight("My Lights", "Lights")
  println("The name of the tv is: ${lights.name}")
  lights.increaseBrithnessLevel()

  var smartDevice: SmartDevices = SmartTv("Apple TV", "Entertainment")
  smartDevice.turnOn()
  println("Device type: ${smartDevice.deviceType}")
  
  smartDevice = SmartLight("Google Light", "Utility")
  smartDevice.turnOn()



}