package com.rickandmortyapi.ui.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.rickandmortyapi.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionShowCharacterDetail actionShowCharacterDetail(int characterId) {
    return new ActionShowCharacterDetail(characterId);
  }

  public static class ActionShowCharacterDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionShowCharacterDetail(int characterId) {
      this.arguments.put("characterId", characterId);
    }

    @NonNull
    public ActionShowCharacterDetail setCharacterId(int characterId) {
      this.arguments.put("characterId", characterId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("characterId")) {
        int characterId = (int) arguments.get("characterId");
        __result.putInt("characterId", characterId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_showCharacterDetail;
    }

    @SuppressWarnings("unchecked")
    public int getCharacterId() {
      return (int) arguments.get("characterId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionShowCharacterDetail that = (ActionShowCharacterDetail) object;
      if (arguments.containsKey("characterId") != that.arguments.containsKey("characterId")) {
        return false;
      }
      if (getCharacterId() != that.getCharacterId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getCharacterId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionShowCharacterDetail(actionId=" + getActionId() + "){"
          + "characterId=" + getCharacterId()
          + "}";
    }
  }
}
