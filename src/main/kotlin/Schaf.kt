class Schaf(name: String, gewicht: Double, alter: Int, geschlecht: String): Tier(name, gewicht, alter, geschlecht) {
    override fun noise() {
        super.noise()
        println("määhh...")
    }
}