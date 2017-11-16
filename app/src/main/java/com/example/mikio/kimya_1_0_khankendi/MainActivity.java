package com.example.mikio.kimya_1_0_khankendi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button buttonSearch = (Button) findViewById(R.id.buttonSearch);
        Button buttonQRSearch = (Button) findViewById(R.id.buttonQRSearch);
        Button buttonWeb = (Button) findViewById(R.id.buttonWeb);
        Button buttonPDF = (Button) findViewById(R.id.buttonPDF);
        Button buttonForm = (Button) findViewById(R.id.buttonForm);



        buttonSearch.setOnClickListener(this);
        buttonQRSearch.setOnClickListener(this);
        buttonWeb.setOnClickListener(this);
        buttonPDF.setOnClickListener(this);
        buttonForm.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonSearch:
                Toast.makeText(this, "Hier darf wer die DB Anbindung ausprogrammieren ;)", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonQRSearch:
                Toast.makeText(this, "Kommt noch ;)", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonWeb:
                //benötigt keine INTERNET Permission, da durch Browser ausgeführt
                EditText etSearch = (EditText) findViewById(R.id.editTextGefahrenstoff);
                String search = etSearch.getText().toString();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.com/search?&q=" + search));
                startActivity(browserIntent);
                break;
            case R.id.buttonPDF:
                //to open a PDF file with already installed 3rd party application
                Toast.makeText(this, "Kommt noch ;)", Toast.LENGTH_SHORT).show();

/*                File file = new File("https://www.cs.ucsb.edu/~bboe/cs32_m12/slides/sort/bubble_01.pdf");

                Uri path = Uri.fromFile(file);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(path, "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);*/
                break;
            case R.id.buttonForm:
                Intent i = new Intent(this, FormActivity.class);
                startActivity(i);
                finish();
                break;

        }

    }
}
