// Generated by view binder compiler. Do not edit!
package com.bogazliyan.myapplication2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bogazliyan.myapplication2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain23Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageButton imageButton1;

  @NonNull
  public final ImageButton imageButton10;

  @NonNull
  public final ImageButton imageButton19;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageButton imageButton20;

  @NonNull
  public final ImageButton imageButton3;

  @NonNull
  public final ImageButton imageButton4;

  @NonNull
  public final ImageButton imageButton5;

  @NonNull
  public final ImageButton imageButton6;

  @NonNull
  public final ImageButton imageButton7;

  @NonNull
  public final ImageButton imageButton8;

  @NonNull
  public final ImageButton imageButton9;

  @NonNull
  public final ScrollView scrollView2;

  private ActivityMain23Binding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButton, @NonNull ImageButton imageButton1,
      @NonNull ImageButton imageButton10, @NonNull ImageButton imageButton19,
      @NonNull ImageButton imageButton2, @NonNull ImageButton imageButton20,
      @NonNull ImageButton imageButton3, @NonNull ImageButton imageButton4,
      @NonNull ImageButton imageButton5, @NonNull ImageButton imageButton6,
      @NonNull ImageButton imageButton7, @NonNull ImageButton imageButton8,
      @NonNull ImageButton imageButton9, @NonNull ScrollView scrollView2) {
    this.rootView = rootView;
    this.imageButton = imageButton;
    this.imageButton1 = imageButton1;
    this.imageButton10 = imageButton10;
    this.imageButton19 = imageButton19;
    this.imageButton2 = imageButton2;
    this.imageButton20 = imageButton20;
    this.imageButton3 = imageButton3;
    this.imageButton4 = imageButton4;
    this.imageButton5 = imageButton5;
    this.imageButton6 = imageButton6;
    this.imageButton7 = imageButton7;
    this.imageButton8 = imageButton8;
    this.imageButton9 = imageButton9;
    this.scrollView2 = scrollView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain23Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain23Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main23, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain23Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.imageButton1;
      ImageButton imageButton1 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton1 == null) {
        break missingId;
      }

      id = R.id.imageButton10;
      ImageButton imageButton10 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton10 == null) {
        break missingId;
      }

      id = R.id.imageButton19;
      ImageButton imageButton19 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton19 == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
        break missingId;
      }

      id = R.id.imageButton20;
      ImageButton imageButton20 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton20 == null) {
        break missingId;
      }

      id = R.id.imageButton3;
      ImageButton imageButton3 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton3 == null) {
        break missingId;
      }

      id = R.id.imageButton4;
      ImageButton imageButton4 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton4 == null) {
        break missingId;
      }

      id = R.id.imageButton5;
      ImageButton imageButton5 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton5 == null) {
        break missingId;
      }

      id = R.id.imageButton6;
      ImageButton imageButton6 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton6 == null) {
        break missingId;
      }

      id = R.id.imageButton7;
      ImageButton imageButton7 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton7 == null) {
        break missingId;
      }

      id = R.id.imageButton8;
      ImageButton imageButton8 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton8 == null) {
        break missingId;
      }

      id = R.id.imageButton9;
      ImageButton imageButton9 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton9 == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      return new ActivityMain23Binding((ConstraintLayout) rootView, imageButton, imageButton1,
          imageButton10, imageButton19, imageButton2, imageButton20, imageButton3, imageButton4,
          imageButton5, imageButton6, imageButton7, imageButton8, imageButton9, scrollView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
