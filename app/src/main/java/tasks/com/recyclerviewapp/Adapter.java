package tasks.com.recyclerviewapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Freeware Sys on 18/03/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ProductViewHolder> {
    Context context;
   private List<Product>productList;

    public Adapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
       View view= inflater.inflate(R.layout.single_row,null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product=productList.get(position);
        holder.bigTitle.setText(product.getTitle());
        holder.desc.setText(product.getShortdesc());
        holder.rating.setText(String.valueOf(product.getRating()));
        holder.prices.setText(String.valueOf(product.getPrice()));
        holder.iamges.setImageDrawable(context.getResources().getDrawable(product.getImage()));

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView iamges;
        TextView bigTitle,desc,rating,prices;

        public ProductViewHolder(View itemView) {
            super(itemView);
            iamges= (ImageView) itemView.findViewById(R.id.imageView);
            bigTitle= (TextView) itemView.findViewById(R.id.textViewTitle);
            desc= (TextView) itemView.findViewById(R.id.textViewShortDesc);
            rating= (TextView) itemView.findViewById(R.id.textViewRating);
            prices= (TextView) itemView.findViewById(R.id.textViewPrice);

        }
    }
}
