package hbacak07.example.com.muhasebe.Data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DataBase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="Muhasebe";
    private static final int DATABASE_VERSION=1;

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_VERILISTESI="CREATE TABLE item("+"id INTEGER PRIMARY KEY AUTOINCREMENT , " +
                "tur VARCHAR , " +
                "tip VARCHAR , " +
                "tarih INTEGER , " +
                "miktar INTEGER , " +
                "bilgi VARCHAR)";
        db.execSQL(CREATE_VERILISTESI);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS item");
        onCreate(db);
    }
    public void yeni(Item item){
        SQLiteDatabase db=this.getWritableDatabase();
        String INSERT_ITEM_SQL="INSERT INTO item (tur,tip,tarih,miktar,,bilgi)" +
                " VALUES ('"+item.getTur()+"','"+item.getTip()+"','"+item.getTarih()+"','"+item.getMiktar()+"','"+item.getNot()+"')" ;
        db.execSQL(INSERT_ITEM_SQL);
        db.close();
    }
    public ArrayList<Item> getir(){
        SQLiteDatabase db=this.getWritableDatabase();

        String SELECT_ITEM_SQL="SELECT *FROM item";
        Cursor cursor=db.rawQuery(SELECT_ITEM_SQL,null);

        ArrayList<Item> item_liste=new ArrayList<Item>();

        if (cursor!=null){
            cursor.moveToFirst();
            do {
                Item item=new Item();

                item.setId(cursor.getInt(0));
                item.setTur(cursor.getString(1));
                item.setTip(cursor.getString(2));
                item.setTarih(cursor.getInt(3));
                item.setMiktar(cursor.getInt(4));
                item.setNot(cursor.getString(5));
            }while (cursor.moveToNext());
        }
        return item_liste;
    }
    /*

    //////////////////////////////////////////////////


    public void talebegüncelle(GTalebe gtalebe){
        SQLiteDatabase db=this.getWritableDatabase();

        String UPPDATE_TALEBE="UPDATE Talebelistesi SET adet = " + gtalebe.getAdet() + " WHERE id = " +gtalebe.getId();

            db.execSQL(UPPDATE_TALEBE);

        db.close();

    }
    public void talebesil(String id){
        SQLiteDatabase db=this.getWritableDatabase();

        String DELETE_TALEBE="DELETE FROM Talebelistesi WHERE id="+id;

        db.execSQL(DELETE_TALEBE);

        db.close();
    }

}
*/
}
