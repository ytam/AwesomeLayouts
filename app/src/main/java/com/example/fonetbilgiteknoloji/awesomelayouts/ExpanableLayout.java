package com.example.fonetbilgiteknoloji.awesomelayouts;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExpanableLayout extends RootActivity {


    @BindView(R.id.expandableLayoutKons) ExpandableRelativeLayout expandableLayoutKons;
    @BindView(R.id.expandableLayoutKonsTani) ExpandableRelativeLayout expandableLayoutKonsTani;
    @BindView(R.id.expandableLayoutKonsDiger) ExpandableRelativeLayout expandableLayoutKonsDiger;
    @BindView(R.id.expandableLayout1) ExpandableRelativeLayout expandableLayout1;

    @BindView(R.id.txtExpandleButtonKons) TextView txtExpandleButtonKons;
    @BindView(R.id.txtExpandleButtonTani) TextView txtExpandleButtonTani;
    @BindView(R.id.txtExpandleButtonKonsDiger) TextView txtExpandleButtonKonsDiger;
    @BindView(R.id.txtExpandleButton) TextView txtExpandleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanable_layout);
        ButterKnife.bind(this);
    }

    public void expandableButton1(View view) {

        expandableLayout1.toggle();


        if (expandableLayout1.isExpanded()) {
            txtExpandleButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
        } else {
            expandableLayoutKonsDiger.collapse();
            expandableLayoutKonsTani.collapse();
            expandableLayoutKons.collapse();
            txtExpandleButtonKonsDiger.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButtonTani.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButtonKons.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up, 0);
        }
    }

    public void expandableButtonKons(View view) {

        expandableLayoutKons.toggle();

        if (expandableLayoutKons.isExpanded()) {

            txtExpandleButtonKons.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
        } else {
            expandableLayout1.collapse();
            expandableLayoutKonsDiger.collapse();
            expandableLayoutKonsTani.collapse();

            txtExpandleButtonKonsDiger.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButtonTani.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButtonKons.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up, 0);
            txtExpandleButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);

        }
    }

    public void expandableButtonTani(View view) {

        expandableLayoutKonsTani.toggle();

        if (expandableLayoutKonsTani.isExpanded()) {

            txtExpandleButtonTani.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
        } else {
            expandableLayout1.collapse();
            expandableLayoutKonsDiger.collapse();
            expandableLayoutKons.collapse();
            txtExpandleButtonKonsDiger.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButtonTani.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up, 0);
            txtExpandleButtonKons.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
        }
    }

    public void expandableButtonDiger(View view) {

        expandableLayoutKonsDiger.toggle();

        if (expandableLayoutKonsDiger.isExpanded()) {

            txtExpandleButtonKonsDiger.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);


        } else {
            expandableLayout1.collapse();
            expandableLayoutKonsTani.collapse();
            expandableLayoutKons.collapse();

            txtExpandleButtonKonsDiger.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up, 0);
            txtExpandleButtonTani.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButtonKons.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
            txtExpandleButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
        }
    }
}
