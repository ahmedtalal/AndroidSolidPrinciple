package ahmed.javcoder.solidprinciples.Ui

import ahmed.javcoder.solidprinciples.R
import ahmed.javcoder.solidprinciples.SolidPrinciple.DIP.Gmail
import ahmed.javcoder.solidprinciples.SolidPrinciple.DIP.HotMail
import ahmed.javcoder.solidprinciples.SolidPrinciple.DIP.Notification
import ahmed.javcoder.solidprinciples.databinding.ActivityMain4Binding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

class MainActivity4 : AppCompatActivity() {
    private lateinit var switchBinding : ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        switchBinding = DataBindingUtil.setContentView(this , R.layout.activity_main4)
        switchBinding.gmailNotifId.setOnClickListener(){
            switchBinding.textTypeId.text = Notification.notificationType(Gmail() , "notification from gmail")
        }

        switchBinding.hotmailId.setOnClickListener(){
            switchBinding.textTypeId.text = Notification.notificationType(HotMail() , "notification from hotmail")
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this , MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
}