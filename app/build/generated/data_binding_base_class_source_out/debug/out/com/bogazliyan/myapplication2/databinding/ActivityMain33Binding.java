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

public final class ActivityMain33Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button175;

  @NonNull
  public final ScrollView scrollView20;

  @NonNull
  public final TextView textView63;

  private ActivityMain33Binding(@NonNull ConstraintLayout rootView, @NonNull Button button175,
      @NonNull ScrollView scrollView20, @NonNull TextView textView63) {
    this.rootView = rootView;
    this.button175 = button175;
    this.scrollView20 = scrollView20;
    this.textView63 = textView63;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain33Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain33Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main33, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain33Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button175;
      Button button175 = ViewBindings.findChildViewById(rootView, id);
      if (button175 == null) {
        break missingId;
      }

      id = R.id.scrollView20;
      ScrollView scrollView20 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView20 == null) {
        break missingId;
      }

      id = R.id.textView63;
      TextView textView63 = ViewBindings.findChildViewById(rootView, id);
      if (textView63 == null) {
        break missingId;
      }

      return new ActivityMain33Binding((ConstraintLayout) rootView, button175, scrollView20,
          textView63);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}