package tw.org.iii.iiiand011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private F1 f1;
    private F2 f2;
    private F3 f3;
    private F4 f4;
    private FragmentManager fmgr;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.main_title);

        f1 = new F1();
        f2 = new F2();
        f3 = new F3();
        f4 = new F4();

        fmgr = getSupportFragmentManager();
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container,f1);
        transaction.commit(); //交易去吧
    }

    public void setMyTitle(String newTitle){
        title.setText(newTitle);
    }
    public F2 getF2(){
        return f2;
    }


    public void toF1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);
        transaction.commit(); //交易去吧
    }

    public void toF2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        transaction.commit(); //交易去吧
    }
    public void toF3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f3);
        transaction.commit(); //交易去吧
    }

    public void toF4(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f4);
        transaction.commit(); //交易去吧
    }

}
