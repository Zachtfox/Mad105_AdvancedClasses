fun main(){
    var em1 = Employee("John Williams", PositionTitle.Production, true, 22.00, 1)
    var em2 = Employee("Klaus Badelt", PositionTitle.Technical, false, 21.00, 2)
    var em3 = Employee("Hans Zimmer", PositionTitle.Sales, false, 21.50, 3)

    em1.display()
    em1.caclulate(45.00)

    em2.display()
    em2.caclulate(50.00)

    em3.display()
    em3.caclulate(35.00)

}