package ahmed.javcoder.solidprinciples.SolidPrinciple.DIP

class Gmail : Imessage {
    override fun sendMessage(message: String): String {
        return message
    }
}