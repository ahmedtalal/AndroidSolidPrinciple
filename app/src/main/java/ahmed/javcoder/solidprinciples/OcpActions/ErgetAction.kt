package ahmed.javcoder.solidprinciples.OcpActions


import ahmed.javcoder.solidprinciples.SolidPrinciple.LSP.Erget
import ahmed.javcoder.solidprinciples.Ui.MainActivity2
import android.annotation.SuppressLint
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class ErgetAction : View.OnClickListener {
    @SuppressLint("SetTextI18n")
    override fun onClick(v: View) {
        val erget  = Erget()
        (v.context as MainActivity2).messageType_id.text = erget.eat() + " and " + erget.fly()
    }
}