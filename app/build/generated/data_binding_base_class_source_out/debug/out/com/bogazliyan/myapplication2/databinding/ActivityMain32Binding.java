// Generated by view binder compiler. Do not edit!
package com.bogazliyan.myapplication2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bogazliyan.myapplication2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain32Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button174;

  @NonNull
  public final ScrollView scrollView19;

  @NonNull
  public final TextView textView60;

  @NonNull
  public final TextView textView61;

  @NonNull
  public final TextView textView62;

  private ActivityMain32Binding(@NonNull ConstraintLayout rootView, @NonNull Button button174,
      @NonNull ScrollView scrollView19, @NonNull TextView textView60, @NonNull TextView textView61,
      @NonNull TextView textView62) {
    this.rootView = rootView;
    this.button174 = button174;
    this.scrollView19 = scrollView19;
    this.textView60 = textView60;
    this.textView61 = textView61;
    this.textView62 = textView62;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain32Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain32Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main32, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain32Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button174;
      Button button174 = ViewBindings.findChildViewById(rootView, id);
      if (button174 == null) {
        break missingId;
      }

      id = R.id.scrollView19;
      ScrollView scrollView19 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView19 == null) {
        break missingId;
      }

      id = R.id.textView60;
      TextView textView60 = ViewBindings.findChildViewById(rootView, id);
      if (textView60 == null) {
        break missingId;
      }

      id = R.id.textView61;
      TextView textView61 = ViewBindings.findChildViewById(rootView, id);
      if (textView61 == null) {
        break missingId;
      }

      id = R.id.textView62;
      TextView textView62 = ViewBindings.findChildViewById(rootView, id);
      if (textView62 == null) {
        break missingId;
      }

      return new ActivityMain32Binding((ConstraintLayout) rootView, button174, scrollView19,
          textView60, textView61, textView62);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}