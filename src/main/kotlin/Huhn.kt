class Huhn(name: String, gewicht: Double, alter: Int, geschlecht: String, var eierProTag: Int):Tier(name, gewicht, alter, geschlecht) {
    override fun noise() {
        super.noise()
        println("ga-gack...")
    }
}
