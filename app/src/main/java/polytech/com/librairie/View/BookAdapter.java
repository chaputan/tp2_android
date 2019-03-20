package polytech.com.librairie.View;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import polytech.com.librairie.Holder.BookViewHolder;
import polytech.com.librairie.Model.Book;
import polytech.com.librairie.R;

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {

    private List<Book> books;

    public BookAdapter(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context c = viewGroup.getContext();
        LayoutInflater li = LayoutInflater.from(c);
        View v = li.inflate(R.layout.item_book, viewGroup, false);
        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder bookViewHolder, int i) {
        bookViewHolder.updateWithBook(books.get(i));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
