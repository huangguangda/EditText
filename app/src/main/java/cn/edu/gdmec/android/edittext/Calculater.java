package cn.edu.gdmec.android.edittext;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculater extends AppCompatActivity {
    private EditText numberone;
    private EditText numbertwo;
    private Button mybutton;
    private TextView symbol;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_calculater );
        numberone=(EditText)findViewById ( R.id.numberone );
        numbertwo=(EditText)findViewById ( R.id.numbertwo );
        mybutton=(Button)findViewById ( R.id.mybutton );
        symbol=(TextView)findViewById ( R.id.symbol );
        mybutton.setOnClickListener ( new Calculate () );
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add ( 0, 1, 1, R.string.exit );
        menu.add ( 0, 2, 2, R.string.about );
        return super.onCreateOptionsMenu ( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId ()==1){
            finish ();
        }else if (item.getItemId ()==2){
            Toast.makeText ( this,"亲爱的你可知，我有多么思念你！", Toast.LENGTH_SHORT ).show ();
        }
        return super.onOptionsItemSelected ( item );
    }

    class Calculate implements OnClickListener
    {
        @Override
        public void onClick(View v){
            String number1=numberone.getText ().toString ();
            String number2=numbertwo.getText ().toString ();
            Intent intent=new Intent (  );
            intent.putExtra ( "num1",number1 );
            intent.putExtra ( "num2",number2 );
            intent.setClass ( Calculater.this, Result.class );
            Calculater.this.startActivity ( intent );
        }
    }
}
