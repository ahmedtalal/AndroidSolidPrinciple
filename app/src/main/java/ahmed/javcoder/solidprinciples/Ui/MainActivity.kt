package ahmed.javcoder.solidprinciples.Ui

import ahmed.javcoder.solidprinciples.OcpActions.AfternoonAction
import ahmed.javcoder.solidprinciples.OcpActions.EveningAction
import ahmed.javcoder.solidprinciples.OcpActions.MorningAction
import ahmed.javcoder.solidprinciples.OcpActions.NextActivty
import ahmed.javcoder.solidprinciples.R
import ahmed.javcoder.solidprinciples.SolidPrinciple.OCP.Afternoon
import ahmed.javcoder.solidprinciples.SolidPrinciple.OCP.Eveninig
import ahmed.javcoder.solidprinciples.SolidPrinciple.OCP.GetType
import ahmed.javcoder.solidprinciples.SolidPrinciple.OCP.Morring
import ahmed.javcoder.solidprinciples.databinding.ActivityMainBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity(){
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        binding.morringId.setOnClickListener(MorningAction())
        binding.afternoonId.setOnClickListener(AfternoonAction())
        binding.eveningId.setOnClickListener(EveningAction())
        binding.nextActivtyId.setOnClickListener(NextActivty())
    }
}