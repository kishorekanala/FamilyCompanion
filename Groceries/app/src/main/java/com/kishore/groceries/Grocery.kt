package com.kishore.groceries

class Grocery {
    var nameGrocery: String = ""
        get() = field

        set(value) {
            field = value
            println("Setting nameGrocery ${value}")
        }
    var brandGrocery: String
        get() = field
        set(value) {
            field = value
            println("Setting brandGrocery ${value}")
        }
    var qty: Float = 0.0F
        get() = field
        set(value) {
            field = value
            println("Setting qty ${value}")
        }
    var rate: Float = 0.0F
        get() = field
        set(value) {
            field = value
            println("Setting qty ${value}")
        }

    constructor(nameGrocery: String, brandGrocery: String, qty: Float, rate: Float) {
        this.nameGrocery = nameGrocery
        this.brandGrocery = brandGrocery
        this.qty = qty
        this.rate = rate
    }

    init {
        println("Grocery Init")
    }


}

fun main() {
    println("main")
    val g = Grocery("","", 0.0F, 0.0F)
    g.nameGrocery = "Sugar"
//    g.brandGrocery = "Parle"
//    g.qty = 2.0F
//    g.rate = 50.0F

    println("${g.nameGrocery}")
}