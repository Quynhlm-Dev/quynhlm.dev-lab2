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

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText edtName = findViewById(R.id.edtName);
        EditText edtID = findViewById(R.id.edtID);
        EditText edtAge = findViewById(R.id.edtAge);
        RadioButton rdoNam = findViewById(R.id.rdoNam);
        RadioButton rdoNu= findViewById(R.id.rdonu);
        CheckBox chkDaBong = findViewById(R.id.chkDabong);
        CheckBox chkGame = findViewById(R.id.chkGame);
        Button btnLuu = findViewById(R.id.btnluu);
        TextView txtReturn = findViewById(R.id.txtReturn);


        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String ID = edtID.getText().toString();
                String Age = edtAge.getText().toString();
                if (name.trim().isEmpty() && ID.trim().isEmpty() && Age.trim().isEmpty()) {
                    Toast.makeText(MainActivity3.this, "Không được để trống", Toast.LENGTH_LONG).show();
                }
                String GioiTinh = rdoNam.isChecked()
                        ? rdoNam.getText().toString()
                        : rdoNu.isChecked()
                        ? rdoNu.getText().toString()
                        : "Chưa chọn giới tính";

                String hobyy = chkDaBong.isChecked() && chkGame.isChecked()
                        ? "Thích cả hai"
                        : chkDaBong.isChecked()
                        ? chkDaBong.getText().toString()
                        : chkGame.isChecked()
                        ? chkGame.getText().toString()
                        : "Không thích gì cả";

                txtReturn.setText("Tôi tên là: "+name+"\n"
                                + "MSSV: "+ID+"\n"
                                + "Tuổi: "+Age+"\n"
                                + "Giới tính: "+GioiTinh+"\n"
                                + "Sở thích: "+hobyy);
            }
        });


    }
}