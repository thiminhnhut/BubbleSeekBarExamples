# BubbleSeekBar Examples

* **Thực hiện:** Thi Minh Nhựt - Email: thiminhnhut@gmail.com

* **Thời gian:** Ngày 22 tháng 05 năm 2018

* **Revision:** [BubbleSeekBarDemo 1.0](https://github.com/thiminhnhut/BubbleSeekBarExamples/tree/master/BubbleSeekBarDemo)

## Nội dung

1. Hướng dẫn sử dụng thư viện: [BubbleSeekBar](https://github.com/woxingxiao/BubbleSeekBar)

1. Sử dụng thư viện:

        dependencies {
            // enhanced version
            // implementation 'com.xw.repo:bubbleseekbar:${LATEST_VERSION}'
            implementation 'com.xw.repo:bubbleseekbar:3.17'
        }

1. Các thuộc tính và sự kiện cần chú ý:

    * Các thuộc tính chú ý: `min, max, progress (Float), sectionCount (Int)` với `sectionCount = max - min`.

    * Các sự kiện chú ý:

            public interface OnProgressChangedListener {

                void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser);

                void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat);

                void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser);
            }

1. Demo được viết bằng Kotlin: [BubbleSeekBarDemo](https://github.com/thiminhnhut/BubbleSeekBarExamples/tree/master/BubbleSeekBarDemo)

    ![](https://raw.githubusercontent.com/thiminhnhut/BubbleSeekBarExamples/master/BubbleSeekBarDemo/Demo.png)
