package ahmed.javcoder.solidprinciples.SolidPrinciple.OCP

class GetType {

    companion object{
        fun showmessage(type : TypeOfTime):String{
            return type.message()
        }
    }
}