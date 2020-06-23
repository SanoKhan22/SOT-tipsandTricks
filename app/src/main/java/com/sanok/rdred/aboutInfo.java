package com.sanok.rdred;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class aboutInfo extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("ABOUT ME")
                .setMessage("HEllO!\n I Am SANO.I Develope This RDR App To Help You Understand the General Idea of R D Redemption Game.\nAs RDR is Designed for XBOX/PS and Can Be Played there And it's  Not Realeased for Android Yet.So, I Made This simple Guide app For it's FANs\n\n      If  You Have any suggest or  complain about this App you can Easily Contant me:\n" +
                        "Gmail:ehsanokhan90@gmail.com")
                .setIcon(R.drawable.aboutpic)
                .setPositiveButton("OKAY", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}
