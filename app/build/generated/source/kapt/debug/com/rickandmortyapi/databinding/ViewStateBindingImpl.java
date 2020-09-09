package com.rickandmortyapi.databinding;
import com.rickandmortyapi.R;
import com.rickandmortyapi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewStateBindingImpl extends ViewStateBinding implements com.rickandmortyapi.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.progress_request, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewStateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ViewStateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (android.widget.ProgressBar) bindings[4]
            );
        this.btnTryAgain.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.rickandmortyapi.generated.callback.OnClickListener(this, 1);
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
        if (BR.apiStatus == variableId) {
            setApiStatus((com.rickandmortyapi.data.remote.ApiStatus) variable);
        }
        else if (BR.tryAgainClick == variableId) {
            setTryAgainClick((kotlin.jvm.functions.Function0<kotlin.Unit>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setApiStatus(@Nullable com.rickandmortyapi.data.remote.ApiStatus ApiStatus) {
        this.mApiStatus = ApiStatus;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.apiStatus);
        super.requestRebind();
    }
    public void setTryAgainClick(@Nullable kotlin.jvm.functions.Function0<kotlin.Unit> TryAgainClick) {
        this.mTryAgainClick = TryAgainClick;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tryAgainClick);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.rickandmortyapi.data.remote.ApiStatus apiStatus = mApiStatus;
        boolean apiStatusApiStatusERROR = false;
        int apiStatusApiStatusERRORViewVISIBLEViewGONE = 0;
        kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainClick = mTryAgainClick;

        if ((dirtyFlags & 0x5L) != 0) {



                // read apiStatus == ApiStatus.ERROR
                apiStatusApiStatusERROR = (apiStatus) == (com.rickandmortyapi.data.remote.ApiStatus.ERROR);
            if((dirtyFlags & 0x5L) != 0) {
                if(apiStatusApiStatusERROR) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read apiStatus == ApiStatus.ERROR ? View.VISIBLE : View.GONE
                apiStatusApiStatusERRORViewVISIBLEViewGONE = ((apiStatusApiStatusERROR) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnTryAgain.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.rickandmortyapi.ui.binding.BindAdaptersKt.bindStatus(this.mboundView1, apiStatus);
            this.mboundView2.setVisibility(apiStatusApiStatusERRORViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // tryAgainClick
        kotlin.jvm.functions.Function0<kotlin.Unit> tryAgainClick = mTryAgainClick;
        // tryAgainClick != null
        boolean tryAgainClickJavaLangObjectNull = false;
        // tryAgainClick.invoke()
        kotlin.Unit tryAgainClickInvoke = null;



        tryAgainClickJavaLangObjectNull = (tryAgainClick) != (null);
        if (tryAgainClickJavaLangObjectNull) {


            tryAgainClickInvoke = tryAgainClick.invoke();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): apiStatus
        flag 1 (0x2L): tryAgainClick
        flag 2 (0x3L): null
        flag 3 (0x4L): apiStatus == ApiStatus.ERROR ? View.VISIBLE : View.GONE
        flag 4 (0x5L): apiStatus == ApiStatus.ERROR ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}