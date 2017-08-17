package shaolizhi.mydialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 由邵励治于2017/8/8创造.
 */

public class PromptLoginDialog extends Dialog {

    public PromptLoginDialog(@NonNull Context context) {
        super(context, R.style.promptLoginDialogStyle);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_prompt_login);

        TextView textView = (TextView) findViewById(R.id.dialog_prompt_login_text_view);
        textView.setText("正在登陆...");
        LinearLayout linearLayout = (LinearLayout) this.findViewById(R.id.dialog_prompt_login_linear_layout);
        linearLayout.getBackground().setAlpha(210);
    }
}
