package ahmed.javcoder.solidprinciples.OcpActions

import ahmed.javcoder.solidprinciples.SolidPrinciple.ISP.Tester
import ahmed.javcoder.solidprinciples.Ui.MainActivity3
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class TesterAction : View.OnClickListener {
    override fun onClick(v: View) {
        val tester = Tester()
        (v.context as MainActivity3).textType_id.text = tester.test()
    }
}