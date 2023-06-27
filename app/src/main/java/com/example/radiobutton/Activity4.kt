package com.example.radiobutton


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.ToggleButton

class Activity4 : AppCompatActivity() {
    private lateinit var toogleButton: ToggleButton
    private lateinit var textViewToggleButton: TextView
    private lateinit var textViewData: TextView
    private lateinit var buttonGoBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        //        TODO("ToogleButton")
        toogleButton=findViewById(R.id.toggleButton)
        textViewToggleButton=findViewById(R.id.textViewToogleButton)
        toogleButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked){
                textViewToggleButton.visibility= View.VISIBLE
            }else{textViewToggleButton.visibility= View.INVISIBLE}
        }


        textViewData=findViewById(R.id.textViewData)

        val data=intent.extras
       data?.let {
           val message=data.getString(Constants.INTENT_MESSAGE_KEY)
           val messge2=data.getString(Constants.INTENT_MESSAGE2_KEY)
           val number=data.getDouble(Constants.INTENT_DATA_NUMBER)

           textViewData.text=message +"\n"+ messge2 +"\n" + number
       }

        buttonGoBack=findViewById(R.id.buttonGoBak)
        buttonGoBack.setOnClickListener{
            val intent=intent
            intent.putExtra(Constants.INTENT_MESSAGE2_KEY,"Hello From 4th Activity")
            setResult(Constants.RESULT_CODE,intent)
            finish()
        }
    }
}