package com.example.aula2an;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Date;

public class DataBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base2);

        AppDatabase db = AppDatabase.getInstance(this);
        FuncionarioDao dao = db.funcionarioDao();
        Funcionario f = new Funcionario(1, "teste1", new Date(), 1000);
        dao.insert(f);
    }
}