package com.example.lab4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MyCustomListView extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom_list_view);

        listView = findViewById(R.id.listView);

        ArrayList<Contact> contactsList = new ArrayList<>();

        contactsList.add(new Contact("Nông Ngọc Diệu", "0965343641", "Bên kia là ảnh bạn gái của Diệu", R.drawable.item1));
        contactsList.add(new Contact("Cũng là Nông Ngọc Diệu", "0965343641", "Đây cũng là bạn gái của Diệu", R.drawable.item1));
        contactsList.add(new Contact("Vẫn là Nông Ngọc Diệu", "0965343641", "Không phải bạn bên phải", R.drawable.item1));
        contactsList.add(new Contact("<> Nông Ngọc Diệu", "0965343641", "Bạn ở bên trái cơ", R.drawable.item1));

        ContactAdapter contactAdapter = new ContactAdapter(this, R.layout.list_row, contactsList);
        listView.setAdapter(contactAdapter);
    }
}