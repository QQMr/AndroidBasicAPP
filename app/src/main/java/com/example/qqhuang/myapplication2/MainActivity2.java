package com.example.qqhuang.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity2 extends AppCompatActivity {
 private EditText mEdtSex, mEdtAge;
 private Button mBtnOK;
 private TextView mTxtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mEdtSex = (EditText) findViewById(R.id.edtAge);
        mEdtAge = (EditText) findViewById(R.id.edtAge);
        mBtnOK = (Button) findViewById(R.id.button);
        mTxtR = (TextView) findViewById(R.id.txtR);

        mBtnOK.setOnClickListener(btnOKOnClick);


    }
    private View.OnClickListener btnOKOnClick = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            String strSex = mEdtSex.getText().toString();
            int Age = Integer.parseInt( mEdtAge.getText().toString() ) ;
            mTxtR.setText("QQ");
            String strSug = getString(R.string.suggestion);
            if( strSex.equals(getString(R.string.ssx_male))  )
            {
                if( Age < 28 )
                    strSug= strSug + getString(R.string.sug_not_hurry);
                else if( Age > 33 )
                    strSug= strSug + getString(R.string.sug_get_married);
                else
                    strSug= strSug + getString(R.string.sug_find_couple);
            }
            else
            {
                if( Age < 25 )
                    strSug= strSug + getString(R.string.sug_not_hurry);
                else if ( Age > 30 )
                    strSug= strSug + getString(R.string.sug_get_married);
                else
                    strSug= strSug + getString(R.string.sug_find_couple);

            }
            mTxtR.setText(strSug);

        }
    };

}
