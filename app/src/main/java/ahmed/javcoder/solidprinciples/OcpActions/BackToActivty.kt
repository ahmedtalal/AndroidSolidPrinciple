package ahmed.javcoder.solidprinciples.OcpActions

import ahmed.javcoder.solidprinciples.Ui.MainActivity
import ahmed.javcoder.solidprinciples.Ui.MainActivity2
import ahmed.javcoder.solidprinciples.Ui.MainActivity3
import android.content.Intent
import android.view.View

class BackToActivty : View.OnClickListener {
    override fun onClick(v: View) {
        val intent =  Intent(v.context , MainActivity3::class.java)
        v.context.startActivity(intent)
       ( v.context as MainActivity2).finish()
    }
}