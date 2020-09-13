package ahmed.javcoder.solidprinciples.SolidPrinciple.ISP

class Programmer : Testing , Codeable {
    override fun test(): String {
        return "programmer can become tester"
    }

    override fun code(): String {
        return "tester can become developer"
    }
}