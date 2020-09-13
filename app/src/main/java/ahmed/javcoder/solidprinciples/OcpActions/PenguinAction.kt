package ahmed.javcoder.solidprinciples.OcpActions

import ahmed.javcoder.solidprinciples.SolidPrinciple.LSP.Penguin
import ahmed.javcoder.solidprinciples.Ui.MainActivity2
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class PenguinAction : View.OnClickListener {

    override fun onClick(v: View) {
        var penguin = Penguin()
        (v.context as MainActivity2).messageType_id.text = penguin.eat()
    }
}