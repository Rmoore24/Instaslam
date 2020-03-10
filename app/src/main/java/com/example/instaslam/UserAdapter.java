package com.example.instaslam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;

import java.util.List;

/*public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>
{
    private Context context;
    private List<User> users;

    public UserAdapter(Context context, List<User> users)
        {
        this.context = context;
        this.users = users;
        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        User user = users.get(position);
        holder.bind(user);
    }

    @Override
    public int getItemCount()
    {
        return users.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView ivProfile;
        private TextView proUsername;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfile = itemView.findViewById(R.id.ivProfile);
            proUsername = itemView.findViewById(R.id.tvUsername);
        }

        public void bind(User post)
        {
            //Bind the post data to the view elements


            ParseFile image = users.get(proUsername);
            if(image != null)
            {
                Glide.with(context).load(user.getImage().getUrl()).into(ivProfile);
            }

        }
    }
}
*/