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

public final class ActivityMain31Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button173;

  @NonNull
  public final ScrollView scrollView18;

  @NonNull
  public final TextView textView57;

  @NonNull
  public final TextView textView58;

  @NonNull
  public final TextView textView59;

  private ActivityMain31Binding(@NonNull ConstraintLayout rootView, @NonNull Button button173,
      @NonNull ScrollView scrollView18, @NonNull TextView textView57, @NonNull TextView textView58,
      @NonNull TextView textView59) {
    this.rootView = rootView;
    this.button173 = button173;
    this.scrollView18 = scrollView18;
    this.textView57 = textView57;
    this.textView58 = textView58;
    this.textView59 = textView59;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain31Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain31Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main31, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain31Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button173;
      Button button173 = ViewBindings.findChildViewById(rootView, id);
      if (button173 == null) {
        break missingId;
      }

      id = R.id.scrollView18;
      ScrollView scrollView18 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView18 == null) {
        break missingId;
      }

      id = R.id.textView57;
      TextView textView57 = ViewBindings.findChildViewById(rootView, id);
      if (textView57 == null) {
        break missingId;
      }

      id = R.id.textView58;
      TextView textView58 = ViewBindings.findChildViewById(rootView, id);
      if (textView58 == null) {
        break missingId;
      }

      id = R.id.textView59;
      TextView textView59 = ViewBindings.findChildViewById(rootView, id);
      if (textView59 == null) {
        break missingId;
      }

      return new ActivityMain31Binding((ConstraintLayout) rootView, button173, scrollView18,
          textView57, textView58, textView59);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
