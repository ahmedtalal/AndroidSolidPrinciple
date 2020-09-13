package ahmed.javcoder.solidprinciples.SolidPrinciple.LSP

class Erget : FlybaleBird {
    override fun fly() : String{
        return "this is flybale erget"
    }

    override fun eat(): String {
        return "eating now"
    }
}