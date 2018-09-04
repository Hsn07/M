package hbacak07.example.com.muhasebe;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlertDialogs {
    Context context;

    public AlertDialogs(Context context) {
        this.context = context;
    }

    public void yeni(){
        Dialog dialog=new Dialog(context);
        dialog.setContentView(R.layout.item);

        EditText et_tur=dialog.findViewById(R.id.et_tur);
        EditText et_tip=dialog.findViewById(R.id.et_tip);
        EditText et_tarih=dialog.findViewById(R.id.et_tarih);
        EditText et_fiyat=dialog.findViewById(R.id.et_miktar);
        EditText et_bilgi=dialog.findViewById(R.id.et_bilgi);

        Button btn_iptal=dialog.findViewById(R.id.btn_iptal);
        Button btn_kaydet=dialog.findViewById(R.id.btn_kaydet);

        btn_iptal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        dialog.show();
    }

    /* public void Bottomsheet(){
        BottomSheetDialog sheetDialog=new BottomSheetDialog(Database_Islemleri.this);
        View parentview=getLayoutInflater().inflate(R.layout.bottom_sheet,null);
        sheetDialog.setContentView(parentview);

        BottomSheetBehavior sheetBehavior=BottomSheetBehavior.from((View) parentview.getParent() );
        sheetBehavior.setPeekHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,100,getResources().getDisplayMetrics()));

        sheetDialog.show();
    }*/
}
