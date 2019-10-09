package nguyenduchung.ndh.oop01092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnListenerValue {

    TextView mTxtGiatri;
    Integer mValue=0;
    Button mBtnCong,mBtnTru,mBtnReset;
    OnListenerValue onListenerValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onListenerValue=this;
        mTxtGiatri=findViewById(R.id.textviewketqua);
        mBtnCong=findViewById(R.id.buttonCong);
        mBtnTru=findViewById(R.id.buttonTru);
        mBtnReset=findViewById(R.id.buttonReset);
        onListenerValue =MainActivity.this;

        mBtnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onListenerValue.onListenIngterger(-1);
            }
        });
        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onListenerValue.onListenIngterger(1);
            }
        });
        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onListenerValue.onListenIngterger(0);
            }
        });

//        tinh(4,5);
//        tinh(3,4,5);
//
//
//    }
//    public void tinh(int h,int b){
//        float kq=h*b/2;
//        Toast.makeText(this, "Dien tich tam giac la "+kq, Toast.LENGTH_SHORT).show();
//    }
//    public void tinh(int a,int b,int c){
//        float kq=a+b+c;
//        Toast.makeText(this, "Chu vi tam giac la "+kq, Toast.LENGTH_SHORT).show();

   }
    @Override
    public void onListenIngterger(Integer integer) {
        if(integer == 0){
            mValue =0;
            mTxtGiatri.setText(mValue.toString());
        }
        else{
            mValue += integer;
            mTxtGiatri.setText(mValue.toString());
        }

    }

}
