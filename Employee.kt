class Employee(var name: String,
               var position: PositionTitle,
               var salary: Boolean,
               var payRate: Double,
               var shift: Int){

    var bonus: Double = 0.00
    var overtimePay: Double = 0.00

    fun display(){
        println("$name")
        println("Position: $position")
        println("Salary: $salary")
        println("Rate of Pay: $payRate")
        println("Shift: $shift")
    }

    fun caclulate(hoursIn: Double){
        var payRate = payRate
        var salary = salary
        var shift = shift

        if (shift == 2) {
             bonus = .05
        }
        if (shift == 3){
             bonus = .1
        }
        else {
             bonus = 0.0
        }

        if (hoursIn > 40 && salary == false){
             overtimePay = (hoursIn - 40) * 1.5
        }

        var pay = (payRate * hoursIn) + (hoursIn * bonus) + (overtimePay)

        println("Weekly earnings: $pay")

    }

}

