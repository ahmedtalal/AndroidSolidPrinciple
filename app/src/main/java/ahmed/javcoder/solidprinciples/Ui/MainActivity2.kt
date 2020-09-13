package ahmed.javcoder.solidprinciples.Ui

import ahmed.javcoder.solidprinciples.OcpActions.BackToActivty
import ahmed.javcoder.solidprinciples.OcpActions.ErgetAction
import ahmed.javcoder.solidprinciples.OcpActions.PenguinAction
import ahmed.javcoder.solidprinciples.R
import ahmed.javcoder.solidprinciples.SolidPrinciple.LSP.Erget
import ahmed.javcoder.solidprinciples.SolidPrinciple.LSP.Penguin
import ahmed.javcoder.solidprinciples.databinding.ActivityMain2Binding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main2)
        binding.backToActivtyId.setOnClickListener(BackToActivty())
        binding.ergetId.setOnClickListener(ErgetAction())
        binding.penguinId.setOnClickListener(PenguinAction())


    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent : Intent = Intent(this , MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}