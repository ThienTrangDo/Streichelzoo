fun main (){

    var besucher1 = Besucher("Franz", 35)
    besucher1.nameVonBesucher()
    println()

    var besucher2 = Besucher ("Sissi", 4)
    besucher2.nameVonBesucher()
    println()

    var helgaTier = Tier ("Helga", 35.3, 12, "Weiblich")
    println(helgaTier.name)
    println(helgaTier.gewicht)
    println(helgaTier.alter)
    println(helgaTier.geschlecht)
    println()

    helgaTier.move()
    helgaTier.noise()
    helgaTier.streicheln(besucher1.name)
    helgaTier.fuettern(besucher1.name)
    println()

    var shawnDasSchaf = Schaf ("Shawn", 23.4, 5, "Weiblich")
    shawnDasSchaf.noise()
    println()

    var kikeriDasHuhn = Huhn ("Kikeri", 2.5, 2, "Männlich", 2)
    kikeriDasHuhn.noise()
    println("${kikeriDasHuhn.name} legt jeden Tag ${kikeriDasHuhn.eierProTag} Eier.")
    println()

    var bertaDieKuh = Kuh ("Berta", 525.0, 7, "Weiblich")
    bertaDieKuh.noise()
    bertaDieKuh.melken(besucher1.name)
    println()

    var gustavDasPony = Pony ("Gustav", 315.0, 3, "Männlich", 30.5)
    gustavDasPony.noise()
    gustavDasPony.reiten(besucher1.name, besucher1.alter)
    gustavDasPony.reiten(besucher2.name, besucher2.alter)
    println()

    var streichelzoo = Streichelzoo()
    streichelzoo.alleTiereFuettern("Franz")
    streichelzoo.alleFreuenSich("Franz")
}