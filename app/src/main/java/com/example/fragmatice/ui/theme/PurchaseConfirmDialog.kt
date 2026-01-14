package com.example.fragmatice.ui.theme

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.fragmatice.R

class PurchaseConfirmDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog  =
        AlertDialog.Builder(requireContext())
            .setMessage(getString(R.string.order_confirmation))
            .setPositiveButton(getString(R.string.ok)) {_,_ ->}
            .create()

        companion object {
                const val TAG = "PurchaseConfirmDialog"
            }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        println("onCancel Called")
    }


}