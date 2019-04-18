package com.example.recycler_view.Adapter_Classes;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recycler_view.MainActivity;
import com.example.recycler_view.Model.Contacts;
import com.example.recycler_view.Profile;
import com.example.recycler_view.R;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contacts> contact_list;

    public ContactAdapter(Context mContext, List<Contacts> contact) {
        this.mContext = mContext;
        this.contact_list = contact;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contacts,viewGroup,false);

        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        final Contacts contacts = contact_list.get(i);
        contactsViewHolder.tvName.setText(contacts.getName());
        contactsViewHolder.tvPhone.setText(contacts.getPhoneNo());
        contactsViewHolder.image.setImageResource(contacts.getImageID());


        contactsViewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext, Profile.class);
                i.putExtra(MainActivity.Profile_intention1,contacts.getName());
                i.putExtra(MainActivity.Profile_intention2,contacts.getPhoneNo());
                i.putExtra(MainActivity.Profile_intention3,contacts.getImageID());
                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contact_list.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvPhone;
        ImageView image;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvname);
            tvPhone = itemView.findViewById(R.id.tvphone);
            image = itemView.findViewById(R.id.imageView);
        }
    }
}
