package ahmed.javcoder.solidprinciples.Ui

import ahmed.javcoder.solidprinciples.OcpActions.ProgrammerAction
import ahmed.javcoder.solidprinciples.OcpActions.TesterAction
import ahmed.javcoder.solidprinciples.R
import ahmed.javcoder.solidprinciples.databinding.ActivityMain3Binding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil

class MainActivity3 : AppCompatActivity() {
    private lateinit var ispBinding : ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ispBinding = DataBindingUtil.setContentView(this , R.layout.activity_main3)
        ispBinding.voiceId.setOnClickListener(ProgrammerAction())
        ispBinding.TextId.setOnClickListener(TesterAction())
        ispBinding.dipctivtyId.setOnClickListener(){
            val intent : Intent = Intent(this , MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent : Intent = Intent(this , MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
}