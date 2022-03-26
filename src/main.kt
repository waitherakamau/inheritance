fun main(){
    var mycar=Car("audi","q7","blue",4)
    println( mycar.Calculateparkingfees(4))
    mycar.Identity()
    mycar.Carry(2)
    var myBus=Bus("oxygen","coach","white",30)
    println(myBus.mixTripFare(15.2))
    myBus.Identity()
    myBus.Carry(30)
    println(myBus.Calculateparkingfees(3))
    println(myBus.mixTripFare(15.2))




}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun Carry(people:Int){
        var y=people-capacity

        if (people<=capacity)
            println("Carrying $people passengers")
        else
            println("over capacity by $y people")


    }
    fun Identity(){
        println("i am $color $make $model")

    }
    open fun Calculateparkingfees(hours:Int):Int{
        var H=hours*20
        return H


    }

}
class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
      fun mixTripFare(fare:Double):Double{
        var t=fare*capacity
          return t
      }

    override fun Calculateparkingfees(hours: Int): Int {
        var x=hours*capacity
        return x
    }

    }
