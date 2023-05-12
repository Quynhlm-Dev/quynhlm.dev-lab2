package com.quynhlm.dev.testclink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText edtName = findViewById(R.id.edtTen);
        RadioButton rdoCD = findViewById(R.id.rdoCd);
        RadioButton rdoPC = findViewById(R.id.rdoPC);

        CheckBox chkJava = findViewById(R.id.chkJava);
        CheckBox chkC = findViewById(R.id.chkC);
        CheckBox chkJS = findViewById(R.id.chkJavaSript);
        Button btnClick = findViewById(R.id.btnClick);
        TextView txtTrave = findViewById(R.id.txtTraVe);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                if(name.trim().isEmpty()){
                    Toast.makeText(MainActivity2.this, "Không được để trống", Toast.LENGTH_SHORT).show();
                }
                String Study = rdoCD.isChecked()
                        ? rdoCD.getText().toString()
                        : rdoPC.isChecked()
                        ? rdoPC.getText().toString()
                        :"Không đi học";


                String hobyy = chkJava.isChecked()&&chkC.isChecked()&&chkJS.isChecked()
                        ? "Thich ca ba"
                        : chkJava.isChecked()
                        ? chkJava.getText().toString()
                        : chkC.isChecked()
                        ? chkC.getText().toString()
                        : chkJS.isChecked()
                        ? chkJS.getText().toString()
                        : "Khong thich mon nao";

                txtTrave.setText("Tôi tên là:"+name+"\n"
                               + "Học hệ:"+Study+"\n"
                               + "Sở thích"+hobyy);

            }
        });

    }
}