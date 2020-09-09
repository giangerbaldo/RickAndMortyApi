package com.rickandmortyapi.ui.characterDetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CharacterDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private CharacterDetailFragmentArgs() {
  }

  private CharacterDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static CharacterDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    CharacterDetailFragmentArgs __result = new CharacterDetailFragmentArgs();
    bundle.setClassLoader(CharacterDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("characterId")) {
      int characterId;
      characterId = bundle.getInt("characterId");
      __result.arguments.put("characterId", characterId);
    } else {
      throw new IllegalArgumentException("Required argument \"characterId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getCharacterId() {
    return (int) arguments.get("characterId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("characterId")) {
      int characterId = (int) arguments.get("characterId");
      __result.putInt("characterId", characterId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    CharacterDetailFragmentArgs that = (CharacterDetailFragmentArgs) object;
    if (arguments.containsKey("characterId") != that.arguments.containsKey("characterId")) {
      return false;
    }
    if (getCharacterId() != that.getCharacterId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getCharacterId();
    return result;
  }

  @Override
  public String toString() {
    return "CharacterDetailFragmentArgs{"
        + "characterId=" + getCharacterId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(CharacterDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int characterId) {
      this.arguments.put("characterId", characterId);
    }

    @NonNull
    public CharacterDetailFragmentArgs build() {
      CharacterDetailFragmentArgs result = new CharacterDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCharacterId(int characterId) {
      this.arguments.put("characterId", characterId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getCharacterId() {
      return (int) arguments.get("characterId");
    }
  }
}
