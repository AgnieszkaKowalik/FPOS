package com.example.marta.farmaceutycznypomocnik;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marta on 06.11.2016.
 */

public class DBController extends SQLiteOpenHelper {

    public DBController(Context context) {
        super(context,"bazaLekow.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table leki(" +
                        "nr integer primary key autoincrement," +
                        "nazwa text," +
                        "dawka text," +
                        "info text," +
                        "dni text," +
                        "godziny text);" +
                        "");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {}

    // metoda dodajLek- dodawanie leku do bazy
    public void dodajLek(Lek lek){ // przekazanie do metody całego obiektu klasy Lek o nazwie lek
        SQLiteDatabase db = getWritableDatabase(); // uchwyt do bazy pozwalający na dodawanie danych do bazy
        ContentValues wartosci = new ContentValues();
        wartosci.put("nazwa", lek.getNazwa()); // metoda put("nazwa kolumny", parametr);
        wartosci.put("dawka",lek.getDawka());
        wartosci.put("info", lek.getInfo());
        wartosci.put("dni", lek.getDni());
        wartosci.put("godziny", lek.getGodziny());
        db.insertOrThrow("leki",null, wartosci);
    }

    // metoda aktualizuj - edycja danych w bazie
    public void aktualizujLek(Lek lek){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues wartosci = new ContentValues();
        wartosci.put("nazwa", lek.getNazwa());
        wartosci.put("dawka",lek.getDawka());
        wartosci.put("info", lek.getInfo());
        wartosci.put("dni", lek.getDni());
        wartosci.put("godziny", lek.getGodziny());
        String args[]={lek.getNr() + ""};
        db.update("leki", wartosci,"nr=?",args);
    }


    // metoda dajWszystkie() - pobieranie danych z bazy i zwracanie jako listę obiektów klasy LinkedList
    public List<Lek> dajWszystkie(){
        LinkedList leki = new LinkedList<Lek>();
        String[] kolumny={"nr","nazwa","dawka","info","dni","godziny"};
        SQLiteDatabase db = getReadableDatabase(); // uchwyt do bazy pozwalający na odczyt danych z bazy
        Cursor kursor =db.query("leki",kolumny,null,null,null,null,null);
        while(kursor.moveToNext()){
            Lek lek = new Lek(); // tworzenie pustego obiektu klasy Lek o nazwie lek
            lek.setNr(kursor.getLong(0)); // uzupełnianie pól obiektu lek
            lek.setNazwa(kursor.getString(1));
            lek.setDawka(kursor.getString(2));
            lek.setInfo(kursor.getString(3));
            lek.setDni(kursor.getString(4));
            lek.setGodziny(kursor.getString(5));
            leki.add(lek);// dodwanie obiektu lek do listy
        }
        return leki; // zwracanie listy leków
    }

    // metoda dajLek - pozwala na wyświetlanie konkretnego rekordu z bazy danych
    public Lek dajLek(int nr){
        Lek lek = new Lek(); // tworzenie pustego obiektu klasy Lek o nazwie lek
        SQLiteDatabase db = getReadableDatabase();
        String[] kolumny={"nr","nazwa","dawka","info","dni","godziny"}; // kolumny, które mają być czytane
        String args[]={nr+""}; // podstawienie wartości która trafi pod znak „?” w warunku where

        /* metoda QUERY : argumenty odpowiedzialne za:
        - grupowanie,
        - warunek having,
        - sortowanie
        - limitowanie ilości zwracanych wierszy (wg wymienionej kolejności) ustawione na null (nie są potrzebne teraz)
        */

        Cursor kursor=db.query("leki",kolumny," nr=?",args,null,null,null,null); // wykonanie zapytania
        if(kursor!=null){ //sprawdzenie, czy zwrócony zostanie przynajmniej jeden wiersz
            // czytanie danych z pól wiersza i uzupełniania obiektu
            kursor.moveToFirst(); // przejście do pierwszego wiersza
            lek.setNr(kursor.getLong(0));
            lek.setNazwa(kursor.getString(1));
            lek.setDawka(kursor.getString(2));
            lek.setInfo(kursor.getString(3));
            lek.setDni(kursor.getString(4));
            lek.setGodziny(kursor.getString(5));
        }
        return lek; // zwracanie uzupełnionego obiektu
    }

    // metoda kasujLek- usuwanie zbędnych rekordów (powtarzających się)
    public void kasujLek(int id){
        SQLiteDatabase db = getWritableDatabase();
        String[] argumenty={""+id}; // kolekcja

        /* metoda DELETE :
           - argument 1 to nazwa tabeli z której kasujemy
           - argument 2 to warunki dla klauzuli where
           - argument 3 to lista wartości które mają trafić do parametrów warunków where określonych jako argument nr 2 metody delete*/

        db.delete("leki", "nr=?", argumenty);
    }
}
