package com.example.recyclerviewinandroid;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact_Model> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclercontact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrContacts.add( new Contact_Model(R.drawable.man_icon1, "A", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_2, "B", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_3, "C", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_4, "D", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_5, "E", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon1, "F", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_2, "G", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_3, "H", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_4, "I", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_5, "J", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon1, "K", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_2, "L", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_3, "M", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_4, "N", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon_5, "O", "9855475997"));
        arrContacts.add( new Contact_Model(R.drawable.man_icon1, "P", "9855475997"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}