import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevices (var name: String, val category: String) {
  var status: String = "Online"
  
  open var deviceType: String = "Unknown"
  protected set 

  open fun turnOff(){
    status = "Off"
  }
  
  open fun turnOn(){
    status = "On"
  }

  fun printDeviceInfo() {
    println("Device name: $name, category: $category, type: $deviceType")
  }
}

class SmartTv (val deviceName: String, val deviceCategory: String) 
  : SmartDevices (name = deviceName, category = deviceCategory){
    override var deviceType: String = "Smart Tv"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    // : Int = 1
    //   set(value){
    //   if (value in 0..100){
    //     field = value}
    // }
  
    private var channelNumber by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 200)
    // : Int = 2
    // set (value){
    //   if (value in 0..200){
    //     field = value
    //   }
    // }

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

    fun decreaseSpeakerVolume() {
      speakerVolume--
      println("The volume of the tv is decreased!")
    }

    fun previousChannel() {
      channelNumber--
      println("The current channel is the number: $channelNumber")
    }



  }

class SmartLight(deviceName: String, deviceCategory: String) 
  : SmartDevices (name = deviceName, category = deviceCategory) {

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)
    // = 0
    // set (value) {
    //   if (value in 0..100){
    //     field = value}
    // }

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

    fun decreaseBrightness() {
      brightnessLevel--
      println("The brightless level is at $brightnessLevel")
    }


  }

class SmartHome(
  val tv: SmartTv,
  val light: SmartLight) {

  var deviceTurnOnCount = 0
    private set

  fun turnOnTv() {
    tv.turnOn()
    deviceTurnOnCount++
  }

  fun turnOffTv() {
    tv.turnOff()
    deviceTurnOnCount--
  }

  fun increaseTvVolumne() {
    tv.increaseSpeakerVolume()
  }

  fun changeTvChannelToNext() {
      tv.increaseChannelNumber()
    }

  fun turnOnLight(){
    light.turnOn()
    deviceTurnOnCount++
  }

  fun turnOffLight(){
      light.turnOff()
      deviceTurnOnCount--
    }

    fun increaseLightBrightness() {
      light.increaseBrithnessLevel()
  }

  fun turnOffAllDevices() {
    light.turnOff()
    tv.turnOff()
  }
} 

class RangeRegulator(
  initialValue: Int,
  private val minValue: Int,
  private val maxValue: Int,
  ) : ReadWriteProperty<Any?, Int> {
    
    var fieldValue = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
      return fieldValue
    }
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
      if (value in minValue..maxValue){
        fieldValue = value
      }
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

  lights.decreaseBrightness()

  tv.previousChannel()
  tv.decreaseSpeakerVolume()
  tv.previousChannel()

  val my_home: SmartHome = SmartHome(light = lights, tv = tv)


}
