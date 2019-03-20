package polytech.com.librairie.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

import polytech.com.librairie.View.BookAdapter;
import polytech.com.librairie.Model.Book;
import polytech.com.librairie.R;

public class ListBookActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);

        List<Book> books = new ArrayList<>();
        for(int i = 0; i < 10; ++i){
            books.add(new Book("book"+i));
        }
        final RecyclerView rv = findViewById(R.id.books_list);

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new BookAdapter(books));

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }
}
