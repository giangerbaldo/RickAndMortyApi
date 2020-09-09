package com.rickandmortyapi.databinding;
import com.rickandmortyapi.R;
import com.rickandmortyapi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewCharacterDetailBindingImpl extends ViewCharacterDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txv_char_detail_name_label, 6);
        sViewsWithIds.put(R.id.txv_char_detail_species_label, 7);
        sViewsWithIds.put(R.id.txv_char_detail_episodes_label, 8);
        sViewsWithIds.put(R.id.txv_char_detail_location_label, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewCharacterDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ViewCharacterDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            );
        this.imvCharDetailImage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txvCharDetailEpisodes.setTag(null);
        this.txvCharDetailLocationName.setTag(null);
        this.txvCharDetailName.setTag(null);
        this.txvCharDetailSpecies.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.detailViewModel == variableId) {
            setDetailViewModel((com.rickandmortyapi.ui.characterDetail.CharacterDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetailViewModel(@Nullable com.rickandmortyapi.ui.characterDetail.CharacterDetailViewModel DetailViewModel) {
        this.mDetailViewModel = DetailViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.detailViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDetailViewModelCharacterWithLocation((androidx.lifecycle.LiveData<com.rickandmortyapi.data.local.entity.CharacterWithLocations>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDetailViewModelCharacterWithLocation(androidx.lifecycle.LiveData<com.rickandmortyapi.data.local.entity.CharacterWithLocations> DetailViewModelCharacterWithLocation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.rickandmortyapi.data.local.entity.CharacterWithLocations> detailViewModelCharacterWithLocation = null;
        com.rickandmortyapi.data.local.entity.CharacterWithLocations detailViewModelCharacterWithLocationGetValue = null;
        java.lang.String integerToStringDetailViewModelCharacterWithLocationCharacterTotalEpisodes = null;
        com.rickandmortyapi.ui.characterDetail.CharacterDetailViewModel detailViewModel = mDetailViewModel;
        java.lang.String detailViewModelCharacterWithLocationCharacterName = null;
        com.rickandmortyapi.data.local.entity.CharacterEntity detailViewModelCharacterWithLocationCharacter = null;
        int detailViewModelCharacterWithLocationCharacterTotalEpisodes = 0;
        java.util.List<com.rickandmortyapi.data.local.entity.LocationEntity> detailViewModelCharacterWithLocationLocations = null;
        java.lang.String detailViewModelCharacterWithLocationCharacterSpecies = null;
        com.rickandmortyapi.data.local.entity.LocationEntity detailViewModelCharacterWithLocationLocationsGetInt0 = null;
        java.lang.String detailViewModelCharacterWithLocationLocationsGetInt0Name = null;
        java.lang.String detailViewModelCharacterWithLocationCharacterImage = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (detailViewModel != null) {
                    // read detailViewModel.characterWithLocation
                    detailViewModelCharacterWithLocation = detailViewModel.getCharacterWithLocation();
                }
                updateLiveDataRegistration(0, detailViewModelCharacterWithLocation);


                if (detailViewModelCharacterWithLocation != null) {
                    // read detailViewModel.characterWithLocation.getValue()
                    detailViewModelCharacterWithLocationGetValue = detailViewModelCharacterWithLocation.getValue();
                }


                if (detailViewModelCharacterWithLocationGetValue != null) {
                    // read detailViewModel.characterWithLocation.getValue().character
                    detailViewModelCharacterWithLocationCharacter = detailViewModelCharacterWithLocationGetValue.getCharacter();
                    // read detailViewModel.characterWithLocation.getValue().locations
                    detailViewModelCharacterWithLocationLocations = detailViewModelCharacterWithLocationGetValue.getLocations();
                }


                if (detailViewModelCharacterWithLocationCharacter != null) {
                    // read detailViewModel.characterWithLocation.getValue().character.name
                    detailViewModelCharacterWithLocationCharacterName = detailViewModelCharacterWithLocationCharacter.getName();
                    // read detailViewModel.characterWithLocation.getValue().character.totalEpisodes
                    detailViewModelCharacterWithLocationCharacterTotalEpisodes = detailViewModelCharacterWithLocationCharacter.getTotalEpisodes();
                    // read detailViewModel.characterWithLocation.getValue().character.species
                    detailViewModelCharacterWithLocationCharacterSpecies = detailViewModelCharacterWithLocationCharacter.getSpecies();
                    // read detailViewModel.characterWithLocation.getValue().character.image
                    detailViewModelCharacterWithLocationCharacterImage = detailViewModelCharacterWithLocationCharacter.getImage();
                }
                if (detailViewModelCharacterWithLocationLocations != null) {
                    // read detailViewModel.characterWithLocation.getValue().locations.get(0)
                    detailViewModelCharacterWithLocationLocationsGetInt0 = detailViewModelCharacterWithLocationLocations.get(0);
                }


                // read Integer.toString(detailViewModel.characterWithLocation.getValue().character.totalEpisodes)
                integerToStringDetailViewModelCharacterWithLocationCharacterTotalEpisodes = java.lang.Integer.toString(detailViewModelCharacterWithLocationCharacterTotalEpisodes);
                if (detailViewModelCharacterWithLocationLocationsGetInt0 != null) {
                    // read detailViewModel.characterWithLocation.getValue().locations.get(0).name
                    detailViewModelCharacterWithLocationLocationsGetInt0Name = detailViewModelCharacterWithLocationLocationsGetInt0.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.rickandmortyapi.ui.binding.BindAdaptersKt.bindImage(this.imvCharDetailImage, detailViewModelCharacterWithLocationCharacterImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txvCharDetailEpisodes, integerToStringDetailViewModelCharacterWithLocationCharacterTotalEpisodes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txvCharDetailLocationName, detailViewModelCharacterWithLocationLocationsGetInt0Name);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txvCharDetailName, detailViewModelCharacterWithLocationCharacterName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txvCharDetailSpecies, detailViewModelCharacterWithLocationCharacterSpecies);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): detailViewModel.characterWithLocation
        flag 1 (0x2L): detailViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}