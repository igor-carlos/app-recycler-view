package com.example.app_recycler_view;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    private List<Contact> contacts;

    public ContactsAdapter(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.contacts_itens, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = this.contacts.get(position);
        holder.bind(contact);
    }

    @Override
    public int getItemCount() {
        return this.contacts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Contact contact) {
            TextView txtName = itemView.findViewById(R.id.txt_contact_name);
            TextView txtCellphone = itemView.findViewById(R.id.txt_contact_cellphone);
            LinearLayout linearLayout = itemView.findViewById(R.id.linear_contacts_item);

            txtName.setText(contact.getName());
            txtCellphone.setText(contact.getCellphone());
            linearLayout.setBackgroundResource(contact.getBackgroundColor());
        }
    }
}
