package ahmed.javcoder.solidprinciples.OcpActions

import ahmed.javcoder.solidprinciples.Ui.MainActivity
import ahmed.javcoder.solidprinciples.Ui.MainActivity2
import android.content.Intent
import android.view.View

class NextActivty : View.OnClickListener {
    override fun onClick(v: View) {
        val intent =  Intent(v.context , MainActivity2::class.java)
        v.context.startActivity(intent)
       ( v.context as MainActivity).finish()
    }
}