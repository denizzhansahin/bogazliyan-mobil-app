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

public final class ActivityMain45Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ScrollView scrollView29;

  @NonNull
  public final TextView textView236;

  @NonNull
  public final TextView textView238;

  @NonNull
  public final TextView textView239;

  private ActivityMain45Binding(@NonNull ConstraintLayout rootView,
      @NonNull ScrollView scrollView29, @NonNull TextView textView236,
      @NonNull TextView textView238, @NonNull TextView textView239) {
    this.rootView = rootView;
    this.scrollView29 = scrollView29;
    this.textView236 = textView236;
    this.textView238 = textView238;
    this.textView239 = textView239;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain45Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain45Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main45, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain45Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.scrollView29;
      ScrollView scrollView29 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView29 == null) {
        break missingId;
      }

      id = R.id.textView236;
      TextView textView236 = ViewBindings.findChildViewById(rootView, id);
      if (textView236 == null) {
        break missingId;
      }

      id = R.id.textView238;
      TextView textView238 = ViewBindings.findChildViewById(rootView, id);
      if (textView238 == null) {
        break missingId;
      }

      id = R.id.textView239;
      TextView textView239 = ViewBindings.findChildViewById(rootView, id);
      if (textView239 == null) {
        break missingId;
      }

      return new ActivityMain45Binding((ConstraintLayout) rootView, scrollView29, textView236,
          textView238, textView239);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}