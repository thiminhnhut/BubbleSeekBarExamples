package io.github.thiminhnhut.view

import android.app.Fragment
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.xw.repo.BubbleSeekBar
import io.github.thiminhnhut.bubbleseekbardemo.R
import io.github.thiminhnhut.model.DataBubbleSeekBar

class FragmentShowBubbleSeekBar: Fragment() {
    companion object {
        private lateinit var dataBubbleSeekBar: DataBubbleSeekBar
        fun newInstance(dataBubbleSeekBar: DataBubbleSeekBar): FragmentShowBubbleSeekBar {
            this.dataBubbleSeekBar = dataBubbleSeekBar
            return FragmentShowBubbleSeekBar()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.fragment_show_bubble_seekbar, container, false)

        val txtValue = view.findViewById<TextView>(R.id.txtValue)
        val txtonProgressChanged = view.findViewById<TextView>(R.id.txtonProgressChanged)
        val txtgetProgressOnActionUp = view.findViewById<TextView>(R.id.txtgetProgressOnActionUp)
        val txtgetProgressOnFinally = view.findViewById<TextView>(R.id.txtgetProgressOnFinally)

        val bubbleSeekBar = view.findViewById<BubbleSeekBar>(R.id.bubbleSeekBar)
        val bubbleSeekBarConfig = bubbleSeekBar.configBuilder
        bubbleSeekBarConfig.min(dataBubbleSeekBar.min.toFloat())
                            .max(dataBubbleSeekBar.max.toFloat())
                            .progress(dataBubbleSeekBar.process.toFloat())
                            .sectionCount(dataBubbleSeekBar.max - dataBubbleSeekBar.min)
                            .trackColor(ContextCompat.getColor(activity, R.color.color_gray))
                            .secondTrackColor(ContextCompat.getColor(activity, R.color.color_blue))
                            .thumbColor(ContextCompat.getColor(activity, R.color.color_blue))
                            .showSectionText()
                            .sectionTextColor(ContextCompat.getColor(activity, R.color.colorPrimary))
                            .sectionTextSize(18)
                            .showThumbText()
                            .touchToSeek()
                            .thumbTextColor(ContextCompat.getColor(activity, R.color.color_red))
                            .thumbTextSize(18)
                            .bubbleColor(ContextCompat.getColor(activity, R.color.color_red))
                            .bubbleTextSize(18)
                            .showSectionMark()
                            .seekBySection()
                            .autoAdjustSectionMark()
                            .sectionTextPosition(BubbleSeekBar.TextPosition.BELOW_SECTION_MARK)
                            .build()

        txtValue.text = bubbleSeekBar.progress.toString()
        txtonProgressChanged.text = bubbleSeekBar.progress.toString()
        txtgetProgressOnActionUp.text = bubbleSeekBar.progress.toString()
        txtgetProgressOnFinally.text = bubbleSeekBar.progress.toString()

        bubbleSeekBar.onProgressChangedListener = object : BubbleSeekBar.OnProgressChangedListener {
            override fun onProgressChanged(bubbleSeekBar: BubbleSeekBar?, progress: Int, progressFloat: Float, fromUser: Boolean) {
                txtonProgressChanged.text = progress.toString()
            }

            override fun getProgressOnActionUp(bubbleSeekBar: BubbleSeekBar?, progress: Int, progressFloat: Float) {
                txtgetProgressOnActionUp.text = progress.toString()
            }

            override fun getProgressOnFinally(bubbleSeekBar: BubbleSeekBar?, progress: Int, progressFloat: Float, fromUser: Boolean) {
                txtgetProgressOnFinally.text = progress.toString()
                txtValue.text = progress.toString()
            }
        }

        return view
    }
}