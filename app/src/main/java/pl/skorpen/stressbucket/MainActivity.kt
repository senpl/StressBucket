package pl.skorpen.stressbucket

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.View.OnFocusChangeListener
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
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
//                Toast.makeText(this, "TEXT contains" +textView.text, Toast.LENGTH_SHORT).show()
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
        val seekBarPositive1 = findViewById<SeekBar>(R.id.seekBarPositive1).apply {
            progress = getIntValue("positiveSeek1")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("positiveSeek1", progress)
                    updateCounter()
                }
            })
        }
        val seekBarPositive2 = findViewById<SeekBar>(R.id.seekBarPositive2).apply {
            progress = getIntValue("positiveSeek2")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("positiveSeek2", progress)
                    updateCounter()
                }
            })
        }
        val seekBarPositive3 = findViewById<SeekBar>(R.id.seekBarPositive3).apply {
            progress = getIntValue("positiveSeek3")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("positiveSeek3", progress)
                    updateCounter()
                }
            })
        }
        val seekBarPositive4 = findViewById<SeekBar>(R.id.seekBarPositive4).apply {
            progress = getIntValue("positiveSeek4")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("positiveSeek4", progress)
                    updateCounter()
                }
            })
        }
        val seekBarPositive5 = findViewById<SeekBar>(R.id.seekBarPositive5).apply {
            progress = getIntValue("positiveSeek5")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("positiveSeek5", progress)
                    updateCounter()
                }
            })
        }
        val seekBarNegative1 = findViewById<SeekBar>(R.id.seekBarNegative1).apply {
            progress = getIntValue("negativeSeek1")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("negativeSeek1", progress)
                    updateCounter()
                }
            })
        }
        val seekBarNegative2 = findViewById<SeekBar>(R.id.seekBarNegative2).apply {
            progress = getIntValue("negativeSeek2")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("negativeSeek2", progress)
                    updateCounter()
                }
            })
        }
        val seekBarNegative3 = findViewById<SeekBar>(R.id.seekBarNegative3).apply {
            progress = getIntValue("negativeSeek3")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("negativeSeek3", progress)
                    updateCounter()
                }
            })
        }
        val seekBarNegative4 = findViewById<SeekBar>(R.id.seekBarNegative4).apply {
            progress = getIntValue("negativeSeek4")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("negativeSeek4", progress)
                    updateCounter()
                }
            })
        }
        val seekBarNegative5 = findViewById<SeekBar>(R.id.seekBarNegative5).apply {
            progress = getIntValue("negativeSeek5")
            setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {}
                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    saveIntToPreference("negativeSeek5", progress)
                    updateCounter()
                }
            })
        }
        findViewById<Button>(R.id.resetSeekbarsPositive).apply {
            setOnClickListener {
                saveIntToPreference("positiveSeek1", 0)
                saveIntToPreference("positiveSeek2", 0)
                saveIntToPreference("positiveSeek3", 0)
                saveIntToPreference("positiveSeek4", 0)
                saveIntToPreference("positiveSeek5", 0)
                seekBarPositive1.progress = 0
                seekBarPositive2.progress = 0
                seekBarPositive3.progress = 0
                seekBarPositive4.progress = 0
                seekBarPositive5.progress = 0
                updateCounter()
            }
        }
        findViewById<Button>(R.id.resetSeekbarsNegative).apply {
            setOnClickListener {
                saveIntToPreference("negativeSeek1", 0)
                saveIntToPreference("negativeSeek2", 0)
                saveIntToPreference("negativeSeek3", 0)
                saveIntToPreference("negativeSeek4", 0)
                saveIntToPreference("negativeSeek5", 0)
                seekBarNegative1.progress = 0
                seekBarNegative2.progress = 0
                seekBarNegative3.progress = 0
                seekBarNegative4.progress = 0
                seekBarNegative5.progress = 0
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
