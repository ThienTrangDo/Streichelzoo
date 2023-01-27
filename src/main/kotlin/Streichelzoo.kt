class Streichelzoo {
    var tierListe  : MutableList<Tier> = mutableListOf(
        Schaf ("Shawn", 23.4, 5, "Weiblich"),
        Schaf ("Charlie", 28.9, 8, "Männlich"),

        Huhn ("Kikeri", 2.5, 2, "Männlich", 2),
        Huhn ("Nani", 2.3, 3, "Weiblich", 5),

        Kuh ("Berta", 525.0, 7, "Weiblich"),

        Pony ("Gustav", 315.0, 3, "Männlich", 30.5)
    )

    fun alleFreuenSich (name: String){
        println("Herzlich Willkommen $name, schön das du unsern Streichelzoo besuchst! Viel Spaß.")
        for (i in tierListe){
            i.noise()
        }
    }

    fun alleTiereFuettern (name: String){
        println("Alle Tiere werden gefütter.")
        for (i in tierListe){
            i.fuettern(name)
        }
    }

    fun rennen (pony1: String, pony2: String){

    }

    override fun toString(): String {
        return super.toString()
    }
}
