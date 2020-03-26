package net.dementia13.srq_instagram;

import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static  final String TAG = "Main Activity";
    private EditText etDescription;
    private Button btnCaptureImage;
    private ImageView ivPostImage;
    private Button btnSubmit;

//    queryPosts();
/*
    btnSubmit.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           String description = etDescription.getText().toString();
           if (description.isEmpty()) {
               Toast.makeText(MainActivity.this, "Description cannot be empty", Toast.LENGTH_SHORT).show();
               return;
           }
           ParseUser currentUser = ParseUser.getCurrentUser();
           savePost(description, currentUser);
        }
    });
    */


    private void savePost(String description, ParseUser currentUser) {
       // Post post =
    }

    private void queryPosts() {
        ParseQuery<Post> query = ParseQuery.getQuery(Post.class);
        query.findInBackground(new FindCallback<Post>() {
            @Override
            public void done(List<Post> posts, ParseException e) {
                if (e != null) {
                    Log.e(TAG, "Issue with getting posts", e);
                    return;
                }
                for (Post post : posts) {
                    Log.i(TAG, "Post: " + post.getDescription() + ", username: " + post);
                }
            }
        });
    }

}
