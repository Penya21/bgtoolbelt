package com.kitam.bgapp.databinding;
import com.kitam.bgapp.R;
import com.kitam.bgapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBoardgameDetailBindingImpl extends FragmentBoardgameDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewContainer, 1);
        sViewsWithIds.put(R.id.image_slider, 2);
        sViewsWithIds.put(R.id.cvImage, 3);
        sViewsWithIds.put(R.id.ivImage, 4);
        sViewsWithIds.put(R.id.llTags, 5);
        sViewsWithIds.put(R.id.clDuration, 6);
        sViewsWithIds.put(R.id.tvDuration, 7);
        sViewsWithIds.put(R.id.clNumPlayers, 8);
        sViewsWithIds.put(R.id.tvNumPlayers, 9);
        sViewsWithIds.put(R.id.clAges, 10);
        sViewsWithIds.put(R.id.tvAges, 11);
        sViewsWithIds.put(R.id.clDifficulty, 12);
        sViewsWithIds.put(R.id.tvDifficulty, 13);
        sViewsWithIds.put(R.id.cvDescription, 14);
        sViewsWithIds.put(R.id.tvHome, 15);
        sViewsWithIds.put(R.id.sbListType, 16);
        sViewsWithIds.put(R.id.cv_text_description, 17);
        sViewsWithIds.put(R.id.tvDescription, 18);
        sViewsWithIds.put(R.id.ivExpandDescription, 19);
        sViewsWithIds.put(R.id.tvAuthor, 20);
        sViewsWithIds.put(R.id.tvYear, 21);
        sViewsWithIds.put(R.id.tvRank, 22);
        sViewsWithIds.put(R.id.ivFav, 23);
        sViewsWithIds.put(R.id.ivShare, 24);
        sViewsWithIds.put(R.id.fcvProductFragment, 25);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBoardgameDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentBoardgameDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[17]
            , (androidx.fragment.app.FragmentContainerView) bindings[25]
            , (com.denzcoskun.imageslider.ImageSlider) bindings[2]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[24]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[5]
            , (com.addisonelliott.segmentedbutton.SegmentedButtonGroup) bindings[16]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            );
        this.scrollView.setTag(null);
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