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

public final class ActivityMain35Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ScrollView scrollView13;

  @NonNull
  public final TextView textView66;

  @NonNull
  public final TextView textView67;

  private ActivityMain35Binding(@NonNull ConstraintLayout rootView,
      @NonNull ScrollView scrollView13, @NonNull TextView textView66,
      @NonNull TextView textView67) {
    this.rootView = rootView;
    this.scrollView13 = scrollView13;
    this.textView66 = textView66;
    this.textView67 = textView67;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain35Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain35Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main35, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain35Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.scrollView13;
      ScrollView scrollView13 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView13 == null) {
        break missingId;
      }

      id = R.id.textView66;
      TextView textView66 = ViewBindings.findChildViewById(rootView, id);
      if (textView66 == null) {
        break missingId;
      }

      id = R.id.textView67;
      TextView textView67 = ViewBindings.findChildViewById(rootView, id);
      if (textView67 == null) {
        break missingId;
      }

      return new ActivityMain35Binding((ConstraintLayout) rootView, scrollView13, textView66,
          textView67);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
