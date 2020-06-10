package com.sanok.snakerguid;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class aboutInfo extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("ABOUT ME")
                .setMessage("HEllO!\n I Am SANO.I Develope This SOT App To Help You Understand the General Idea of Sea Of Theives Game.\nAs SOT is Designed for XBOX and Can Be Played there And it's  Not Realeased for Android Yet.So, I Made This simple Guide app For it's FANs\n\n      If  You Have any suggest or  complain about this App you can Easily Contant me:\n" +
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
