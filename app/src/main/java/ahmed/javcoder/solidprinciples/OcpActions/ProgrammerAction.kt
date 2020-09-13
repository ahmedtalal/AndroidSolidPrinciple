package ahmed.javcoder.solidprinciples.OcpActions

import ahmed.javcoder.solidprinciples.SolidPrinciple.ISP.Programmer
import ahmed.javcoder.solidprinciples.Ui.MainActivity3
import android.annotation.SuppressLint
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class ProgrammerAction : View.OnClickListener {
    @SuppressLint("SetTextI18n")
    override fun onClick(v: View) {
        val programmer  = Programmer()
        (v.context as MainActivity3).textType_id.text = programmer.code() + " and " + programmer.test()
    }
}