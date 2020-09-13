package ahmed.javcoder.solidprinciples.SolidPrinciple.DIP

class Notification {

    companion object {
        fun notificationType(type :Imessage , message : String) : String{
            return type.sendMessage(message)
        }
    }
}