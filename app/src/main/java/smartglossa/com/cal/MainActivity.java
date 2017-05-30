package smartglossa.com.cal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText res1;
    EditText res2;
    TextView res3;
    Button Add;
    Button sub;
    Integer x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res1=(EditText)findViewById(R.id.edit1);
        res2=(EditText)findViewById(R.id.edit2);
        res3=(TextView)findViewById(R.id.res);
        Add=(Button)findViewById(R.id.button);
        sub=(Button)findViewById(R.id.sub);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt(res1.getText().toString());
                y=Integer.parseInt(res2.getText().toString());
                z=x + y;
                res3.setText(Integer.toString(z));
            }

        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt(res1.getText().toString());
                y=Integer.parseInt(res2.getText().toString());
                z=x * y;
                res3.setText(Integer.toString(z));
            }

        });

    }
}
