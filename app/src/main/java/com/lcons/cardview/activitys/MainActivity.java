package com.lcons.cardview.activitys;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lcons.cardview.R;
import com.lcons.cardview.adapter.PostagemAdapter;
import com.lcons.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define Adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens() {

        Postagem p = new Postagem("Lucas Constantino", "Viagem Legal!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Michely Faustino", "Viaje muito!", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Marcelo Pedroni", "Paris :)", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Tuani Iovana", "Fotinha.", R.drawable.imagem4);
        this.postagens.add(p);

    }
}