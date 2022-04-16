package com.example.app_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactsActivity extends AppCompatActivity {

    RecyclerView rvContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        rvContacts = findViewById(R.id.rv_contacts);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Igor", "+55 74 7755-6949", R.color.white));
        contacts.add(new Contact("João", "+55 27 98018-2489", R.color.purple_200));
        contacts.add(new Contact("Marlão", "+55 24 7687-0976", R.color.teal_200));
        contacts.add(new Contact("Márcia", "+55 73 94499-0144", R.color.purple_700));
        contacts.add(new Contact("Kevin", "+55 94 92126-3449", R.color.orange));
        contacts.add(new Contact("Victor", "+55 93 90328-1684", R.color.green));
        contacts.add(new Contact("Oliver", "+55 45 91824-3590", R.color.yellow));
        contacts.add(new Contact("Tomás", "+55 49 95053-8147", R.color.red));

        ContactsAdapter adapter = new ContactsAdapter(contacts);
        rvContacts.setAdapter(adapter);
    }
}