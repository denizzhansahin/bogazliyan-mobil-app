// Generated by view binder compiler. Do not edit!
package com.bogazliyan.myapplication2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ActivityMain34Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ScrollView scrollView21;

  @NonNull
  public final TextView textView64;

  @NonNull
  public final TextView textView65;

  private ActivityMain34Binding(@NonNull ConstraintLayout rootView,
      @NonNull ScrollView scrollView21, @NonNull TextView textView64,
      @NonNull TextView textView65) {
    this.rootView = rootView;
    this.scrollView21 = scrollView21;
    this.textView64 = textView64;
    this.textView65 = textView65;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain34Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain34Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main34, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain34Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.scrollView21;
      ScrollView scrollView21 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView21 == null) {
        break missingId;
      }

      id = R.id.textView64;
      TextView textView64 = ViewBindings.findChildViewById(rootView, id);
      if (textView64 == null) {
        break missingId;
      }

      id = R.id.textView65;
      TextView textView65 = ViewBindings.findChildViewById(rootView, id);
      if (textView65 == null) {
        break missingId;
      }

      return new ActivityMain34Binding((ConstraintLayout) rootView, scrollView21, textView64,
          textView65);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
