package nguyenduchung.ndh.oop01092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tinh(4,5);
        tinh(3,4,5);


    }
    public void tinh(int h,int b){
        float kq=h*b/2;
        Toast.makeText(this, "Dien tich tam giac la "+kq, Toast.LENGTH_SHORT).show();
    }
    public void tinh(int a,int b,int c){
        float kq=a+b+c;
        Toast.makeText(this, "Chu vi tam giac la "+kq, Toast.LENGTH_SHORT).show();
    }
}
