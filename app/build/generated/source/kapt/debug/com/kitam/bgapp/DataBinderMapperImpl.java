package com.kitam.bgapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kitam.bgapp.databinding.FragmentBoardgameDetailAltBindingImpl;
import com.kitam.bgapp.databinding.FragmentBoardgameDetailBindingImpl;
import com.kitam.bgapp.databinding.FragmentSearchListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTBOARDGAMEDETAIL = 1;

  private static final int LAYOUT_FRAGMENTBOARDGAMEDETAILALT = 2;

  private static final int LAYOUT_FRAGMENTSEARCHLIST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kitam.bgapp.R.layout.fragment_boardgame_detail, LAYOUT_FRAGMENTBOARDGAMEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kitam.bgapp.R.layout.fragment_boardgame_detail_alt, LAYOUT_FRAGMENTBOARDGAMEDETAILALT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kitam.bgapp.R.layout.fragment_search_list, LAYOUT_FRAGMENTSEARCHLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTBOARDGAMEDETAIL: {
          if ("layout/fragment_boardgame_detail_0".equals(tag)) {
            return new FragmentBoardgameDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_boardgame_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOARDGAMEDETAILALT: {
          if ("layout/fragment_boardgame_detail_alt_0".equals(tag)) {
            return new FragmentBoardgameDetailAltBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_boardgame_detail_alt is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHLIST: {
          if ("layout/fragment_search_list_0".equals(tag)) {
            return new FragmentSearchListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_boardgame_detail_0", com.kitam.bgapp.R.layout.fragment_boardgame_detail);
      sKeys.put("layout/fragment_boardgame_detail_alt_0", com.kitam.bgapp.R.layout.fragment_boardgame_detail_alt);
      sKeys.put("layout/fragment_search_list_0", com.kitam.bgapp.R.layout.fragment_search_list);
    }
  }
}
