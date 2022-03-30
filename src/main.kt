fun main() {
var zuri =Car("Toyota","vitz","blue",6 )
    zuri.carry(5)
    zuri.carry(9)
    zuri. identity()
    zuri.calculateParkingFees(3)
    var bus= Bus("Suzuki", "vits","white",45)
    bus.maxTripFare(40.0)

}
open class Car(var make:String,var model:String , var color:String, var capacity:Int ){
fun carry(people:Int){
    var find = people - capacity
    if (people<=capacity){
    println("carrying $people passengers")

}else{
    println("over capacity by $find people")
    }
     }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var product=  hours * 20
        return product
    }
}
class Bus(make:String, model:String , color:String,  capacity:Int ):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
    var max = fare * capacity
    return max
    }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var busFee=hours*capacity
        return busFee
    }
}
