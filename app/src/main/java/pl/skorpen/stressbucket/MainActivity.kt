package pl.skorpen.stressbucket

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.View.OnFocusChangeListener
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.warkiz.widget.IndicatorSeekBar
import com.warkiz.widget.OnSeekChangeListener
import com.warkiz.widget.SeekParams
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<EditText>(R.id.positive1)
        textView.setText(getValue("positive1"))
        textView.onFocusChangeListener= OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) { //SAVE THE DATA
                saveToPreference("positive1", textView.text.toString())
            }
        }
        findViewById<EditText>(R.id.positive2).apply {setText(getValue("positive2"))
        onFocusChangeListener = OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("positive2", text = text.toString())
            }
        }}
        findViewById<EditText>(R.id.positive3).apply {setText(getValue("positive3"))
        onFocusChangeListener = OnFocusChangeListener { _: View?, hasFocus: Boolean ->
            if (!hasFocus) {
                saveToPreference("positive3", text = text.toString())
            }
        }}
        findViewById<EditText>(R.id.positive4).apply {setText(getValue("positive4"))
        onFocusChangeListener = OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("positive4", text = text.toString())
            }
        }}
        findViewById<EditText>(R.id.positive5).apply {setText(getValue("positive5"))
        onFocusChangeListener = OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("positive5", text.toString())
            }
        }}
        findViewById<EditText>(R.id.negative1).apply {setText(getValue("negative1"))
        onFocusChangeListener= OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("negative1", text.toString())
            }
        }}
        findViewById<EditText>(R.id.negative2).apply {setText(getValue("negative2"))
        onFocusChangeListener = OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("negative2", text.toString())
            }
        }}
        findViewById<EditText>(R.id.negative3).apply {setText(getValue("negative3"))
        onFocusChangeListener = OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("negative3", text.toString())
            }
        }
        }
        findViewById<EditText>(R.id.negative4).apply {setText(getValue("negative4"))
        onFocusChangeListener = OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("negative4", text.toString())
            }
        }
        }
        findViewById<EditText>(R.id.negative5).apply {setText(getValue("negative5"))
        onFocusChangeListener = OnFocusChangeListener { _ , hasFocus ->
            if (!hasFocus) {
                saveToPreference("negative5", text.toString())
            }
        }}
        val seekBarPositive1 = findViewById<IndicatorSeekBar>(R.id.seekBarPositive1).apply{
            setProgress((getIntValue("positiveSeek1").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
            override fun onSeeking(seekParams:SeekParams) {}
            override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
            override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                saveIntToPreference("positiveSeek1",seekBar.progress)
                updateCounter()
                }
            }
        }
        val seekBarPositive2 = findViewById<IndicatorSeekBar>(R.id.seekBarPositive2).apply {
            setProgress((getIntValue("positiveSeek2").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("positiveSeek2",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarPositive3 = findViewById<IndicatorSeekBar>(R.id.seekBarPositive3).apply {
            setProgress((getIntValue("positiveSeek3").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("positiveSeek3",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarPositive4 = findViewById<IndicatorSeekBar>(R.id.seekBarPositive4).apply {
            setProgress((getIntValue("positiveSeek4").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("positiveSeek4",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarPositive5 = findViewById<IndicatorSeekBar>(R.id.seekBarPositive5).apply {
            setProgress((getIntValue("positiveSeek5").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("positiveSeek5",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarNegative1 = findViewById<IndicatorSeekBar>(R.id.seekBarNegative1).apply {
            setProgress((getIntValue("negativeSeek1").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("negativeSeek1",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarNegative2 = findViewById<IndicatorSeekBar>(R.id.seekBarNegative2).apply {
            setProgress((getIntValue("negativeSeek2").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("negativeSeek2",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarNegative3 = findViewById<IndicatorSeekBar>(R.id.seekBarNegative3).apply {
            setProgress((getIntValue("negativeSeek3").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("negativeSeek3",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarNegative4 = findViewById<IndicatorSeekBar>(R.id.seekBarNegative4).apply {
            setProgress((getIntValue("negativeSeek4").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("negativeSeek4",seekBar.progress)
                    updateCounter()
                }
            }
        }
        val seekBarNegative5 = findViewById<IndicatorSeekBar>(R.id.seekBarNegative5).apply {
            setProgress((getIntValue("negativeSeek5").toFloat()))
            onSeekChangeListener = object: OnSeekChangeListener {
                override fun onSeeking(seekParams:SeekParams) {}
                override fun onStartTrackingTouch(seekBar:IndicatorSeekBar) {}
                override fun onStopTrackingTouch(seekBar:IndicatorSeekBar) {
                    saveIntToPreference("negativeSeek5",seekBar.progress)
                    updateCounter()
                }
            }
        }
        findViewById<ImageButton>(R.id.resetSeekBarsPositive).apply {
            setOnClickListener {
                saveIntToPreference("positiveSeek1", 0)
                saveIntToPreference("positiveSeek2", 0)
                saveIntToPreference("positiveSeek3", 0)
                saveIntToPreference("positiveSeek4", 0)
                saveIntToPreference("positiveSeek5", 0)
                seekBarPositive1.setProgress(0.toFloat())
                seekBarPositive2.setProgress(0.toFloat())
                seekBarPositive3.setProgress(0.toFloat())
                seekBarPositive4.setProgress(0.toFloat())
                seekBarPositive5.setProgress(0.toFloat())
                updateCounter()
            }
        }
        findViewById<ImageButton>(R.id.resetSeekBarsNegative).apply {
            setOnClickListener {
                saveIntToPreference("negativeSeek1", 0)
                saveIntToPreference("negativeSeek2", 0)
                saveIntToPreference("negativeSeek3", 0)
                saveIntToPreference("negativeSeek4", 0)
                saveIntToPreference("negativeSeek5", 0)
                seekBarNegative1.setProgress(0.toFloat())
                seekBarNegative2.setProgress(0.toFloat())
                seekBarNegative3.setProgress(0.toFloat())
                seekBarNegative4.setProgress(0.toFloat())
                seekBarNegative5.setProgress(0.toFloat())
                updateCounter()
            }
        }
        updateCounter()
    }

    private fun updateCounter(){
        val sumOfBuckets=calculateSumOfBuckets()
        Counter.text=sumOfBuckets.toString()
        if(sumOfBuckets<0)
            Counter.setTextColor(Color.RED)
        else{
            Counter.setTextColor(Color.BLACK)
        }
    }
    private fun calculateSumOfBuckets(): Int =
        getIntValue("positiveSeek1")+getIntValue("positiveSeek2")+getIntValue("positiveSeek3")+getIntValue("positiveSeek4")+getIntValue("positiveSeek5")-getIntValue("negativeSeek1")-getIntValue("negativeSeek2")-getIntValue("negativeSeek3")-getIntValue("negativeSeek4")-getIntValue("negativeSeek5")

    private fun getValue(propKey: String): String? {
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        return sharedPref.getString(propKey, "")
    }

    private fun getIntValue(propKey: String): Int {
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        return sharedPref.getInt(propKey, 0)
    }

    /**
     * @param prefName On which preferences to store
     * @param text to store
     */
    private fun saveToPreference(prefName: String, text: String) {
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString(prefName, text)
        editor.apply()
    }

    private fun saveIntToPreference(prefName: String, number: Int) {
        val sharedPref = getPreferences(Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putInt(prefName, number)
        editor.apply()
    }
}
