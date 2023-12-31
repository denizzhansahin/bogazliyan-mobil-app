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

public final class ActivityMain10Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton imageButton1;

  @NonNull
  public final ImageButton imageButton2;

  @NonNull
  public final ImageButton imageButton4;

  @NonNull
  public final ImageButton imageButton5;

  @NonNull
  public final ImageButton imageButton6;

  @NonNull
  public final ScrollView scrollView2;

  private ActivityMain10Binding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton imageButton1, @NonNull ImageButton imageButton2,
      @NonNull ImageButton imageButton4, @NonNull ImageButton imageButton5,
      @NonNull ImageButton imageButton6, @NonNull ScrollView scrollView2) {
    this.rootView = rootView;
    this.imageButton1 = imageButton1;
    this.imageButton2 = imageButton2;
    this.imageButton4 = imageButton4;
    this.imageButton5 = imageButton5;
    this.imageButton6 = imageButton6;
    this.scrollView2 = scrollView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain10Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain10Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main10, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain10Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageButton1;
      ImageButton imageButton1 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton1 == null) {
        break missingId;
      }

      id = R.id.imageButton2;
      ImageButton imageButton2 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton2 == null) {
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

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      return new ActivityMain10Binding((ConstraintLayout) rootView, imageButton1, imageButton2,
          imageButton4, imageButton5, imageButton6, scrollView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
