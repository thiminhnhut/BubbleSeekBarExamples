package io.github.thiminhnhut.bubbleseekbardemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.thiminhnhut.model.DataBubbleSeekBar
import io.github.thiminhnhut.view.FragmentShowBubbleSeekBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.layout_root, FragmentShowBubbleSeekBar.newInstance(DataBubbleSeekBar(1, 6, 1)))
            fragmentTransaction.commit()
        }
    }
}
