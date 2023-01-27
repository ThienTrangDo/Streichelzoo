class Kuh (name: String, gewicht: Double, alter: Int, geschlecht: String):Tier(name, gewicht, alter, geschlecht){

    constructor(name: String, gewicht: Double, alter: Int, geschlecht: String, gibtMilch: Boolean):this (name, gewicht, alter, geschlecht)

    var gibtMilch = false

    override fun noise() {
        super.noise()
        println("Muuhh...")
    }

    fun melken(name: String) {
        if (alter >= 3 && geschlecht == "Weiblich") {
            gibtMilch = true
            println("${this.name} gibt Milch.")
        }
        else {
            println("${this.name} kann keine Milch geben.")
        }
    }
}
