package io.legado.app.lib.theme.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import io.legado.app.R
import io.legado.app.lib.theme.Selector
import io.legado.app.lib.theme.ThemeStore
import io.legado.app.utils.dp

class ATEAccentStrokeTextView : AppCompatTextView {
    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        background = Selector.shapeBuild()
            .setCornerRadius(3.dp)
            .setStrokeWidth(1.dp)
            .setDisabledStrokeColor(context.resources.getColor(R.color.md_grey_500))
            .setDefaultStrokeColor(ThemeStore.accentColor(context))
            .setPressedBgColor(context.resources.getColor(R.color.transparent30))
            .create()
        setTextColor(
            Selector.colorBuild()
                .setDefaultColor(ThemeStore.accentColor(context))
                .setDisabledColor(context.resources.getColor(R.color.md_grey_500))
                .create()
        )
    }
}
