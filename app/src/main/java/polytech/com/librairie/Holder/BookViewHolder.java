package polytech.com.librairie.Holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import polytech.com.librairie.Model.Book;
import polytech.com.librairie.R;

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView itemName;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        itemName = itemView.findViewById(R.id.itemName);
    }

    public void updateWithBook(Book book){
        this.itemName.setText(book.getName());
    }
}
