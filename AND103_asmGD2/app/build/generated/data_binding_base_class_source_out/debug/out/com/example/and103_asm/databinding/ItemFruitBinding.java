// Generated by view binder compiler. Do not edit!
package com.example.and103_asm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.and103_asm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFruitBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageButton btnBuy;

  @NonNull
  public final ImageButton btnDelete;

  @NonNull
  public final ImageButton btnEdit;

  @NonNull
  public final ImageView img;

  @NonNull
  public final TextView tvDes;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPriceQuantity;

  private ItemFruitBinding(@NonNull CardView rootView, @NonNull ImageButton btnBuy,
      @NonNull ImageButton btnDelete, @NonNull ImageButton btnEdit, @NonNull ImageView img,
      @NonNull TextView tvDes, @NonNull TextView tvName, @NonNull TextView tvPriceQuantity) {
    this.rootView = rootView;
    this.btnBuy = btnBuy;
    this.btnDelete = btnDelete;
    this.btnEdit = btnEdit;
    this.img = img;
    this.tvDes = tvDes;
    this.tvName = tvName;
    this.tvPriceQuantity = tvPriceQuantity;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFruitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFruitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_fruit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFruitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_buy;
      ImageButton btnBuy = ViewBindings.findChildViewById(rootView, id);
      if (btnBuy == null) {
        break missingId;
      }

      id = R.id.btn_delete;
      ImageButton btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btn_edit;
      ImageButton btnEdit = ViewBindings.findChildViewById(rootView, id);
      if (btnEdit == null) {
        break missingId;
      }

      id = R.id.img;
      ImageView img = ViewBindings.findChildViewById(rootView, id);
      if (img == null) {
        break missingId;
      }

      id = R.id.tv_des;
      TextView tvDes = ViewBindings.findChildViewById(rootView, id);
      if (tvDes == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_priceQuantity;
      TextView tvPriceQuantity = ViewBindings.findChildViewById(rootView, id);
      if (tvPriceQuantity == null) {
        break missingId;
      }

      return new ItemFruitBinding((CardView) rootView, btnBuy, btnDelete, btnEdit, img, tvDes,
          tvName, tvPriceQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
