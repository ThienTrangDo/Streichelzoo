class Pony(name: String, gewicht: Double, alter: Int, geschlecht: String, var geschwindigkeit: Double):Tier(name, gewicht, alter, geschlecht) {

    override fun noise() {
        super.noise()
        println("Wiehiehie...")
    }

    fun reiten(besucherName: String, besucherAlter: Int){
        if (alter >=1 && besucherAlter >= 6){
            println("Der Besucher $besucherName darf das Pony $name reiten.")
        }
        else {
            println("$besucherName darf das Pony $name nicht reiten, weil $besucherName erst $besucherAlter Jahre alt ist.")
        }
    }
}

/*
fun melken(name: String) {
        if (alter >= 3 && geschlecht == "Weiblich") {
            println("${this.name} gibt Milch.")
        }
        else {
            println("${this.name} kann keine Milch geben.")
        }
    }
 */