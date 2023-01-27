open class Tier(var name: String, var gewicht: Double, var alter: Int, var geschlecht: String) {

    fun move(){
        println("Das Tier ${this.name} bewegt sich.")
    }

    open fun noise(){
        println("Das Tier ${this.name} macht Geräusche.")
    }

    fun streicheln(name: String){
        println("Das Tier ${this.name} wurde von dem Besucher $name gestreichelt.")
    }

    fun fuettern(name: String){
        println("Das Tier ${this.name} wurde von dem Besucher $name gefüttert.")
        var neuesGewicht= this.gewicht+(this.gewicht/100*2)
        println("${this.name} wiegt jetzt $neuesGewicht")
    }
}