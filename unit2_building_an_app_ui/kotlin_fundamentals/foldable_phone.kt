open class Phone(
    var isScreenLightOn: Boolean = false){
    
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    open fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(
    var isOn: Boolean = false,
    var isFolded: Boolean = true)
    : Phone(isScreenLightOn = isOn){

    override fun switchOn() {
        if (isFolded == true)
            isOn = true
    }

    override fun switchOff() {
        isOn = false
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }

}


fun main() {
    val samsungPhone: FoldablePhone = FoldablePhone()
    samsungPhone.switchOn()
    samsungPhone.checkPhoneScreenLight()
    println(samsungPhone.isFolded)
}





