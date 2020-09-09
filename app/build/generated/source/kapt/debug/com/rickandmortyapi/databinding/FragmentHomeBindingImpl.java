package com.rickandmortyapi.databinding;
import com.rickandmortyapi.R;
import com.rickandmortyapi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.rickandmortyapi.generated.callback.Function0.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"view_state"},
            new int[] {2},
            new int[] {com.rickandmortyapi.R.layout.view_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_view, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final kotlin.jvm.functions.Function0 mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.rickandmortyapi.databinding.ViewStateBinding) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.SearchView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerCharacters.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.rickandmortyapi.generated.callback.Function0(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        includeHomeStateView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeHomeStateView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.rickandmortyapi.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rickandmortyapi.ui.home.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeHomeStateView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludeHomeStateView((com.rickandmortyapi.databinding.ViewStateBinding) object, fieldId);
            case 1 :
                return onChangeViewModelCharacterList((androidx.lifecycle.LiveData<java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity>>) object, fieldId);
            case 2 :
                return onChangeViewModelRequestStatus((androidx.lifecycle.LiveData<com.rickandmortyapi.data.remote.ApiStatus>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeHomeStateView(com.rickandmortyapi.databinding.ViewStateBinding IncludeHomeStateView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCharacterList(androidx.lifecycle.LiveData<java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity>> ViewModelCharacterList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRequestStatus(androidx.lifecycle.LiveData<com.rickandmortyapi.data.remote.ApiStatus> ViewModelRequestStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity> viewModelCharacterListGetValue = null;
        com.rickandmortyapi.data.remote.ApiStatus viewModelRequestStatusGetValue = null;
        com.rickandmortyapi.ui.home.HomeViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity>> viewModelCharacterList = null;
        androidx.lifecycle.LiveData<com.rickandmortyapi.data.remote.ApiStatus> viewModelRequestStatus = null;

        if ((dirtyFlags & 0x1eL) != 0) {


            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.characterList
                        viewModelCharacterList = viewModel.getCharacterList();
                    }
                    updateLiveDataRegistration(1, viewModelCharacterList);


                    if (viewModelCharacterList != null) {
                        // read viewModel.characterList.getValue()
                        viewModelCharacterListGetValue = viewModelCharacterList.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.requestStatus
                        viewModelRequestStatus = viewModel.getRequestStatus();
                    }
                    updateLiveDataRegistration(2, viewModelRequestStatus);


                    if (viewModelRequestStatus != null) {
                        // read viewModel.requestStatus.getValue()
                        viewModelRequestStatusGetValue = viewModelRequestStatus.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.includeHomeStateView.setApiStatus(viewModelRequestStatusGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.includeHomeStateView.setTryAgainClick(mCallback1);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.rickandmortyapi.ui.binding.BindAdaptersKt.bindCharacterRecyclerView(this.recyclerCharacters, viewModelCharacterListGetValue);
        }
        executeBindingsOn(includeHomeStateView);
    }
    // Listener Stub Implementations
    // callback impls
    public final kotlin.Unit _internalCallbackInvoke(int sourceId ) {
        // localize variables for thread safety
        // viewModel
        com.rickandmortyapi.ui.home.HomeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.tryAgain();
        }
        return null;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeHomeStateView
        flag 1 (0x2L): viewModel.characterList
        flag 2 (0x3L): viewModel.requestStatus
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}