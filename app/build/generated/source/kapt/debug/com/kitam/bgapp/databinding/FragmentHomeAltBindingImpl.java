package com.kitam.bgapp.databinding;
import com.kitam.bgapp.R;
import com.kitam.bgapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeAltBindingImpl extends FragmentHomeAltBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_slider, 1);
        sViewsWithIds.put(R.id.cvImage, 2);
        sViewsWithIds.put(R.id.ivImage, 3);
        sViewsWithIds.put(R.id.llTags, 4);
        sViewsWithIds.put(R.id.clDuration, 5);
        sViewsWithIds.put(R.id.tvDuration, 6);
        sViewsWithIds.put(R.id.clNumPlayers, 7);
        sViewsWithIds.put(R.id.tvNumPlayers, 8);
        sViewsWithIds.put(R.id.clAges, 9);
        sViewsWithIds.put(R.id.tvAges, 10);
        sViewsWithIds.put(R.id.clDifficulty, 11);
        sViewsWithIds.put(R.id.tvDifficulty, 12);
        sViewsWithIds.put(R.id.cvDescription, 13);
        sViewsWithIds.put(R.id.tvHome, 14);
        sViewsWithIds.put(R.id.tvAuthor, 15);
        sViewsWithIds.put(R.id.tvYear, 16);
        sViewsWithIds.put(R.id.tvRank, 17);
        sViewsWithIds.put(R.id.tvDescription, 18);
        sViewsWithIds.put(R.id.ivExpandDescription, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeAltBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentHomeAltBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (com.denzcoskun.imageslider.ImageSlider) bindings[1]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[3]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.viewContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}