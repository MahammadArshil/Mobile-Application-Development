package com.arshil.databasecontact;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBAdapter {
    static final String KEY_ROWID = "_id";
    static final String KEY_NAME = "name";
    static final String KEY_EMAIL = "email";
    static final String TAG = "DBAdapter";
    static final String DATABASE_NAME = "MyDB";
    static final String DATABASE_TABLE = "contacts";
    static final int DATABASE_VERSION = 1;
    static final String DATABASE_CREATE = "create table contacts (_id integer primary key autoincrement," + "name text not null, email text not null);";
    final Context context;
    DatabaseHelper DBHelper;
    SQLiteDatabase db;

    public DBAdapter(Context ctx) {
        this.context = ctx;
        DBHelper = new DatabaseHelper(context);
    }

    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            try {
                db.execSQL(DATABASE_CREATE);

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Toast.makeText(this, "DB Created", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to " + newVersion + ",which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS contacts");
            onCreate(db);
        }
    }

    //Oen the database
    public void open() throws SQLException {
        db = DBHelper.getWritableDatabase();

    }

    //Close the database
    public void close() {
        DBHelper.close();
    }

    //Insert a Contact into Database
    public long insertContact(String name, String email) {
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_NAME, name);
        initialValues.put(KEY_EMAIL, email);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }

    public Cursor getTest()
    {
        return db.rawQuery("select email from contacts",null);
    }
    public Cursor getAllData() {

        return db.query(DATABASE_TABLE,new String[]{KEY_ROWID,KEY_NAME,KEY_EMAIL},null,null,null,null,null);
        //return db.query("contacts", new String[]{"_id","name","email"}, null, null, null, null, null);

    }
}
//    //Delete a particular contact
//    public boolean deleteContact(long rowId){
//        return db.delete(DATABASE_TABLE,KEY_ROWID + "="+ rowId,null)>0;
//    }
////
//    //Retrives all the Contacts
//    public Cursor getAllContacts(){
//        return db.query(DATABASE_TABLE, new String[] {KEY_ROWID,KEY_NAME,KEY_EMAIL},null, null, null, null, null);
//    }
//    public Cursor getAllData(){
//        return db.query("contacts",new String[]{KEY_ROWID,KEY_NAME,KEY_EMAIL},null,null,null,null,null);
//
//    }
//
//    //Retrieves a Particular Contact
//    public Cursor getContact(long rowId) throws SQLException{
//        Cursor mCursor= db.query(true,DATABASE_TABLE, new String[]{KEY_ROWID, KEY_NAME, KEY_EMAIL},KEY_ROWID+"="+rowId,null,null,null,null,null);
//        if(mCursor != null){
//            mCursor.moveToFirst();
//        }
//        return mCursor;
//    }
//
//    //Update a Contact
//    public  boolean updateContact(long rowId,String name, String email){
//        ContentValues args=new ContentValues();
//        args.put(KEY_NAME,name);
//        args.put(KEY_EMAIL,email);
//        return  db.update(DATABASE_TABLE,args,KEY_ROWID+"="+rowId,null)>0;
//    }
