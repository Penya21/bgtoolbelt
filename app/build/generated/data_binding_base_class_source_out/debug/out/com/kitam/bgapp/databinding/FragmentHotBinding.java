// Generated by view binder compiler. Do not edit!
package com.kitam.bgapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.addisonelliott.segmentedbutton.SegmentedButtonGroup;
import com.kitam.bgapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

public final class FragmentHotBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView carouselContainer;

  @NonNull
  public final ConstraintLayout clHeaderLayout;

  @NonNull
  public final ImageView header;

  @NonNull
  public final ImageButton ibListType;

  @NonNull
  public final ImageCarousel imageSlider;

  @NonNull
  public final RecyclerView rvHotList;

  @NonNull
  public final SegmentedButtonGroup sbListType;

  private FragmentHotBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView carouselContainer, @NonNull ConstraintLayout clHeaderLayout,
      @NonNull ImageView header, @NonNull ImageButton ibListType,
      @NonNull ImageCarousel imageSlider, @NonNull RecyclerView rvHotList,
      @NonNull SegmentedButtonGroup sbListType) {
    this.rootView = rootView;
    this.carouselContainer = carouselContainer;
    this.clHeaderLayout = clHeaderLayout;
    this.header = header;
    this.ibListType = ibListType;
    this.imageSlider = imageSlider;
    this.rvHotList = rvHotList;
    this.sbListType = sbListType;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_hot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHotBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.carousel_container;
      CardView carouselContainer = rootView.findViewById(id);
      if (carouselContainer == null) {
        break missingId;
      }

      id = R.id.clHeaderLayout;
      ConstraintLayout clHeaderLayout = rootView.findViewById(id);
      if (clHeaderLayout == null) {
        break missingId;
      }

      id = R.id.header;
      ImageView header = rootView.findViewById(id);
      if (header == null) {
        break missingId;
      }

      id = R.id.ibListType;
      ImageButton ibListType = rootView.findViewById(id);
      if (ibListType == null) {
        break missingId;
      }

      id = R.id.image_slider;
      ImageCarousel imageSlider = rootView.findViewById(id);
      if (imageSlider == null) {
        break missingId;
      }

      id = R.id.rvHotList;
      RecyclerView rvHotList = rootView.findViewById(id);
      if (rvHotList == null) {
        break missingId;
      }

      id = R.id.sbListType;
      SegmentedButtonGroup sbListType = rootView.findViewById(id);
      if (sbListType == null) {
        break missingId;
      }

      return new FragmentHotBinding((ConstraintLayout) rootView, carouselContainer, clHeaderLayout,
          header, ibListType, imageSlider, rvHotList, sbListType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
