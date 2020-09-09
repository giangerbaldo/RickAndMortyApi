package com.rickandmortyapi;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.rickandmortyapi.databinding.FragmentCharacterDetailBindingImpl;
import com.rickandmortyapi.databinding.FragmentHomeBindingImpl;
import com.rickandmortyapi.databinding.ViewCharacterDetailBindingImpl;
import com.rickandmortyapi.databinding.ViewItemCharacterBindingImpl;
import com.rickandmortyapi.databinding.ViewStateBindingImpl;
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
  private static final int LAYOUT_FRAGMENTCHARACTERDETAIL = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_VIEWCHARACTERDETAIL = 3;

  private static final int LAYOUT_VIEWITEMCHARACTER = 4;

  private static final int LAYOUT_VIEWSTATE = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rickandmortyapi.R.layout.fragment_character_detail, LAYOUT_FRAGMENTCHARACTERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rickandmortyapi.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rickandmortyapi.R.layout.view_character_detail, LAYOUT_VIEWCHARACTERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rickandmortyapi.R.layout.view_item_character, LAYOUT_VIEWITEMCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.rickandmortyapi.R.layout.view_state, LAYOUT_VIEWSTATE);
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
        case  LAYOUT_FRAGMENTCHARACTERDETAIL: {
          if ("layout/fragment_character_detail_0".equals(tag)) {
            return new FragmentCharacterDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_character_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWCHARACTERDETAIL: {
          if ("layout/view_character_detail_0".equals(tag)) {
            return new ViewCharacterDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_character_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWITEMCHARACTER: {
          if ("layout/view_item_character_0".equals(tag)) {
            return new ViewItemCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_item_character is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWSTATE: {
          if ("layout/view_state_0".equals(tag)) {
            return new ViewStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_state is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "apiStatus");
      sKeys.put(2, "character");
      sKeys.put(3, "detailViewModel");
      sKeys.put(4, "tryAgainClick");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/fragment_character_detail_0", com.rickandmortyapi.R.layout.fragment_character_detail);
      sKeys.put("layout/fragment_home_0", com.rickandmortyapi.R.layout.fragment_home);
      sKeys.put("layout/view_character_detail_0", com.rickandmortyapi.R.layout.view_character_detail);
      sKeys.put("layout/view_item_character_0", com.rickandmortyapi.R.layout.view_item_character);
      sKeys.put("layout/view_state_0", com.rickandmortyapi.R.layout.view_state);
    }
  }
}
