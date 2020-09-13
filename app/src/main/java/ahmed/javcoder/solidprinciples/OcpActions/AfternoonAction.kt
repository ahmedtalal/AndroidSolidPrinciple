package ahmed.javcoder.solidprinciples.OcpActions

import ahmed.javcoder.solidprinciples.SolidPrinciple.OCP.Afternoon
import ahmed.javcoder.solidprinciples.SolidPrinciple.OCP.GetType
import ahmed.javcoder.solidprinciples.SolidPrinciple.OCP.Morring
import ahmed.javcoder.solidprinciples.Ui.MainActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class AfternoonAction: View.OnClickListener {
    override fun onClick(v: View) {
        (v.context as MainActivity).messageType_id.setText(GetType.showmessage(Afternoon()))
    }
}