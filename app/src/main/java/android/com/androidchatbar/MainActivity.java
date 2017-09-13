package android.com.androidchatbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cenkgun.chatbar.ChatBarView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ChatBarView chatBarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        chatBarView = (ChatBarView) findViewById(R.id.chatBar);

        chatBarView.setMessageBoxHint("Enter your Messahe here...");
        chatBarView.setSendClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(chatBarView.getMessageText());
            }
        });
    }
}
