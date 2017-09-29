package cn.edu.gdmec.android.edittext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jack on 2017/9/27.
 */

public class Result extends Activity{
    private TextView textview;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.result );
        textview=(TextView)findViewById ( R.id.textview );
        Intent intent=getIntent ();
        String numberone=intent.getStringExtra ( "num1" );
        String numbertwo=intent.getStringExtra ( "num2" );
        Double d1=Double.parseDouble ( numberone );
        Double d2=Double.parseDouble ( numbertwo );
        Double result=d1/d2;
        textview.setText ( numberone+"/"+numbertwo+"="+result );
    }
}
