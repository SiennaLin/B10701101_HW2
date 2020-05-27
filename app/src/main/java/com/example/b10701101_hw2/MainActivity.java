package com.example.b10701101_hw2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView answer;
    private RecyclerView.LayoutManager layoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer=findViewById(R.id.answer);

        answer.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        answer.setLayoutManager(layoutManager);
    }

    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        class MyViewHolder extends RecyclerView.ViewHolder {
            public View itemview;
            public TextView name,number;
            public MyViewHolder(View v) {
                super(v);
                itemview = v;

                name=itemview.findViewById(R.id.name);
                number=itemview.findViewById(R.id.number);

            }
        }

        @NonNull
        @Override
        public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View itemview = (TextView) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item, parent, false);
            MyViewHolder vh = new MyViewHolder(itemview);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    public void add(View view) {
        Intent intent = new Intent(this,page2.class);
        startActivity(intent);
    }


}
